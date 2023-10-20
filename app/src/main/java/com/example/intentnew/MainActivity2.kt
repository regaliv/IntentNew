package com.example.intentnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.intentnew.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getText(): String {

        return binding.editText.text.toString()
    }

    fun onClick (view: View){
        val i = Intent()
        i.putExtra("key",getText())
        setResult(RESULT_OK, i)
        finish()
    }


}