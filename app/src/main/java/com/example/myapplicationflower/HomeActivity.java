package com.example.myapplicationflower;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    LinearLayout hand;
    LinearLayout box;
    LinearLayout vase;
    LinearLayout jerbs;
    FirebaseAuth auth;

    Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BroadcastReceiver br = new MyReceiver();
        IntentFilter f1 = new IntentFilter(Intent.ACTION_BATTERY_LOW);
        IntentFilter f2 = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        registerReceiver(br,f1);
        registerReceiver(br,f2);

        hand = findViewById(R.id.hand);
        box = findViewById(R.id.box);
        vase = findViewById(R.id.vase);
        jerbs = findViewById(R.id.jerbs);

        hand = findViewById(R.id.hand);
        box = findViewById(R.id.box);
        vase = findViewById(R.id.vase);
        jerbs = findViewById(R.id.jerbs);
        auth = FirebaseAuth.getInstance();
        btnLogout = findViewById(R.id.btnLogout);

        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHand();
            }
        });

        box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBox();
            }
        });

        vase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVase();
            }
        });

        jerbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJerbs();
            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform logout
                auth.signOut();

                // Redirect to MainActivity
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                finish(); // Close the current activity
            }
        });
    }

    public void openHand() {
        Intent intent = new Intent(this, handActivity.class);
        startActivity(intent);
    }

    public void openBox() {
        Intent intent = new Intent(this, boxActivity.class);
        startActivity(intent);
    }

    public void openVase() {
        Intent intent = new Intent(this, vaseActivity.class);
        startActivity(intent);
    }

    public void openJerbs() {
        Intent intent = new Intent(this, jerbsActivity.class);
        startActivity(intent);
    }
    public void gotocart(View view) {
        Intent i = new Intent(this , CartActivity.class);
        startActivity(i);
    }
    public void openLink(View view) {
        String url = view.getTag().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
