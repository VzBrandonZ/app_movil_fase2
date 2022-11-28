package com.septimobappmovil.studyconnect.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.septimobappmovil.studyconnect.adapter.PostAdapter
import com.septimobappmovil.studyconnect.databinding.FragmentHomeBinding
import com.septimobappmovil.studyconnect.model.PostModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recycleView: RecyclerView = binding.recycleViewPost
        recycleView.adapter = PostAdapter(
            listOf(
                PostModel(1, "viajando por España", "url 1"),
                PostModel(2, "viajando por Ecuador", "url 2"),
                PostModel(3, "viajando por EEUU", "url 3"),
            )
        )
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}