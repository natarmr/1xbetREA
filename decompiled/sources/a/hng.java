package a;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hng implements da60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13350a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    @Override // a.da60
    public void a(ca60 ca60Var) {
        synchronized (this.c) {
            d8m0 d8m0Var = (d8m0) ((HashMap) this.e).remove(ca60Var);
            if (d8m0Var != null) {
                d8m0Var.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(d8m0Var);
            }
        }
    }

    @Override // a.da60
    public void b(Executor executor, ca60 ca60Var) {
        d8m0 d8m0Var;
        synchronized (this.c) {
            d8m0 d8m0Var2 = (d8m0) ((HashMap) this.e).remove(ca60Var);
            if (d8m0Var2 != null) {
                d8m0Var2.c.set(false);
                ((CopyOnWriteArraySet) this.f).remove(d8m0Var2);
            }
            d8m0Var = new d8m0((AtomicReference) this.d, executor, ca60Var);
            ((HashMap) this.e).put(ca60Var, d8m0Var);
            ((CopyOnWriteArraySet) this.f).add(d8m0Var);
        }
        d8m0Var.a(0);
    }

    public boolean c(int i, int i2) {
        km40 km40Var = (km40) ((vy40) this.d).g(this.f13350a + i);
        km40 km40Var2 = (km40) ((vy40) this.e).g(this.f13350a + i2);
        return Intrinsics.d(km40Var, km40Var2) || km40Var.getClass() == km40Var2.getClass();
    }

    public void d() {
        synchronized (this.e) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                c4m0 c4m0Var = (c4m0) this.f;
                yje yjeVar = null;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.f = null;
                qjj.W((vne) this.c, null, null, new wup0(this, yjeVar, (byte) 14), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
