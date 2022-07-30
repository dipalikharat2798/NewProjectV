package com.vback.vback.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var lst1 = MutableLiveData<ArrayList<RecyclerFirstModel>>()
    var lst2 = MutableLiveData<ArrayList<RecyclerFirstModel>>()
    var lst3 = MutableLiveData<ArrayList<RecyclerFirstModel>>()

    fun add1(blog: ArrayList<RecyclerFirstModel>) {
        lst1.value = blog
    }

    fun add2(blog: ArrayList<RecyclerFirstModel>) {
        lst2.value = blog
    }

    fun add3(blog: ArrayList<RecyclerFirstModel>) {
        lst3.value = blog
    }

}