package com.example.intentnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.intentnew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var launcher:ActivityResultLauncher<Intent>? = null

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launcher= registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result:ActivityResult->
            if (result.resultCode== RESULT_OK){
                val text = result.data?.getStringExtra("key")
                binding.textView.text =text.toString()
            }
        }
    }


    fun aaa(view: View){
        launcher?.launch(Intent(this, MainActivity2::class.java))
    }
}