package ru.startandroid.newforum;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewTheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_theme);

        newTheme = findViewById(R.id.NewTheme);
        textOfTheme = findViewById(R.id.TextOfTheme);
        save = findViewById(R.id.Save);
        //View.OnClickListener
        newTheme.setText("");
        textOfTheme.setText("");
    }

    TextInputEditText newTheme;
    TextInputEditText textOfTheme;
    Button save;
}
