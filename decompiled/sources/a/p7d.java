package a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p7d implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f26500a = new LinkedHashMap();
    public volatile Map b;

    public p7d() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.b = lunVar;
    }

    @Override // a.bmf0
    public final void a(gnf0 gnf0Var, long j) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new tx9((bmf0) entry.getKey(), gnf0Var, j, (byte) 1));
        }
    }

    public final void b(bmf0 bmf0Var, ex2 ex2Var) {
        ex2Var.getClass();
        if (this.b.containsKey(bmf0Var)) {
            throw new IllegalStateException((bmf0Var + " was already registered!").toString());
        }
        synchronized (this.f26500a) {
            this.f26500a.put(bmf0Var, ex2Var);
            this.b = xp20.n(this.f26500a);
        }
    }

    @Override // a.bmf0
    public final void c(gnf0 gnf0Var, long j, pz2 pz2Var) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new m7d((bmf0) entry.getKey(), gnf0Var, j, pz2Var, (byte) 1));
        }
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new k7d((bmf0) entry.getKey(), gnf0Var, j, oz2Var, (byte) 0));
        }
    }

    public final void f(bmf0 bmf0Var) {
        bmf0Var.getClass();
        synchronized (this.f26500a) {
            this.f26500a.remove(bmf0Var);
            this.b = xp20.n(this.f26500a);
        }
    }

    @Override // a.bmf0
    public final void k(gnf0 gnf0Var) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new l7d((bmf0) entry.getKey(), gnf0Var, (byte) 1));
        }
    }

    @Override // a.bmf0
    public final void n(gnf0 gnf0Var) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new l7d((bmf0) entry.getKey(), gnf0Var, (byte) 2));
        }
    }

    @Override // a.bmf0
    public final void q(cmf0 cmf0Var) {
        cmf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new fy2((bmf0) entry.getKey(), cmf0Var, (byte) 25));
        }
    }

    @Override // a.bmf0
    public final void r(final gnf0 gnf0Var, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.b.entrySet()) {
            final bmf0 bmf0Var = (bmf0) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: a.n7d
                @Override // java.lang.Runnable
                public final void run() {
                    bmf0Var.r(gnf0Var, j, i, i2);
                }
            });
        }
    }

    @Override // a.bmf0
    public final void v(final gnf0 gnf0Var, final long j, final long j2) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            final bmf0 bmf0Var = (bmf0) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: a.o7d
                @Override // java.lang.Runnable
                public final void run() {
                    bmf0Var.v(gnf0Var, j, j2);
                }
            });
        }
    }

    @Override // a.bmf0
    public final void w(gnf0 gnf0Var, long j, qmf0 qmf0Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new m7d((bmf0) entry.getKey(), gnf0Var, j, qmf0Var, (byte) 0));
        }
    }

    @Override // a.bmf0
    public final void x(gnf0 gnf0Var) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new l7d((bmf0) entry.getKey(), gnf0Var, (byte) 0));
        }
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new k7d((bmf0) entry.getKey(), gnf0Var, j, oz2Var, (byte) 1));
        }
    }
}
