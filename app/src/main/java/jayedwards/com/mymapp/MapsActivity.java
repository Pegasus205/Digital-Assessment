package jayedwards.com.mymapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import jayedwards.com.mymapp.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);


        // Add a marker in Sydney and move the camera
        LatLng sheldon = new LatLng(-27.5702, 153.2324);
        mMap.addMarker(new MarkerOptions().position(sheldon).title("Sheldon College"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sheldon));


        //Add a marker in Sheldon, the ilinq building and move the camera
        LatLng Ilinq = new LatLng (-27.568738, 153.233793);
        mMap.addMarker (new MarkerOptions().position(Ilinq).title("ilinq Precinct"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sheldon));

        //Add a marker in Sheldon, the Stadium building and move the camera
        LatLng Stadium = new LatLng (-27.569689, 153.232741);
        mMap.addMarker (new MarkerOptions().position(Stadium).title("Stadium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Stadium));

        //Add a marker in Sheldon, the Science block building and move the camera
        LatLng Science = new LatLng (-27.569556, 153.233235);
        mMap.addMarker (new MarkerOptions().position(Science).title("Science Block"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Science));

        //Add a marker in Sheldon, the Art, Ideas and Year 10 Home rooms block building and move the camera
        LatLng Art = new LatLng (-27.569385, 153.233750);
        mMap.addMarker (new MarkerOptions().position(Art).title("Art Block"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Art));

        //Add a marker in Sheldon, the english block building and move the camera
        LatLng English = new LatLng (-27.569385, 153.234286);
        mMap.addMarker (new MarkerOptions().position(English).title("English Block"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(English));

        //Add a marker in Sheldon, the SLC block building and move the camera
        LatLng SLC = new LatLng (-27.569990, 153.234107);
        mMap.addMarker (new MarkerOptions().position(SLC).title("SLC Block"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SLC));

        //move map view camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sheldon));
    }
}