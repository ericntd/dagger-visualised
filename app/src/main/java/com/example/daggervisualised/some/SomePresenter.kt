package com.example.daggervisualised.some

import com.example.daggervisualised.ProfileRepository
import javax.inject.Inject

class SomePresenter @Inject constructor(
    val someParam: Any?,
    val profileRepository: ProfileRepository,
    val someRepository: SomeRepository
) {
    fun doSomeWork() {
        println("doSomeWork")
    }
}