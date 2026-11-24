package org.xplatform.authenticator.impl;

import a.cpv0;
import a.ga3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ConfirmationAuthenticatorBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : extras.keySet()) {
                linkedHashMap.put(str, String.valueOf(extras.get(str)));
            }
            cpv0 cpv0VarD = cpv0.d(context);
            cpv0VarD.getClass();
            ga3.d(cpv0VarD, context, linkedHashMap);
        }
    }
}
