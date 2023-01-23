package com.example.webservicesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webservicesdemo.R
import com.example.webservicesdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var users = ArrayList<User>()
    private var usersAdapter = UsersAdapter(users)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        initListener()
    }

    private fun  initListener(){
        binding.btnSimpleRequest.setOnClickListener {
    WebThread(null).execute(
        *arrayOf(binding.edtTargetUrl.text.toString())
    )
}


    }

    private fun initRecyclerView(){

    }


}