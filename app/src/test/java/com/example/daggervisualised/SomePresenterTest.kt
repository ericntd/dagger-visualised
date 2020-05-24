package com.example.daggervisualised

import com.example.daggervisualised.some.SomePresenter
import com.example.daggervisualised.some.SomeRepository
import org.junit.Test
import org.mockito.Mockito

class SomePresenterTest {
    @Test
    fun doSomeWork() {
        val profileRepository = Mockito.mock(ProfileRepository::class.java)
        val someRepository = Mockito.mock(SomeRepository::class.java)
        val underTest = SomePresenter(
            profileRepository,
            someRepository
        )
        // Trigger
        underTest.doSomeWork()
        // Validation
    }
}