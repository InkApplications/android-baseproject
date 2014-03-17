package com.myvendor.myapp.activity;

import com.inkapplications.android.standard.activity.BaseActivity;
import com.myvendor.myapp.dependencyinjection.module.ActivityModule;

import java.util.List;

public class Activity extends BaseActivity
{
    @Override
    public List<Object> getModules()
    {
        List<Object> modules = super.getModules();

        modules.add(new ActivityModule());

        return modules;
    }
}
