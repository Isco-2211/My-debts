package com.example.mydebts

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mydebts.databinding.FragmentCatBinding

class CatFragment : Fragment(R.layout.fragment_cat) {

    private lateinit var binding: FragmentCatBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCatBinding.bind(view)
    }

}