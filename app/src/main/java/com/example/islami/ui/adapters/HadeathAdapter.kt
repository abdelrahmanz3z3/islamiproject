package com.example.islami.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.islami.databinding.ItemHadeathBinding

class HadeathAdapter(val list: List<String>?) : Adapter<HadeathAdapter.ViewHolder>() {

    class ViewHolder( val viewBinding: ItemHadeathBinding) : RecyclerView.ViewHolder(viewBinding.root)
    {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding= ItemHadeathBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        return list?.size?:0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.viewBinding.h.text= (list?.get(position) ?:0).toString()
        //------------------------------------------------------------
        holder.viewBinding.root.setOnClickListener {
            onHadeathClickListener?.onHadeathClick(position, list?.get(position)?.toString()!!)
        }
    }
    var onHadeathClickListener : OnHadeathClickListener?=null
    fun interface OnHadeathClickListener
    {
        fun onHadeathClick(position: Int,hadeath_name : String)
    }
}