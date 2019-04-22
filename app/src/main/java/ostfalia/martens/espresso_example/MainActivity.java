package ostfalia.martens.espresso_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeButton;
    private TextView view;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = findViewById(R.id.button);
        view = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toBeChanged = editText.getText().toString();
                view.setText(toBeChanged);
                editText.setText("");
            }
        });
    }
}
