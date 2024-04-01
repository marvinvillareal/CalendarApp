package com.calendarapp.modules
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log
import com.facebook.react.bridge.Callback
import java.util.Date

class CalendarModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {


    // add to CalendarModule.kt
    override fun getName(): String = "CalendarModule"

    @ReactMethod
    fun createCalendarEvent(name: String,
                            location: String,
                            date: Date,
                            callback: Callback) {

        Log.d("CalendarModule", "Create event called with name: $name and location: $location")
        callback.invoke("Error! from Android Native Module", "Result from Android Native Module")
    }

    @ReactMethod
    fun createCalendar() {}


}