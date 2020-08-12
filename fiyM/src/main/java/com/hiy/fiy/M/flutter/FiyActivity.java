package com.hiy.fiy.M.flutter;

import android.os.Bundle;
import android.os.Handler;

import com.idlefish.flutterboost.containers.BoostFlutterActivity;

import io.flutter.embedding.engine.FlutterEngine;

public class FiyActivity extends BoostFlutterActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FlutterEngine flutterEngine = getFlutterEngine();
        if (flutterEngine != null) {
            FiyPlugin fiyPlugin = new FiyPlugin();
            flutterEngine.getPlugins().add(fiyPlugin);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
//                    fiyPlugin.getChannel().invokeMethod("test", "native => flutter");
                }
            }, 1500);
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


}
