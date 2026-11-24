package com.google.android.gms.measurement.api;

import a.hqw0;
import a.nqw0;
import a.oqw0;
import a.pow0;
import a.qrw0;
import a.vpw0;
import a.wrw0;
import a.xqw0;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrw0 f45538a;

    public AppMeasurementSdk(wrw0 wrw0Var) {
        this.f45538a = wrw0Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return wrw0.e(context, null).b;
    }

    public final void a(vpw0 vpw0Var) {
        wrw0 wrw0Var = this.f45538a;
        ArrayList arrayList = wrw0Var.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (vpw0Var.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qrw0 qrw0Var = new qrw0(vpw0Var);
            arrayList.add(new Pair(vpw0Var, qrw0Var));
            if (wrw0Var.f != null) {
                try {
                    wrw0Var.f.registerOnMeasurementEventListener(qrw0Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            wrw0Var.c(new oqw0(wrw0Var, qrw0Var, (byte) 3));
        }
    }

    public void beginAdUnitExposure(String str) {
        wrw0 wrw0Var = this.f45538a;
        wrw0Var.c(new nqw0(wrw0Var, str, (byte) 1));
    }

    public void endAdUnitExposure(String str) {
        wrw0 wrw0Var = this.f45538a;
        wrw0Var.c(new nqw0(wrw0Var, str, (byte) 2));
    }

    public long generateEventId() {
        return this.f45538a.g();
    }

    public String getAppInstanceId() {
        pow0 pow0Var = new pow0();
        wrw0 wrw0Var = this.f45538a;
        wrw0Var.c(new xqw0(wrw0Var, pow0Var, (byte) 1));
        return (String) pow0.D(pow0Var.C(50L), String.class);
    }

    public String getGmpAppId() {
        pow0 pow0Var = new pow0();
        wrw0 wrw0Var = this.f45538a;
        wrw0Var.c(new xqw0(wrw0Var, pow0Var, (byte) 0));
        return (String) pow0.D(pow0Var.C(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        wrw0 wrw0Var = this.f45538a;
        wrw0Var.c(new hqw0(wrw0Var, str, str2, bundle, true));
    }
}
