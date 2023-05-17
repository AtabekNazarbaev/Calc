package com.example.calculator.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.calculator.R
import com.example.calculator.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    lateinit var binding: FragmentFirstBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        binding.apply {
            var sum = 0.0
            btnPlay.setOnClickListener {
                if (etP1.text.isNullOrBlank() || etP2.text.isNullOrBlank() || etP3.text.isNullOrBlank()) {
                    Toast.makeText(requireContext(), "Malumotlarni toltiring", Toast.LENGTH_SHORT).show()
                } else {
                    var a = etP1.text.toString().toDouble()
                    var b = etP2.text.toString().toDouble()
                    var c = etP3.text.toString().toDouble()
                    sum = (a * b * c - b * c * (1 - a) - a * c * (1 - b) - a * b * (1 - c) - a * (1 - b) * (1 - c) - b * (1 - a) * (1 - c) - c * (1 - a) * (1 - b))
                    tvPSum.text = sum.toString()
                }
            }
        }
    }
}
