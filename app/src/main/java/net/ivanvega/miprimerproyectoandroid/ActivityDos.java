package net.ivanvega.miprimerproyectoandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityDos extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_segunda_activity);

        Log.i("acti", "paso por oncreate");

        Toast.makeText(this,
                "Este es un toast", Toast.LENGTH_LONG).show();

        Toast.makeText(this,
                "Este es otro toast", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("acti", "paso por onstart") ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("acti", "paso por onResume") ;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("acti", "Paso poe stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("acti", "Paso poe stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("acti", "Paso poe pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("acti", "Paso poe destroy");
    }
}
