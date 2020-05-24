package com.example.daggervisualised.some

import com.example.daggervisualised.ProfileRepository
import dagger.Module
import dagger.Provides

@Module
class SomeActivityModule {
    @Provides
    fun provideSomeRepository(): SomeRepository {
        return SomeRepository()
    }

    @Provides
    fun provideSomePrestener(
        activity: SomeActivity,
        profileRepository: ProfileRepository,
        someRepository: SomeRepository
    ): SomePresenter {
        return SomePresenter(
            activity.intent.extras?.get("some key"),
            profileRepository,
            someRepository
        )
    }
}