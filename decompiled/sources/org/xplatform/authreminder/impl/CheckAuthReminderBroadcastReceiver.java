package org.xplatform.authreminder.impl;

import a.af3;
import a.b1j;
import a.in4;
import a.jf4;
import a.o5d0;
import a.ze3;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckAuthReminderBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (Intrinsics.d(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            Context applicationContext = context.getApplicationContext();
            ComponentCallbacks2 componentCallbacks2 = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (componentCallbacks2 == null) {
                return;
            }
            af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(in4.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                in4 in4Var = (in4) (ze3Var instanceof in4 ? ze3Var : null);
                if (in4Var != null) {
                    in4Var.f15055a.h().Z(true);
                    return;
                }
            }
            jf4.n(b1j.i(in4.class, "Cannot create dependency "));
        }
    }
}
