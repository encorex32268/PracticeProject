package com.lihan.practiceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lihan.practiceproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

            var practiceList = arrayListOf<String>(
                "MVVM","Permission","ContentProvider","Room Database",
                "OkHttp","Broadcast","Service","Notification"
            )
            val mAdapter = PracticeListAdapter(practiceList)

            recyclerView.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = mAdapter
            }
        }
    }
}