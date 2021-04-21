package com.bobapp;
import android.content.Context;
import android.content.Intent;

public class BOBClass {
    public static void callActivity(Context context, Intent intent) {
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
