package com.example.madiyar.registrationandauth

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentFinalRegistrationBinding
import com.example.madiyar.databinding.FragmentNewPasswordBinding


class NewPasswordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentNewPasswordBinding>(
        inflater,
        R.layout.fragment_new_password,
        container,
        false
    )
        binding.tilNewPassword.typeface = Typeface.createFromAsset(context?.assets, "fonts/montserrat_regular.ttf")
        binding.tilNewPasswordConfirm.typeface = Typeface.createFromAsset(context?.assets, "fonts/montserrat_regular.ttf")

        return binding.root
    }
}