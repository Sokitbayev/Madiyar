package com.example.madiyar.registrationandauth

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.madiyar.R
import com.example.madiyar.databinding.FragmentEntranceBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.ktx.actionCodeSettings
import kotlinx.android.synthetic.main.fragment_entrance.*
import java.lang.Exception


class EntranceFragment : Fragment() {
    private val auth by lazy { FirebaseAuth.getInstance() }
    val options = PhoneAuthOptions.newBuilder()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = DataBindingUtil.inflate<FragmentEntranceBinding>(inflater,R.layout.fragment_entrance,container,false)
        binding.tilPassword.typeface = Typeface.createFromAsset(context?.assets, "fonts/montserrat_regular.ttf")
        binding.tvForgotPassword.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_entranceFragment_to_forgotPasswordFragment)
        }
        binding.btnEnter.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_entranceFragment_to_userMainPageFragment2)
            //signIn(binding.etEmail.text.toString(),binding.etPassword.text.toString())
        }
        return binding.root
    }
    private fun signIn(email: String, password: String)
    {
        try{
            auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    view?.findNavController()?.navigate(R.id.action_entranceFragment_to_userMainPageFragment2)
                }
                Toast.makeText(context, it.exception?.message, Toast.LENGTH_LONG).show()
            }
        }
        catch (e: Exception){
            Toast.makeText(context, "Заполните все поля", Toast.LENGTH_LONG).show()
        }
    }
}