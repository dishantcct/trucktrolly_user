package com.trucktrollyuser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/*
 * Created by Umesh Prajapati on 20-03-2016.
 */
public class SignUpActivity extends AppCompatActivity {

    private EditText edtTextName;
    private EditText edtTextEmail;
    private EditText edtTextMobileNumber;
    private EditText edtTextPassword;
    private EditText edtTextConfirmPassword;
    private Button   btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_screen);

        edtTextName     =   (EditText) findViewById(R.id.editTextName);

    }
}
