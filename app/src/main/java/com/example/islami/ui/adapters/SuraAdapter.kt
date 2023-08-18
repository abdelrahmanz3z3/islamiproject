package com.example.islami.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.islami.databinding.ChapterItemBinding
import com.example.islami.databinding.FragmentQuraunBinding
import com.example.islami.ui.data.SuraName

class SuraAdapter(var list: MutableList<SuraName>?) :Adapter<SuraAdapter.ViewHolder>() {

    class ViewHolder( val viewBinding: ChapterItemBinding) : RecyclerView.ViewHolder(viewBinding.root)
    {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val viewBinding= ChapterItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        return list?.size?:0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var sura = list?.get(position)
        holder.viewBinding.textView2.text=sura?.suraName.toString()
        holder.viewBinding.textView.text=sura?.ayat.toString()
        //------------------------------------------------------------
        holder.viewBinding.root.setOnClickListener {
            onSuraClickListener?.onSuraClick(position,sura!!)
        }
    }
    var onSuraClickListener : OnSuraClickListener?=null
    fun interface OnSuraClickListener
    {
       fun onSuraClick(position: Int,sura :SuraName)
    }
}