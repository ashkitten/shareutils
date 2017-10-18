package net.ashkitten.shareutils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LaunchUrlActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(sharedText));
            startActivity(i);
        }
        finish();
    }
}
