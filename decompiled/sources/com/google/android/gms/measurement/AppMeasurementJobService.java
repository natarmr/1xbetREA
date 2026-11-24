package com.google.android.gms.measurement;

import a.drm0;
import a.h4x0;
import a.hf5;
import a.k3x0;
import a.m6x0;
import a.oqw0;
import a.s0x;
import a.svs0;
import a.uuw0;
import a.wrw0;
import a.z5x0;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements h4x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public drm0 f45536a;

    @Override // a.h4x0
    public final void a(Intent intent) {
    }

    @Override // a.h4x0
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final drm0 c() {
        drm0 drm0Var = this.f45536a;
        if (drm0Var != null) {
            return drm0Var;
        }
        drm0 drm0Var2 = new drm0((Object) this);
        this.f45536a = drm0Var2;
        return drm0Var2;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        drm0 drm0VarC = c();
        Service service = (Service) drm0VarC.f6568a;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            s0x.H(string);
            m6x0 m6x0VarZ = m6x0.z(service);
            uuw0 uuw0VarR = m6x0VarZ.r();
            svs0 svs0Var = m6x0VarZ.l.c;
            uuw0VarR.o.b(string, "Local AppMeasurementJobService called. action");
            m6x0VarZ.J().v1(new z5x0(drm0VarC, m6x0VarZ, new hf5(drm0VarC, uuw0VarR, jobParameters, (byte) 22)));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            s0x.H(string);
            wrw0 wrw0VarE = wrw0.e(service, null);
            k3x0 k3x0Var = new k3x0(drm0VarC, jobParameters, (byte) 3);
            wrw0VarE.getClass();
            wrw0VarE.c(new oqw0(wrw0VarE, k3x0Var, (byte) 1));
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
        throw new UnsupportedOperationException();
    }
}
