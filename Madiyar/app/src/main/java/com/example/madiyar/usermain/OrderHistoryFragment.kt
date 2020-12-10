package com.example.madiyar.usermain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentAddressBinding
import com.example.madiyar.databinding.FragmentOrderHistoryBinding

class OrderHistoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentOrderHistoryBinding>(inflater, R.layout.fragment_order_history,container,false)
        binding.btnDetailed.setOnClickListener {
            it.findNavController().navigate(R.id.action_userMainPageFragment2_to_orderHistoryDetailedFragment)
        }
        binding.btnDetailed2.setOnClickListener {
            it.findNavController().navigate(R.id.action_userMainPageFragment2_to_orderHistoryDetailedFragment)
        }
        return binding.root
    }
}