
package com.codeseasy.examples.loginregister;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.codeseasy.examples.loginregister.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class legall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legall);
    }


    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {

            LatLng legall = new LatLng(43.19847535758443, 13.791033553969353);
            googleMap.addMarker(new MarkerOptions().position(legall).title("Marker in Legall"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(legall));


            googleMap.setMaxZoomPreference(14.0f);
            googleMap.setMinZoomPreference(6.0f);


        }
    };
}