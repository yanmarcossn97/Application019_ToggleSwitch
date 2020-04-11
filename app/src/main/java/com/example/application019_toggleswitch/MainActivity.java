package com.example.application019_toggleswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchSenha;
    private ToggleButton toggleSenha;
    private TextView viewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchSenha = findViewById(R.id.switchSenha);
        toggleSenha = findViewById(R.id.toggleSenha);
        viewResultado = findViewById(R.id.viewResultado);

    }

    public void salvarConfig(View view) {
        String statusSwitch = "";
        String statusToggle = "";

        boolean estadoSwitch = switchSenha.isChecked();
        boolean estadoToggle = toggleSenha.isChecked();

        if(estadoSwitch) {
            statusSwitch = "Switch ativado - ";
            viewResultado.setText(statusSwitch);
        } else {
            statusSwitch = "Switch desativado - ";
            viewResultado.setText(statusSwitch);
        }

        if(estadoToggle) {
            statusToggle = "Toggle ativado - ";
            viewResultado.setText(statusSwitch + statusToggle);
        } else {
            statusToggle = "Toggle desativado - ";
            viewResultado.setText(statusSwitch + statusToggle);
        }

    }
}
