package com.example.madiyar.registrationandauth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentEntranceBinding


class EntranceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEntranceBinding>(inflater,R.layout.fragment_entrance,container,false)
        binding.tvForgotPassword.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entranceFragment_to_forgotPasswordFragment)
        }
        binding.btnEnter.setOnClickListener {
            TODO("ADD ENTRANCE")
        }
        return binding.root
    }
}