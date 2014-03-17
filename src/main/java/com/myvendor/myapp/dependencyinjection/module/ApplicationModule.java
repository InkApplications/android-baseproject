package com.myvendor.myapp.dependencyinjection.module;

import com.maxvandervelde.android.logger.ConsoleLogger;
import com.maxvandervelde.android.standard.dependencyinjection.module.StandardApplicationModule;
import com.myvendor.myapp.BuildConfig;
import com.myvendor.myapp.Application;
import dagger.Module;
import dagger.Provides;
import org.apache.commons.logging.Log;

import javax.inject.Singleton;

@Module(
    includes = {

    },
    injects = {
        Application.class
    },
    addsTo = StandardApplicationModule.class,
    complete = false,
    library = true
)
public class ApplicationModule
{
    @Provides @Singleton Log provideLogger()
    {
        return new ConsoleLogger(BuildConfig.DEBUG, "application");
    }
}
