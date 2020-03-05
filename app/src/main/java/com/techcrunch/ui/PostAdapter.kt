package com.techcrunch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techcrunch.R
import com.techcrunch.model.DataPosts
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    private val data = arrayListOf<DataPosts>()


    fun setData(items: List<DataPosts>) {
        data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PostViewHolder (LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false))

    override fun getItemCount() =  data.size

    override fun onBindViewHolder(viewHolder: PostViewHolder, position: Int) {
            viewHolder.bind(data[position])

        }

    class PostViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun bind(response: DataPosts) {
            view.tv_post_title.text = response.title?.rendered
            view.tv_excerpt.text = response.excerpt?.rendered

        }
    }
}