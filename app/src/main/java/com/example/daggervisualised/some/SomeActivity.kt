package com.example.daggervisualised.some

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggervisualised.R
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SomeActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var somePresenter: SomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        somePresenter.doSomeWork()
    }
}
