package com.google.firebase.analytics;

import a.cgq;
import a.d1x0;
import a.dgq;
import a.itt0;
import a.kqw0;
import a.nfq;
import a.s0x;
import a.upw0;
import a.wrw0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrw0 f45641a;

    public FirebaseAnalytics(wrw0 wrw0Var) {
        s0x.H(wrw0Var);
        this.f45641a = wrw0Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(wrw0.e(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static d1x0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        wrw0 wrw0VarE = wrw0.e(context, bundle);
        if (wrw0VarE == null) {
            return null;
        }
        return new upw0(wrw0VarE);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = cgq.l;
            return (String) Tasks.await(((cgq) nfq.d().b(dgq.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            itt0.o(e);
            return null;
        } catch (ExecutionException e2) {
            itt0.o(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdd zzddVarM = zzdd.m(activity);
        wrw0 wrw0Var = this.f45641a;
        wrw0Var.getClass();
        wrw0Var.c(new kqw0(wrw0Var, zzddVarM, str, str2));
    }
}
