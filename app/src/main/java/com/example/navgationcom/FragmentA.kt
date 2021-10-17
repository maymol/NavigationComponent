package com.example.navgationcom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class FragmentA : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bundle = arguments
        val root = inflater.inflate(R.layout.fragment_a, container, false)
        val textView : TextView = root.findViewById(R.id.textView)
        textView.text = bundle?.getString("message")
        return root
    }

}