package com.example.application019_toggleswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private String statusSwitch = "";
    private String statusToggle = "";

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

        monitoradorDeEstado();

    }

    public void monitoradorDeEstado() {

        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                boolean estadoSwitch = switchSenha.isChecked();

                if(estadoSwitch) {
                    statusSwitch = "Switch ativado - ";
                    viewResultado.setText(statusSwitch + statusToggle);
                } else {
                    statusSwitch = "Switch desativado - ";
                    viewResultado.setText(statusSwitch + statusToggle);
                }

            }
        });

        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                boolean estadoToggle = toggleSenha.isChecked();

                if(estadoToggle) {
                    statusToggle = "Toggle ativado - ";
                    viewResultado.setText(statusSwitch + statusToggle);
                } else {
                    statusToggle = "Toggle desativado - ";
                    viewResultado.setText(statusSwitch + statusToggle);
                }

            }
        });

    }

}
