package com.example.bindrecyc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.bindrecyc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityM
//    lateinit var bind:ActivityMainBinding
    private lateinit var recyclerAdapter:DataBindingAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        bind = DataBindingUtil.setContentView(this,R.layout.activity_main)
          val recycler : RecyclerView = findViewById(R.id.recycler_view)
        recycler.layoutManager =  LinearLayoutManager(this)

        val list = ArrayList<DataClass>()
        list.add(DataClass("saravanan", "20","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"))
        list.add(DataClass("neeraj", "26","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"))
        list.add(DataClass("saravanan", "22","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"))
        list.add(DataClass("saravanan", "55","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"))
        list.add(DataClass("saravanan", "20","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"))

        recyclerAdapter = DataBindingAdapter(list)
        recycler.adapter = recyclerAdapter
//        init(list){
//            recyclerAdapter.setContentList(list)
//        }


//        binding.recyclerView.apply {
//            this.layoutManager=LinearLayoutManager(this@MainActivity)
//            this.adapter = recyclerAdapter
//        }


    }

    private fun init(list: MutableList<String>, function: () -> Unit) {
        list.add("one")
        list.add("two")
        list.add("three")
        list.add("four")
        list.add("five")
    }


}