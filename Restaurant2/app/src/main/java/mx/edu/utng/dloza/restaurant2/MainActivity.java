package mx.edu.utng.dloza.restaurant2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void new1 (View view){
        Intent intent= new Intent(MainActivity.this,RestaurantActivity.class);
        startActivity(intent);
    }



}
