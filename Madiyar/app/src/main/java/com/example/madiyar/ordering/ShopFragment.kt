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
import com.example.madiyar.databinding.FragmentShopBinding


class ShopFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentShopBinding>(inflater,
            R.layout.fragment_shop,container,false)
        binding.btnBasket.setOnClickListener {
            it.findNavController().navigate(R.id.action_shopFragment_to_basketFragment)
        }
        return binding.root
    }
}