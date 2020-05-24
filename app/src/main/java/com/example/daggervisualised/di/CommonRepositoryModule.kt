package com.example.daggervisualised.di

import com.example.daggervisualised.ProfileRepository
import dagger.Module
import dagger.Provides

@Module
class CommonRepositoryModule {
    @Provides
    fun providesProfileRepository(): ProfileRepository {
        println("providesProfileRepository")
        return ProfileRepository()
    }
}