package com.example.madiyar.registrationandauth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentSmsCodeBinding


class SmsCodeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentSmsCodeBinding>(inflater,R.layout.fragment_sms_code,container,false)
        binding.btnConfirmCode.setOnClickListener {
            it.findNavController().navigate(R.id.action_smsCodeFragment_to_newPasswordFragment)
        }

        return binding.root
    }
}