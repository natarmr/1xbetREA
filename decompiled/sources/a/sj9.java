package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class sj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vaz f32293a;
    public final boolean b;
    public final ey40 c;
    public final fy40 d;
    public final dy40 e;
    public final ey40 f;
    public float g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;

    public sj9(vaz vazVar, boolean z) {
        this.f32293a = vazVar;
        this.b = z;
        ey40 ey40Var = hkx.f13229a;
        this.c = new ey40();
        this.d = new fy40();
        int i = zjx.f44502a;
        this.e = new dy40();
        this.f = new ey40();
        this.h = -1;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MIN_VALUE;
    }

    public final int d(tj9 tj9Var, int i, boolean z) {
        List list;
        List list2;
        ey40 ey40Var = this.f;
        if (ey40Var.a(i)) {
            Object objB = ey40Var.b(i);
            objB.getClass();
            return ((uj9) objB).b;
        }
        ey40 ey40Var2 = this.c;
        int i2 = 0;
        if (ey40Var2.a(i)) {
            if (!z || (list2 = (List) ey40Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((sbz) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        ey40Var2.j(i, tj9Var.b(i, new rj9(this, tj9Var, (byte) 1)));
        if (!z || (list = (List) ey40Var2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((sbz) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final boolean e() {
        return (this.j == Integer.MAX_VALUE || this.k == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(tj9 tj9Var, int i, int i2) {
        int i3;
        ey40 ey40Var = this.f;
        uj9 uj9Var = (uj9) ey40Var.b(i);
        kj5 kj5Var = uj9.c;
        if (uj9Var != null) {
            uj9Var.b = i2;
            uj9Var.f35767a = kj5Var;
        } else {
            uj9Var = new uj9();
            uj9Var.f35767a = kj5Var;
            uj9Var.b = i2;
        }
        ey40Var.j(i, uj9Var);
        if (i > this.k) {
            this.k = i;
            this.m -= i2;
        } else if (i < this.j) {
            this.j = i;
            this.l -= i2;
        }
        if (Math.signum(this.g) <= 0.0f) {
            if (this.m > 0) {
                i3 = this.k + 1;
            } else {
                i3 = -1;
            }
        } else if (Math.signum(this.g) <= 0.0f || this.l <= 0) {
            i3 = -1;
        } else {
            i3 = this.j - 1;
        }
        if (i3 > 0 && tj9Var.f(i3) != -1 && tj9Var.f(i3) < this.o) {
            this.c.j(i3, tj9Var.b(i3, new rj9(this, tj9Var, (byte) 0)));
        }
        l();
    }

    public final void g(tj9 tj9Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = Math.signum(f) == Math.signum(this.g);
        if (!z) {
            if (!z2 || this.n) {
                this.l = i3 - i5;
                this.j = i;
            } else {
                int iB = si30.b(Math.abs(f)) + this.l;
                int i7 = i3 - i5;
                if (iB > i7) {
                    iB = i7;
                }
                this.l = iB;
            }
            while (this.l > 0 && (i6 = this.j) > 0) {
                int iD = d(tj9Var, this.j - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iD == -1) {
                    return;
                }
                this.j--;
                this.l -= iD;
            }
            return;
        }
        if (!z2 || this.n) {
            this.m = i3 - i4;
            this.k = i2;
        } else {
            int iB2 = si30.b(Math.abs(f)) + this.m;
            int i8 = i3 - i4;
            if (iB2 > i8) {
                iB2 = i8;
            }
            this.m = iB2;
        }
        while (this.m > 0 && tj9Var.f(this.k) != -1 && tj9Var.f(this.k) < this.o - 1) {
            int iD2 = d(tj9Var, this.k + 1, this.k + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iD2 == -1) {
                return;
            }
            this.k++;
            this.m -= iD2;
        }
    }

    public final void h(tj9 tj9Var, float f) {
        int i;
        int i2;
        l();
        boolean zA = tj9Var.a();
        vaz vazVar = this.f32293a;
        if (zA) {
            int iA = tj9Var.getDensity() != null ? vazVar.a(tj9Var.k()) : 0;
            this.o = tj9Var.p();
            int iC = tj9Var.c();
            int iG = tj9Var.g();
            int iP = tj9Var.p();
            int i3 = tj9Var.i();
            int iN = tj9Var.n();
            ey40 ey40Var = this.f;
            if (f <= 0.0f) {
                this.l = iA - i3;
                this.j = iC;
                while (this.l > 0 && (i2 = this.j) > 0 && ey40Var.a(i2 - 1)) {
                    Object objB = ey40Var.b(this.j - 1);
                    objB.getClass();
                    int i4 = ((uj9) objB).b;
                    this.j--;
                    this.l -= i4;
                }
                j(0, this.j - 1);
            } else {
                this.m = iA - iN;
                this.k = iG;
                while (this.m > 0 && (i = this.k) < iP - 1 && ey40Var.a(i + 1)) {
                    Object objB2 = ey40Var.b(this.k + 1);
                    objB2.getClass();
                    int i5 = ((uj9) objB2).b;
                    this.k++;
                    this.m -= i5;
                }
                j(this.k + 1, iP - 1);
            }
        }
        if (tj9Var.a()) {
            int iB = tj9Var.getDensity() != null ? vazVar.b(tj9Var.k()) : 0;
            int iC2 = tj9Var.c();
            int iG2 = tj9Var.g();
            int i6 = tj9Var.i();
            boolean z = false;
            int iN2 = tj9Var.n();
            if (f <= 0.0f) {
                z = true;
            }
            g(tj9Var, iC2, iG2, iB, iN2, i6, f, z);
        }
        this.g = f;
        l();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(tj9 tj9Var) {
        sj9 sj9Var;
        tj9 tj9Var2;
        boolean z = this.i;
        vaz vazVar = this.f32293a;
        if (!z && this.b) {
            if ((tj9Var.getDensity() != null ? vazVar.b(tj9Var.k()) : 0) != 0) {
                this.n = true;
            }
            this.i = true;
        }
        int i = this.h;
        if (i != -1 && i != tj9Var.p()) {
            this.n = true;
            if (tj9Var.a()) {
                int i2 = this.j;
                if (i2 < 0) {
                    i2 = 0;
                }
                this.j = i2;
                int iQ = tj9Var.q();
                if (iQ != -1) {
                    int i3 = this.k;
                    if (i3 <= iQ) {
                        iQ = i3;
                    }
                    this.k = iQ;
                }
                if (this.g <= 0.0f) {
                    j(tj9Var.g(), this.o - 1);
                } else {
                    j(0, tj9Var.c());
                }
            }
        }
        this.o = tj9Var.p();
        if (tj9Var.a()) {
            int iE = tj9Var.e();
            for (int i4 = 0; i4 < iE; i4++) {
                int iD = tj9Var.d(i4);
                Object objR = tj9Var.r(i4);
                int iJ = tj9Var.j(i4);
                if (iD != -1) {
                    ey40 ey40Var = this.f;
                    if (ey40Var.a(iD)) {
                        Object objB = ey40Var.b(iD);
                        objB.getClass();
                        int i5 = ((uj9) objB).b;
                        Object objB2 = ey40Var.b(iD);
                        objB2.getClass();
                        Object obj = ((uj9) objB2).f35767a;
                        if (i5 != iJ || !Intrinsics.d(obj, objR)) {
                            this.n = true;
                        }
                    }
                    uj9 uj9Var = (uj9) ey40Var.b(iD);
                    if (uj9Var != null) {
                        uj9Var.b = iJ;
                        uj9Var.f35767a = objR;
                    } else {
                        uj9Var = new uj9();
                        uj9Var.f35767a = objR;
                        uj9Var.b = iJ;
                    }
                    ey40Var.j(iD, uj9Var);
                    this.j = Math.min(this.j, iD);
                    this.k = Math.max(this.k, iD);
                    List list = (List) this.c.h(iD);
                    if (list != null) {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((sbz) list.get(i6)).cancel();
                        }
                    }
                }
            }
            if (this.n) {
                boolean z2 = this.g <= 0.0f;
                if (tj9Var.a()) {
                    sj9Var = this;
                    tj9Var2 = tj9Var;
                    sj9Var.g(tj9Var2, tj9Var.c(), tj9Var.g(), tj9Var.getDensity() != null ? vazVar.b(tj9Var.k()) : 0, tj9Var.n(), tj9Var.i(), 0.0f, z2);
                } else {
                    sj9Var = this;
                    tj9Var2 = tj9Var;
                }
                sj9Var.n = false;
            } else {
                sj9Var = this;
                tj9Var2 = tj9Var;
            }
        } else {
            sj9Var = this;
            tj9Var2 = tj9Var;
            sj9Var.k();
        }
        sj9Var.h = tj9Var2.p();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void j(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        fy40 fy40Var = this.d;
        fy40Var.b();
        ey40 ey40Var = this.c;
        int[] iArr2 = ey40Var.b;
        long[] jArr2 = ey40Var.f11466a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            fy40Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        dy40 dy40Var = this.e;
        int[] iArr3 = dy40Var.b;
        long[] jArr3 = dy40Var.f6876a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                fy40Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        ey40 ey40Var2 = this.f;
        int[] iArr4 = ey40Var2.b;
        long[] jArr4 = ey40Var2.f11466a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            fy40Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        int[] iArr5 = fy40Var.b;
        long[] jArr5 = fy40Var.f10343a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) ey40Var.h(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((sbz) list.get(i19)).cancel();
                            }
                        }
                        int iC = dy40Var.c(i18);
                        if (iC >= 0) {
                            dy40Var.e--;
                            long[] jArr6 = dy40Var.f6876a;
                            int i20 = dy40Var.d;
                            int i21 = iC >> 3;
                            int i22 = (iC & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iC - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        ey40Var2.h(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void k() {
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MIN_VALUE;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.e.a();
        this.f.c();
        ey40 ey40Var = this.c;
        long[] jArr = ey40Var.f11466a;
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
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = ey40Var.b[i4];
                        List list = (List) ey40Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((sbz) list.get(i6)).cancel();
                        }
                        ey40Var.i(i4);
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

    public final void l() {
        ahy.k0(this.l, "prefetchWindowStartExtraSpace");
        ahy.k0(this.m, "prefetchWindowEndExtraSpace");
        ahy.k0(this.j, "prefetchWindowStartIndex");
        ahy.k0(this.k, "prefetchWindowEndIndex");
    }
}
