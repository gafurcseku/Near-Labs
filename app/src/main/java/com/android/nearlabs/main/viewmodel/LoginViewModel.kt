package com.android.nearlabs.main.viewmodel


import androidx.lifecycle.ViewModel
import com.android.nearlabs.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

}