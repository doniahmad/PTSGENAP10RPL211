package com.example.ptsgenap10rpl211;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {
    EditText textemail;
    EditText textpassword;
    Button btnlogin;
    Button btngoogle;

    private SignInButton login;
    private GoogleSignInClient mGoogleSignInClient;
    private int RC_SIGN_IN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ini penghilang navigasi
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        textemail = (EditText) findViewById(R.id.txtEmail);
        textpassword = (EditText) findViewById(R.id.txtPassword);
        btnlogin = (Button) findViewById(R.id.buttonLogin);
        btngoogle = (Button) findViewById(R.id.logingoogle);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = textemail.getText().toString();
                String password = textpassword.getText().toString();
                if (email.equalsIgnoreCase("admin@gmail.com")
                        && password.equalsIgnoreCase("admin123")) {
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this, dashboard.class);
                    startActivity(move);
                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btngoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginGoogle();
            }
        });
    }

    private void LoginGoogle() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            final GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            if (account != null){
                Toast.makeText(this,"Login Sukses", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, dashboard.class);
                startActivity(i);
                finish();
            }
            else{
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }
        }
        catch (ApiException e) {
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
        }
    }

}
