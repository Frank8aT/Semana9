package xyz.devien.myapplication222222;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView TextView;
    TextView textView2;
    int val1, val2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button=findViewById(R.id.button);
        button=findViewById(R.id.button);
        TextView= (TextView)findViewById(R.id.textView);
        textView2=(TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                /*Random random = new Random();
                int val = random.nextInt(10);
                TextView.setText(Integer.toString(val));*/
                if (val1 == 0) {
                    Random random = new Random();
                    val1 = random.nextInt(10);
                    TextView.setText(Integer.toString(val1));
                    button.setText("Jugador2");
                } else {
                    Random random = new Random();
                    val2 = random.nextInt(10);
                    textView2.setText(Integer.toString(val2));

                    // Comparar los valores
                    if (val1 > val2) {
                        // val1 es mayor que val2
                    } else if (val1 < val2) {
                        // val1 es menor que val2
                    } else {
                        // val1 es igual a val2
                    }
                }
            }
        });
    }
}
