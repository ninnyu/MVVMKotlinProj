package com.example.potatopaloozac.mvvmkotlinproj.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.view.View
import com.example.potatopaloozac.mvvmkotlinproj.BR
import com.example.potatopaloozac.mvvmkotlinproj.model.User
import java.util.*

class ViewModel(private val user: User): Observer, BaseObservable() {

    override fun update(o: Observable?, arg: Any?) {
        if (arg == "fname") {
            notifyPropertyChanged(BR.fname)
        }
        if (arg == "lname") {
            notifyPropertyChanged(BR.lname)
        }
        if (arg == "age") {
            notifyPropertyChanged(BR.age)
        }
    }

    init {
        user.addObserver(this)
    }

    val fname: String
    @Bindable get() {
        return user.fname
    }

    val lname: String
    @Bindable get() {
        return user.lname
    }

    val age: String
    @Bindable get() {
        return user.age
    }

    fun onButtonClicked(view: View) {
        this.user.fname = "ShivaChild"
        this.user.lname = "KarthikChild"
        this.user.age = "99"
    }
}