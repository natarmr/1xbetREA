package a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class v4 extends p8a {
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;

    public v4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.m = atomicReferenceFieldUpdater;
        this.n = atomicReferenceFieldUpdater2;
        this.o = atomicReferenceFieldUpdater3;
        this.p = atomicReferenceFieldUpdater4;
        this.q = atomicReferenceFieldUpdater5;
    }

    @Override // a.p8a
    public final boolean M(y4 y4Var, u4 u4Var, u4 u4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(y4Var, u4Var, u4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y4Var) == u4Var);
        return false;
    }

    @Override // a.p8a
    public final boolean N(y4 y4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(y4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y4Var) == obj);
        return false;
    }

    @Override // a.p8a
    public final boolean O(y4 y4Var, x4 x4Var, x4 x4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(y4Var, x4Var, x4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y4Var) == x4Var);
        return false;
    }

    @Override // a.p8a
    public final void b0(x4 x4Var, x4 x4Var2) {
        this.n.lazySet(x4Var, x4Var2);
    }

    @Override // a.p8a
    public final void c0(x4 x4Var, Thread thread) {
        this.m.lazySet(x4Var, thread);
    }
}
