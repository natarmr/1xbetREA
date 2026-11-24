package a;

import android.os.Trace;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tld implements zfe0, mld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nld f34137a;
    public final v0 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final lz40 e;
    public final q9k0 f;
    public final hz40 g;
    public final iz40 h;
    public final iz40 i;
    public final hz40 j;
    public final qpb k;
    public final qpb l;
    public final hz40 m;
    public hz40 n;
    public boolean o;
    public isj0 p;
    public h390 q;
    public tld r;
    public int s;
    public final lrc t;
    public final pwi u;
    public final fet v;
    public byte w;
    public Function2 x;

    public tld(nld nldVar, v0 v0Var) {
        this.f34137a = nldVar;
        this.b = v0Var;
        iz40 iz40Var = new iz40();
        lz40 lz40Var = iz40Var.e;
        if (lz40Var == null) {
            lz40Var = new lz40(iz40Var);
            iz40Var.e = lz40Var;
        }
        lz40 lz40Var2 = lz40Var;
        this.e = lz40Var2;
        q9k0 q9k0Var = new q9k0();
        if (nldVar.e()) {
            q9k0Var.k = new ey40();
        }
        if (nldVar.g()) {
            q9k0Var.c();
        }
        this.f = q9k0Var;
        this.g = e9x.J();
        this.h = new iz40();
        this.i = new iz40();
        this.j = e9x.J();
        qpb qpbVar = new qpb();
        this.k = qpbVar;
        qpb qpbVar2 = new qpb();
        this.l = qpbVar2;
        this.m = e9x.J();
        this.n = e9x.J();
        lrc lrcVar = new lrc((Object) nldVar, (byte) 6);
        this.t = lrcVar;
        this.u = new pwi((byte) 11);
        fet fetVar = new fet(v0Var, nldVar, s9k0.a(q9k0Var), lz40Var2, qpbVar, qpbVar2, lrcVar, this);
        nldVar.s(fetVar);
        this.v = fetVar;
        ugd ugdVar = xia0.f40936a;
    }

    public final boolean A() {
        synchronized (this.d) {
            h390 h390Var = this.q;
            boolean z = false;
            if (h390Var != null && (h390Var.h.get() != j390.e || h390Var.i != hfm0.v())) {
                AtomicReference atomicReference = h390Var.h;
                j390 j390Var = j390.f;
                j390 j390Var2 = j390.d;
                while (!atomicReference.compareAndSet(j390Var, j390Var2) && atomicReference.get() == j390Var) {
                }
                ((MutableIntList) h390Var.l.b).a(9);
                return false;
            }
            s();
            try {
                hz40 hz40Var = this.n;
                this.n = e9x.J();
                try {
                    fet fetVar = this.v;
                    isj0 isj0Var = this.p;
                    a180 a180Var = fetVar.e.f29108a;
                    if (!a180Var.b0()) {
                        ykd.a("Expected applyChanges() to have been called");
                    }
                    if (hz40Var.e > 0 || !fetVar.s.isEmpty()) {
                        fetVar.P = isj0Var;
                        try {
                            fetVar.p(hz40Var, null);
                            fetVar.P = null;
                            z = !a180Var.b0();
                        } catch (Throwable th) {
                            fetVar.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        t();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.n = hz40Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.f20890a.g()) {
                        pwi pwiVar = this.u;
                        try {
                            pwiVar.t(this.e, this.v.C());
                            pwiVar.d();
                        } finally {
                            pwiVar.c();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    g();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(w1h0 w1h0Var) {
        Object objQ;
        while (true) {
            Object obj = this.c.get();
            if (obj == null || obj.equals(ay3.m)) {
                objQ = w1h0Var;
            } else if (obj instanceof Set) {
                objQ = new Set[]{obj, w1h0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    e9d0.x(this.c, "corrupt pendingModifications: ");
                    return;
                }
                objQ = qx3.q(w1h0Var, (Set[]) obj);
            }
            AtomicReference atomicReference = this.c;
            do {
                if (atomicReference.compareAndSet(obj, objQ)) {
                    if (obj == null) {
                        synchronized (this.d) {
                            t();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void C(Object obj) {
        synchronized (this.d) {
            try {
                y(obj);
                Object objG = this.j.g(obj);
                if (objG != null) {
                    if (objG instanceof iz40) {
                        iz40 iz40Var = (iz40) objG;
                        Object[] objArr = iz40Var.b;
                        long[] jArr = iz40Var.f15620a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            y((zbk) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        y((zbk) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.mld
    public final void a() {
        synchronized (this.d) {
            try {
                if (this.v.F) {
                    dsb0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.w != 3) {
                    this.w = (byte) 3;
                    this.x = xia0.b;
                    qpb qpbVar = this.v.L;
                    if (qpbVar != null) {
                        k(qpbVar);
                    }
                    boolean z = this.f.b == 0;
                    if (!z || !this.e.f20890a.g()) {
                        pwi pwiVar = this.u;
                        try {
                            pwiVar.t(this.e, this.v.C());
                            if (!z) {
                                q9k0 q9k0Var = this.f;
                                pwi pwiVar2 = this.u;
                                t9k0 t9k0VarH = q9k0Var.h();
                                try {
                                    t9k0VarH.m(t9k0VarH.t, new cnc(pwiVar2, (byte) 11));
                                    t9k0VarH.I();
                                    t9k0VarH.e(true);
                                    this.b.n();
                                    this.b.e();
                                    pwiVar.e();
                                } catch (Throwable th) {
                                    t9k0VarH.e(false);
                                    throw th;
                                }
                            }
                            pwiVar.d();
                            pwiVar.c();
                        } catch (Throwable th2) {
                            pwiVar.c();
                            throw th2;
                        }
                    }
                    this.m.a();
                    fet fetVar = this.v;
                    fetVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        fetVar.b.x(fetVar);
                        fetVar.E.clear();
                        fetVar.s.clear();
                        fetVar.e.f29108a.Z();
                        fetVar.v = null;
                        fetVar.f9421a.n();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f34137a.y(this);
    }

    @Override // a.zfe0
    public final void b() {
        this.o = true;
        this.t.b();
    }

    @Override // a.mld
    public final boolean c() {
        return this.w == 3;
    }

    @Override // a.mld
    public final void d(Function2 function2) {
        boolean zO = o();
        v();
        nld nldVar = this.f34137a;
        if (!zO) {
            this.x = function2;
            nldVar.a(this, function2);
            return;
        }
        fet fetVar = this.v;
        fetVar.z = 0;
        fetVar.y = true;
        this.x = function2;
        nldVar.a(this, function2);
        if (fetVar.F || fetVar.z != 0) {
            dsb0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        fetVar.z = -1;
        fetVar.y = false;
    }

    @Override // a.zfe0
    public final gox e(yfe0 yfe0Var, Object obj) {
        tld tldVar;
        int i = yfe0Var.b;
        if ((i & 2) != 0) {
            yfe0Var.b = i | 4;
        }
        bet betVar = yfe0Var.c;
        if (betVar == null || !betVar.a()) {
            return gox.f11656a;
        }
        q9k0 q9k0Var = this.f;
        q9k0Var.getClass();
        bet betVar2 = yfe0Var.c;
        if (betVar2 != null && q9k0Var.j(obc.J(betVar2))) {
            if (yfe0Var.d == null) {
                return gox.f11656a;
            }
            gox goxVarX = x(yfe0Var, betVar, obj);
            if (goxVarX != gox.f11656a) {
                this.t.b();
            }
            return goxVarX;
        }
        synchronized (this.d) {
            tldVar = this.r;
        }
        if (tldVar != null) {
            fet fetVar = tldVar.v;
            if (fetVar.F && fetVar.k0(yfe0Var, obj)) {
                return gox.d;
            }
        }
        return gox.f11656a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // a.zfe0
    public final void f(Object obj) {
        yfe0 yfe0VarA;
        int i;
        boolean z;
        fet fetVar = this.v;
        if (fetVar.A <= 0 && (yfe0VarA = fetVar.A()) != null) {
            int i2 = yfe0VarA.b | 1;
            yfe0VarA.b = i2;
            if ((i2 & 32) == 0) {
                ry40 ry40Var = yfe0VarA.f;
                if (ry40Var == null) {
                    ry40Var = new ry40();
                    yfe0VarA.f = ry40Var;
                }
                int i3 = yfe0VarA.e;
                int iC = ry40Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = ry40Var.c[iC];
                }
                ry40Var.b[iC] = obj;
                ry40Var.c[iC] = i3;
                if (i == yfe0VarA.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.t.b();
            if (z) {
                return;
            }
            if (obj instanceof c8m0) {
                ((c8m0) obj).k(1);
            }
            e9x.F(this.g, obj, yfe0VarA);
            if (obj instanceof zbk) {
                zbk zbkVar = (zbk) obj;
                ybk ybkVarM = zbkVar.m();
                hz40 hz40Var = this.j;
                e9x.T(hz40Var, obj);
                ry40 ry40Var2 = ybkVarM.e;
                Object[] objArr = ry40Var2.b;
                long[] jArr = ry40Var2.f31295a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    b8m0 b8m0Var = (b8m0) objArr[(i4 << 3) + i7];
                                    if (b8m0Var instanceof c8m0) {
                                        ((c8m0) b8m0Var).k(1);
                                    }
                                    e9x.F(hz40Var, b8m0Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = ybkVarM.f;
                hz40 hz40Var2 = yfe0VarA.g;
                if (hz40Var2 == null) {
                    hz40Var2 = new hz40();
                    yfe0VarA.g = hz40Var2;
                }
                hz40Var2.n(zbkVar, obj2);
            }
        }
    }

    public final void g() {
        this.c.set(null);
        this.k.f29108a.Z();
        this.l.f29108a.Z();
        lz40 lz40Var = this.e;
        if (lz40Var.f20890a.g()) {
            return;
        }
        pwi pwiVar = this.u;
        try {
            pwiVar.t(lz40Var, this.v.C());
            pwiVar.d();
        } finally {
            pwiVar.c();
        }
    }

    public final void h(Object obj, boolean z) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof iz40;
        iz40 iz40Var = this.h;
        iz40 iz40Var2 = this.i;
        hz40 hz40Var = this.m;
        if (!z2) {
            yfe0 yfe0Var = (yfe0) objG;
            if (e9x.S(hz40Var, obj, yfe0Var) || yfe0Var.b(obj) == gox.f11656a) {
                return;
            }
            if (yfe0Var.g == null || z) {
                iz40Var.a(yfe0Var);
                return;
            } else {
                iz40Var2.a(yfe0Var);
                return;
            }
        }
        iz40 iz40Var3 = (iz40) objG;
        Object[] objArr = iz40Var3.b;
        long[] jArr = iz40Var3.f15620a;
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
                        yfe0 yfe0Var2 = (yfe0) objArr[(i << 3) + i3];
                        if (!e9x.S(hz40Var, obj, yfe0Var2) && yfe0Var2.b(obj) != gox.f11656a) {
                            if (yfe0Var2.g == null || z) {
                                iz40Var.a(yfe0Var2);
                            } else {
                                iz40Var2.a(yfe0Var2);
                            }
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

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void i(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof w1h0;
        hz40 hz40Var = this.j;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            iz40 iz40Var = ((w1h0) set).f38399a;
            Object[] objArr = iz40Var.b;
            long[] jArr9 = iz40Var.f15620a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof yfe0) {
                                    ((yfe0) obj2).b(obj);
                                } else {
                                    h(obj2, z);
                                    Object objG = hz40Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof iz40) {
                                            iz40 iz40Var2 = (iz40) objG;
                                            Object[] objArr2 = iz40Var2.b;
                                            long[] jArr10 = iz40Var2.f15620a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                h((zbk) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            h((zbk) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof yfe0) {
                    ((yfe0) obj3).b(null);
                } else {
                    h(obj3, z);
                    Object objG2 = hz40Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof iz40) {
                            iz40 iz40Var3 = (iz40) objG2;
                            Object[] objArr3 = iz40Var3.b;
                            long[] jArr12 = iz40Var3.f15620a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                h((zbk) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
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
                        } else {
                            h((zbk) objG2, z);
                        }
                    }
                }
            }
        }
        hz40 hz40Var2 = this.g;
        iz40 iz40Var4 = this.h;
        if (z) {
            iz40 iz40Var5 = this.i;
            if (iz40Var5.h()) {
                long[] jArr13 = hz40Var2.f13891a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = hz40Var2.b[i18];
                                    Object obj5 = hz40Var2.c[i18];
                                    if (obj5 instanceof iz40) {
                                        iz40 iz40Var6 = (iz40) obj5;
                                        Object[] objArr4 = iz40Var6.b;
                                        long[] jArr14 = iz40Var6.f15620a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            yfe0 yfe0Var = (yfe0) objArr5[i22];
                                                            if (iz40Var5.c(yfe0Var) || iz40Var4.c(yfe0Var)) {
                                                                iz40Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = iz40Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        yfe0 yfe0Var2 = (yfe0) obj5;
                                        zG = iz40Var5.c(yfe0Var2) || iz40Var4.c(yfe0Var2);
                                    }
                                    if (zG) {
                                        hz40Var2.m(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                iz40Var5.b();
                n();
                return;
            }
        }
        if (iz40Var4.h()) {
            long[] jArr16 = hz40Var2.f13891a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = hz40Var2.b[i26];
                                Object obj7 = hz40Var2.c[i26];
                                if (obj7 instanceof iz40) {
                                    iz40 iz40Var7 = (iz40) obj7;
                                    Object[] objArr6 = iz40Var7.b;
                                    long[] jArr17 = iz40Var7.f15620a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (iz40Var4.c((yfe0) objArr7[i30])) {
                                                            iz40Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = iz40Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = iz40Var4.c((yfe0) obj7);
                                }
                                if (zC) {
                                    hz40Var2.m(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            n();
            iz40Var4.b();
        }
    }

    public final void j() {
        synchronized (this.d) {
            try {
                k(this.k);
                t();
            } catch (Throwable th) {
                try {
                    if (!this.e.f20890a.g()) {
                        pwi pwiVar = this.u;
                        try {
                            pwiVar.t(this.e, this.v.C());
                            pwiVar.d();
                        } finally {
                            pwiVar.c();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    g();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:146:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:146:0x00e9->B:76:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0158, B:89:0x016b, B:76:0x012c, B:81:0x0140, B:95:0x0189, B:97:0x0195), top: B:146:0x00e9 }] */
    public final void k(qpb qpbVar) throws Throwable {
        pwi pwiVar;
        long[] jArr;
        int i;
        long[] jArr2;
        pwi pwiVar2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        qpb qpbVar2 = this.l;
        fet fetVar = this.v;
        rld rldVarC = fetVar.C();
        pwi pwiVar3 = this.u;
        pwiVar3.t(this.e, rldVarC);
        try {
            if (qpbVar.f29108a.b0()) {
                try {
                    if (qpbVar2.f29108a.b0() && this.q == null) {
                        pwiVar3.d();
                    }
                    return;
                } finally {
                    pwiVar3.c();
                }
            }
            h390 h390Var = this.q;
            bv3 bv3Var = h390Var != null ? h390Var.l : this.b;
            try {
                Trace.beginSection(bv3Var.equals(h390Var != null ? h390Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    h390 h390Var2 = this.q;
                    pwi pwiVar4 = h390Var2 != null ? h390Var2.k : pwiVar3;
                    q9k0 q9k0Var = this.f;
                    rld rldVarC2 = fetVar.C();
                    t9k0 t9k0VarH = s9k0.a(q9k0Var).h();
                    int i3 = 0;
                    try {
                        qpbVar.h1(bv3Var, t9k0VarH, pwiVar4, rldVarC2);
                        t9k0VarH.e(true);
                        bv3Var.e();
                        Trace.endSection();
                        pwiVar3.e();
                        pwiVar3.f();
                        if (this.o) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.o = false;
                                hz40 hz40Var = this.g;
                                long[] jArr3 = hz40Var.f13891a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = hz40Var.b[i8];
                                                    Object obj2 = hz40Var.c[i8];
                                                    if (obj2 instanceof iz40) {
                                                        iz40 iz40Var = (iz40) obj2;
                                                        Object[] objArr = iz40Var.b;
                                                        long[] jArr4 = iz40Var.f15620a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        pwiVar2 = pwiVar3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((yfe0) objArr[i13]).a()) {
                                                                                    iz40Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = iz40Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        pwiVar2 = pwiVar3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((yfe0) obj2).a();
                                                    }
                                                    if (zG) {
                                                        hz40Var.m(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    pwiVar2 = pwiVar3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                pwiVar3 = pwiVar2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            pwiVar = pwiVar3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            pwiVar = pwiVar3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        pwiVar3 = pwiVar;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    pwiVar = pwiVar3;
                                }
                                n();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            pwiVar = pwiVar3;
                        }
                        try {
                            if (qpbVar2.f29108a.b0() && this.q == null) {
                                pwiVar.d();
                            }
                            return;
                        } finally {
                            pwiVar.c();
                        }
                    } catch (Throwable th3) {
                        try {
                            t9k0VarH.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (qpbVar2.f29108a.b0() && this.q == null) {
                pwiVar3.d();
            }
            throw th;
        } finally {
            pwiVar3.c();
        }
    }

    public final void l() {
        synchronized (this.d) {
            try {
                qpb qpbVar = this.l;
                qpbVar.getClass();
                if (!qpbVar.f29108a.b0()) {
                    k(this.l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.f20890a.g()) {
                        pwi pwiVar = this.u;
                        try {
                            pwiVar.t(this.e, this.v.C());
                            pwiVar.d();
                        } finally {
                            pwiVar.c();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    g();
                    throw th2;
                }
            }
        }
    }

    public final void m() {
        synchronized (this.d) {
            try {
                this.v.v = null;
                if (!this.e.f20890a.g()) {
                    pwi pwiVar = this.u;
                    try {
                        pwiVar.t(this.e, this.v.C());
                        pwiVar.d();
                        pwiVar.c();
                    } catch (Throwable th) {
                        pwiVar.c();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.e.f20890a.g()) {
                        pwi pwiVar2 = this.u;
                        try {
                            pwiVar2.t(this.e, this.v.C());
                            pwiVar2.d();
                        } finally {
                            pwiVar2.c();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    g();
                    throw th3;
                }
            }
        }
    }

    public final void n() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        hz40 hz40Var = this.j;
        long[] jArr3 = hz40Var.f13891a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = hz40Var.b[i10];
                            Object obj2 = hz40Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof iz40;
                            j5 = j8;
                            hz40 hz40Var2 = this.g;
                            if (z) {
                                iz40 iz40Var = (iz40) obj2;
                                Object[] objArr = iz40Var.b;
                                long[] jArr4 = iz40Var.f15620a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!hz40Var2.c((zbk) objArr[i15])) {
                                                        iz40Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = iz40Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !hz40Var2.c((zbk) obj2);
                            }
                            if (zG) {
                                hz40Var.m(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        iz40 iz40Var2 = this.i;
        if (!iz40Var2.h()) {
            return;
        }
        Object[] objArr2 = iz40Var2.b;
        long[] jArr5 = iz40Var2.f15620a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((yfe0) objArr2[i20]).g == null) {
                            iz40Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.w != 1) {
                z = false;
            }
            if (z) {
                this.w = (byte) 0;
            }
        }
        return z;
    }

    public final void p(Function2 function2) {
        try {
            synchronized (this.d) {
                s();
                hz40 hz40Var = this.n;
                this.n = e9x.J();
                try {
                    fet fetVar = this.v;
                    isj0 isj0Var = this.p;
                    if (!fetVar.e.f29108a.b0()) {
                        ykd.a("Expected applyChanges() to have been called");
                    }
                    fetVar.P = isj0Var;
                    try {
                        fetVar.p(hz40Var, function2);
                        fetVar.P = null;
                    } catch (Throwable th) {
                        fetVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.n = hz40Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.e.f20890a.g()) {
                    pwi pwiVar = this.u;
                    try {
                        pwiVar.t(this.e, this.v.C());
                        pwiVar.d();
                    } finally {
                        pwiVar.c();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                g();
                throw th4;
            }
        }
    }

    public final h390 q(boolean z, Function2 function2) {
        if (this.q != null) {
            dsb0.b("A pausable composition is in progress");
        }
        h390 h390Var = new h390(this, this.f34137a, this.v, this.e, function2, z, this.b, this.d);
        this.q = h390Var;
        return h390Var;
    }

    public final void r() {
        synchronized (this.d) {
            try {
                if (this.q != null) {
                    dsb0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b == 0;
                if (!z || !this.e.f20890a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        pwi pwiVar = this.u;
                        try {
                            pwiVar.t(this.e, this.v.C());
                            if (!z) {
                                q9k0 q9k0Var = this.f;
                                pwi pwiVar2 = this.u;
                                t9k0 t9k0VarH = q9k0Var.h();
                                try {
                                    t9k0VarH.m(t9k0VarH.t, new sjs(pwiVar2, t9k0VarH, (byte) 4));
                                    t9k0VarH.e(true);
                                    this.b.e();
                                    pwiVar.e();
                                } catch (Throwable th) {
                                    t9k0VarH.e(false);
                                    throw th;
                                }
                            }
                            pwiVar.d();
                            pwiVar.c();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            pwiVar.c();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.g.a();
                this.j.a();
                this.n.a();
                this.k.f29108a.Z();
                this.l.f29108a.Z();
                fet fetVar = this.v;
                fetVar.E.clear();
                fetVar.s.clear();
                fetVar.e.f29108a.Z();
                fetVar.v = null;
                this.w = (byte) 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void s() {
        Object obj = ay3.m;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                ykd.b("pending composition has not been applied");
                csj.b();
                return;
            }
            if (andSet instanceof Set) {
                i((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ykd.b("corrupt pendingModifications drain: " + atomicReference);
                csj.b();
                return;
            }
            for (Set set : (Set[]) andSet) {
                i(set, true);
            }
        }
    }

    public final void t() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.d(andSet, ay3.m)) {
            return;
        }
        if (andSet instanceof Set) {
            i((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                i(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.q == null) {
                ykd.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            ykd.b("corrupt pendingModifications drain: " + atomicReference);
            csj.b();
        }
    }

    public final void u() {
        xun xunVar = xun.f41520a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(xunVar);
        if (Intrinsics.d(andSet, ay3.m) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            i((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ykd.b("corrupt pendingModifications drain: " + atomicReference);
            csj.b();
            return;
        }
        for (Set set : (Set[]) andSet) {
            i(set, false);
        }
    }

    public final void v() {
        String str;
        byte b = this.w;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            dsb0.b(str);
        }
        if (this.q == null) {
            return;
        }
        dsb0.b("A pausable composition is in progress");
    }

    public final void w(ArrayList arrayList) {
        lz40 lz40Var = this.e;
        fet fetVar = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mu40) ((Pair) arrayList.get(i)).f46059a).c != this) {
                ykd.a("Check failed");
                break;
            }
        }
        try {
            fetVar.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    fetVar.E(arrayList);
                    fetVar.j();
                    Trace.endSection();
                } catch (Throwable th) {
                    fetVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!lz40Var.f20890a.g()) {
                    pwi pwiVar = this.u;
                    try {
                        pwiVar.t(lz40Var, fetVar.C());
                        pwiVar.d();
                    } finally {
                        pwiVar.c();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                g();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final gox x(yfe0 yfe0Var, bet betVar, Object obj) {
        synchronized (this.d) {
            try {
                tld tldVar = this.r;
                tld tldVar2 = null;
                if (tldVar != null) {
                    q9k0 q9k0Var = this.f;
                    int i = this.s;
                    if (q9k0Var.g) {
                        ykd.a("Writer is active");
                    }
                    if (i < 0 || i >= q9k0Var.b) {
                        ykd.a("Invalid group index");
                    }
                    bet betVarJ = obc.J(betVar);
                    if (q9k0Var.j(betVarJ)) {
                        int i2 = q9k0Var.f28352a[(i * 5) + 3] + i;
                        int i3 = betVarJ.f2467a;
                        if (i > i3 || i3 >= i2) {
                            tldVar = null;
                        }
                    } else {
                        tldVar = null;
                    }
                    tldVar2 = tldVar;
                }
                if (tldVar2 == null) {
                    fet fetVar = this.v;
                    if (fetVar.F && fetVar.k0(yfe0Var, obj)) {
                        return gox.d;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof zbk;
                        hz40 hz40Var = this.n;
                        if (z) {
                            Object objG = hz40Var.g(yfe0Var);
                            if (objG == null) {
                                e9x.F(this.n, yfe0Var, obj);
                                break;
                            }
                            if (objG instanceof iz40) {
                                iz40 iz40Var = (iz40) objG;
                                Object[] objArr = iz40Var.b;
                                long[] jArr = iz40Var.f15620a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    e9x.F(this.n, yfe0Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == ujn.B) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        e9x.F(this.n, yfe0Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        e9x.F(this.n, yfe0Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != ujn.B) {
                                    e9x.F(this.n, yfe0Var, obj);
                                    break;
                                }
                            }
                        } else {
                            hz40Var.n(yfe0Var, ujn.B);
                        }
                    } else {
                        this.n.n(yfe0Var, ujn.B);
                    }
                }
                if (tldVar2 != null) {
                    return tldVar2.x(yfe0Var, betVar, obj);
                }
                this.f34137a.n(this);
                return this.v.F ? gox.c : gox.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof iz40;
        hz40 hz40Var = this.m;
        if (!z) {
            yfe0 yfe0Var = (yfe0) objG;
            if (yfe0Var.b(obj) != gox.d || (obj instanceof zbk)) {
                return;
            }
            e9x.F(hz40Var, obj, yfe0Var);
            return;
        }
        iz40 iz40Var = (iz40) objG;
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
                    if ((255 & j) < 128) {
                        yfe0 yfe0Var2 = (yfe0) objArr[(i << 3) + i3];
                        if (yfe0Var2.b(obj) == gox.d && !(obj instanceof zbk)) {
                            e9x.F(hz40Var, obj, yfe0Var2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean z(Set set) {
        boolean z = set instanceof w1h0;
        hz40 hz40Var = this.j;
        hz40 hz40Var2 = this.g;
        if (z) {
            iz40 iz40Var = ((w1h0) set).f38399a;
            Object[] objArr = iz40Var.b;
            long[] jArr = iz40Var.f15620a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (hz40Var2.c(obj) || hz40Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (hz40Var2.c(obj2) || hz40Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
