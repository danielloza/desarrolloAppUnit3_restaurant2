package mx.edu.utng.dloza.restaurant2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    public void map (View view){
        Intent intent= new Intent(RestaurantActivity.this,MapsActivity.class);
        startActivity(intent);
    }
}
