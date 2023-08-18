package com.example.islami.ui.qurancontent

import android.R.string
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.islami.databinding.ActivityQuraunContentBinding


class Quraun_content : AppCompatActivity() {
    lateinit var viewBinding: ActivityQuraunContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityQuraunContentBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        val i =intent
        var position = i.getIntExtra("pos",-1)
        position+=1;
        var name = i.getStringExtra("name")
        var s = assets.open("q/${position}.txt").bufferedReader().use { it.readText() }

        viewBinding.ccc.text=s.trim().split(",").toString()
        viewBinding.suraName.text=name

    }
}