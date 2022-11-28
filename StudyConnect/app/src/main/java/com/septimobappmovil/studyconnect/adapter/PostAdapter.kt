package com.septimobappmovil.studyconnect.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.septimobappmovil.studyconnect.R
import com.septimobappmovil.studyconnect.databinding.ViewPostItemBinding
import com.septimobappmovil.studyconnect.model.PostModel

class PostAdapter(private val post: List<PostModel>) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {



    class ViewHolder(binding: ViewPostItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(post: PostModel){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewPostItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(post[position])
    }

    override fun getItemCount(): Int {
        return post.size
    }
}