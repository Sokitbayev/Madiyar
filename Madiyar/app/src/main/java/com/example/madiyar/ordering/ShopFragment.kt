package com.example.madiyar.ordering

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentShopBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


class ShopFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentShopBinding>(
            inflater,
            R.layout.fragment_shop, container, false
        )
        val bottomSheetBehavior: BottomSheetBehavior<*> =
            BottomSheetBehavior.from<View>(binding.bottomSheet)
        binding.btnBasket.setOnClickListener {
            it.findNavController().navigate(R.id.action_shopFragment_to_basketFragment)
        }
        binding.cvApple.setOnClickListener {

                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
        }
        binding.cvOrange.setOnClickListener {

            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
        }
        binding.btnAdd.setOnClickListener {
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN)

        }
        return binding.root
    }
}