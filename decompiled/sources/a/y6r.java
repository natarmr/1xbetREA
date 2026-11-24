package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y6r implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42112a = new Object();
    public final xw3 b = new xw3();
    public boolean c;

    public final void a(cmf0 cmf0Var) {
        cmf0Var.getClass();
        synchronized (this.f42112a) {
            try {
                if (this.c) {
                    return;
                }
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f42112a) {
            if (this.c) {
                return;
            }
            this.c = true;
            Iterator<E> it = this.b.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
            this.b.clear();
        }
    }
}
