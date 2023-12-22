package com.example.myapplicationflower;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mContainerView;
    ProgressBar progressBar;
    FirebaseAuth auth;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        mContainerView = findViewById(R.id.welcome);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

        auth = FirebaseAuth.getInstance();
        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        if (preferences.getBoolean("isLoggedIn", false) && auth.getCurrentUser() != null) {
            // User is already logged in, redirect to HomeActivity
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
            finish();
        }

        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.flower3);
        Bitmap blurredBitmap = blurbuilder.blur(this, originalBitmap);
        mContainerView.setBackground(new BitmapDrawable(getResources(), blurredBitmap));
    }

    public void login(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void registration(View view) {
        startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Check if the user is already logged in when the app resumes
        if (auth.getCurrentUser() != null && preferences.getBoolean("isLoggedIn", false)) {
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
            finish();
        }
    }
}
