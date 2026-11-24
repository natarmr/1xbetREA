package a;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tj50 extends nz40 {
    public final nz40 o;
    public boolean p;

    public tj50(long j, wfk0 wfk0Var, Function1 function1, Function1 function2, nz40 nz40Var) {
        super(j, wfk0Var, function1, function2);
        this.o = nz40Var;
        nz40Var.k();
    }

    @Override // a.nz40, a.rfk0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // a.nz40
    public final wdx w() {
        tj50 tj50Var;
        nz40 nz40Var = this.o;
        if (nz40Var.m || nz40Var.c) {
            return new sfk0(this);
        }
        iz40 iz40Var = this.h;
        long j = this.b;
        HashMap mapM = iz40Var != null ? xfk0.m(nz40Var.g(), this, this.o.d()) : null;
        Object obj = xfk0.c;
        synchronized (obj) {
            try {
                xfk0.v(this);
                if (iz40Var == null || iz40Var.d == 0) {
                    tj50Var = this;
                    tj50Var.a();
                } else {
                    tj50Var = this;
                    wdx wdxVarZ = tj50Var.z(this.o.g(), iz40Var, mapM, this.o.d());
                    if (!wdxVarZ.equals(tfk0.f33870a)) {
                        return wdxVarZ;
                    }
                    iz40 iz40VarX = tj50Var.o.x();
                    if (iz40VarX != null) {
                        iz40VarX.j(iz40Var);
                    } else {
                        tj50Var.o.B(iz40Var);
                        tj50Var.h = null;
                    }
                }
                if (Intrinsics.f(tj50Var.o.g(), j) < 0) {
                    tj50Var.o.v();
                }
                nz40 nz40Var2 = tj50Var.o;
                nz40Var2.r(nz40Var2.d().c(j).b(tj50Var.j));
                tj50Var.o.A(j);
                nz40 nz40Var3 = tj50Var.o;
                int i = tj50Var.d;
                tj50Var.d = -1;
                if (i >= 0) {
                    int[] iArr = nz40Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    nz40Var3.k = iArrCopyOf;
                } else {
                    nz40Var3.getClass();
                }
                nz40 nz40Var4 = tj50Var.o;
                wfk0 wfk0Var = tj50Var.j;
                nz40Var4.getClass();
                synchronized (obj) {
                    nz40Var4.j = nz40Var4.j.f(wfk0Var);
                    nz40 nz40Var5 = tj50Var.o;
                    int[] iArr2 = tj50Var.k;
                    nz40Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = nz40Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        nz40Var5.k = iArr2;
                    }
                }
                tj50Var.m = true;
                if (!tj50Var.p) {
                    tj50Var.p = true;
                    tj50Var.o.l();
                }
                return tfk0.f33870a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
