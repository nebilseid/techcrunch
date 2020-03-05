package com.techcrunch.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.techcrunch.R
import com.techcrunch.di.AppModule
import com.techcrunch.di.DaggerAppComponent
import com.techcrunch.viewmodel.PostsViewModel
import com.techcrunch.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_post.*
import javax.inject.Inject

class PostsActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    @Inject
    lateinit var postsViewModel: PostsViewModel

    private val postAdapter = PostAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
            .inject(this)


        rv_post.layoutManager = LinearLayoutManager(this)
        rv_post.adapter = postAdapter

        posts()
    }

    private fun posts() {
        postsViewModel =
            ViewModelProvider(this, viewModelFactory).get(postsViewModel::class.java)
        postsViewModel.getPosts()


        postsViewModel.roadLiveData.observe(this, Observer {
            postAdapter.setData(it)
        })
    }
}

