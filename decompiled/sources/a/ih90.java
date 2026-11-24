package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ih90 extends fh90 {
    public final gh90 e;
    public Object f;
    public boolean g;
    public int h;

    public ih90(gh90 gh90Var, pqs0[] pqs0VarArr) {
        super(gh90Var.c, pqs0VarArr);
        this.e = gh90Var;
        this.h = gh90Var.e;
    }

    public final void e(int i, nqs0 nqs0Var, Object obj, int i2, int i3, boolean z) {
        int i4;
        pqs0[] pqs0VarArr = (pqs0[]) this.d;
        int i5 = i2 * 5;
        if (i5 <= 30) {
            int iL = 1 << jtt0.l(i, i5);
            if (!nqs0Var.i(iL)) {
                int iU = nqs0Var.u(iL);
                nqs0 nqs0VarT = nqs0Var.t(iU);
                pqs0 pqs0Var = pqs0VarArr[i2];
                Object[] objArr = nqs0Var.d;
                int iBitCount = Integer.bitCount(nqs0Var.f23972a) * 2;
                pqs0Var.getClass();
                objArr.getClass();
                pqs0Var.b = objArr;
                pqs0Var.c = iBitCount;
                pqs0Var.d = iU;
                e(i, nqs0VarT, obj, i2 + 1, i3, z);
                return;
            }
            int iF = nqs0Var.f(iL);
            if (iL == (z ? 1 << jtt0.l(i3, i5) : 0) && i2 < (i4 = this.b)) {
                pqs0 pqs0Var2 = pqs0VarArr[i4];
                Object[] objArr2 = nqs0Var.d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                pqs0Var2.getClass();
                pqs0Var2.b = objArr3;
                pqs0Var2.c = 2;
                pqs0Var2.d = 0;
                return;
            }
            pqs0 pqs0Var3 = pqs0VarArr[i2];
            Object[] objArr4 = nqs0Var.d;
            int iBitCount2 = Integer.bitCount(nqs0Var.f23972a) * 2;
            pqs0Var3.getClass();
            objArr4.getClass();
            pqs0Var3.b = objArr4;
            pqs0Var3.c = iBitCount2;
            pqs0Var3.d = iF;
            this.b = i2;
            return;
        }
        pqs0 pqs0Var4 = pqs0VarArr[i2];
        Object[] objArr5 = nqs0Var.d;
        int length = objArr5.length;
        pqs0Var4.getClass();
        pqs0Var4.b = objArr5;
        pqs0Var4.c = length;
        pqs0Var4.d = 0;
        while (true) {
            pqs0 pqs0Var5 = pqs0VarArr[i2];
            if (Intrinsics.d(pqs0Var5.b[pqs0Var5.d], obj)) {
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
        ih90 ih90Var;
        if (!this.g) {
            v4i0.e();
            return;
        }
        boolean z = this.c;
        gh90 gh90Var = this.e;
        if (!z) {
            ih90Var = this;
            zys0.c(gh90Var).remove(ih90Var.f);
        } else {
            if (!z) {
                itt0.a();
                return;
            }
            pqs0 pqs0Var = ((pqs0[]) this.d)[this.b];
            Object obj = pqs0Var.b[pqs0Var.d];
            zys0.c(gh90Var).remove(this.f);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            nqs0 nqs0Var = gh90Var.c;
            Object obj2 = this.f;
            ih90Var = this;
            ih90Var.e(iHashCode, nqs0Var, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        ih90Var.f = null;
        ih90Var.g = false;
        ih90Var.h = gh90Var.e;
    }
}
