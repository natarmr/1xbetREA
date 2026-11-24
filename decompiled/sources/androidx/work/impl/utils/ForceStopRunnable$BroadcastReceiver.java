package androidx.work.impl.utils;

import a.wv00;
import a.ytq;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45420a = wv00.h("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (wv00.f().f39816a <= 2) {
            Log.v(f45420a, "Rescheduling alarm that keeps track of force-stops.");
        }
        ytq.c(context);
    }
}
