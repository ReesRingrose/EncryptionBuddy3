package comreesringrose.httpsgithub.encryptionbuddy;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

import static android.R.id.list;

/**
 * Created by Rees on 13/04/2017.
 */

public class decrypt extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decrypt_layout);
    }

    private EditText input,passInput;
    private TextView textout;
   // private String key,text;

    public void buttonOnClick1(View v)
    {

        input = (EditText) findViewById(R.id.inputtext);
        passInput = (EditText) findViewById(R.id.enterPassword);
        if (input == null || passInput == null )
        {
            Toast.makeText(this, "You did not enter any input", Toast.LENGTH_SHORT).show();


        }
        else
        {
            textout = (TextView) findViewById(R.id.output);

            String key = passInput.getText().toString();
            String text  = input.getText().toString();

            String rec = decrypter(text,key);
            textout.setText(rec);



        }
    }

    static String decrypter(String text,String key) {
        String res = "";
        text = text.toUpperCase();
        key = key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
            //yes sir
        }
        return res;
    }
}
