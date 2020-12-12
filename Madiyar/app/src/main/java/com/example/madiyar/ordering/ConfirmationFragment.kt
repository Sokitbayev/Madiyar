package com.example.madiyar.ordering

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentBasketBinding
import com.example.madiyar.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentConfirmationBinding>(inflater,
            R.layout.fragment_confirmation,container,false)
        binding.btnOrder.setOnClickListener {
            it.findNavController().navigate(R.id.action_confirmationFragment_to_userMainPageFragment2)
        }
        return binding.root
    }


}