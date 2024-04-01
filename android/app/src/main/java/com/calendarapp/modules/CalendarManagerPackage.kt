package com.calendarapp.modules

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.Collections
import android.view.View
import com.facebook.react.uimanager.ReactShadowNode


class CalendarManagerPackage: ReactPackage {
    override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> {
//        val modules = ArrayList<NativeModule>()
//        modules.add(CalendarModule(p0))
//        return modules
        return mutableListOf(CalendarModule(p0))
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> {
        return mutableListOf()
    }
}