package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c810 extends pu90 implements tt40, dg80, vj30 {
    public static final p610 s = new p610((byte) 3);
    public static final p610 t = new p610((byte) 4);
    public a810 f;
    public Function1 g;
    public Function2 h;
    public Function1 i;
    public ru90 j;
    public hz40 k;
    public boolean l;
    public hz40 m;
    public boolean n;
    public boolean o;
    public final d810 p = new d810(this, 0);
    public fp q;
    public hz40 r;

    public static void R0(s460 s460Var) {
        f7z f7zVar;
        s460 s460Var2 = s460Var.v;
        e7z e7zVar = s460Var.u;
        if (!Intrinsics.d(s460Var2 != null ? s460Var2.u : null, e7zVar)) {
            e7zVar.i1.p.y.f();
            return;
        }
        b22 b22VarC = e7zVar.i1.p.c();
        if (b22VarC == null || (f7zVar = ((sj30) b22VarC).y) == null) {
            return;
        }
        f7zVar.f();
    }

    @Override // a.vj30
    public final uj30 D0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            xcx.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new b810(i, i2, map, function1, function2, this);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    public final void F0(uj30 uj30Var) {
        long j;
        char c;
        long j2;
        long j3;
        a810 a810Var;
        hz40 hz40Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        fp fpVar;
        hz40 hz40Var2;
        iz40 iz40Var;
        a810 a810Var2;
        long j4;
        if (this.o) {
            return;
        }
        Function1 function1E = uj30Var.e();
        Function2 function2D = uj30Var.d();
        Function1 function1C = uj30Var.c();
        long jG = 0;
        if (function2D == null) {
            long J = 9223372034707292159L;
            if (function1E == null) {
                U0();
                this.g = null;
                this.h = null;
                this.i = null;
                a810 a810Var3 = this.f;
                if (a810Var3 != null) {
                    a810Var3.f402a = false;
                }
                if (a810Var3 != null) {
                    a810Var3.b = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.h = null;
            this.i = null;
            boolean z2 = this.g != function1E;
            if (!z2 && Q0().f402a) {
                j6z j6zVarI0 = I0();
                J = x1x.J(j6zVarI0.R(0L));
                jG = j6zVarI0.g();
                z2 = (ikx.b(J, Q0().b) && qkx.a(jG, Q0().c)) ? false : true;
            }
            if (z2) {
                ru90 ru90Var = this.j;
                if (ru90Var != null) {
                    ru90Var.f31116a = uj30Var;
                } else {
                    ru90Var = new ru90(uj30Var, this, null);
                    this.j = ru90Var;
                }
                z0(ru90Var, J, jG);
                this.g = uj30Var.e();
                return;
            }
            return;
        }
        if (function2D != this.h || function1C != this.i) {
            this.h = function2D;
            this.i = function1C;
            U0();
            return;
        }
        hz40 hz40Var3 = this.m;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (hz40Var3 != null) {
            Object[] objArr3 = hz40Var3.c;
            long[] jArr3 = hz40Var3.f13891a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                a810Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                a810 a810Var4 = (a810) objArr3[(i4 << 3) + i6];
                                if (a810Var4.f402a) {
                                    a810Var2 = a810Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                a810Var2 = null;
            }
            a810Var = a810Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            a810Var = null;
        }
        if (a810Var == null) {
            return;
        }
        j6z j6zVarI1 = I0();
        long J2 = x1x.J(j6zVarI1.R(0L));
        long jG2 = j6zVarI1.g();
        if ((ikx.b(J2, a810Var.b) && qkx.a(jG2, a810Var.c)) || (hz40Var = this.m) == null) {
            return;
        }
        Object[] objArr4 = hz40Var.b;
        Object[] objArr5 = hz40Var.c;
        long[] jArr4 = hz40Var.f13891a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        a810 a810Var5 = (a810) objArr5[i11];
                        i2 = i3;
                        xlw xlwVar = (xlw) obj;
                        jArr2 = jArr4;
                        if (a810Var5.f402a) {
                            objArr2 = objArr4;
                            z = (qkx.a(a810Var5.c, jG2) && ikx.b(a810Var5.b, J2)) ? false : true;
                            a810Var5.c = jG2;
                            a810Var5.b = J2;
                            a810Var5.f402a = false;
                            if (!z) {
                                fpVar = this.q;
                                if (fpVar != null) {
                                    fpVar.L(xlwVar);
                                }
                                hz40Var2 = this.r;
                                if (hz40Var2 != null) {
                                    iz40Var = (iz40) hz40Var2.g(xlwVar);
                                } else {
                                    iz40Var = null;
                                }
                                if (iz40Var != null) {
                                    S0(iz40Var);
                                    iz40Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        a810Var5.c = jG2;
                        a810Var5.b = J2;
                        a810Var5.f402a = false;
                        if (!z) {
                            fpVar = this.q;
                            if (fpVar != null) {
                                fpVar.L(xlwVar);
                            }
                            hz40Var2 = this.r;
                            if (hz40Var2 != null) {
                                iz40Var = (iz40) hz40Var2.g(xlwVar);
                            } else {
                                iz40Var = null;
                            }
                            if (iz40Var != null) {
                                S0(iz40Var);
                                iz40Var.b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract c810 H0();

    public abstract j6z I0();

    public abstract boolean J0();

    public abstract e7z L0();

    @Override // a.cnx
    public boolean M() {
        return false;
    }

    public abstract uj30 N0();

    public abstract c810 O0();

    public abstract long P0();

    public final a810 Q0() {
        a810 a810Var = this.f;
        if (a810Var != null) {
            return a810Var;
        }
        a810 a810Var2 = new a810(this);
        this.f = a810Var2;
        return a810Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(iz40 iz40Var) {
        e7z e7zVar;
        Object[] objArr = iz40Var.b;
        long[] jArr = iz40Var.f15620a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (e7zVar = (e7z) ((g1v0) objArr[(i << 3) + i3]).get()) != null) {
                        if (M()) {
                            e7zVar.T(false);
                        } else {
                            e7zVar.V(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void T0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void U0() {
        fp fpVar = this.q;
        if (fpVar != null) {
            int i = fpVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((xlw[]) fpVar.c)[i2] = null;
                ((float[]) fpVar.d)[i2] = Float.NaN;
                ((byte[]) fpVar.e)[i2] = 0;
            }
            fpVar.b = 0;
        }
        hz40 hz40Var = this.r;
        if (hz40Var == null) {
            return;
        }
        Object[] objArr = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            S0((iz40) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        hz40Var.a();
    }

    @Override // a.pu90
    public final int c0(w12 w12Var) {
        int iY0;
        if (!J0() || (iY0 = y0(w12Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = w12Var instanceof gcu0;
        long j = this.e;
        return iY0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // a.dg80
    public boolean h0() {
        return L0().I();
    }

    @Override // a.tt40
    public final void v(boolean z) {
        c810 c810VarO0 = O0();
        e7z e7zVarL0 = c810VarO0 != null ? c810VarO0.L0() : null;
        if (Intrinsics.d(e7zVarL0, L0())) {
            this.l = z;
            return;
        }
        if ((e7zVarL0 != null ? e7zVarL0.i1.d : null) != a7z.c) {
            if ((e7zVarL0 != null ? e7zVarL0.i1.d : null) != a7z.d) {
                return;
            }
        }
        this.l = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(e7z e7zVar, xlw xlwVar) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        hz40 hz40Var = this.r;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (hz40Var != null) {
            Object[] objArr = hz40Var.c;
            long[] jArr3 = hz40Var.f13891a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                iz40 iz40Var = (iz40) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = iz40Var.b;
                                long[] jArr4 = iz40Var.f15620a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    e7z e7zVar2 = (e7z) ((g1v0) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (e7zVar2 != null) {
                                                        boolean zI = e7zVar2.I();
                                                        i4 = i8;
                                                        if (zI) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    iz40Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        hz40 hz40Var2 = this.r;
        if (hz40Var2 != null) {
            long[] jArr5 = hz40Var2.f13891a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((iz40) hz40Var2.c[i18]).g()) {
                                    hz40Var2.m(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        hz40 hz40Var3 = this.r;
        if (hz40Var3 == null) {
            hz40Var3 = new hz40();
            this.r = hz40Var3;
        }
        Object objG = hz40Var3.g(xlwVar);
        if (objG == null) {
            objG = new iz40();
            hz40Var3.n(xlwVar, objG);
        }
        ((iz40) objG).k(new g1v0(e7zVar));
    }

    public abstract int y0(w12 w12Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0(ru90 ru90Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        e7z e7zVar;
        boolean z2;
        int i;
        char c2;
        long j6;
        eg80 snapshotObserver;
        hz40 hz40Var = this.r;
        fp fpVar = this.q;
        if (fpVar == null) {
            fpVar = new fp();
            this.q = fpVar;
        }
        fp fpVar2 = fpVar;
        cg80 cg80Var = L0().o;
        if (cg80Var != null && (snapshotObserver = cg80Var.getSnapshotObserver()) != null) {
            snapshotObserver.f7752a.d(ru90Var, s, new rr(this, j, j2, ru90Var, (byte) 1));
        }
        boolean zM = M();
        iz40 iz40Var = (iz40) fpVar2.f;
        iz40 iz40Var2 = (iz40) fpVar2.g;
        int i2 = fpVar2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) fpVar2.e)[i3];
            if (b == 3) {
                xlw xlwVar = ((xlw[]) fpVar2.c)[i3];
                xlwVar.getClass();
                iz40Var2.k(xlwVar);
            } else if (b != 0 && hz40Var != null) {
                xlw xlwVar2 = ((xlw[]) fpVar2.c)[i3];
                xlwVar2.getClass();
                iz40 iz40Var3 = (iz40) hz40Var.l(xlwVar2);
                if (iz40Var3 != null) {
                    iz40Var.j(iz40Var3);
                }
            }
        }
        int i4 = fpVar2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) fpVar2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                xlw[] xlwVarArr = (xlw[]) fpVar2.c;
                xlwVarArr[i6 - i5] = xlwVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = fpVar2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((xlw[]) fpVar2.c)[i8] = null;
        }
        fpVar2.b -= i5;
        c810 c810VarO0 = O0();
        Object[] objArr = iz40Var2.b;
        long[] jArr = iz40Var2.f15620a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            xlw xlwVar3 = (xlw) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            c810 c810Var = c810VarO0 == null ? this : c810VarO0;
                            i = i9;
                            c810 c810Var2 = c810Var;
                            while (true) {
                                fp fpVar3 = c810Var2.q;
                                if (fpVar3 != null) {
                                    z2 = zM;
                                    if (tx3.u(xlwVar3, (xlw[]) fpVar3.c)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zM;
                                c810 c810VarO1 = c810Var2.O0();
                                if (c810VarO1 == null) {
                                    break;
                                }
                                c810Var2 = c810VarO1;
                                zM = z2;
                            }
                            hz40 hz40Var2 = c810Var2.r;
                            iz40 iz40Var4 = hz40Var2 != null ? (iz40) hz40Var2.l(xlwVar3) : null;
                            if (iz40Var4 != null) {
                                c810Var.S0(iz40Var4);
                            }
                        } else {
                            z2 = zM;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zM = z2;
                    }
                    z = zM;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zM;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zM = z;
                i9 = 8;
            }
        } else {
            z = zM;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        iz40Var2.b();
        Object[] objArr2 = iz40Var.b;
        long[] jArr2 = iz40Var.f15620a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (e7zVar = (e7z) ((g1v0) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                e7zVar.T(false);
                            } else {
                                e7zVar.V(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        iz40Var.b();
    }
}
