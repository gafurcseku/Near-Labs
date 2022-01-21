package com.android.nearlabs.main.view.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.nearlabs.R
import com.android.nearlabs.Utility
import com.android.nearlabs.databinding.FragmentNearLabsLoginBinding


class NearLabsLoginFragment : Fragment() {
    private lateinit var binding: FragmentNearLabsLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNearLabsLoginBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            Utility.getLoginTermAndConditionTextView(termAndConditions,requireContext())
        }
    }


}