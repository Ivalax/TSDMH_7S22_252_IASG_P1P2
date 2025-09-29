package mx.edu.tesoem.isc.tsdmh_7s22_252_iasg_p1p2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView resultado;
    Button btnsumar,btnrestar,btndivi,btnmult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        num1 = findViewById(R.id.txtnum);
        num2 = findViewById(R.id.txtnum2);
        resultado = findViewById(R.id.resultado);
        btnsumar = findViewById(R.id.btnsuma);
        btnrestar = findViewById(R.id.btnresta);
        btndivi = findViewById(R.id.btndivision);
        btnmult = findViewById(R.id.btnmultiplicacion);

        btnsumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int re = n1+n2;
                resultado.setText("El resultado de la operacion es: " + String.valueOf(re));
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int re = n1-n2;
                resultado.setText("El resultado de la operacion es: " + String.valueOf(re));
            }
        });

        btndivi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int re = n1/n2;
                resultado.setText("El resultado de la operacion es: " + String.valueOf(re));
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int re = n1*n2;
                resultado.setText("El resultado de la operacion es: " + String.valueOf(re));
            }
        });
    }
}