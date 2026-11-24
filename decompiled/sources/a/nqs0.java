package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class nqs0 {
    public static final nqs0 e = new nqs0(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23972a;
    public int b;
    public final xuz c;
    public Object[] d;

    public nqs0(int i, int i2, Object[] objArr, xuz xuzVar) {
        this.f23972a = i;
        this.b = i2;
        this.c = xuzVar;
        this.d = objArr;
    }

    public static nqs0 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, xuz xuzVar) {
        if (i3 > 30) {
            return new nqs0(0, 0, new Object[]{obj, obj2, obj3, obj4}, xuzVar);
        }
        int iL = jtt0.l(i, i3);
        int iL2 = jtt0.l(i2, i3);
        if (iL != iL2) {
            return new nqs0((1 << iL) | (1 << iL2), 0, iL < iL2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, xuzVar);
        }
        return new nqs0(0, 1 << iL, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, xuzVar)}, xuzVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, xuz xuzVar) {
        Object obj3 = this.d[i];
        nqs0 nqs0VarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, y(i), i3, obj, obj2, i4 + 5, xuzVar);
        int iU = u(i2);
        int i5 = iU + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qx3.i(0, i, 6, objArr, objArr2);
        qx3.e(i, i + 2, i5, objArr, objArr2);
        objArr2[iU - 1] = nqs0VarK;
        qx3.e(iU, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f23972a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += t(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        int i = 0;
        int iJ = g8x.J(0, this.d.length - 1, 2);
        if (iJ >= 0) {
            while (!Intrinsics.d(obj, this.d[i])) {
                if (i != iJ) {
                    i += 2;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iL = 1 << jtt0.l(i, i2);
        if (i(iL)) {
            return Intrinsics.d(obj, this.d[f(iL)]);
        }
        if (!j(iL)) {
            return false;
        }
        nqs0 nqs0VarT = t(u(iL));
        if (i2 == 30) {
            return nqs0VarT.c(obj) != -1;
        }
        return nqs0VarT.d(i, i2 + 5, obj);
    }

    public final boolean e(nqs0 nqs0Var) {
        if (this == nqs0Var) {
            return true;
        }
        if (this.b == nqs0Var.b && this.f23972a == nqs0Var.f23972a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == nqs0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.f23972a & (i - 1)) * 2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[LOOP:2: B:44:0x00b9->B:48:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce A[EDGE_INSN: B:61:0x00ce->B:50:0x00ce BREAK  A[LOOP:1: B:35:0x008e->B:42:0x00b4], SYNTHETIC] */
    public final boolean g(nqs0 nqs0Var, Function2 function2) {
        int i;
        int length;
        nqs0Var.getClass();
        if (this != nqs0Var) {
            int i2 = this.f23972a;
            if (i2 == nqs0Var.f23972a && (i = this.b) == nqs0Var.b) {
                if (i2 == 0 && i == 0) {
                    Object[] objArr = this.d;
                    if (objArr.length == nqs0Var.d.length) {
                        Iterable iterableM = l1e0.m(2, new IntRange(0, objArr.length - 1, 1));
                        if (!(iterableM instanceof Collection) || !((Collection) iterableM).isEmpty()) {
                            Iterator it = iterableM.iterator();
                            while (it.hasNext()) {
                                int iNextInt = ((bkx) it).nextInt();
                                Object obj = nqs0Var.d[iNextInt];
                                Object objY = nqs0Var.y(iNextInt);
                                int iC = c(obj);
                                if (!(iC != -1 ? ((Boolean) function2.invoke(y(iC), objY)).booleanValue() : false)) {
                                }
                            }
                        }
                    }
                } else {
                    int iBitCount = Integer.bitCount(i2) * 2;
                    kotlin.ranges.a aVarM = l1e0.m(2, l1e0.o(0, iBitCount));
                    int i3 = aVarM.f46068a;
                    int i4 = aVarM.b;
                    int i5 = aVarM.c;
                    if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                        length = this.d.length;
                        while (iBitCount < length) {
                            if (!t(iBitCount).g(nqs0Var.t(iBitCount), function2)) {
                                break;
                            }
                            iBitCount++;
                        }
                    } else {
                        while (Intrinsics.d(this.d[i3], nqs0Var.d[i3]) && ((Boolean) function2.invoke(y(i3), nqs0Var.y(i3))).booleanValue()) {
                            if (i3 != i4) {
                                i3 += i5;
                            } else {
                                length = this.d.length;
                                while (iBitCount < length) {
                                    if (!t(iBitCount).g(nqs0Var.t(iBitCount), function2)) {
                                        break;
                                        break;
                                    }
                                    iBitCount++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Object h(int i, int i2, Object obj) {
        int iL = 1 << jtt0.l(i, i2);
        if (i(iL)) {
            int iF = f(iL);
            if (Intrinsics.d(obj, this.d[iF])) {
                return y(iF);
            }
            return null;
        }
        if (!j(iL)) {
            return null;
        }
        nqs0 nqs0VarT = t(u(iL));
        if (i2 != 30) {
            return nqs0VarT.h(i, i2 + 5, obj);
        }
        int iC = nqs0VarT.c(obj);
        if (iC != -1) {
            return nqs0VarT.y(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.f23972a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final nqs0 l(Object obj, Object obj2, gh90 gh90Var) {
        int iC = c(obj);
        if (iC == -1) {
            gh90Var.g(gh90Var.g + 1);
            return new nqs0(0, 0, jtt0.m(this.d, 0, obj, obj2), gh90Var.b);
        }
        gh90Var.d = y(iC);
        if (y(iC) == obj2) {
            return this;
        }
        if (this.c == gh90Var.b) {
            this.d[iC + 1] = obj2;
            return this;
        }
        gh90Var.e++;
        Object[] objArr = this.d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[iC + 1] = obj2;
        return new nqs0(0, 0, objArrCopyOf, gh90Var.b);
    }

    public final nqs0 m(int i, gh90 gh90Var) {
        gh90Var.g(gh90Var.g - 1);
        gh90Var.d = y(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != gh90Var.b) {
            return new nqs0(0, 0, jtt0.p(i, objArr), gh90Var.b);
        }
        this.d = jtt0.p(i, objArr);
        return this;
    }

    public final nqs0 n(int i, Object obj, Object obj2, int i2, gh90 gh90Var) {
        int iL = 1 << jtt0.l(i, i2);
        boolean zI = i(iL);
        xuz xuzVar = this.c;
        if (zI) {
            int iF = f(iL);
            if (!Intrinsics.d(obj, this.d[iF])) {
                gh90Var.g(gh90Var.g + 1);
                xuz xuzVar2 = gh90Var.b;
                if (xuzVar != xuzVar2) {
                    return new nqs0(this.f23972a ^ iL, this.b | iL, a(iF, iL, i, obj, obj2, i2, xuzVar2), xuzVar2);
                }
                this.d = a(iF, iL, i, obj, obj2, i2, xuzVar2);
                this.f23972a ^= iL;
                this.b |= iL;
                return this;
            }
            gh90Var.d = y(iF);
            if (y(iF) != obj2) {
                if (xuzVar == gh90Var.b) {
                    this.d[iF + 1] = obj2;
                    return this;
                }
                gh90Var.e++;
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new nqs0(this.f23972a, this.b, objArrCopyOf, gh90Var.b);
            }
        } else {
            if (!j(iL)) {
                gh90Var.g(gh90Var.g + 1);
                xuz xuzVar3 = gh90Var.b;
                int iF2 = f(iL);
                Object[] objArr2 = this.d;
                if (xuzVar != xuzVar3) {
                    return new nqs0(this.f23972a | iL, this.b, jtt0.m(objArr2, iF2, obj, obj2), xuzVar3);
                }
                this.d = jtt0.m(objArr2, iF2, obj, obj2);
                this.f23972a |= iL;
                return this;
            }
            int iU = u(iL);
            nqs0 nqs0VarT = t(iU);
            nqs0 nqs0VarL = i2 == 30 ? nqs0VarT.l(obj, obj2, gh90Var) : nqs0VarT.n(i, obj, obj2, i2 + 5, gh90Var);
            if (nqs0VarT != nqs0VarL) {
                return x(iU, iL, nqs0VarL, gh90Var.b);
            }
        }
        return this;
    }

    public final nqs0 o(nqs0 nqs0Var, int i, r6k r6kVar, gh90 gh90Var) {
        nqs0 nqs0Var2;
        Object[] objArr;
        int i2;
        byte b;
        nqs0 nqs0VarK;
        boolean zD;
        int i3;
        boolean z;
        int i4;
        nqs0Var.getClass();
        if (this == nqs0Var) {
            r6kVar.f29936a += b();
            return this;
        }
        byte b2 = -1;
        int i5 = 1;
        if (i > 30) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + nqs0Var.d.length);
            int length = this.d.length;
            int iJ = g8x.J(0, nqs0Var.d.length - 1, 2);
            if (iJ >= 0) {
                int i6 = 0;
                i3 = 0;
                z = true;
                while (true) {
                    int iC = c(nqs0Var.d[i6]);
                    if (iC == -1) {
                        Object[] objArr3 = nqs0Var.d;
                        objArrCopyOf[length] = objArr3[i6];
                        objArrCopyOf[length + 1] = objArr3[i6 + 1];
                        length += 2;
                        i4 = i5;
                    } else {
                        r6kVar.f29936a += i5;
                        Object obj = objArrCopyOf[iC];
                        Object[] objArr4 = nqs0Var.d;
                        i4 = i5;
                        if (obj != objArr4[i6]) {
                            z = false;
                        }
                        int i7 = iC + 1;
                        Object obj2 = objArrCopyOf[i7];
                        Object obj3 = objArr4[i6 + 1];
                        if (obj2 != obj3) {
                            objArrCopyOf[i7] = obj3;
                            i3 = i4;
                        }
                    }
                    if (i6 == iJ) {
                        break;
                    }
                    i6 += 2;
                    i5 = i4;
                }
            } else {
                i3 = 0;
                z = true;
            }
            if (i3 != 0) {
                gh90Var.e++;
            }
            if (length != this.d.length || i3 != 0) {
                if (length != nqs0Var.d.length || !z) {
                    return length == objArrCopyOf.length ? new nqs0(0, 0, objArrCopyOf, gh90Var.b) : new nqs0(0, 0, Arrays.copyOf(objArrCopyOf, length), gh90Var.b);
                }
            }
            return this;
        }
        int i8 = this.b | nqs0Var.b;
        int i9 = this.f23972a;
        int i10 = nqs0Var.f23972a;
        int i11 = (i9 ^ i10) & (~i8);
        int i12 = i9 & i10;
        int i13 = i11;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            if (Intrinsics.d(this.d[f(iLowestOneBit)], nqs0Var.d[nqs0Var.f(iLowestOneBit)])) {
                i13 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i12 ^= iLowestOneBit;
        }
        if ((i8 & i13) != 0) {
            jf4.n("Check failed.");
            return null;
        }
        if (Intrinsics.d(this.c, gh90Var.b) && this.f23972a == i13 && this.b == i8) {
            nqs0Var2 = this;
        } else {
            nqs0Var2 = new nqs0(i13, i8, new Object[Integer.bitCount(i8) + (Integer.bitCount(i13) * 2)], null);
        }
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr5 = nqs0Var2.d;
            int length2 = (objArr5.length - 1) - i15;
            if (j(iLowestOneBit2)) {
                nqs0VarK = t(u(iLowestOneBit2));
                if (nqs0Var.j(iLowestOneBit2)) {
                    nqs0VarK = nqs0VarK.o(nqs0Var.t(nqs0Var.u(iLowestOneBit2)), i + 5, r6kVar, gh90Var);
                    objArr5 = objArr5;
                    b = b2;
                    i2 = iLowestOneBit2;
                } else {
                    if (nqs0Var.i(iLowestOneBit2)) {
                        int iF = nqs0Var.f(iLowestOneBit2);
                        Object obj4 = nqs0Var.d[iF];
                        Object objY = nqs0Var.y(iF);
                        int i16 = gh90Var.g;
                        if (i == 30) {
                            nqs0VarK = nqs0VarK.l(obj4, objY, gh90Var);
                            i2 = iLowestOneBit2;
                        } else {
                            i2 = iLowestOneBit2;
                            nqs0VarK = nqs0VarK.n(obj4 != null ? obj4.hashCode() : 0, obj4, objY, i + 5, gh90Var);
                        }
                        if (gh90Var.g == i16) {
                            r6kVar.f29936a++;
                        }
                    } else {
                        i2 = iLowestOneBit2;
                        objArr5 = objArr5;
                    }
                    b = -1;
                }
            } else {
                i2 = iLowestOneBit2;
                objArr5 = objArr5;
                if (nqs0Var.j(i2)) {
                    nqs0 nqs0VarT = nqs0Var.t(nqs0Var.u(i2));
                    if (i(i2)) {
                        int iF2 = f(i2);
                        Object obj5 = this.d[iF2];
                        if (i == 30) {
                            b = -1;
                            zD = nqs0VarT.c(obj5) != -1;
                        } else {
                            b = -1;
                            zD = nqs0VarT.d(obj5 != null ? obj5.hashCode() : 0, i + 5, obj5);
                        }
                        if (zD) {
                            r6kVar.f29936a++;
                        } else {
                            Object objY2 = y(iF2);
                            if (i == 30) {
                                nqs0VarK = nqs0VarT.l(obj5, objY2, gh90Var);
                            } else {
                                nqs0VarK = nqs0VarT.n(obj5 != null ? obj5.hashCode() : 0, obj5, objY2, i + 5, gh90Var);
                            }
                        }
                    } else {
                        b = -1;
                    }
                    nqs0VarK = nqs0VarT;
                } else {
                    b = -1;
                    int iF3 = f(i2);
                    Object obj6 = this.d[iF3];
                    Object objY3 = y(iF3);
                    int iF4 = nqs0Var.f(i2);
                    Object obj7 = nqs0Var.d[iF4];
                    nqs0VarK = k(obj6 != null ? obj6.hashCode() : 0, obj6, objY3, obj7 != null ? obj7.hashCode() : 0, obj7, nqs0Var.y(iF4), i + 5, gh90Var.b);
                }
            }
            objArr5[length2] = nqs0VarK;
            i15++;
            i14 ^= i2;
            b2 = b;
        }
        int i17 = 0;
        while (i13 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i13);
            int i18 = i17 * 2;
            if (nqs0Var.i(iLowestOneBit3)) {
                int iF5 = nqs0Var.f(iLowestOneBit3);
                Object objY4 = nqs0Var.y(iF5);
                if (i(iLowestOneBit3)) {
                    int iF6 = f(iLowestOneBit3);
                    r6kVar.f29936a++;
                    if (nqs0Var2 != this && y(iF6) != objY4) {
                        gh90Var.e++;
                    }
                    objArr = nqs0Var2.d;
                    objArr[i18] = this.d[iF6];
                } else {
                    objArr = nqs0Var2.d;
                    objArr[i18] = nqs0Var.d[iF5];
                }
                objArr[i18 + 1] = objY4;
            } else {
                int iF7 = f(iLowestOneBit3);
                Object[] objArr6 = nqs0Var2.d;
                objArr6[i18] = this.d[iF7];
                objArr6[i18 + 1] = y(iF7);
            }
            i17++;
            i13 ^= iLowestOneBit3;
        }
        if (!e(nqs0Var2)) {
            return nqs0Var.e(nqs0Var2) ? nqs0Var : nqs0Var2;
        }
        return this;
    }

    public final nqs0 p(int i, Object obj, int i2, gh90 gh90Var) {
        nqs0 nqs0VarP;
        int iL = 1 << jtt0.l(i, i2);
        if (i(iL)) {
            int iF = f(iL);
            if (Intrinsics.d(obj, this.d[iF])) {
                return r(iF, iL, gh90Var);
            }
        } else if (j(iL)) {
            int iU = u(iL);
            nqs0 nqs0VarT = t(iU);
            if (i2 == 30) {
                int iC = nqs0VarT.c(obj);
                nqs0VarP = iC != -1 ? nqs0VarT.m(iC, gh90Var) : nqs0VarT;
            } else {
                nqs0VarP = nqs0VarT.p(i, obj, i2 + 5, gh90Var);
            }
            return s(nqs0VarT, nqs0VarP, iU, iL, gh90Var.b);
        }
        return this;
    }

    public final nqs0 q(int i, Object obj, Object obj2, int i2, gh90 gh90Var) {
        gh90 gh90Var2;
        nqs0 nqs0VarQ;
        int iL = 1 << jtt0.l(i, i2);
        if (i(iL)) {
            int iF = f(iL);
            return (Intrinsics.d(obj, this.d[iF]) && Intrinsics.d(obj2, y(iF))) ? r(iF, iL, gh90Var) : this;
        }
        if (!j(iL)) {
            return this;
        }
        int iU = u(iL);
        nqs0 nqs0VarT = t(iU);
        if (i2 == 30) {
            int iC = nqs0VarT.c(obj);
            nqs0VarQ = (iC == -1 || !Intrinsics.d(obj2, nqs0VarT.y(iC))) ? nqs0VarT : nqs0VarT.m(iC, gh90Var);
            gh90Var2 = gh90Var;
        } else {
            gh90Var2 = gh90Var;
            nqs0VarQ = nqs0VarT.q(i, obj, obj2, i2 + 5, gh90Var2);
        }
        return s(nqs0VarT, nqs0VarQ, iU, iL, gh90Var2.b);
    }

    public final nqs0 r(int i, int i2, gh90 gh90Var) {
        gh90Var.g(gh90Var.g - 1);
        gh90Var.d = y(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != gh90Var.b) {
            return new nqs0(i2 ^ this.f23972a, this.b, jtt0.p(i, objArr), gh90Var.b);
        }
        this.d = jtt0.p(i, objArr);
        this.f23972a ^= i2;
        return this;
    }

    public final nqs0 s(nqs0 nqs0Var, nqs0 nqs0Var2, int i, int i2, xuz xuzVar) {
        if (nqs0Var2 != null) {
            return (nqs0Var2 != nqs0Var || (nqs0Var2.d.length == 2 && nqs0Var2.b == 0)) ? x(i, i2, nqs0Var2, xuzVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != xuzVar) {
            return new nqs0(this.f23972a, this.b ^ i2, jtt0.q(i, objArr), xuzVar);
        }
        this.d = jtt0.q(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final nqs0 t(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (nqs0) obj;
    }

    public final int u(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        r4.c = x(r1, r2, (a.nqs0) r4.c, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.s88 v(java.lang.Object r13, int r14, int r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nqs0.v(java.lang.Object, int, int, java.lang.Object):a.s88");
    }

    public final nqs0 w(int i, Long l, int i2) {
        nqs0 nqs0VarW;
        int iL = 1 << jtt0.l(i, i2);
        if (i(iL)) {
            int iF = f(iL);
            if (!l.equals(this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new nqs0(this.f23972a ^ iL, this.b, jtt0.p(iF, objArr), null);
            }
        } else {
            if (!j(iL)) {
                return this;
            }
            int iU = u(iL);
            nqs0 nqs0VarT = t(iU);
            if (i2 == 30) {
                int iC = nqs0VarT.c(l);
                if (iC != -1) {
                    Object[] objArr2 = nqs0VarT.d;
                    nqs0VarW = objArr2.length == 2 ? null : new nqs0(0, 0, jtt0.p(iC, objArr2), null);
                } else {
                    nqs0VarW = nqs0VarT;
                }
            } else {
                nqs0VarW = nqs0VarT.w(i, l, i2 + 5);
            }
            if (nqs0VarW != null) {
                return nqs0VarT != nqs0VarW ? x(iU, iL, nqs0VarW, null) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new nqs0(this.f23972a, this.b ^ iL, jtt0.q(iU, objArr3), null);
            }
        }
        return null;
    }

    public final nqs0 x(int i, int i2, nqs0 nqs0Var, xuz xuzVar) {
        if (nqs0Var.d.length != 2 || nqs0Var.b != 0) {
            if (xuzVar != null && this.c == xuzVar) {
                this.d[i] = nqs0Var;
                return this;
            }
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[i] = nqs0Var;
            return new nqs0(this.f23972a, this.b, objArrCopyOf, xuzVar);
        }
        if (this.d.length == 1) {
            nqs0Var.f23972a = this.b;
            return nqs0Var;
        }
        int iF = f(i2);
        Object[] objArr2 = this.d;
        Object[] objArr3 = nqs0Var.d;
        Object obj = objArr3[0];
        Object obj2 = objArr3[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length + 1);
        qx3.e(i + 2, i + 1, objArr2.length, objArrCopyOf2, objArrCopyOf2);
        qx3.e(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new nqs0(this.f23972a ^ i2, this.b ^ i2, objArrCopyOf2, xuzVar);
    }

    public final Object y(int i) {
        return this.d[i + 1];
    }
}
