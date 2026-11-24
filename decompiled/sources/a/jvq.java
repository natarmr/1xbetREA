package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class jvq implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17216a;
    public WeakReference b;
    public WeakReference c;
    public boolean d;
    public boolean e;
    public final Handler f;
    public final CopyOnWriteArrayList g;

    public jvq(us00 us00Var) {
        us00Var.getClass();
        this.f17216a = us00Var;
        this.e = true;
        this.f = new Handler();
        this.g = new CopyOnWriteArrayList();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (activity instanceof kxq) {
            this.b = new WeakReference(activity);
        }
        if (activity instanceof ApplicationActivity) {
            this.c = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.e = true;
        this.f.postDelayed(new ccf(this, (byte) 26), 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.e = false;
        boolean z = this.d;
        this.d = true;
        if (activity instanceof yc3) {
            this.b = new WeakReference(activity);
        }
        if (z) {
            Log.i("a.jvq", "still foreground");
            return;
        }
        Log.i("a.jvq", "went foreground");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((js3) it.next()).b();
            } catch (Exception e) {
                Log.e("a.jvq", "Listener threw exception!", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
