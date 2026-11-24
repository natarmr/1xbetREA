package a;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class xfk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final thj0 f40794a = new thj0(24);
    public static final nvu b = new nvu((byte) 20);
    public static final Object c = new Object();
    public static wfk0 d;
    public static long e;
    public static final x23 f;
    public static final zz2 g;
    public static List h;
    public static List i;
    public static final x8v j;
    public static final a14 k;

    static {
        wfk0 wfk0Var = wfk0.e;
        d = wfk0Var;
        e = 2L;
        x23 x23Var = new x23();
        x23Var.c = new long[16];
        x23Var.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        x23Var.e = iArr;
        f = x23Var;
        zz2 zz2Var = new zz2();
        zz2Var.b = new int[16];
        zz2Var.c = new h1v0[16];
        g = zz2Var;
        iun iunVar = iun.f15405a;
        h = iunVar;
        i = iunVar;
        long j2 = e;
        e = 1 + j2;
        x8v x8vVar = new x8v(j2, wfk0Var, null, new umu((byte) 6));
        d = d.g(x8vVar.b);
        j = x8vVar;
        k = new a14(0);
    }

    public static final wfk0 a(wfk0 wfk0Var, long j2, long j3) {
        while (Intrinsics.f(j2, j3) < 0) {
            wfk0Var = wfk0Var.g(j2);
            j2++;
        }
        return wfk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object b(Function1 function1) {
        iz40 iz40Var;
        Object objU;
        x8v x8vVar = j;
        synchronized (c) {
            try {
                iz40Var = x8vVar.h;
                if (iz40Var != null) {
                    k.addAndGet(1);
                }
                objU = u(x8vVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iz40Var != null) {
            try {
                List list = h;
                w1h0 w1h0Var = new w1h0(iz40Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).invoke(w1h0Var, x8vVar);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (iz40Var != null) {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.f15620a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((b8m0) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(f40794a);
    }

    public static final void d() {
        zz2 zz2Var = g;
        int i2 = zz2Var.f45232a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            h1v0 h1v0Var = ((h1v0[]) zz2Var.c)[i3];
            Object obj = h1v0Var != null ? h1v0Var.get() : null;
            if (obj != null && o((b8m0) obj)) {
                if (i4 != i3) {
                    ((h1v0[]) zz2Var.c)[i4] = h1v0Var;
                    int[] iArr = (int[]) zz2Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((h1v0[]) zz2Var.c)[i5] = null;
            ((int[]) zz2Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            zz2Var.f45232a = i4;
        }
    }

    public static final rfk0 e(rfk0 rfk0Var, Function1 function1, boolean z) {
        boolean z2 = rfk0Var instanceof nz40;
        if (z2 || rfk0Var == null) {
            return new ios0(z2 ? (nz40) rfk0Var : null, function1, null, false, z);
        }
        return new jos0(rfk0Var, function1, false, z);
    }

    public static final e8m0 f(e8m0 e8m0Var) {
        e8m0 e8m0VarR;
        rfk0 rfk0VarH = h();
        e8m0 e8m0VarR2 = r(e8m0Var, rfk0VarH.g(), rfk0VarH.d());
        if (e8m0VarR2 != null) {
            return e8m0VarR2;
        }
        synchronized (c) {
            rfk0 rfk0VarH2 = h();
            e8m0VarR = r(e8m0Var, rfk0VarH2.g(), rfk0VarH2.d());
        }
        if (e8m0VarR != null) {
            return e8m0VarR;
        }
        q();
        throw null;
    }

    public static final e8m0 g(e8m0 e8m0Var, rfk0 rfk0Var) {
        e8m0 e8m0VarR;
        e8m0 e8m0VarR2 = r(e8m0Var, rfk0Var.g(), rfk0Var.d());
        if (e8m0VarR2 != null) {
            return e8m0VarR2;
        }
        synchronized (c) {
            e8m0VarR = r(e8m0Var, rfk0Var.g(), rfk0Var.d());
        }
        if (e8m0VarR != null) {
            return e8m0VarR;
        }
        q();
        throw null;
    }

    public static final rfk0 h() {
        rfk0 rfk0Var = (rfk0) b.w();
        return rfk0Var == null ? j : rfk0Var;
    }

    public static final Function1 i(Function1 function1, Function1 function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new erm(function1, function2, (byte) 1);
    }

    public static final Function1 j(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new erm(function1, function2, (byte) 2);
    }

    public static final e8m0 k(e8m0 e8m0Var, b8m0 b8m0Var) {
        long j2 = e;
        x23 x23Var = f;
        if (x23Var.f40148a > 0) {
            j2 = ((long[]) x23Var.c)[0];
        }
        long j3 = j2 - 1;
        e8m0 e8m0Var2 = null;
        e8m0 e8m0Var3 = null;
        for (e8m0 e8m0VarG = b8m0Var.g(); e8m0VarG != null; e8m0VarG = e8m0VarG.b) {
            long j4 = e8m0VarG.f7381a;
            if (j4 != 0) {
                if (j4 != 0 && Intrinsics.f(j4, j3) <= 0 && !wfk0.e.e(j4)) {
                    if (e8m0Var3 != null) {
                        if (Intrinsics.f(e8m0VarG.f7381a, e8m0Var3.f7381a) >= 0) {
                            e8m0Var2 = e8m0Var3;
                            break;
                        }
                        break;
                    }
                    e8m0Var3 = e8m0VarG;
                }
            }
            e8m0Var2 = e8m0VarG;
            break;
        }
        if (e8m0Var2 != null) {
            e8m0Var2.f7381a = Long.MAX_VALUE;
            return e8m0Var2;
        }
        e8m0 e8m0VarB = e8m0Var.b(Long.MAX_VALUE);
        e8m0VarB.b = b8m0Var.g();
        b8m0Var.h(e8m0VarB);
        return e8m0VarB;
    }

    public static final void l(rfk0 rfk0Var, b8m0 b8m0Var) {
        rfk0Var.t(rfk0Var.h() + 1);
        Function1 function1I = rfk0Var.i();
        if (function1I != null) {
            function1I.invoke(b8m0Var);
        }
    }

    public static final HashMap m(long j2, nz40 nz40Var, wfk0 wfk0Var) {
        long[] jArr;
        wfk0 wfk0Var2;
        long[] jArr2;
        int i2;
        int i3;
        e8m0 e8m0VarR;
        iz40 iz40VarX = nz40Var.x();
        if (iz40VarX != null) {
            long jG = nz40Var.g();
            wfk0 wfk0VarF = nz40Var.d().g(jG).f(nz40Var.j);
            Object[] objArr = iz40VarX.b;
            long[] jArr3 = iz40VarX.f15620a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                b8m0 b8m0Var = (b8m0) objArr[(i4 << 3) + i7];
                                e8m0 e8m0VarG = b8m0Var.g();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                e8m0 e8m0VarR2 = r(e8m0VarG, j2, wfk0Var);
                                if (e8m0VarR2 != null && (e8m0VarR = r(e8m0VarG, jG, wfk0VarF)) != null && !e8m0VarR2.equals(e8m0VarR)) {
                                    e8m0 e8m0VarR3 = r(e8m0VarG, jG, nz40Var.d());
                                    if (e8m0VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    e8m0 e8m0VarB = b8m0Var.b(e8m0VarR, e8m0VarR2, e8m0VarR3);
                                    if (e8m0VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(e8m0VarR2, e8m0VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            wfk0VarF = wfk0VarF;
                        }
                        jArr = jArr3;
                        wfk0Var2 = wfk0VarF;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        wfk0Var2 = wfk0VarF;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    wfk0VarF = wfk0Var2;
                }
            }
        }
        return null;
    }

    public static final e8m0 n(e8m0 e8m0Var, c8m0 c8m0Var, rfk0 rfk0Var, e8m0 e8m0Var2) {
        e8m0 e8m0VarK;
        if (rfk0Var.f()) {
            rfk0Var.n(c8m0Var);
        }
        long jG = rfk0Var.g();
        if (e8m0Var2.f7381a == jG) {
            return e8m0Var2;
        }
        synchronized (c) {
            e8m0VarK = k(e8m0Var, c8m0Var);
        }
        e8m0VarK.f7381a = jG;
        rfk0Var.n(c8m0Var);
        return e8m0VarK;
    }

    public static final boolean o(b8m0 b8m0Var) {
        e8m0 e8m0Var;
        long j2 = e;
        x23 x23Var = f;
        if (x23Var.f40148a > 0) {
            j2 = ((long[]) x23Var.c)[0];
        }
        e8m0 e8m0Var2 = null;
        e8m0 e8m0VarG = null;
        int i2 = 0;
        for (e8m0 e8m0VarG2 = b8m0Var.g(); e8m0VarG2 != null; e8m0VarG2 = e8m0VarG2.b) {
            long j3 = e8m0VarG2.f7381a;
            if (j3 != 0) {
                if (Intrinsics.f(j3, j2) >= 0) {
                    i2++;
                } else if (e8m0Var2 == null) {
                    i2++;
                    e8m0Var2 = e8m0VarG2;
                } else {
                    if (Intrinsics.f(e8m0VarG2.f7381a, e8m0Var2.f7381a) < 0) {
                        e8m0Var = e8m0Var2;
                        e8m0Var2 = e8m0VarG2;
                    } else {
                        e8m0Var = e8m0VarG2;
                    }
                    if (e8m0VarG == null) {
                        e8m0VarG = b8m0Var.g();
                        e8m0 e8m0Var3 = e8m0VarG;
                        while (true) {
                            if (e8m0VarG == null) {
                                e8m0VarG = e8m0Var3;
                                break;
                            }
                            if (Intrinsics.f(e8m0VarG.f7381a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.f(e8m0Var3.f7381a, e8m0VarG.f7381a) < 0) {
                                e8m0Var3 = e8m0VarG;
                            }
                            e8m0VarG = e8m0VarG.b;
                        }
                    }
                    e8m0Var2.f7381a = 0L;
                    e8m0Var2.a(e8m0VarG);
                    e8m0Var2 = e8m0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(b8m0 b8m0Var) {
        if (o(b8m0Var)) {
            zz2 zz2Var = g;
            int i2 = zz2Var.f45232a;
            int iIdentityHashCode = System.identityHashCode(b8m0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = zz2Var.f45232a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) zz2Var.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        h1v0 h1v0Var = ((h1v0[]) zz2Var.c)[i6];
                        if (b8m0Var == (h1v0Var != null ? h1v0Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) zz2Var.b)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = zz2Var.f45232a;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(zz2Var.f45232a + 1);
                                        break;
                                    }
                                    if (((int[]) zz2Var.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    h1v0 h1v0Var2 = ((h1v0[]) zz2Var.c)[i6];
                                    if ((h1v0Var2 != null ? h1v0Var2.get() : null) == b8m0Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                h1v0 h1v0Var3 = ((h1v0[]) zz2Var.c)[i8];
                                if ((h1v0Var3 != null ? h1v0Var3.get() : null) == b8m0Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            h1v0[] h1v0VarArr = (h1v0[]) zz2Var.c;
            int length = h1v0VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                h1v0[] h1v0VarArr2 = new h1v0[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(h1v0VarArr, i10, h1v0VarArr2, i12, i2 - i10);
                System.arraycopy((h1v0[]) zz2Var.c, 0, h1v0VarArr2, 0, i10);
                qx3.d(i12, i10, i2, (int[]) zz2Var.b, iArr);
                qx3.h(0, i10, 6, (int[]) zz2Var.b, iArr);
                zz2Var.c = h1v0VarArr2;
                zz2Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(h1v0VarArr, i10, h1v0VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) zz2Var.b;
                qx3.d(i13, i10, i2, iArr2, iArr2);
            }
            ((h1v0[]) zz2Var.c)[i10] = new h1v0(b8m0Var);
            ((int[]) zz2Var.b)[i10] = iIdentityHashCode;
            zz2Var.f45232a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final e8m0 r(e8m0 e8m0Var, long j2, wfk0 wfk0Var) {
        e8m0 e8m0Var2 = null;
        while (e8m0Var != null) {
            long j3 = e8m0Var.f7381a;
            if (j3 != 0 && Intrinsics.f(j3, j2) <= 0 && !wfk0Var.e(j3) && (e8m0Var2 == null || Intrinsics.f(e8m0Var2.f7381a, e8m0Var.f7381a) < 0)) {
                e8m0Var2 = e8m0Var;
            }
            e8m0Var = e8m0Var.b;
        }
        if (e8m0Var2 != null) {
            return e8m0Var2;
        }
        return null;
    }

    public static final e8m0 s(e8m0 e8m0Var, b8m0 b8m0Var) {
        e8m0 e8m0VarR;
        rfk0 rfk0VarH = h();
        Function1 function1E = rfk0VarH.e();
        if (function1E != null) {
            function1E.invoke(b8m0Var);
        }
        e8m0 e8m0VarR2 = r(e8m0Var, rfk0VarH.g(), rfk0VarH.d());
        if (e8m0VarR2 != null) {
            return e8m0VarR2;
        }
        synchronized (c) {
            rfk0 rfk0VarH2 = h();
            e8m0 e8m0VarG = b8m0Var.g();
            e8m0VarG.getClass();
            e8m0VarR = r(e8m0VarG, rfk0VarH2.g(), rfk0VarH2.d());
            if (e8m0VarR == null) {
                q();
                throw null;
            }
        }
        return e8m0VarR;
    }

    public static final void t(int i2) {
        x23 x23Var = f;
        int i3 = ((int[]) x23Var.e)[i2];
        x23Var.j(i3, x23Var.f40148a - 1);
        x23Var.f40148a--;
        long[] jArr = (long[]) x23Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.f(jArr[i5], j2) <= 0) {
                break;
            }
            x23Var.j(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) x23Var.c;
        int i6 = x23Var.f40148a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < x23Var.f40148a && Intrinsics.f(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.f(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                x23Var.j(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.f(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                x23Var.j(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) x23Var.e)[i2] = x23Var.b;
        x23Var.b = i2;
    }

    public static final Object u(x8v x8vVar, Function1 function1) {
        long j2 = x8vVar.b;
        Object objInvoke = function1.invoke(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        wfk0 wfk0VarC = d.c(j2);
        d = wfk0VarC;
        x8vVar.b = j3;
        x8vVar.f30392a = wfk0VarC;
        x8vVar.g = 0;
        x8vVar.h = null;
        x8vVar.o();
        d = d.g(j3);
        return objInvoke;
    }

    public static final void v(rfk0 rfk0Var) {
        Long lValueOf;
        if (d.e(rfk0Var.g())) {
            return;
        }
        long jG = rfk0Var.g();
        boolean z = rfk0Var.c;
        nz40 nz40Var = rfk0Var instanceof nz40 ? (nz40) rfk0Var : null;
        Object objValueOf = nz40Var != null ? Boolean.valueOf(nz40Var.m) : "read-only";
        synchronized (c) {
            x23 x23Var = f;
            lValueOf = Long.valueOf(x23Var.f40148a > 0 ? ((long[]) x23Var.c)[0] : -1L);
        }
        StringBuilder sbR = kng0.r(jG, "Snapshot is not open: snapshotId=", ", disposed=", z);
        sbR.append(", applied=");
        sbR.append(objValueOf);
        sbR.append(", lowestPin=");
        sbR.append(lValueOf);
        throw new IllegalStateException(sbR.toString().toString());
    }

    public static final e8m0 w(e8m0 e8m0Var, b8m0 b8m0Var, rfk0 rfk0Var) {
        e8m0 e8m0VarR;
        e8m0 e8m0VarR2;
        if (rfk0Var.f()) {
            rfk0Var.n(b8m0Var);
        }
        long jG = rfk0Var.g();
        e8m0 e8m0VarR3 = r(e8m0Var, jG, rfk0Var.d());
        if (e8m0VarR3 == null) {
            synchronized (c) {
                rfk0 rfk0VarH = h();
                e8m0 e8m0VarG = b8m0Var.g();
                e8m0VarG.getClass();
                e8m0VarR2 = r(e8m0VarG, rfk0VarH.g(), rfk0VarH.d());
                if (e8m0VarR2 == null) {
                    q();
                    throw null;
                }
            }
            e8m0VarR3 = e8m0VarR2;
        }
        if (e8m0VarR3.f7381a == rfk0Var.g()) {
            return e8m0VarR3;
        }
        synchronized (c) {
            e8m0VarR = r(b8m0Var.g(), jG, rfk0Var.d());
            if (e8m0VarR == null) {
                q();
                throw null;
            }
            if (e8m0VarR.f7381a != jG) {
                e8m0 e8m0VarK = k(e8m0VarR, b8m0Var);
                e8m0VarK.a(e8m0VarR);
                e8m0VarK.f7381a = rfk0Var.g();
                e8m0VarR = e8m0VarK;
            }
        }
        rfk0Var.n(b8m0Var);
        return e8m0VarR;
    }
}
