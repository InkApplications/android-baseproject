package com.myvendor.myapp.dependencyinjection.module;

import com.inkapplications.android.standard.dependencyinjection.module.StandardActivityModule;
import com.myvendor.myapp.activity.MainActivity;
import dagger.Module;

@Module(
    includes = {

    },
    injects = {
        MainActivity.class
    },
    addsTo = StandardActivityModule.class,
    complete = false,
    library = true
)
public class ActivityModule
{

}
