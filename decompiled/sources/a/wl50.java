package a;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wl50 {
    public static wl50 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f39337a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public wl50(Context context) {
        Executor executorP0 = kc5.P0();
        this.f39337a = executorP0;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorP0.execute(new llo(this, context, (byte) 28));
    }

    public static synchronized wl50 a(Context context) {
        wl50 wl50Var;
        wl50Var = f;
        if (wl50Var == null) {
            wl50Var = new wl50(context);
            f = wl50Var;
        }
        return wl50Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<vl50> copyOnWriteArrayList = this.b;
        for (vl50 vl50Var : copyOnWriteArrayList) {
            if (vl50Var.f37606a.get() == null) {
                copyOnWriteArrayList.remove(vl50Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (vl50 vl50Var2 : this.b) {
                    vl50Var2.b.execute(new wss(vl50Var2, (byte) 13));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
