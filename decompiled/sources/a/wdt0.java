package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wdt0 {
    public static final wdt0 f = new wdt0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38990a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public wdt0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f38990a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static wdt0 c() {
        return new wdt0(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.f38990a;
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

    public final int b() {
        int iH;
        int iJ;
        int iD;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f38990a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iD = ryc.d(i5);
                } else if (i6 == 2) {
                    iD = ryc.a(i5, (og9) this.c[i3]);
                } else if (i6 == 3) {
                    iH = ryc.h(i5) * 2;
                    iJ = ((wdt0) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        itt0.o(ynx.d());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iD = ryc.c(i5);
                }
                i2 = iD + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iH = ryc.h(i5);
                iJ = ryc.j(jLongValue);
            }
            i2 = iJ + iH + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            e9d0.b();
            return;
        }
        a(this.f38990a + 1);
        int[] iArr = this.b;
        int i2 = this.f38990a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f38990a = i2 + 1;
    }

    public final void e(psc pscVar) throws l52 {
        if (this.f38990a == 0) {
            return;
        }
        pscVar.getClass();
        ryc rycVar = (ryc) pscVar.b;
        for (int i = 0; i < this.f38990a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                long jLongValue = ((Long) obj).longValue();
                rycVar.p(i3, 0);
                rycVar.r(jLongValue);
            } else if (i4 == 1) {
                long jLongValue2 = ((Long) obj).longValue();
                rycVar.p(i3, 1);
                rycVar.n(jLongValue2);
            } else if (i4 == 2) {
                pscVar.p(i3, (og9) obj);
            } else if (i4 == 3) {
                rycVar.p(i3, 3);
                ((wdt0) obj).e(pscVar);
                rycVar.p(i3, 4);
            } else if (i4 != 5) {
                ohq.p(ynx.d());
                return;
            } else {
                int iIntValue = ((Integer) obj).intValue();
                rycVar.p(i3, 5);
                rycVar.m(iIntValue);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wdt0)) {
            return false;
        }
        wdt0 wdt0Var = (wdt0) obj;
        int i = this.f38990a;
        if (i == wdt0Var.f38990a) {
            int[] iArr = this.b;
            int[] iArr2 = wdt0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = wdt0Var.c;
            int i3 = this.f38990a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f38990a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f38990a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
