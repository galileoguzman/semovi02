package com.galileoguzman.semovi02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
    }

    public void btnSayHelloPressed(View view) {
        Log.e("MainActivity", "Button say hello was pressed");
        doSayHello();
    }

    private void doSayHello() {
        String name = etName.getText().toString();
        String regard = "Hola " + name;
        showMessage(regard);
    }
}
