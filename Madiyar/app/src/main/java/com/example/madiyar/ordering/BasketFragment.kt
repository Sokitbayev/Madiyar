package com.example.madiyar.ordering

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentAddressBinding
import com.example.madiyar.databinding.FragmentBasketBinding
import kotlinx.android.synthetic.main.fragment_final_registration.view.*

class BasketFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBasketBinding>(inflater,
            R.layout.fragment_basket,container,false)
        binding.btnArrange.setOnClickListener {
            it.findNavController().navigate(R.id.action_basketFragment_to_paymentMethodFragment)
        }
        return binding.root
    }

}