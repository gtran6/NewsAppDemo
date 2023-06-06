package com.myprojects.bottomnav.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    val bottomNavigationVisibility: MutableLiveData<Boolean> = MutableLiveData(true)
}