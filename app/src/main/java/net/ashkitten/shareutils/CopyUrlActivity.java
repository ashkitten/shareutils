package net.ashkitten.shareutils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class CopyUrlActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (sharedText != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
            clipboardManager.setPrimaryClip(ClipData.newPlainText("share text", sharedText));
            Toast.makeText(this, "Copied URL to clipboard", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
