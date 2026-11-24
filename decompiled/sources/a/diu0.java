package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class diu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hiu0 f6154a = new hiu0();

    public final void s(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        hiu0 hiu0Var = this.f6154a;
        if (hiu0Var.d) {
            hiu0.a(autoCloseable);
            return;
        }
        synchronized (hiu0Var.f13133a) {
            autoCloseable2 = (AutoCloseable) hiu0Var.b.put(str, autoCloseable);
        }
        hiu0.a(autoCloseable2);
    }

    public final void t() {
        hiu0 hiu0Var = this.f6154a;
        if (!hiu0Var.d) {
            hiu0Var.d = true;
            synchronized (hiu0Var.f13133a) {
                try {
                    Iterator it = hiu0Var.b.values().iterator();
                    while (it.hasNext()) {
                        hiu0.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = hiu0Var.c.iterator();
                    while (it2.hasNext()) {
                        hiu0.a((AutoCloseable) it2.next());
                    }
                    hiu0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v();
    }

    public final AutoCloseable u(String str) {
        AutoCloseable autoCloseable;
        hiu0 hiu0Var = this.f6154a;
        synchronized (hiu0Var.f13133a) {
            autoCloseable = (AutoCloseable) hiu0Var.b.get(str);
        }
        return autoCloseable;
    }

    public void v() {
    }
}
