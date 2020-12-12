package com.example.madiyar.usermain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentCurrentOrdersBinding
import com.example.madiyar.databinding.FragmentOneCurrentOrderBinding

class OneCurrentOrderFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentOneCurrentOrderBinding>(inflater,R.layout.fragment_one_current_order,container,false)
        binding.cardView
        return binding.root
    }

}