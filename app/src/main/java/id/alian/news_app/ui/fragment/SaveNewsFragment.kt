package id.alian.news_app.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import id.alian.news_app.R
import id.alian.news_app.adapters.NewsAdapter
import id.alian.news_app.databinding.FragmentSaveNewsBinding
import id.alian.news_app.databinding.FragmentSearchNewsBinding
import id.alian.news_app.ui.NewsActivity
import id.alian.news_app.ui.NewsViewModel

class SaveNewsFragment : Fragment(R.layout.fragment_save_news) {

    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter

    private var _binding: FragmentSaveNewsBinding? = null
    private val binding get() = _binding!!
    private val TAG = "SaveNewsFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSaveNewsBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModel = (activity as NewsActivity).viewModel
        setupRecyclerView()

        newsAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("article", it)
            }

            findNavController().navigate(
                R.id.action_saveNewsFragment_to_articleFragment,
                bundle
            )
        }

        return view
    }

    private fun setupRecyclerView() {
        newsAdapter = NewsAdapter()
        binding.rvSavedNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}