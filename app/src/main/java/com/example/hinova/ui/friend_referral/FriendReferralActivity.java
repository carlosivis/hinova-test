package com.example.hinova.ui.friend_referral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FriendReferralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_referral);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FriendReferralFragment.newInstance())
                    .commitNow();
        }
    }
}