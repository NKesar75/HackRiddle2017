package domain.hackathon.hackathon2017;

import android.*;
import android.Manifest;
import android.app.Activity;


import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;


/**
 * Created by andy1 on 11/11/2017.
 */


public class GPS_class extends Activity {
   private LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
   private LocationListener locationListener;
   private int x;

   public void GetCurrentlocation() {
      locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
      locationListener = new LocationListener() {
         @Override
         public void onLocationChanged(Location location) {

         }

         @Override
         public void onStatusChanged(String s, int i, Bundle bundle) {

         }

         @Override
         public void onProviderEnabled(String s) {

         }

         @Override
         public void onProviderDisabled(String s) {

         }
      };

      if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
         requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.INTERNET},10);
         return;
      }
      locationManager.requestLocationUpdates("gps", 5000, 0, locationListener);
   }



}
