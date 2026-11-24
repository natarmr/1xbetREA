package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class b23 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1836a;
    public final /* synthetic */ td9 b;

    public b23(td9 td9Var, gbe0 gbe0Var) {
        this.b = td9Var;
        dbe0 dbe0Var = gbe0Var.f11014a;
        kuo kuoVar = u0x.f34876a;
        Object obj = dbe0Var.b.n.f20682a.get(u0x.d);
        this.f1836a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.f1836a;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        td9 td9Var = this.b;
        gbe0 gbe0Var = (gbe0) ((WeakReference) td9Var.b).get();
        if (gbe0Var == null) {
            td9Var.i();
            return;
        }
        jbe0 jbe0VarD = gbe0Var.d();
        if (jbe0VarD != null) {
            synchronized (jbe0VarD.c) {
                j = jbe0VarD.f16237a.f29768a;
            }
            jbe0VarD.b((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.f1836a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        td9 td9Var = this.b;
        gbe0 gbe0Var = (gbe0) ((WeakReference) td9Var.b).get();
        if (gbe0Var == null) {
            td9Var.i();
            return;
        }
        jbe0 jbe0VarD = gbe0Var.d();
        if (jbe0VarD != null) {
            synchronized (jbe0VarD.c) {
                j = jbe0VarD.f16237a.f29768a;
            }
            jbe0VarD.b(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
