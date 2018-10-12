package com.example.potatopaloozac.mvvmkotlinproj.view

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.potatopaloozac.mvvmkotlinproj.BR
import com.example.potatopaloozac.mvvmkotlinproj.R
import com.example.potatopaloozac.mvvmkotlinproj.databinding.ActivityMainBinding
import com.example.potatopaloozac.mvvmkotlinproj.model.User
import com.example.potatopaloozac.mvvmkotlinproj.viewmodel.ViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //user: User = User() ----> same as ----> user = User()
        var user: User = User()
        user.fname = "Shiva"
        user.lname = "Karthik"
        user.age = "499"

        val viewmodel = ViewModel(user)

        //databinding
        val databinding =
                DataBindingUtil.setContentView<ActivityMainBinding>(
                        this, R.layout.activity_main)

        databinding.setVariable(BR.viewmodel, viewmodel)
    }
}
