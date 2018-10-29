package rojas.cayola.rodrigo.alacran.com.alacran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt_num1;
    private EditText txt_num2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_num1 = (EditText)findViewById(R.id.Text_num1);
        txt_num2 = (EditText)findViewById(R.id.Text_num2);
        result   = (TextView)findViewById(R.id.txt_result);
    }

    public void promedio(View view){
        String valor1 = txt_num1.getText().toString();
        String valor2 = txt_num2.getText().toString();

        int num1 = Integer.parseInt (valor1);
        int num2 = Integer.parseInt (valor2);

        int resultado_Promedio = (num1+num2)/2;
        String resultado = String.valueOf(resultado_Promedio);
        result.setText(resultado);
    }

}
