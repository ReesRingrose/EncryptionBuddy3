package comreesringrose.httpsgithub.encryptionbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
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

public class SecondScreen extends AppCompatActivity
{


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //  RelativeLayout content_main = (RelativeLayout) findViewById(R.id.);
        switch (item.getItemId()) {
            case R.id.action_settings:

                return true;
            case R.id.action_encryption:

                Intent intent = new Intent(this,SecondScreen.class);
                startActivity(intent);

                return true;
            case R.id.action_decryption:

                Intent intent2 = new Intent(this,decrypt.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


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



