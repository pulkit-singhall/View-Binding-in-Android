package com.example.bindingtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bindingtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // for using binding we just have to change three lines of code
        // also add binding true in the android section of gradle build (app)

        binding.btn.setOnClickListener {
            if(binding.checkBox.isChecked){
                Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Pls accept terms and conditions",Toast.LENGTH_SHORT).show()
            }
        }


    }
}