package com.yushan.module_compete;


import com.yushan.lib_base.base.ApplicationDelegate;
import com.yushan.lib_base.base.ViewManager;

/**
 * <p>类说明</p>
 *
 * @author yushan
 * @version V2.8.3
 * @name MyDelegate
 */


public class MyDelegate implements ApplicationDelegate {

    @Override
    public void onCreate() {
        ViewManager.getInstance().addFragment(0, new TeamFragment());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
