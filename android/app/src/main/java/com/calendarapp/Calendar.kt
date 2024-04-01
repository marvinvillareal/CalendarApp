package com.calendarapp

import android.util.Log
import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.Date

class Calendar: ReactPackage {
    override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> = listOf(MyCalendarModule(p0)).toMutableList()

    override fun createViewManagers(p0: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()
}

class MyCalendarModule(reactApplicationContext: ReactApplicationContext): ReactContextBaseJavaModule() {
    override fun getName(): String {
        Log.d("CalendarModule", "Create event called with name:  and location: ")
        return "CalendarManager"
    }

    @ReactMethod
    fun createCalendarEvent(name: String,
                            location: String,
                            date: Double,
                            callback: Callback) {

        Log.d("CalendarModule", "Create event called with name: $name and location: $location")
        callback.invoke("Error! from Android Native Module", "Result from Android Native Module")
    }

}