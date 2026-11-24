package androidx.work.impl.background.systemalarm;

import a.cpv0;
import a.wv00;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45417a = wv00.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wv00.f().a(f45417a, "Received intent " + intent);
        try {
            cpv0 cpv0VarD = cpv0.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            cpv0VarD.getClass();
            synchronized (cpv0.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = cpv0VarD.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    cpv0VarD.i = pendingResultGoAsync;
                    if (cpv0VarD.h) {
                        pendingResultGoAsync.finish();
                        cpv0VarD.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            wv00.f().e(f45417a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
