package com.sdcards.greenit.greenit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by neha on 11/21/2015.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final Context con=this;
        final Thread t=new Thread(){
            public void run() {

                super.run();
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);

                } finally {
                    Intent c = new Intent(con, IntroActivity.class);
                    startActivity(c);
                }
            }
        };
            t.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
