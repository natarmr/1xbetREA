package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class klw0 {
    public static final klw0 f = new klw0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18511a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public klw0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f18511a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static klw0 e() {
        return new klw0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iI1;
        int iE1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < this.f18511a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iC = ohs0.C(i4 << 3, 8, iC);
                } else if (i5 == 2) {
                    iC = p4.d1(i4, (sjw0) this.c[i2]) + iC;
                } else if (i5 == 3) {
                    iI1 = p4.i1(i4 << 3) << 1;
                    iE1 = ((klw0) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        itt0.o(qkw0.a());
                        return 0;
                    }
                    ((Integer) this.c[i2]).getClass();
                    iC = ohs0.C(i4 << 3, 4, iC);
                }
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iI1 = p4.i1(i4 << 3);
                iE1 = p4.e1(jLongValue);
            }
            iC = iE1 + iI1 + iC;
        }
        this.d = iC;
        return iC;
    }

    public final void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.f18511a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            e9d0.b();
            return;
        }
        b(this.f18511a + 1);
        int[] iArr = this.b;
        int i2 = this.f18511a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f18511a = i2 + 1;
    }

    public final void d(zlt0 zlt0Var) {
        p4 p4Var = (p4) zlt0Var.b;
        if (this.f18511a == 0) {
            return;
        }
        for (int i = 0; i < this.f18511a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                p4Var.b1(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                p4Var.S0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                p4Var.T0(i3, (sjw0) obj);
            } else if (i4 == 3) {
                p4Var.h1(i3, 3);
                ((klw0) obj).d(zlt0Var);
                p4Var.h1(i3, 4);
            } else {
                if (i4 != 5) {
                    ohq.p(qkw0.a());
                    return;
                }
                p4Var.R0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof klw0)) {
            return false;
        }
        klw0 klw0Var = (klw0) obj;
        int i = this.f18511a;
        if (i == klw0Var.f18511a) {
            int[] iArr = this.b;
            int[] iArr2 = klw0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = klw0Var.c;
            int i3 = this.f18511a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f18511a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f18511a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
