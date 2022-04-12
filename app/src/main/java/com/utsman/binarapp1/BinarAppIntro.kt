package com.utsman.binarapp1

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment
import com.utsman.binarapp1.fragment.AccountFragment

class BinarAppIntro : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setBackgroundDrawable(ColorDrawable(Color.BLUE))

        addSlide(
            AppIntroFragment.createInstance(
                title = "Hai binar",
                description = "Ini slide pertama"
            )
        )

        addSlide(
            AppIntroFragment.createInstance(
                title = "Hai binar",
                description = "Ini slide kedua"
            )
        )

        addSlide(AccountFragment())
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}