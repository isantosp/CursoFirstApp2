package net.ddsmedia.connect.cursofirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void clickEnBoton(View view){
        Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_LONG).show();
    }
}
