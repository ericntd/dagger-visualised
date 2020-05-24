package com.example.daggervisualised.di

import com.example.daggervisualised.some.SomeActivity
import com.example.daggervisualised.some.SomeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [CommonRepositoryModule::class])
abstract class AppModule {
    /**
     * Connect SomeActivity's sub-graph to the App's Dependency Graph
     */
    @ContributesAndroidInjector(modules = [SomeActivityModule::class])
    abstract fun contributeSomeActivity() : SomeActivity
}