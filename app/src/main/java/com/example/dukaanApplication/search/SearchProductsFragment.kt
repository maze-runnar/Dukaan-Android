package com.example.dukaanApplication.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dukaanApplication.adapter.SearchProductAdapter
import com.example.dukaanApplication.databinding.FragmentSearchProductsBinding

class SearchProductsFragment : Fragment() {

    private var _binding : FragmentSearchProductsBinding? =null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      _binding = FragmentSearchProductsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val llm = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        val adapter = SearchProductAdapter()
        binding.rvProducts.adapter = adapter
        binding.rvProducts.layoutManager =llm
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}