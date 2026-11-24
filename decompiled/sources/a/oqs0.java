package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oqs0 {
    public static final oqs0 e = new oqs0(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25705a;
    public int b;
    public final evz c;
    public Object[] d;

    public oqs0(int i, int i2, Object[] objArr, evz evzVar) {
        this.f25705a = i;
        this.b = i2;
        this.c = evzVar;
        this.d = objArr;
    }

    public static oqs0 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, evz evzVar) {
        if (i3 > 30) {
            return new oqs0(0, 0, new Object[]{obj, obj2, obj3, obj4}, evzVar);
        }
        int iS = ktt0.s(i, i3);
        int iS2 = ktt0.s(i2, i3);
        if (iS != iS2) {
            return new oqs0((1 << iS) | (1 << iS2), 0, iS < iS2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, evzVar);
        }
        return new oqs0(0, 1 << iS, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, evzVar)}, evzVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, evz evzVar) {
        Object obj3 = this.d[i];
        oqs0 oqs0VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, evzVar);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = oqs0VarJ;
        qx3.e(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f25705a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, this.d.length));
        int i = aVarM.f46068a;
        int i2 = aVarM.b;
        int i3 = aVarM.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!Intrinsics.d(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iS = 1 << ktt0.s(i, i2);
        if (h(iS)) {
            return Intrinsics.d(obj, this.d[f(iS)]);
        }
        if (!i(iS)) {
            return false;
        }
        oqs0 oqs0VarS = s(t(iS));
        return i2 == 30 ? oqs0VarS.c(obj) : oqs0VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(oqs0 oqs0Var) {
        if (this == oqs0Var) {
            return true;
        }
        if (this.b == oqs0Var.b && this.f25705a == oqs0Var.f25705a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == oqs0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.f25705a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iS = 1 << ktt0.s(i, i2);
        if (h(iS)) {
            int iF = f(iS);
            if (Intrinsics.d(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iS)) {
            return null;
        }
        oqs0 oqs0VarS = s(t(iS));
        if (i2 != 30) {
            return oqs0VarS.g(i, i2 + 5, obj);
        }
        kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, oqs0VarS.d.length));
        int i3 = aVarM.f46068a;
        int i4 = aVarM.b;
        int i5 = aVarM.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!Intrinsics.d(obj, oqs0VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return oqs0VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.f25705a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final oqs0 k(int i, hh90 hh90Var) {
        hh90Var.g(hh90Var.f - 1);
        hh90Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != hh90Var.b) {
            return new oqs0(0, 0, ktt0.w(i, objArr), hh90Var.b);
        }
        this.d = ktt0.w(i, objArr);
        return this;
    }

    public final oqs0 l(int i, Object obj, Object obj2, int i2, hh90 hh90Var) {
        hh90 hh90Var2;
        oqs0 oqs0VarL;
        int iS = 1 << ktt0.s(i, i2);
        boolean zH = h(iS);
        evz evzVar = this.c;
        if (zH) {
            int iF = f(iS);
            if (!Intrinsics.d(obj, this.d[iF])) {
                hh90Var.g(hh90Var.f + 1);
                evz evzVar2 = hh90Var.b;
                if (evzVar != evzVar2) {
                    return new oqs0(this.f25705a ^ iS, this.b | iS, a(iF, iS, i, obj, obj2, i2, evzVar2), evzVar2);
                }
                this.d = a(iF, iS, i, obj, obj2, i2, evzVar2);
                this.f25705a ^= iS;
                this.b |= iS;
                return this;
            }
            hh90Var.d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (evzVar == hh90Var.b) {
                this.d[iF + 1] = obj2;
                return this;
            }
            hh90Var.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new oqs0(this.f25705a, this.b, objArrCopyOf, hh90Var.b);
        }
        if (!i(iS)) {
            hh90Var.g(hh90Var.f + 1);
            evz evzVar3 = hh90Var.b;
            int iF2 = f(iS);
            Object[] objArr2 = this.d;
            if (evzVar != evzVar3) {
                return new oqs0(this.f25705a | iS, this.b, ktt0.t(objArr2, iF2, obj, obj2), evzVar3);
            }
            this.d = ktt0.t(objArr2, iF2, obj, obj2);
            this.f25705a |= iS;
            return this;
        }
        int iT = t(iS);
        oqs0 oqs0VarS = s(iT);
        if (i2 == 30) {
            kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, oqs0VarS.d.length));
            int i3 = aVarM.f46068a;
            int i4 = aVarM.b;
            int i5 = aVarM.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.d(obj, oqs0VarS.d[i3])) {
                        if (i3 == i4) {
                            hh90Var.g(hh90Var.f + 1);
                            oqs0VarL = new oqs0(0, 0, ktt0.t(oqs0VarS.d, 0, obj, obj2), hh90Var.b);
                            break;
                        }
                        i3 += i5;
                    } else {
                        hh90Var.d = oqs0VarS.x(i3);
                        if (oqs0VarS.c != hh90Var.b) {
                            hh90Var.e++;
                            Object[] objArr3 = oqs0VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            oqs0VarL = new oqs0(0, 0, objArrCopyOf2, hh90Var.b);
                            break;
                        }
                        oqs0VarS.d[i3 + 1] = obj2;
                        oqs0VarL = oqs0VarS;
                        break;
                    }
                }
            } else {
                hh90Var.g(hh90Var.f + 1);
                oqs0VarL = new oqs0(0, 0, ktt0.t(oqs0VarS.d, 0, obj, obj2), hh90Var.b);
                break;
            }
            hh90Var2 = hh90Var;
        } else {
            hh90Var2 = hh90Var;
            oqs0VarL = oqs0VarS.l(i, obj, obj2, i2 + 5, hh90Var2);
        }
        return oqs0VarS == oqs0VarL ? this : r(iT, oqs0VarL, hh90Var2.b);
    }

    public final oqs0 m(oqs0 oqs0Var, int i, s6k s6kVar, hh90 hh90Var) {
        oqs0 oqs0Var2;
        Object[] objArr;
        oqs0 oqs0VarJ;
        if (this == oqs0Var) {
            s6kVar.f31707a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            evz evzVar = hh90Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + oqs0Var.d.length);
            int length = this.d.length;
            kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, oqs0Var.d.length));
            int i3 = aVarM.f46068a;
            int i4 = aVarM.b;
            int i5 = aVarM.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(oqs0Var.d[i3])) {
                        s6kVar.f31707a++;
                    } else {
                        Object[] objArr3 = oqs0Var.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != oqs0Var.d.length) {
                    return length == objArrCopyOf.length ? new oqs0(0, 0, objArrCopyOf, evzVar) : new oqs0(0, 0, Arrays.copyOf(objArrCopyOf, length), evzVar);
                }
            }
            return this;
        }
        int i6 = this.b | oqs0Var.b;
        int i7 = this.f25705a;
        int i8 = oqs0Var.f25705a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (Intrinsics.d(this.d[f(iLowestOneBit)], oqs0Var.d[oqs0Var.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            dsb0.b("Check failed.");
        }
        if (Intrinsics.d(this.c, hh90Var.b) && this.f25705a == i11 && this.b == i6) {
            oqs0Var2 = this;
        } else {
            oqs0Var2 = new oqs0(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = oqs0Var2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (i(iLowestOneBit2)) {
                oqs0VarJ = s(t(iLowestOneBit2));
                if (oqs0Var.i(iLowestOneBit2)) {
                    oqs0VarJ = oqs0VarJ.m(oqs0Var.s(oqs0Var.t(iLowestOneBit2)), i + 5, s6kVar, hh90Var);
                    objArr = objArr4;
                } else if (oqs0Var.h(iLowestOneBit2)) {
                    int iF = oqs0Var.f(iLowestOneBit2);
                    Object obj = oqs0Var.d[iF];
                    Object objX = oqs0Var.x(iF);
                    int i14 = hh90Var.f;
                    objArr = objArr4;
                    oqs0VarJ = oqs0VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, hh90Var);
                    if (hh90Var.f == i14) {
                        s6kVar.f31707a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (oqs0Var.i(iLowestOneBit2)) {
                    oqs0 oqs0VarS = oqs0Var.s(oqs0Var.t(iLowestOneBit2));
                    if (h(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (oqs0VarS.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            s6kVar.f31707a++;
                            oqs0VarJ = oqs0VarS;
                        } else {
                            oqs0VarJ = oqs0VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i15, hh90Var);
                        }
                    } else {
                        oqs0VarJ = oqs0VarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = oqs0Var.f(iLowestOneBit2);
                    Object obj4 = oqs0Var.d[iF4];
                    oqs0VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, oqs0Var.x(iF4), i + 5, hh90Var.b);
                }
            }
            objArr[length2] = oqs0VarJ;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (oqs0Var.h(iLowestOneBit3)) {
                int iF5 = oqs0Var.f(iLowestOneBit3);
                Object[] objArr5 = oqs0Var2.d;
                objArr5[i17] = oqs0Var.d[iF5];
                objArr5[i17 + 1] = oqs0Var.x(iF5);
                if (h(iLowestOneBit3)) {
                    s6kVar.f31707a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = oqs0Var2.d;
                objArr6[i17] = this.d[iF6];
                objArr6[i17 + 1] = x(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(oqs0Var2)) {
            return oqs0Var.e(oqs0Var2) ? oqs0Var : oqs0Var2;
        }
        return this;
    }

    public final oqs0 n(int i, Object obj, int i2, hh90 hh90Var) {
        oqs0 oqs0VarN;
        int iS = 1 << ktt0.s(i, i2);
        if (h(iS)) {
            int iF = f(iS);
            if (Intrinsics.d(obj, this.d[iF])) {
                return p(iF, iS, hh90Var);
            }
        } else if (i(iS)) {
            int iT = t(iS);
            oqs0 oqs0VarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, oqs0VarS.d.length));
                int i3 = aVarM.f46068a;
                int i4 = aVarM.b;
                int i5 = aVarM.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.d(obj, oqs0VarS.d[i3])) {
                            if (i3 == i4) {
                                oqs0VarN = oqs0VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            oqs0VarN = oqs0VarS.k(i3, hh90Var);
                            break;
                        }
                    }
                } else {
                    oqs0VarN = oqs0VarS;
                    break;
                }
            } else {
                oqs0VarN = oqs0VarS.n(i, obj, i2 + 5, hh90Var);
            }
            return q(oqs0VarS, oqs0VarN, iT, iS, hh90Var.b);
        }
        return this;
    }

    public final oqs0 o(int i, Object obj, Object obj2, int i2, hh90 hh90Var) {
        hh90 hh90Var2;
        oqs0 oqs0VarO;
        int iS = 1 << ktt0.s(i, i2);
        if (h(iS)) {
            int iF = f(iS);
            return (Intrinsics.d(obj, this.d[iF]) && Intrinsics.d(obj2, x(iF))) ? p(iF, iS, hh90Var) : this;
        }
        if (!i(iS)) {
            return this;
        }
        int iT = t(iS);
        oqs0 oqs0VarS = s(iT);
        if (i2 == 30) {
            kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, oqs0VarS.d.length));
            int i3 = aVarM.f46068a;
            int i4 = aVarM.b;
            int i5 = aVarM.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!Intrinsics.d(obj, oqs0VarS.d[i3]) || !Intrinsics.d(obj2, oqs0VarS.x(i3))) {
                        if (i3 == i4) {
                            oqs0VarO = oqs0VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        oqs0VarO = oqs0VarS.k(i3, hh90Var);
                        break;
                    }
                }
            } else {
                oqs0VarO = oqs0VarS;
                break;
            }
            hh90Var2 = hh90Var;
        } else {
            hh90Var2 = hh90Var;
            oqs0VarO = oqs0VarS.o(i, obj, obj2, i2 + 5, hh90Var2);
        }
        return q(oqs0VarS, oqs0VarO, iT, iS, hh90Var2.b);
    }

    public final oqs0 p(int i, int i2, hh90 hh90Var) {
        hh90Var.g(hh90Var.f - 1);
        hh90Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != hh90Var.b) {
            return new oqs0(i2 ^ this.f25705a, this.b, ktt0.w(i, objArr), hh90Var.b);
        }
        this.d = ktt0.w(i, objArr);
        this.f25705a ^= i2;
        return this;
    }

    public final oqs0 q(oqs0 oqs0Var, oqs0 oqs0Var2, int i, int i2, evz evzVar) {
        evz evzVar2 = this.c;
        if (oqs0Var2 != null) {
            return (evzVar2 == evzVar || oqs0Var != oqs0Var2) ? r(i, oqs0Var2, evzVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (evzVar2 != evzVar) {
            return new oqs0(this.f25705a, this.b ^ i2, ktt0.x(i, objArr), evzVar);
        }
        this.d = ktt0.x(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final oqs0 r(int i, oqs0 oqs0Var, evz evzVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && oqs0Var.d.length == 2 && oqs0Var.b == 0) {
            oqs0Var.f25705a = this.b;
            return oqs0Var;
        }
        if (this.c == evzVar) {
            objArr[i] = oqs0Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = oqs0Var;
        return new oqs0(this.f25705a, this.b, objArrCopyOf, evzVar);
    }

    public final oqs0 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (oqs0) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r15.c = w(r3, r2, (a.oqs0) r15.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.s88 u(java.lang.Object r15, int r16, int r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oqs0.u(java.lang.Object, int, int, java.lang.Object):a.s88");
    }

    public final oqs0 v(int i, int i2, Object obj) {
        oqs0 oqs0VarV;
        int iS = 1 << ktt0.s(i, i2);
        if (h(iS)) {
            int iF = f(iS);
            if (!Intrinsics.d(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new oqs0(this.f25705a ^ iS, this.b, ktt0.w(iF, objArr), null);
            }
        } else {
            if (!i(iS)) {
                return this;
            }
            int iT = t(iS);
            oqs0 oqs0VarS = s(iT);
            if (i2 == 30) {
                kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, oqs0VarS.d.length));
                int i3 = aVarM.f46068a;
                int i4 = aVarM.b;
                int i5 = aVarM.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!Intrinsics.d(obj, oqs0VarS.d[i3])) {
                            if (i3 == i4) {
                                oqs0VarV = oqs0VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = oqs0VarS.d;
                            if (objArr2.length != 2) {
                                oqs0VarV = new oqs0(0, 0, ktt0.w(i3, objArr2), null);
                                break;
                            }
                            oqs0VarV = null;
                            break;
                        }
                    }
                } else {
                    oqs0VarV = oqs0VarS;
                    break;
                }
            } else {
                oqs0VarV = oqs0VarS.v(i, i2 + 5, obj);
            }
            if (oqs0VarV != null) {
                return oqs0VarS != oqs0VarV ? w(iT, iS, oqs0VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new oqs0(this.f25705a, this.b ^ iS, ktt0.x(iT, objArr3), null);
            }
        }
        return null;
    }

    public final oqs0 w(int i, int i2, oqs0 oqs0Var) {
        Object[] objArr = oqs0Var.d;
        if (objArr.length != 2 || oqs0Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = oqs0Var;
            return new oqs0(this.f25705a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            oqs0Var.f25705a = this.b;
            return oqs0Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        qx3.e(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        qx3.e(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new oqs0(this.f25705a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
