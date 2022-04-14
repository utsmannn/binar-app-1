package com.utsman.binarapp1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.utsman.binarapp1.FragmentListener
import com.utsman.binarapp1.R
import com.utsman.binarapp1.databinding.FragmentAccountBinding

class AccountFragment : Fragment(), FragmentListener {

    private var binding: FragmentAccountBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun getTextValue(): String {
        val name = binding?.inputName?.text.toString()
        return name
    }

}