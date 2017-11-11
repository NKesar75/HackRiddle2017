package domain.hackathon.hackathon2017;

import android.app.Activity;


import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;


/**
 * Created by andy1 on 11/11/2017.
 */



public class GPS_class extends Activity
{
   private LocationManager locationManager=(LocationManager)getSystemService(LOCATION_SERVICE);
   private LocationListener locationListener;
   private int x;
}
