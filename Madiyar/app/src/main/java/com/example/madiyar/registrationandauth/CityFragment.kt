package com.example.madiyar.registrationandauth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentCityBinding


class CityFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCityBinding>(inflater,R.layout.fragment_city,container,false)
        binding.btnNext.setOnClickListener {
            it.findNavController().navigate(R.id.action_cityFragment_to_addressFragment)
        }
        return binding.root

    }
}