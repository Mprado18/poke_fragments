package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar!!.hide()

        binding.gengar.setOnClickListener { loadGengar(GengarFragment()) }

        binding.charizard.setOnClickListener { loadCharizard(CharizardFragment()) }

    }

    private fun loadGengar(frag1: GengarFragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, frag1)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun loadCharizard(frag2: CharizardFragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, frag2)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}