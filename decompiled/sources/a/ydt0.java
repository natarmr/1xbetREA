package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ydt0 {
    public static final ydt0 f = new ydt0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42457a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public ydt0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f42457a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.f42457a;
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
        int iH2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f42457a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iH2 = syc.h(i5) + 8;
                } else if (i6 == 2) {
                    iH2 = syc.f(i5, (mg9) this.c[i3]);
                } else if (i6 == 3) {
                    iH = syc.h(i5) * 2;
                    iJ = ((ydt0) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        itt0.o(box.b());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iH2 = syc.h(i5) + 4;
                }
                i2 = iH2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iH = syc.h(i5);
                iJ = syc.j(jLongValue);
            }
            i2 = iJ + iH + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            e9d0.b();
            return;
        }
        a(this.f42457a + 1);
        int[] iArr = this.b;
        int i2 = this.f42457a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f42457a = i2 + 1;
    }

    public final void d(yqc yqcVar) {
        if (this.f42457a == 0) {
            return;
        }
        yqcVar.getClass();
        syc sycVar = (syc) yqcVar.b;
        for (int i = 0; i < this.f42457a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                sycVar.E(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                sycVar.t(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                sycVar.p(i3, (mg9) obj);
            } else if (i4 == 3) {
                sycVar.B(i3, 3);
                ((ydt0) obj).d(yqcVar);
                sycVar.B(i3, 4);
            } else {
                if (i4 != 5) {
                    ohq.p(box.b());
                    return;
                }
                sycVar.r(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ydt0)) {
            return false;
        }
        ydt0 ydt0Var = (ydt0) obj;
        int i = this.f42457a;
        if (i == ydt0Var.f42457a) {
            int[] iArr = this.b;
            int[] iArr2 = ydt0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = ydt0Var.c;
            int i3 = this.f42457a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f42457a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f42457a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
