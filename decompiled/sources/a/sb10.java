package a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class sb10 {
    public static final Executor e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f31909a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile ob10 d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new ew3((byte) 1);
        } else {
            e = Executors.newCachedThreadPool(new tb10());
        }
    }

    public sb10(Callable callable, boolean z) {
        if (z) {
            try {
                d((ob10) callable.call());
                return;
            } catch (Throwable th) {
                d(new ob10(th));
                return;
            }
        }
        Executor executor = e;
        rb10 rb10Var = new rb10(callable);
        rb10Var.b = this;
        executor.execute(rb10Var);
    }

    public final synchronized void a(kb10 kb10Var) {
        Throwable th;
        try {
            ob10 ob10Var = this.d;
            if (ob10Var != null && (th = ob10Var.b) != null) {
                kb10Var.onResult(th);
            }
            this.b.add(kb10Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(kb10 kb10Var) {
        fa10 fa10Var;
        try {
            ob10 ob10Var = this.d;
            if (ob10Var != null && (fa10Var = ob10Var.f24955a) != null) {
                kb10Var.onResult(fa10Var);
            }
            this.f31909a.add(kb10Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        ob10 ob10Var = this.d;
        if (ob10Var == null) {
            return;
        }
        fa10 fa10Var = ob10Var.f24955a;
        if (fa10Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f31909a).iterator();
                while (it.hasNext()) {
                    ((kb10) it.next()).onResult(fa10Var);
                }
            }
            return;
        }
        Throwable th = ob10Var.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                xv00.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((kb10) it2.next()).onResult(th);
            }
        }
    }

    public final void d(ob10 ob10Var) {
        if (this.d != null) {
            jf4.n("A task may only be set once.");
            return;
        }
        this.d = ob10Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new wss(this, (byte) 7));
        }
    }

    public sb10(fa10 fa10Var) {
        d(new ob10(fa10Var));
    }
}
