package com.utsman.binarapp1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.utsman.binarapp1.databinding.ActivityBinarOnboardingBinding
import com.utsman.binarapp1.onboarding.OnboardingFragment

class BinarOnboardingActivity : AppCompatActivity() {

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE_RESOURCES = "image"
        const val KEY_BG_COLOR = "bg_color"
    }

    private lateinit var binding: ActivityBinarOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinarOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sliderAdapter = SliderAdapter(supportFragmentManager)
        val slide1 = OnboardingFragment()
        slide1.arguments = bundleOf(
            KEY_TITLE to "Slide 1",
            KEY_DESCRIPTION to "ini slide 1 custom",
            KEY_BG_COLOR to Color.GREEN
        )

        val slide2 = OnboardingFragment()
        slide2.arguments = bundleOf(
            KEY_TITLE to "Slide 2",
            KEY_DESCRIPTION to "ini slide 2 custom",
            KEY_IMAGE_RESOURCES to R.drawable.img_kucing
        )

        val fragmentList = listOf(slide1, slide2)
        sliderAdapter.addFragmentList(fragmentList)

        binding.run {
            vpOnboarding.adapter = sliderAdapter

            btnComplete.setOnClickListener {
                val intent = Intent(this@BinarOnboardingActivity, MainActivity::class.java)

                /*val bundle = Bundle()
                bundle.putString("name", "binar")*/

                val bundle = bundleOf(
                    "name" to "binar",
                    "age" to 21
                )

                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}