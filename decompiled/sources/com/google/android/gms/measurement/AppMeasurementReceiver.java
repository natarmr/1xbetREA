package com.google.android.gms.measurement;

import a.cpw0;
import a.kxw0;
import a.tvu0;
import a.uuw0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends tvu0 {
    public cpw0 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new cpw0(this);
        }
        uuw0 uuw0Var = kxw0.l(context, null, null, null).f;
        kxw0.g(uuw0Var);
        if (intent == null) {
            uuw0Var.j.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        uuw0Var.o.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                uuw0Var.j.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        uuw0Var.o.a("Starting wakeful intent.");
        SparseArray sparseArray = tvu0.f34620a;
        synchronized (sparseArray) {
            try {
                int i = tvu0.b;
                int i2 = i + 1;
                tvu0.b = i2;
                if (i2 <= 0) {
                    tvu0.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
