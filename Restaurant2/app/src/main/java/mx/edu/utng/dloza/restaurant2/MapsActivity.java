package mx.edu.utng.dloza.restaurant2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }

    public void map (View view){
        Intent intent= new Intent(MapsActivity.this,MapsActivity.class);
        startActivity(intent);
    }
}
