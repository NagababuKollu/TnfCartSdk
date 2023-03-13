package com.thenorthface.tnf.carthilsdk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.thenorthface.tnf.carthilsdk.databinding.ActivityMainBinding
import com.thenorthface.tnf.cartlib.DisplayQuoteActivity
import com.thenorthface.tnf.cartlib.SampleFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this, DisplayQuoteActivity::class.java))
        }

            if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, SampleFragment(), "fragment_name")
                .commit()
        }



    }


}