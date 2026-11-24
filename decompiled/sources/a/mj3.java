package a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mj3 implements Application.ActivityLifecycleCallbacks {
    public static final f03 q = f03.d();
    public static volatile mj3 r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f21874a;
    public final WeakHashMap b;
    public final WeakHashMap c;
    public final WeakHashMap d;
    public final HashMap e;
    public final HashSet f;
    public final HashSet g;
    public final AtomicInteger h;
    public final dps0 i;
    public final hsd j;
    public final yk5 k;
    public Timer l;
    public Timer m;
    public ts3 n;
    public boolean o;
    public boolean p;

    public mj3(dps0 dps0Var, yk5 yk5Var) {
        hsd hsdVarE = hsd.e();
        f03 f03Var = e7r.e;
        this.f21874a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new AtomicInteger(0);
        this.n = ts3.BACKGROUND;
        this.o = false;
        this.p = true;
        this.i = dps0Var;
        this.k = yk5Var;
        this.j = hsdVarE;
    }

    public static mj3 a() {
        if (r == null) {
            synchronized (mj3.class) {
                try {
                    if (r == null) {
                        r = new mj3(dps0.s, new yk5());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return r;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l = (Long) this.e.get(str);
                HashMap map = this.e;
                if (l == null) {
                    map.put(str, 1L);
                } else {
                    map.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if (((tgq) it.next()) != null) {
                        try {
                            f03 f03Var = sgq.b;
                        } catch (IllegalStateException e) {
                            tgq.f33925a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Activity activity) {
        v680 v680Var;
        WeakHashMap weakHashMap = this.d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        e7r e7rVar = (e7r) this.b.get(activity);
        ivn ivnVar = e7rVar.b;
        HashMap map = e7rVar.c;
        f03 f03Var = e7r.e;
        if (e7rVar.d) {
            if (!map.isEmpty()) {
                f03Var.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            v680 v680VarA = e7rVar.a();
            try {
                ivnVar.n(e7rVar.f7340a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                f03Var.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                v680VarA = new v680();
            }
            ((o24) ivnVar.f15453a).b = new SparseIntArray[9];
            e7rVar.d = false;
            v680Var = v680VarA;
        } else {
            f03Var.a("Cannot stop because no recording was started");
            v680Var = new v680();
        }
        if (v680Var.b()) {
            j9h0.a(trace, (d7r) v680Var.a());
            trace.stop();
        } else {
            q.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void e(String str, Timer timer, Timer timer2) {
        if (this.j.n()) {
            fbs0 fbs0VarH = ibs0.H();
            fbs0VarH.p(str);
            fbs0VarH.n(timer.f45671a);
            fbs0VarH.o(timer.b(timer2));
            rd90 rd90VarA = SessionManager.getInstance().perfSession().a();
            fbs0VarH.i();
            ((ibs0) fbs0VarH.b).t(rd90VarA);
            int andSet = this.h.getAndSet(0);
            synchronized (this.e) {
                try {
                    HashMap map = this.e;
                    fbs0VarH.i();
                    ((ibs0) fbs0VarH.b).F().putAll(map);
                    if (andSet != 0) {
                        fbs0VarH.m(andSet, "_tsns");
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.i.c((ibs0) fbs0VarH.h(), ts3.FOREGROUND_BACKGROUND);
        }
    }

    public final void f(Activity activity) {
        if (this.j.n()) {
            e7r e7rVar = new e7r(activity);
            this.b.put(activity, e7rVar);
            if (activity instanceof kxq) {
                h5r h5rVar = new h5r(this.k, this.i, this, e7rVar);
                this.c.put(activity, h5rVar);
                ((kxq) activity).r().k0(h5rVar, true);
            }
        }
    }

    public final void g(ts3 ts3Var) {
        this.n = ts3Var;
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    lj3 lj3Var = (lj3) ((WeakReference) it.next()).get();
                    if (lj3Var != null) {
                        lj3Var.onUpdateAppState(this.n);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b.remove(activity);
        WeakHashMap weakHashMap = this.c;
        if (weakHashMap.containsKey(activity)) {
            ((kxq) activity).r().B0((q1r) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f21874a.isEmpty()) {
                this.l = new Timer();
                this.f21874a.put(activity, Boolean.TRUE);
                if (this.p) {
                    g(ts3.FOREGROUND);
                    c();
                    this.p = false;
                } else {
                    e("_bs", this.m, this.l);
                    g(ts3.FOREGROUND);
                }
            } else {
                this.f21874a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.j.n()) {
                if (!this.b.containsKey(activity)) {
                    f(activity);
                }
                ((e7r) this.b.get(activity)).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.i, this.k, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        d(activity);
        if (this.f21874a.containsKey(activity)) {
            this.f21874a.remove(activity);
            if (this.f21874a.isEmpty()) {
                Timer timer = new Timer();
                this.m = timer;
                e("_fs", this.l, timer);
                g(ts3.BACKGROUND);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
