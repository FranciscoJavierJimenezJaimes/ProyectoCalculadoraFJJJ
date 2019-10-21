package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectocalculadorafjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity {
    EditText Opcionsuma, suma1;

    Button Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Opcionsuma = (EditText) findViewById(R.id.teclado);

        Action = (Button) findViewById(R.id.botonaccion);

        Action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();

            }
        });

    }

    public void Check() {
        if (Opcionsuma.getText().toString().equals("1")) {
            Intent siguiente = new Intent(InicioActivity.this, SumaActivity.class);
            startActivity(siguiente);
            Toast.makeText(this, "Seleccionaste Opcion 1 Suma.", Toast.LENGTH_SHORT).show();

        }
        if (Opcionsuma.getText().toString().equals("2")) {
            Intent siguiente = new Intent(InicioActivity.this, RestaActivity.class);
            startActivity(siguiente);
            Toast.makeText(this, "Seleccionaste Opcion 2 Resta.", Toast.LENGTH_SHORT).show();

        }
        if (Opcionsuma.getText().toString().equals("3")) {
            Intent siguiente = new Intent(InicioActivity.this, MultiplicarActivity.class);
            startActivity(siguiente);
            Toast.makeText(this, "Seleccionaste Opcion 3 Multiplicación.", Toast.LENGTH_SHORT).show();

        }
        if (Opcionsuma.getText().toString().equals("4")) {
            Intent siguiente = new Intent(InicioActivity.this, DividirActivity.class);
            startActivity(siguiente);
            Toast.makeText(this, "Seleccionaste Opcion 4 Dividir.", Toast.LENGTH_SHORT).show();


        }
        if (Opcionsuma.getText().toString().equals("5")) {
            Intent siguiente = new Intent(InicioActivity.this, AcercadeActivity.class);
            startActivity(siguiente);
            Toast.makeText(this, "Seleccionaste Opcion 5 Acerca de.", Toast.LENGTH_SHORT).show();


        }

    }
}