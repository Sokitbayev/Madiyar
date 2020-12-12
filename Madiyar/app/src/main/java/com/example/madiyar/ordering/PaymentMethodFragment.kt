package com.example.madiyar.ordering

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentPaymentMethodBinding
import com.example.madiyar.databinding.FragmentShopBinding

class PaymentMethodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPaymentMethodBinding>(inflater,
            R.layout.fragment_payment_method,container,false)
        binding.btnChooseMethod.setOnClickListener {
            it.findNavController().navigate(R.id.action_paymentMethodFragment_to_confirmationFragment)
        }
        return binding.root
    }


}