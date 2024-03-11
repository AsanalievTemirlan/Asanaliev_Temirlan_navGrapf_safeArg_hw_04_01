package com.example.navgrapf_safearg_hw_04_01.Ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navgrapf_safearg_hw_04_01.R
import com.example.navgrapf_safearg_hw_04_01.Ui.DataClass.User
import com.example.navgrapf_safearg_hw_04_01.databinding.ActivityMainBinding
import com.example.navgrapf_safearg_hw_04_01.databinding.FragmentEditTextBinding

class EditTextFragment : Fragment() {

    private lateinit var binding: FragmentEditTextBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditTextBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        binding.btnClick.setOnClickListener {
            findNavController().navigate(
                EditTextFragmentDirections.actionEditTextFragmentToTextViewFragment(
                    User(
                        binding.etEmail.text.toString(),
                        binding.etPassword.text.toString().toInt()
                    )

                )
            )
        }
    }

}