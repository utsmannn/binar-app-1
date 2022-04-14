package com.utsman.binarapp1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.utsman.binarapp1.R
import com.utsman.binarapp1.databinding.DialogCustomDialogBinding

class CustomDialogFragment : DialogFragment() {

    private var binding: DialogCustomDialogBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogCustomDialogBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnPositive.setOnClickListener {
                Toast.makeText(context, "ini positive", Toast.LENGTH_SHORT).show()
                dismiss()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        println("dialog fragment resume....")
    }

    override fun onStop() {
        super.onStop()
        println("dialog fragment stop....")
    }

}