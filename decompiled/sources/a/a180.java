package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a180 extends d9x {
    public int b;
    public int d;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mjq[] f60a = new mjq[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final void Z() {
        this.b = 0;
        this.d = 0;
        Arrays.fill(this.e, 0, this.f, (Object) null);
        this.f = 0;
    }

    public final void a0(bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        if (this.b != 0) {
            hu5 hu5Var = new hu5(this, (byte) 6);
            a180 a180Var = (a180) hu5Var.e;
            while (true) {
                mjq mjqVar = a180Var.f60a[hu5Var.b];
                bet betVarF = mjqVar.f(hu5Var);
                bv3 bv3Var2 = bv3Var;
                t9k0 t9k0Var2 = t9k0Var;
                pwi pwiVar2 = pwiVar;
                s080 s080Var2 = s080Var;
                try {
                    mjqVar.d(hu5Var, bv3Var2, t9k0Var2, pwiVar2, s080Var2);
                    int i = hu5Var.b;
                    int i2 = a180Var.b;
                    if (i < i2) {
                        mjq mjqVar2 = a180Var.f60a[i];
                        hu5Var.c += mjqVar2.b;
                        hu5Var.d += mjqVar2.c;
                        int i3 = i + 1;
                        hu5Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        bv3Var = bv3Var2;
                        t9k0Var = t9k0Var2;
                        pwiVar = pwiVar2;
                        s080Var = s080Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (s080Var2 == null) {
                        throw th;
                    }
                    sac.t0(th, new ck60(betVarF, t9k0Var2, s080Var2, (byte) 7));
                    throw th;
                }
            }
        }
        Z();
    }

    public final boolean b0() {
        return this.b == 0;
    }

    public final void c0(mjq mjqVar) {
        int i = this.b;
        mjq[] mjqVarArr = this.f60a;
        if (i == mjqVarArr.length) {
            mjq[] mjqVarArr2 = new mjq[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(mjqVarArr, 0, mjqVarArr2, 0, i);
            this.f60a = mjqVarArr2;
        }
        int i2 = this.d;
        int i3 = mjqVar.b;
        int i4 = mjqVar.c;
        int i5 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            qx3.d(0, 0, length, iArr, iArr2);
            this.c = iArr2;
        }
        int i7 = this.f + i4;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        mjq[] mjqVarArr3 = this.f60a;
        int i9 = this.b;
        this.b = i9 + 1;
        mjqVarArr3[i9] = mjqVar;
        this.d += mjqVar.b;
        this.f += i4;
    }
}
