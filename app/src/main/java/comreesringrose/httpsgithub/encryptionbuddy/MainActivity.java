package comreesringrose.httpsgithub.encryptionbuddy;

import android.content.Intent;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      //  RelativeLayout content_main = (RelativeLayout) findViewById(R.id.content_main);
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

            case R.id.action_about:
                Intent intent4 = new Intent(this,about.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void encryptbutton(View v)
    {
        Intent intent2 = new Intent(this,SecondScreen.class);
        startActivity(intent2);
    }

    public void decryptbutton(View v)
    {
        Intent intent = new Intent(this,decrypt.class);
        startActivity(intent);
    }
    public void about(View v)
    {
        Intent intent4 = new Intent(this,about.class);
        startActivity(intent4);

    }

}
