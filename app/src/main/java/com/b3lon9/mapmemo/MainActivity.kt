package com.b3lon9.mapmemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.b3lon9.mapmemo.databinding.ActivityMainBinding
import com.b3lon9.mapmemo.views.fragment.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(binding.container.id, MainFragment()).commitNow()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}