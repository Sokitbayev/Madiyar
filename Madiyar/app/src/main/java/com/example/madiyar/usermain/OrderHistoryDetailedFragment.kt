package com.example.madiyar.usermain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentOrderHistoryBinding
import com.example.madiyar.databinding.FragmentOrderHistoryDetailedBinding


class OrderHistoryDetailedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentOrderHistoryDetailedBinding>(inflater,
            R.layout.fragment_order_history_detailed,container,false)
        return binding.root
    }
}