package com.android.nearlabs

import android.graphics.Color
import android.text.SpannableStringBuilder
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import com.google.android.material.textview.MaterialTextView

object Utility {
//by clicking continue you must agree to near labs Terms & Conditions ans Privacu Policy
     fun getLoginTermAndConditionTextView(view: MaterialTextView) {
        val spanTxt = SpannableStringBuilder(
            "by clicking continue you must agree to near labs "
        )
        spanTxt.append("Terms & Conditions")
        spanTxt.setSpan(object : ClickableSpan() {

            override fun onClick(p0: View) {

            }
        }, spanTxt.length - "Terms & Conditions".length, spanTxt.length, 0)
        spanTxt.append(" and")
        spanTxt.setSpan(ForegroundColorSpan(Color.BLACK), 32, spanTxt.length, 0)
        spanTxt.append(" Privacy Policy")
        spanTxt.setSpan(object : ClickableSpan() {
            override fun onClick(p0: View) {

            }
        }, spanTxt.length - " Privacy Policy".length, spanTxt.length, 0)
        view.movementMethod = LinkMovementMethod.getInstance()
        view.setText(spanTxt, TextView.BufferType.SPANNABLE)
    }
}