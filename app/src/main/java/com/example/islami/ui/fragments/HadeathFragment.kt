package com.example.islami.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.islami.R
import com.example.islami.databinding.FragmentHadeathBinding
import com.example.islami.databinding.ItemHadeathBinding
import com.example.islami.ui.adapters.HadeathAdapter
import com.example.islami.ui.hadeathcontent.HadeathContent


class HadeathFragment : Fragment() {


lateinit var viewBinding: FragmentHadeathBinding
lateinit var adapter: HadeathAdapter
lateinit var list: MutableList<String>
lateinit var layoutManager: LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding=FragmentHadeathBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        InitAdapter()
        adapter.onHadeathClickListener= HadeathAdapter.OnHadeathClickListener {
                position, hadeath_name ->
            val i = Intent(context,HadeathContent::class.java)
            i.putExtra("posi",position)
            startActivity(i)
        }

    }
    fun InitAdapter()
    {
        InitList()
        adapter= HadeathAdapter(list)
        viewBinding.hRv.adapter=adapter
        layoutManager=LinearLayoutManager(context)
        viewBinding.hRv.layoutManager=layoutManager
    }
    fun InitList()
    {
        list= mutableListOf()
        for (i in 1..50)
        {
            list.add("الحديث رقم $i")
        }
    }
}