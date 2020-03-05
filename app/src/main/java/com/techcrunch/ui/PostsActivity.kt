package com.techcrunch.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.techcrunch.App
import com.techcrunch.R
import com.techcrunch.di.actitivty.ActivityComponent
import com.techcrunch.di.actitivty.ActivityModule
import com.techcrunch.viewmodel.PostsViewModel
import com.techcrunch.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_post.*
import javax.inject.Inject

class PostsActivity : AppCompatActivity() {

    @Inject
    lateinit var activityComponent: ActivityComponent

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: PostsViewModel


    private val postAdapter = PostAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        injectDependecy()
        initializeView()
        getPosts()
    }

    fun getPosts() {
        viewModel = ViewModelProvider(this, viewModelFactory).get(PostsViewModel::class.java)
        viewModel.getPosts()
        viewModel.postViewmodel.observe(this, Observer {
            postAdapter.setData(it)
        })
    }

    fun initializeView() {
        val layoutManager = LinearLayoutManager(this)
        rv_post.layoutManager = layoutManager
        rv_post.adapter = postAdapter
    }

    fun injectDependecy() {
        activityComponent =
            (this.application as App).appComponent.inject(ActivityModule())
        activityComponent.inject(this)

    }
}

