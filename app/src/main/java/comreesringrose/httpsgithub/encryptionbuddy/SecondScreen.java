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
 * Created by Rees on 11/04/2017.
 */

public class SecondScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt_layout);
    }

    private EditText input,passInput;
    private TextView textout;
    //private String key;

    public String stringInput;
   // Button button = new  (Button) findViewById(R.id.button1);


          public void buttonOnClick2(View v)
    {

        input = (EditText) findViewById(R.id.txtInput);
        passInput = (EditText) findViewById(R.id.passInput);


        if (input == null || passInput == null )
        {
            Toast.makeText(this, "You did not enter any input", Toast.LENGTH_SHORT).show();


        }
        else
        {


            input = (EditText) findViewById(R.id.txtInput);
           textout = (TextView) findViewById(R.id.textOutput);


            passInput = (EditText) findViewById(R.id.passInput);
            String key = passInput.getText().toString();
            String inputText = input.getText().toString();

            String enc = encrypt(inputText, key);
           // String inputText = input.getText().toString();
            textout.setText(enc);


        }


    }

    static String encrypt(String text,String key) {
        String res = "";
        text = text.toUpperCase();
        key = key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;





    }



}



