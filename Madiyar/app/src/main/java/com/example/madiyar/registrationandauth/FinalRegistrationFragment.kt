package com.example.madiyar.registrationandauth

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentFinalRegistrationBinding
import com.google.firebase.auth.FirebaseAuth


class FinalRegistrationFragment : Fragment()  {
    private val auth by lazy { FirebaseAuth.getInstance() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentFinalRegistrationBinding>(
            inflater,
            R.layout.fragment_final_registration,
            container,
            false
        )
        binding.tilPassword.typeface = Typeface.createFromAsset(context?.assets, "fonts/montserrat_regular.ttf")
        binding.btnRegister.setOnClickListener {
            if (binding.etEmail.text.toString().trim().isEmpty() || binding.etPassword.text.toString().trim().isEmpty() || binding.etName.text.toString().trim().isEmpty())
                Toast.makeText(context, "Заполните все поля", Toast.LENGTH_LONG).show()
            else
                signUp(binding.etEmail.text.toString(), binding.etPassword.text.toString())
        }

        return binding.root
    }
    private fun signUp(email: String, password: String){
        try{
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(context, "Success", Toast.LENGTH_LONG).show()
                        return@addOnCompleteListener
                    }
                    Toast.makeText(context, it.exception?.message, Toast.LENGTH_LONG).show()

                }
        }
        catch (e: Exception){
            Toast.makeText(context, "Заполните все поля", Toast.LENGTH_LONG).show()

        }
    }

}