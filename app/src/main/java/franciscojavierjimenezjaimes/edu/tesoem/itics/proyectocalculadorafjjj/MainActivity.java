package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectocalculadorafjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent siguiente = new Intent(MainActivity.this, InicioActivity.class);
                startActivity(siguiente);
                finish();
            }
        }, 5000);
    }
}

