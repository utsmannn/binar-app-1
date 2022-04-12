package com.utsman.binarapp1.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.utsman.binarapp1.MainActivity
import com.utsman.binarapp1.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val fragmentCount: Int by lazy {
        arguments?.getInt(MainActivity.FRAGMENT_COUNT) ?: 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("binar main fragment -------> oncreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("binar main fragment -------> oncreateview")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("binar main fragment -------> onviewcreated")
        Toast.makeText(context, "ini fragment nya...", Toast.LENGTH_SHORT).show()

        val tvFragment: TextView = view.findViewById(R.id.tv_fragment)
        tvFragment.text = "ini fragment home"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("binar main fragment -------> onattach")
    }

    override fun onResume() {
        super.onResume()
        println("binar main fragment -------> onresume")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("binar main fragment -------> ondestroy")
    }

    override fun onStop() {
        super.onStop()
        println("binar main fragment -------> onstop")
    }
}