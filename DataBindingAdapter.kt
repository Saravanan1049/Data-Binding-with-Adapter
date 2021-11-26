package com.example.bindrecyc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bindrecyc.databinding.BindContentBinding

class DataBindingAdapter(var list : List<DataClass>):RecyclerView.Adapter<DataBindingAdapter.DataViewHolder>() {

//
//    var list: MutableList<String> = mutableListOf<String>()
//    fun setContentList(list:MutableList<String>){
//        this.list = list
//        notifyDataSetChanged()
//    }
    class DataViewHolder(val bindDataBinding:BindContentBinding):RecyclerView.ViewHolder(bindDataBinding.root){
    fun data(data : DataClass){
        bindDataBinding.setVariable(BR.gg,data)
    }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val bind =  BindContentBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder(bind)
    }

    override fun onBindViewHolder(holder: DataBindingAdapter.DataViewHolder, position: Int) {
        holder.data(list[position])
    }

    override fun getItemCount(): Int {
        return this.list.size
    }
}