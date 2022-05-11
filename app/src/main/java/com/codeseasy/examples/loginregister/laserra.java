


package com.codeseasy.examples.loginregister;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import com.codeseasy.examples.loginregister.R;
        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;

public class laserra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laserra);
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

            LatLng laserra = new LatLng (43.29417890765281, 13.733612576113957);
            googleMap.addMarker(new MarkerOptions().position(laserra).title("Marker in LaSerra"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(laserra));


            googleMap.setMaxZoomPreference(14.0f);
            googleMap.setMinZoomPreference(6.0f);


        }
    };
}