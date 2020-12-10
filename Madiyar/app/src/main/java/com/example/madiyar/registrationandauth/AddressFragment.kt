package com.example.madiyar.registrationandauth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentAddressBinding

class AddressFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentAddressBinding>(inflater,
            R.layout.fragment_address,container,false)
        binding.btnNext.setOnClickListener {
            it.findNavController().navigate(R.id.action_addressFragment_to_finalRegistrationFragment)
        }
        return binding.root
    }
}