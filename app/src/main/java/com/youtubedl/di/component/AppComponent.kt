package com.youtubedl.di.component

import com.youtubedl.DLApplication
import com.youtubedl.di.module.ActivityBindingModule
import com.youtubedl.di.module.AppModule
import com.youtubedl.di.module.NetworkModule
import com.youtubedl.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by cuongpm on 12/6/18.
 */

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBindingModule::class,
        NetworkModule::class, ViewModelModule::class]
)
interface AppComponent : AndroidInjector<DLApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(appApplication: DLApplication): Builder

        fun build(): AppComponent
    }
}