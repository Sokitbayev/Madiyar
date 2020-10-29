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
import com.example.madiyar.databinding.FragmentForgotPasswordBinding


class ForgotPasswordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentForgotPasswordBinding>(inflater,R.layout.fragment_forgot_password,container,false)
        binding.btnSubmit.setOnClickListener {
            it.findNavController().navigate(R.id.action_forgotPasswordFragment_to_smsCodeFragment)
        }
        return binding.root
    }
}