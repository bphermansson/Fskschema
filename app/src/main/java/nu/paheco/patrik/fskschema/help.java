package nu.paheco.patrik.fskschema;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

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

        // Create helptext with strings från strings.xml.
        String htmlDocument =
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" +
                        "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">" +
                        "<head>" +
                        "<title>Förskoleplaneraren</title>" +
                        "</head><body>" +
                        "<h1>Hjälp för "+
                        getResources().getString(R.string.app_name) +
                        "</h1>" +
                        getResources().getString(R.string.helptext) +
                        "</body></html>";



                        WebView web = (WebView)findViewById(R.id.webHelp);
        web.loadDataWithBaseURL(null, htmlDocument,
                "text/HTML", "UTF-8", null);

        TextView helptext = (TextView)findViewById(R.id.helptext);
        helptext.setTypeface(null, Typeface.BOLD);
        helptext.setText("Hjälp för Förskoleplaneraren");
        helptext.setTypeface(null, Typeface.NORMAL);
        helptext.append("Detta program används för att skriva ut ett schema över barnens förskoletider.\n" +
                "För att använda programmet behövs ett Google-konto med en Google-kalender. I denna kalender skapas en särskild kalender " +
                "för barnet där tiderna när barnet ska vara på förskolan läggs in." +
                "Överst i Förskoleplaneraren syns namnet på din Google-kalender. Har du flera kalendrar kan du peka på namnet och välja barnets kalender." +
                "De händelser som finns inlagda i kalendern kommer då att visas i sammanställningen." +
                "Under kalendernamnet visas aktuell vecka. Som standard visas aktuell vecka, och det går att bläddra i årets veckor med hjälp av piltangenterna. " +
                "Till höger om pilarna finns en rund symbol, peka på denna för att komma tillbaka till aktuell vecka. " +
                "Nästa symbol visar en skrivare. Peka på denna för att se en förhandsgranskning över det som kommer att skrivas ut." +
                "");
        //TextView curinfo=(TextView)findViewById(R.id.curinfo);

    }
}
