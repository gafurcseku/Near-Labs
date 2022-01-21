package com.android.nearlabs.main.view.login

import android.os.Bundle
import android.text.InputType
import android.view.InputDevice
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.android.nearlabs.R
import com.android.nearlabs.Utility
import com.android.nearlabs.databinding.FragmentNearLabsLoginBinding
import com.android.nearlabs.main.viewmodel.LoginViewModel


class NearLabsLoginFragment : Fragment() {
    private lateinit var binding: FragmentNearLabsLoginBinding
    private val longViewModel : LoginViewModel by viewModels()
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
            groupButtonToggleGroup.addOnButtonCheckedListener { group, checkedId, isChecked ->
                if(checkedId == R.id.emailButton) {
                    setStartEditText(true)
                }else if(checkedId == R.id.phoneButton) {
                    setStartEditText(false)
                }
            }
        }
    }

    private fun setStartEditText(isEmail:Boolean){
        binding.apply {
            if(isEmail) {
                userInputEditText.hint = "Email Address"
                userInputEditText.inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            }else{
                userInputEditText.hint = "Ex. (373) 378 8383"
                userInputEditText.inputType = InputType.TYPE_CLASS_PHONE
            }
        }
    }

}