package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kvw extends jl60 {
    public static final int[] b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18974a = -1;

    public static int g(int[] iArr) throws o660 {
        float f = 0.38f;
        int i = 0;
        int i2 = -1;
        while (i < 20) {
            float fD = jl60.d(iArr, e[i], i <= 9 ? 0.5f : 0.75f);
            if (fD < f) {
                i2 = i;
                f = fD;
            } else if (fD == f) {
                i2 = -1;
            }
            i++;
        }
        if (i2 >= 0) {
            return i2 % 10;
        }
        throw o660.a();
    }

    public static int[] h(int i, p68 p68Var, int[] iArr) throws o660 {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = p68Var.b;
        int i3 = i;
        boolean z = false;
        int i4 = 0;
        while (i < i2) {
            if (p68Var.d(i) != z) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else {
                    if (jl60.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i3, i};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i4--;
                }
                iArr2[i4] = 1;
                z = !z;
            }
            i++;
        }
        throw o660.a();
    }

    @Override // a.jl60
    public final i0g0 b(int i, p68 p68Var, Map map) throws bwq, o660 {
        int[] iArrH;
        int[] iArr;
        int length;
        int length2;
        int i2;
        int i3;
        boolean z;
        int i4 = p68Var.b;
        int iE = p68Var.e(0);
        if (iE == i4) {
            throw o660.a();
        }
        int[] iArrH2 = h(iE, p68Var, c);
        int i5 = iArrH2[1];
        int i6 = iArrH2[0];
        this.f18974a = (i5 - i6) / 4;
        i(p68Var, i6);
        int[][] iArr2 = d;
        p68Var.i();
        try {
            int i7 = p68Var.b;
            int iE2 = p68Var.e(0);
            if (iE2 == i7) {
                throw o660.a();
            }
            try {
                iArrH = h(iE2, p68Var, iArr2[0]);
                while (true) {
                    if (i2 >= length2) {
                        z = false;
                        break;
                    }
                    int i8 = iArr[i2];
                    if (length == i8) {
                        z = true;
                        break;
                    }
                    if (i8 > i3) {
                        i3 = i8;
                    }
                    i2++;
                }
            } catch (o660 unused) {
                iArrH = h(iE2, p68Var, iArr2[1]);
            }
            i(p68Var, iArrH[0]);
            int i9 = iArrH[0];
            int i10 = p68Var.b;
            iArrH[0] = i10 - iArrH[1];
            iArrH[1] = i10 - i9;
            p68Var.i();
            StringBuilder sb = new StringBuilder(20);
            int i11 = iArrH2[1];
            int i12 = iArrH[0];
            int[] iArr3 = new int[10];
            int[] iArr4 = new int[5];
            int[] iArr5 = new int[5];
            while (i11 < i12) {
                jl60.e(i11, p68Var, iArr3);
                for (int i13 = 0; i13 < 5; i13++) {
                    int i14 = i13 * 2;
                    iArr4[i13] = iArr3[i14];
                    iArr5[i13] = iArr3[i14 + 1];
                }
                sb.append((char) (g(iArr4) + 48));
                sb.append((char) (g(iArr5) + 48));
                for (int i15 = 0; i15 < 10; i15++) {
                    i11 += iArr3[i15];
                }
            }
            String string = sb.toString();
            iArr = map != null ? (int[]) map.get(gkj.f) : null;
            if (iArr == null) {
                iArr = b;
            }
            length = string.length();
            length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            if (!z && length > i3) {
                z = true;
            }
            if (!z) {
                throw bwq.a();
            }
            float f = i;
            i0g0 i0g0Var = new i0g0(string, null, new d3g0[]{new d3g0(iArrH2[1], f), new d3g0(iArrH[0], f)}, ju5.i);
            i0g0Var.b(a3g0.m, "]I0");
            return i0g0Var;
        } catch (Throwable th) {
            p68Var.i();
            throw th;
        }
    }

    public final void i(p68 p68Var, int i) throws o660 {
        int iMin = Math.min(this.f18974a * 10, i);
        for (int i2 = i - 1; iMin > 0 && i2 >= 0 && !p68Var.d(i2); i2--) {
            iMin--;
        }
        if (iMin != 0) {
            throw o660.a();
        }
    }
}
