package com.example.islami.ui.hadeathcontent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami.R
import com.example.islami.databinding.ActivityHadeathContentBinding

class HadeathContent : AppCompatActivity() {
    lateinit var viewBinding:ActivityHadeathContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityHadeathContentBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        val i = intent
        var pos = i.getIntExtra("posi",-1)
        pos+=1;
        var s = assets.open("h/h$pos.txt").bufferedReader().use { it.readText() }
        var aa=s.split("\n")
        var title=aa[0];
        var h_c=aa.subList(1,aa.size-1).toString().trim()
        viewBinding.hCont.text=h_c
        viewBinding.hadeathName.text=title

    }
}