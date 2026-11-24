package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nqd0 extends o4 {
    public static final int[] i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};
    public static final int[] l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};
    public static final int[] n = {2, 4, 6, 8};
    public static final int[][] o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void j(ArrayList arrayList, sm80 sm80Var) {
        if (sm80Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sm80 sm80Var2 = (sm80) it.next();
            if (sm80Var2.f26657a == sm80Var.f26657a) {
                sm80Var2.d++;
                return;
            }
        }
        arrayList.add(sm80Var);
    }

    @Override // a.jl60
    public final i0g0 b(int i2, p68 p68Var, Map map) throws o660 {
        sm80 sm80VarL = l(p68Var, false, i2, map);
        ArrayList<sm80> arrayList = this.g;
        j(arrayList, sm80VarL);
        p68Var.i();
        sm80 sm80VarL2 = l(p68Var, true, i2, map);
        ArrayList<sm80> arrayList2 = this.h;
        j(arrayList2, sm80VarL2);
        p68Var.i();
        for (sm80 sm80Var : arrayList) {
            int i3 = sm80Var.d;
            tdq tdqVar = sm80Var.c;
            if (i3 > 1) {
                for (sm80 sm80Var2 : arrayList2) {
                    int i4 = sm80Var2.d;
                    tdq tdqVar2 = sm80Var2.c;
                    if (i4 > 1) {
                        int i5 = ((sm80Var2.b * 16) + sm80Var.b) % 79;
                        int i6 = (tdqVar.f33781a * 9) + tdqVar2.f33781a;
                        if (i6 > 72) {
                            i6--;
                        }
                        if (i6 > 8) {
                            i6--;
                        }
                        if (i5 == i6) {
                            String strValueOf = String.valueOf((((long) sm80Var.f26657a) * 4537077) + ((long) sm80Var2.f26657a));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(strValueOf);
                            int i7 = 0;
                            for (int i8 = 0; i8 < 13; i8++) {
                                int iCharAt = sb.charAt(i8) - '0';
                                if ((i8 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i7 += iCharAt;
                            }
                            int i9 = 10 - (i7 % 10);
                            if (i9 == 10) {
                                i9 = 0;
                            }
                            sb.append(i9);
                            d3g0[] d3g0VarArr = tdqVar.c;
                            d3g0[] d3g0VarArr2 = tdqVar2.c;
                            i0g0 i0g0Var = new i0g0(sb.toString(), null, new d3g0[]{d3g0VarArr[0], d3g0VarArr[1], d3g0VarArr2[0], d3g0VarArr2[1]}, ju5.m);
                            i0g0Var.b(a3g0.m, "]e0");
                            return i0g0Var;
                        }
                    }
                }
            }
        }
        throw o660.a();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e A[PHI: r13 r14
  0x008e: PHI (r13v12 boolean) = (r13v4 boolean), (r13v15 boolean) binds: [B:44:0x00ab, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r14v10 boolean) = (r14v2 boolean), (r14v13 boolean) binds: [B:44:0x00ab, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[PHI: r13 r14
  0x0094: PHI (r13v7 boolean) = (r13v4 boolean), (r13v15 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r14v5 boolean) = (r14v2 boolean), (r14v13 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[PHI: r13 r14
  0x0098: PHI (r13v6 boolean) = (r13v4 boolean), (r13v15 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r14v4 boolean) = (r14v2 boolean), (r14v13 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    public final paj k(p68 p68Var, tdq tdqVar, boolean z) throws o660 {
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int[] iArr3 = this.b;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = tdqVar.b;
        if (z) {
            jl60.f(iArr4[0], p68Var, iArr3);
        } else {
            jl60.e(iArr4[1], p68Var, iArr3);
            int i2 = 0;
            for (int length = iArr3.length - 1; i2 < length; length--) {
                int i3 = iArr3[i2];
                iArr3[i2] = iArr3[length];
                iArr3[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float fH = q7x.H(iArr3) / i4;
        int i5 = 0;
        while (true) {
            int length2 = iArr3.length;
            fArr = this.d;
            fArr2 = this.c;
            iArr = this.f;
            iArr2 = this.e;
            if (i5 >= length2) {
                break;
            }
            float f = iArr3[i5] / fH;
            int i6 = (int) (0.5f + f);
            if (i6 < 1) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArr2[i7] = i6;
                fArr2[i7] = f - i6;
            } else {
                iArr[i7] = i6;
                fArr[i7] = f - i6;
            }
            i5++;
        }
        int iH = q7x.H(iArr2);
        int iH2 = q7x.H(iArr);
        if (z) {
            if (iH > 12) {
                z2 = false;
                z3 = true;
            } else if (iH < 4) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iH2 > 12) {
                z4 = false;
                z5 = true;
            } else if (iH2 < 4) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
        } else {
            if (iH > 11) {
                z2 = false;
                z3 = true;
            } else if (iH < 5) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iH2 > 10) {
                z4 = false;
                z5 = true;
            } else if (iH2 < 4) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
        }
        int i8 = (iH + iH2) - i4;
        boolean z6 = (iH & 1) == z;
        boolean z7 = (iH2 & 1) == 1;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw o660.a();
                }
                if (z6) {
                    if (z7) {
                        throw o660.a();
                    }
                    z3 = true;
                } else {
                    if (!z7) {
                        throw o660.a();
                    }
                    z5 = true;
                }
            } else if (z6) {
                if (!z7) {
                    throw o660.a();
                }
                if (iH < iH2) {
                    z2 = true;
                    z5 = true;
                } else {
                    z3 = true;
                    z4 = true;
                }
            } else if (z7) {
                throw o660.a();
            }
        } else if (z6) {
            if (z7) {
                throw o660.a();
            }
            z2 = true;
        } else {
            if (!z7) {
                throw o660.a();
            }
            z4 = true;
        }
        if (z2) {
            if (z3) {
                throw o660.a();
            }
            o4.h(fArr2, iArr2);
        }
        if (z3) {
            o4.g(fArr2, iArr2);
        }
        if (z4) {
            if (z5) {
                throw o660.a();
            }
            o4.h(fArr2, iArr);
        }
        if (z5) {
            o4.g(fArr, iArr);
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i11 = iArr2[length3];
            i9 = (i9 * 9) + i11;
            i10 += i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i14 = iArr[length4];
            i12 = (i12 * 9) + i14;
            i13 += i14;
        }
        int i15 = (i12 * 3) + i9;
        if (z) {
            if ((i10 & 1) != 0 || i10 > 12 || i10 < 4) {
                throw o660.a();
            }
            int i16 = (12 - i10) / 2;
            int i17 = m[i16];
            return new paj(vqd.a(xww.M(iArr2, i17, false), i[i16], xww.M(iArr, 9 - i17, true), k[i16]), i15);
        }
        if ((i13 & 1) != 0 || i13 > 10 || i13 < 4) {
            throw o660.a();
        }
        int i18 = (10 - i13) / 2;
        int i19 = n[i18];
        return new paj(vqd.a(xww.M(iArr, 9 - i19, false), j[i18], xww.M(iArr2, i19, true), l[i18]), i15);
    }

    public final sm80 l(p68 p68Var, boolean z, int i2, Map map) {
        try {
            tdq tdqVarN = n(p68Var, i2, z, m(p68Var, z));
            e3g0 e3g0Var = map == null ? null : (e3g0) map.get(gkj.j);
            if (e3g0Var != null) {
                int[] iArr = tdqVarN.b;
                float f = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z) {
                    f = (p68Var.b - 1) - f;
                }
                e3g0Var.a(new d3g0(f, i2));
            }
            paj pajVarK = k(p68Var, tdqVarN, true);
            paj pajVarK2 = k(p68Var, tdqVarN, false);
            return new sm80((pajVarK.f26657a * 1597) + pajVarK2.f26657a, (pajVarK2.b * 4) + pajVarK.b, tdqVarN);
        } catch (o660 unused) {
            return null;
        }
    }

    public final int[] m(p68 p68Var, boolean z) throws o660 {
        int[] iArr = this.f24607a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i2 = p68Var.b;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            z2 = !p68Var.d(i3);
            if (z == z2) {
                break;
            }
            i3++;
        }
        int i4 = 0;
        int i5 = i3;
        while (i3 < i2) {
            if (p68Var.d(i3) != z2) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else {
                    if (o4.i(iArr)) {
                        return new int[]{i5, i3};
                    }
                    i5 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z2 = !z2;
            }
            i3++;
        }
        throw o660.a();
    }

    public final tdq n(p68 p68Var, int i2, boolean z, int[] iArr) throws o660 {
        int i3;
        int i4;
        boolean zD = p68Var.d(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && zD != p68Var.d(i5)) {
            i5--;
        }
        int i6 = i5 + 1;
        int i7 = iArr[0] - i6;
        int[] iArr2 = this.f24607a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i7;
        for (int i8 = 0; i8 < 9; i8++) {
            if (jl60.d(iArr2, o[i8], 0.45f) < 0.2f) {
                int i9 = iArr[1];
                if (z) {
                    int i10 = p68Var.b - 1;
                    i3 = i10 - i9;
                    i4 = i10 - i6;
                } else {
                    i3 = i9;
                    i4 = i6;
                }
                return new tdq(i8, i4, i3, i2, new int[]{i6, i9});
            }
        }
        throw o660.a();
    }

    @Override // a.jl60, a.rae0
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
