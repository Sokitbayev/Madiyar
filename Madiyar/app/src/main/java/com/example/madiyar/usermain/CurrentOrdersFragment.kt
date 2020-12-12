package com.example.madiyar.usermain

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentCurrentOrdersBinding
import com.example.madiyar.databinding.FragmentSmsCodeBinding

class CurrentOrdersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCurrentOrdersBinding>(inflater,R.layout.fragment_current_orders,container,false)
        binding.cardView.setOnClickListener {
            it.findNavController().navigate(R.id.action_currentOrdersFragment_to_oneCurrentOrderFragment)
        }
        binding.cardView1.setOnClickListener {
            it.findNavController().navigate(R.id.action_currentOrdersFragment_to_oneCurrentOrderFragment)
        }
        binding.cardView2.setOnClickListener {
            it.findNavController().navigate(R.id.action_currentOrdersFragment_to_oneCurrentOrderFragment)
        }
        return binding.root
    }

}
