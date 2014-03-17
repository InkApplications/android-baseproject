package com.myvendor.myapp;

import com.inkapplications.android.standard.BaseApplication;
import com.myvendor.myapp.dependencyinjection.module.ApplicationModule;

import java.util.List;

public class Application extends BaseApplication
{
    @Override
    public List<Object> getModules()
    {
        List<Object> modules = super.getModules();

        modules.add(new ApplicationModule());

        return modules;
    }
}
