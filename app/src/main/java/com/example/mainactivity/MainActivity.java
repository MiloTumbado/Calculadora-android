import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mainactivity.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextResult = findViewById(R.id.editTextResult);

        // Configurar clics de botón
        Button btnEqual = findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implementa la lógica de cálculo aquí
                // Puedes usar la clase JavaScriptEvaluator para evaluar la expresión matemática
            }
        });
    }
}

