package com.example.daggervisualised.di

import com.example.daggervisualised.TheApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, AppModule::class, CommonRepositoryModule::class])
interface AppComponent : AndroidInjector<TheApplication> {

}