package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mgw0 {
    public static final mgw0 f = new mgw0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21761a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public mgw0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f21761a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static mgw0 a() {
        return new mgw0(0, new int[8], new Object[8], true);
    }

    public final void b(owp0 owp0Var) {
        aew0 aew0Var = (aew0) owp0Var.b;
        if (this.f21761a != 0) {
            for (int i = 0; i < this.f21761a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    aew0Var.h(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    aew0Var.i(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    aew0Var.l(i4, (qdw0) obj);
                } else if (i3 == 3) {
                    aew0Var.d(i4, 3);
                    ((mgw0) obj).b(owp0Var);
                    aew0Var.d(i4, 4);
                } else {
                    if (i3 != 5) {
                        ohq.p(new yew0());
                        return;
                    }
                    aew0Var.g(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iA;
        int iB;
        int iA2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < this.f21761a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        qdw0 qdw0Var = (qdw0) this.c[i2];
                        int iA3 = aew0.a(i6);
                        int iE = qdw0Var.e();
                        iC = ohs0.c(iE, iE, iA3, iC);
                    } else if (i5 == 3) {
                        int iA4 = aew0.a(i4 << 3);
                        iA = iA4 + iA4;
                        iB = ((mgw0) this.c[i2]).c();
                    } else {
                        if (i5 != 5) {
                            itt0.o(new yew0());
                            return 0;
                        }
                        ((Integer) this.c[i2]).getClass();
                        iA2 = aew0.a(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iA2 = aew0.a(i4 << 3) + 8;
                }
                iC = iA2 + iC;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iA = aew0.a(i7);
                iB = aew0.b(jLongValue);
            }
            iC = iB + iA + iC;
        }
        this.d = iC;
        return iC;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            e9d0.b();
            return;
        }
        e(this.f21761a + 1);
        int[] iArr = this.b;
        int i2 = this.f21761a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f21761a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.f21761a;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof mgw0)) {
            mgw0 mgw0Var = (mgw0) obj;
            int i = this.f21761a;
            if (i == mgw0Var.f21761a) {
                int[] iArr = this.b;
                int[] iArr2 = mgw0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = mgw0Var.c;
                int i3 = this.f21761a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f21761a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f21761a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
