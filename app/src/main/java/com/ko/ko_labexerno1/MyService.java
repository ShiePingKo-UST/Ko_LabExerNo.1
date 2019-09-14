package com.ko.ko_labexerno1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {public MyService(){
    super("MyService");
}
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("PLACES","UST Main Building");
        Log.d("PLACES","UST Car Park");
        Log.d("PLACES","UST Museum");
        Log.d("PLACES","UST Stadium");

    }
}
