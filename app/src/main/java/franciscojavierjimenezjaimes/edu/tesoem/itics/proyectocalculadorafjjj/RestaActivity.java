package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectocalculadorafjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1, num2;
    Button btnresta;
    TextView resultado;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        btnresta = (Button) findViewById(R.id.btnresta);
        resultado = (TextView) findViewById(R.id.resultado);
        btnresta.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText n1 = (EditText)findViewById(R.id.num1);
        EditText n2 = (EditText)findViewById(R.id.num2);


        double entero1 = Double.parseDouble(n1.getText().toString());
        double entero2 = Double.parseDouble(n2.getText().toString());

        double resul=entero1-entero2;
        resultado.setText(" "+resul);
        mp = MediaPlayer.create(this,R.raw.clic);
        mp.start();
    }
}

