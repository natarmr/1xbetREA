package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xdt0 {
    public static final xdt0 f = new xdt0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40713a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public xdt0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f40713a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int iC;
        int iE;
        int iC2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iX = 0;
        for (int i2 = 0; i2 < this.f40713a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        lg9 lg9Var = (lg9) this.c[i2];
                        int iC3 = qyc.c(i4);
                        int size = lg9Var.size();
                        iX = f140.x(size, size, iC3, iX);
                    } else if (i5 == 3) {
                        iC = qyc.c(i4) * 2;
                        iE = ((xdt0) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            itt0.o(new wnx("Protocol message tag had invalid wire type."));
                            return 0;
                        }
                        ((Integer) this.c[i2]).getClass();
                        iC2 = qyc.c(i4) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iC2 = qyc.c(i4) + 8;
                }
                iX = iC2 + iX;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iC = qyc.c(i4);
                iE = qyc.e(jLongValue);
            }
            iX = iE + iC + iX;
        }
        this.d = iX;
        return iX;
    }

    public final void b(prc prcVar) throws l52 {
        if (this.f40713a == 0) {
            return;
        }
        prcVar.getClass();
        qyc qycVar = (qyc) prcVar.b;
        for (int i = 0; i < this.f40713a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                long jLongValue = ((Long) obj).longValue();
                qycVar.m(i3, 0);
                qycVar.o(jLongValue);
            } else if (i4 == 1) {
                long jLongValue2 = ((Long) obj).longValue();
                qycVar.m(i3, 1);
                qycVar.j(jLongValue2);
            } else if (i4 == 2) {
                qycVar.m(i3, 2);
                qycVar.h((lg9) obj);
            } else if (i4 == 3) {
                qycVar.m(i3, 3);
                ((xdt0) obj).b(prcVar);
                qycVar.m(i3, 4);
            } else if (i4 != 5) {
                ohq.p(new wnx("Protocol message tag had invalid wire type."));
                return;
            } else {
                int iIntValue = ((Integer) obj).intValue();
                qycVar.m(i3, 5);
                qycVar.i(iIntValue);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof xdt0)) {
            xdt0 xdt0Var = (xdt0) obj;
            int i = this.f40713a;
            if (i == xdt0Var.f40713a) {
                int[] iArr = this.b;
                int[] iArr2 = xdt0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = xdt0Var.c;
                int i3 = this.f40713a;
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
        int i = this.f40713a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f40713a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
