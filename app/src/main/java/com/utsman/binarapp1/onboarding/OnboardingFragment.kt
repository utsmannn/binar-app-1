package com.utsman.binarapp1.onboarding

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.utsman.binarapp1.BinarOnboardingActivity
import com.utsman.binarapp1.R
import com.utsman.binarapp1.databinding.FragmentBinarOnboardingBinding

class OnboardingFragment : Fragment() {

    private val title: String by lazy {
        arguments?.getString(BinarOnboardingActivity.KEY_TITLE) ?: ""
    }

    private val description: String by lazy {
        arguments?.getString(BinarOnboardingActivity.KEY_DESCRIPTION) ?: ""
    }

    private val imageRes: Int by lazy {
        arguments?.getInt(BinarOnboardingActivity.KEY_IMAGE_RESOURCES) ?: -1
    }

    private val bgColor: Int by lazy {
        arguments?.getInt(BinarOnboardingActivity.KEY_BG_COLOR) ?: Color.WHITE
    }

    private var binding: FragmentBinarOnboardingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBinarOnboardingBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.run {
            tvTitleBoarding.text = title
            tvDescription.text = description
            rootOnboarding.setBackgroundColor(bgColor)

            if (imageRes != -1) {
                imgBoarding.setImageResource(imageRes)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}