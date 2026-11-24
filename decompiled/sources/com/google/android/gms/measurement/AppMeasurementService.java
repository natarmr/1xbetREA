package com.google.android.gms.measurement;

import a.drm0;
import a.h4x0;
import a.kxw0;
import a.m6x0;
import a.oyw0;
import a.tvu0;
import a.uuw0;
import a.z5x0;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements h4x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public drm0 f45537a;

    @Override // a.h4x0
    public final void a(Intent intent) {
        SparseArray sparseArray = tvu0.f34620a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = tvu0.f34620a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.h4x0
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final drm0 c() {
        drm0 drm0Var = this.f45537a;
        if (drm0Var != null) {
            return drm0Var;
        }
        drm0 drm0Var2 = new drm0((Object) this);
        this.f45537a = drm0Var2;
        return drm0Var2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        drm0 drm0VarC = c();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new oyw0(m6x0.z((Service) drm0VarC.f6568a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) c().f6568a).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) c().f6568a).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final drm0 drm0VarC = c();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) drm0VarC.f6568a;
        final uuw0 uuw0Var = kxw0.l(service, null, null, null).f;
        kxw0.g(uuw0Var);
        String action = intent.getAction();
        uuw0Var.o.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: a.j4x0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) drm0VarC.f6568a;
                h4x0 h4x0Var = (h4x0) service2;
                int i3 = i2;
                if (h4x0Var.zza(i3)) {
                    uuw0Var.o.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    uuw0 uuw0Var2 = kxw0.l(service2, null, null, null).f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.o.a("Completed wakeful intent.");
                    h4x0Var.a(intent);
                }
            }
        };
        m6x0 m6x0VarZ = m6x0.z(service);
        m6x0VarZ.J().v1(new z5x0(drm0VarC, m6x0VarZ, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // a.h4x0
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
