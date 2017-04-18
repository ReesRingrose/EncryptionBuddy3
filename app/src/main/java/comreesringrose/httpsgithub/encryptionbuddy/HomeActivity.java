package comreesringrose.httpsgithub.encryptionbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.os.Handler;


public class HomeActivity extends AppCompatActivity
{


    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home1);

        Thread myThread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(3000);
                    Intent intentreturn = new Intent(HomeActivity.this,MainActivity.class);
                    startActivity(intentreturn);
                    finish();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        };

        myThread.start();
    }
}
