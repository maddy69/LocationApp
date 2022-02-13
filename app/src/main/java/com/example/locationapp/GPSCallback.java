package com.example.locationapp;

import android.location.Location;

/**
 *
 */
interface GPSCallback

        void onGPSUpdate(Location location);

public interface GPSCallback

{
    public abstract void onGPSUpdate(Location location);
    speed = location.getSpeed();
    currentSpeed = round(speed,3,BigDecimal.ROUND_HALF_UP);
    kmphSpeed = round((currentSpeed*3.6),3,BigDecimal.ROUND_HALF_UP);
}

