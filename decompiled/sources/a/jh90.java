package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class jh90 extends fh90 {
    public final hh90 e;
    public Object f;
    public boolean g;
    public int h;

    public jh90(hh90 hh90Var, pqs0[] pqs0VarArr) {
        super(hh90Var.c, pqs0VarArr);
        this.e = hh90Var;
        this.h = hh90Var.e;
    }

    public final void e(int i, oqs0 oqs0Var, Object obj, int i2) {
        pqs0[] pqs0VarArr = (pqs0[]) this.d;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int iS = 1 << ktt0.s(i, i3);
            if (oqs0Var.h(iS)) {
                pqs0VarArr[i2].a(oqs0Var.d, Integer.bitCount(oqs0Var.f25705a) * 2, oqs0Var.f(iS));
                this.b = i2;
                return;
            } else {
                int iT = oqs0Var.t(iS);
                oqs0 oqs0VarS = oqs0Var.s(iT);
                pqs0VarArr[i2].a(oqs0Var.d, Integer.bitCount(oqs0Var.f25705a) * 2, iT);
                e(i, oqs0VarS, obj, i2 + 1);
                return;
            }
        }
        pqs0 pqs0Var = pqs0VarArr[i2];
        Object[] objArr = oqs0Var.d;
        pqs0Var.a(objArr, objArr.length, 0);
        while (true) {
            pqs0 pqs0Var2 = pqs0VarArr[i2];
            if (Intrinsics.d(pqs0Var2.b[pqs0Var2.d], obj)) {
                this.b = i2;
                return;
            } else {
                pqs0VarArr[i2].d += 2;
            }
        }
    }

    @Override // a.fh90, java.util.Iterator
    public final Object next() {
        if (this.e.e != this.h) {
            jf4.e();
            return null;
        }
        if (!this.c) {
            itt0.a();
            return null;
        }
        pqs0 pqs0Var = ((pqs0[]) this.d)[this.b];
        this.f = pqs0Var.b[pqs0Var.d];
        this.g = true;
        return super.next();
    }

    @Override // a.fh90, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            v4i0.e();
            return;
        }
        boolean z = this.c;
        hh90 hh90Var = this.e;
        if (!z) {
            zys0.c(hh90Var).remove(this.f);
        } else {
            if (!z) {
                itt0.a();
                return;
            }
            pqs0 pqs0Var = ((pqs0[]) this.d)[this.b];
            Object obj = pqs0Var.b[pqs0Var.d];
            zys0.c(hh90Var).remove(this.f);
            e(obj != null ? obj.hashCode() : 0, hh90Var.c, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.h = hh90Var.e;
    }
}
