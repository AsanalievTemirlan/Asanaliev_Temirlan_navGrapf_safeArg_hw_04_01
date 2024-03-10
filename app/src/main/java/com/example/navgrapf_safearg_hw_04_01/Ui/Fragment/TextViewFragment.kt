package com.example.navgrapf_safearg_hw_04_01.Ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navgrapf_safearg_hw_04_01.R
import com.example.navgrapf_safearg_hw_04_01.databinding.FragmentTextViewBinding


class TextViewFragment : Fragment() {

    private lateinit var binding: FragmentTextViewBinding
    private val args by navArgs<TextViewFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTextViewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding.tvEmail.text = args.email
        binding.tvPassword.text = args.password
    }

}