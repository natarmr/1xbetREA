package a;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eby extends hu00 implements nwk, u4x {
    public pby d;

    @Override // a.nwk
    public final void a() {
        eby ebyVar;
        Unsafe unsafe;
        long j;
        pby pbyVarK = k();
        while (true) {
            Object objH = pbyVarK.H();
            if (objH instanceof eby) {
                if (objH != this) {
                    return;
                }
                do {
                    unsafe = defpackage.a.f0a;
                    j = pby.b;
                    if (unsafe.compareAndSwapObject(pbyVarK, j, objH, qby.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(pbyVarK, j) == objH);
            } else {
                if (!(objH instanceof u4x) || ((u4x) objH).c() == null) {
                    return;
                }
                while (true) {
                    Object objG = this.g();
                    if (objG instanceof hjf0) {
                        return;
                    }
                    if (objG == this) {
                        return;
                    }
                    objG.getClass();
                    hu00 hu00Var = (hu00) objG;
                    Unsafe unsafe2 = defpackage.a.f0a;
                    long j2 = hu00.c;
                    hjf0 hjf0Var = (hjf0) unsafe2.getObjectVolatile(hu00Var, j2);
                    if (hjf0Var == null) {
                        hjf0Var = new hjf0(hu00Var);
                        unsafe2.putObjectVolatile(hu00Var, j2, hjf0Var);
                    }
                    hjf0 hjf0Var2 = hjf0Var;
                    while (true) {
                        Unsafe unsafe3 = defpackage.a.f0a;
                        long j3 = hu00.f13658a;
                        ebyVar = this;
                        if (unsafe3.compareAndSwapObject(ebyVar, j3, objG, hjf0Var2)) {
                            hu00Var.e();
                            return;
                        } else if (unsafe3.getObjectVolatile(ebyVar, j3) != objG) {
                            break;
                        } else {
                            this = ebyVar;
                        }
                    }
                    this = ebyVar;
                }
            }
        }
    }

    @Override // a.u4x
    public final u460 c() {
        return null;
    }

    @Override // a.u4x
    public final boolean isActive() {
        return true;
    }

    public final pby k() {
        pby pbyVar = this.d;
        if (pbyVar != null) {
            return pbyVar;
        }
        Intrinsics.h("job");
        throw null;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(Throwable th);

    @Override // a.hu00
    public final String toString() {
        return getClass().getSimpleName() + '@' + qjj.R(this) + "[job@" + qjj.R(k()) + ']';
    }
}
