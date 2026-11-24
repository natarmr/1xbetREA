package a;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class aub extends wvh0 {
    public final q99 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public aub(long j, aub aubVar, q99 q99Var, int i) {
        super(j, aubVar, i);
        this.g = q99Var;
        this.h = new AtomicReferenceArray(s99.b * 2);
    }

    @Override // a.wvh0
    public final int g() {
        return s99.b;
    }

    @Override // a.wvh0
    public final void h(int i, CoroutineContext coroutineContext) {
        q99 q99Var;
        int i2 = s99.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.h.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof nvu0;
            q99Var = this.g;
            if (z2 || (objL instanceof ovu0)) {
                if (k(i, objL, z ? s99.j : s99.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        q99Var.getClass();
                        Function1 function1 = q99Var.b;
                        if (function1 != null) {
                            vdx.E(function1, obj, coroutineContext);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objL == s99.j || objL == s99.k) {
                    break;
                }
                if (objL != s99.g && objL != s99.f) {
                    if (objL == s99.i || objL == s99.d || objL == s99.l) {
                        return;
                    }
                    udk.e(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            q99Var.getClass();
            Function1 function2 = q99Var.b;
            if (function2 != null) {
                vdx.E(function2, obj, coroutineContext);
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            q99 q99Var = this.g;
            q99Var.getClass();
            q99Var.P((this.d * ((long) s99.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
