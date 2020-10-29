package com.example.madiyar.registrationandauth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentFinalRegistrationBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class FinalRegistrationFragment : Fragment() {
    private val auth by lazy { FirebaseAuth.getInstance() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFinalRegistrationBinding>(inflater,R.layout.fragment_final_registration,container,false)
        binding.btnRegister.setOnClickListener {
            signUp(binding.etName.text.toString(),binding.etPhoneNumber.text.toString(),binding.etPassword.text.toString())
        }

        return binding.root
    }
    private fun signUp(
        name: String, phoneNumber: String, password: String){
        auth.createUserWithEmailAndPassword(name,password)
    }

}