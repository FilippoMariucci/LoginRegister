package com.codeseasy.examples.loginregister;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

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

            LatLng donoma = new LatLng(43.30596733454052, 13.730025907938705);
            googleMap.addMarker(new MarkerOptions().position(donoma).title("Marker in Donoma"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(donoma));


            LatLng brahma = new LatLng(43.29531797531458, 13.735240630687098);
            googleMap.addMarker(new MarkerOptions().position(brahma).title("Marker in Brahma"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(brahma));

            LatLng la_serra = new LatLng(43.29448736298287, 13.733617946030646);
            googleMap.addMarker(new MarkerOptions().position(la_serra).title("Marker in La Serra"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(la_serra));

            LatLng le_gall = new LatLng(43.19856921167434, 13.791248130687098);
            googleMap.addMarker(new MarkerOptions().position(le_gall).title("Marker in Le Gall Discoteca"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(le_gall));

            LatLng luxury = new LatLng(43.178816670176694, 13.78422918465645);
            googleMap.addMarker(new MarkerOptions().position(luxury).title("Marker in Luxury"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(luxury));

            googleMap.setMaxZoomPreference(14.0f);
            googleMap.setMinZoomPreference(6.0f);


        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}