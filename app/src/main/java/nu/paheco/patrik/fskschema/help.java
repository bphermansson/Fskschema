package nu.paheco.patrik.fskschema;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import java.net.URLEncoder;

import nu.paheco.patrik.mycalendar.R;

/**
 * Created by user on 11/1/14.
 */
public class help extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        //Log.d("Help", "In onCreate()");
        WebView web = (WebView)findViewById(R.id.webHelp);

        WebSettings settings = web.getSettings();
        settings.setDefaultTextEncodingName("utf-8");
        web.loadUrl("file:///android_asset/helptext.html");
    }
}
