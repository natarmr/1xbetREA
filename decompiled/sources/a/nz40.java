package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public class nz40 extends rfk0 {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public iz40 h;
    public ArrayList i;
    public wfk0 j;
    public int[] k;
    public int l;
    public boolean m;

    public nz40(long j, wfk0 wfk0Var, Function1 function1, Function1 function2) {
        super(j, wfk0Var);
        this.e = function1;
        this.f = function2;
        this.j = wfk0.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (xfk0.c) {
            this.j = this.j.g(j);
        }
    }

    public void B(iz40 iz40Var) {
        this.h = iz40Var;
    }

    public nz40 C(Function1 function1, Function1 function2) {
        tj50 tj50Var;
        if (this.c) {
            dsb0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dsb0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = xfk0.c;
        synchronized (obj) {
            long j = xfk0.e;
            xfk0.e = j + 1;
            xfk0.d = xfk0.d.g(j);
            wfk0 wfk0VarD = d();
            r(wfk0VarD.g(j));
            tj50Var = new tj50(j, xfk0.a(wfk0VarD, g() + 1, j), xfk0.i(function1, e(), true), xfk0.j(function2, i()), this);
        }
        if (this.m || this.c) {
            return tj50Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = xfk0.e;
            xfk0.e = j2 + 1;
            s(j2);
            xfk0.d = xfk0.d.g(g());
        }
        r(xfk0.a(d(), jG + 1, g()));
        return tj50Var;
    }

    @Override // a.rfk0
    public final void b() {
        xfk0.d = xfk0.d.c(g()).b(this.j);
    }

    @Override // a.rfk0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (xfk0.c) {
            o();
        }
        l();
    }

    @Override // a.rfk0
    public int h() {
        return this.g;
    }

    @Override // a.rfk0
    public Function1 i() {
        return this.f;
    }

    @Override // a.rfk0
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // a.rfk0
    public void l() {
        if (this.l <= 0) {
            dsb0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        iz40 iz40VarX = x();
        if (iz40VarX != null) {
            if (this.m) {
                dsb0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = iz40VarX.b;
            long[] jArr = iz40VarX.f15620a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (e8m0 e8m0VarG = ((b8m0) objArr[(i2 << 3) + i4]).g(); e8m0VarG != null; e8m0VarG = e8m0VarG.b) {
                                    long j2 = e8m0VarG.f7381a;
                                    if (j2 == jG || CollectionsKt.L(this.j, Long.valueOf(j2))) {
                                        thj0 thj0Var = xfk0.f40794a;
                                        e8m0VarG.f7381a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // a.rfk0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // a.rfk0
    public void n(b8m0 b8m0Var) {
        iz40 iz40VarX = x();
        if (iz40VarX == null) {
            iz40 iz40Var = v1h0.f36630a;
            iz40VarX = new iz40();
            B(iz40VarX);
        }
        iz40VarX.a(b8m0Var);
    }

    @Override // a.rfk0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            xfk0.t(this.k[i]);
        }
        o();
    }

    @Override // a.rfk0
    public void t(int i) {
        this.g = i;
    }

    @Override // a.rfk0
    public rfk0 u(Function1 function1) {
        uj50 uj50Var;
        if (this.c) {
            dsb0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dsb0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = xfk0.c;
        synchronized (obj) {
            long j = xfk0.e;
            xfk0.e = j + 1;
            xfk0.d = xfk0.d.g(j);
            uj50Var = new uj50(j, xfk0.a(d(), jG + 1, j), xfk0.i(function1, e(), true), this);
        }
        if (this.m || this.c) {
            return uj50Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = xfk0.e;
            xfk0.e = j2 + 1;
            s(j2);
            xfk0.d = xfk0.d.g(g());
        }
        r(xfk0.a(d(), jG2 + 1, g()));
        return uj50Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (xfk0.c) {
            long j = xfk0.e;
            xfk0.e = j + 1;
            s(j);
            xfk0.d = xfk0.d.g(g());
        }
        r(xfk0.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public wdx w() {
        HashMap mapM;
        List list;
        iz40 iz40Var;
        long j;
        long j2;
        iz40 iz40VarX = x();
        if (iz40VarX != null) {
            long j3 = xfk0.j.b;
            mapM = xfk0.m(j3, this, xfk0.d.c(j3));
        } else {
            mapM = null;
        }
        iun iunVar = iun.f15405a;
        synchronized (xfk0.c) {
            try {
                xfk0.v(this);
                if (iz40VarX == null || iz40VarX.d == 0) {
                    b();
                    x8v x8vVar = xfk0.j;
                    iz40 iz40Var2 = x8vVar.h;
                    xfk0.u(x8vVar, xfk0.f40794a);
                    if (iz40Var2 == null || !iz40Var2.h()) {
                        list = iunVar;
                        iz40Var = null;
                    } else {
                        list = xfk0.h;
                        iz40Var = iz40Var2;
                    }
                } else {
                    x8v x8vVar2 = xfk0.j;
                    wdx wdxVarZ = z(xfk0.e, iz40VarX, mapM, xfk0.d.c(x8vVar2.b));
                    if (!wdxVarZ.equals(tfk0.f33870a)) {
                        return wdxVarZ;
                    }
                    b();
                    iz40Var = x8vVar2.h;
                    xfk0.u(x8vVar2, xfk0.f40794a);
                    B(null);
                    x8vVar2.h = null;
                    list = xfk0.h;
                }
                this.m = true;
                if (iz40Var != null) {
                    w1h0 w1h0Var = new w1h0(iz40Var);
                    if (!iz40Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(w1h0Var, this);
                        }
                    }
                }
                if (iz40VarX != null && iz40VarX.h()) {
                    w1h0 w1h0Var2 = new w1h0(iz40VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((Function2) list.get(i2)).invoke(w1h0Var2, this);
                    }
                }
                synchronized (xfk0.c) {
                    try {
                        p();
                        xfk0.d();
                        if (iz40Var != null) {
                            Object[] objArr = iz40Var.b;
                            long[] jArr = iz40Var.f15620a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                xfk0.p((b8m0) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (iz40VarX != null) {
                            Object[] objArr2 = iz40VarX.b;
                            long[] jArr2 = iz40VarX.f15620a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                xfk0.p((b8m0) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                xfk0.p((b8m0) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return tfk0.f33870a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public iz40 x() {
        return this.h;
    }

    @Override // a.rfk0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final wdx z(long j, iz40 iz40Var, HashMap map, wfk0 wfk0Var) {
        ArrayList arrayList;
        ArrayList arrayListQ0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        b8m0 b8m0Var;
        e8m0 e8m0Var;
        wfk0 wfk0Var2;
        Object[] objArr;
        long[] jArr;
        wfk0 wfk0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        e8m0 e8m0VarB;
        wfk0 wfk0VarF = d().g(g()).f(this.j);
        Object[] objArr3 = iz40Var.b;
        long[] jArr3 = iz40Var.f15620a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListQ0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            b8m0 b8m0Var2 = (b8m0) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            e8m0 e8m0VarG = b8m0Var2.g();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            e8m0 e8m0VarR = xfk0.r(e8m0VarG, j, wfk0Var);
                            if (e8m0VarR == null) {
                                arrayList4 = arrayListQ0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListQ0;
                                j2 = j3;
                                e8m0 e8m0VarR2 = xfk0.r(e8m0VarG, g(), wfk0VarF);
                                if (e8m0VarR2 != null && e8m0VarR2.f7381a != 1 && !e8m0VarR.equals(e8m0VarR2)) {
                                    wfk0Var3 = wfk0VarF;
                                    e8m0 e8m0VarR3 = xfk0.r(e8m0VarG, g(), d());
                                    if (e8m0VarR3 == null) {
                                        xfk0.q();
                                        throw null;
                                    }
                                    if (map == null || (e8m0VarB = (e8m0) map.get(e8m0VarR)) == null) {
                                        e8m0VarB = b8m0Var2.b(e8m0VarR2, e8m0VarR, e8m0VarR3);
                                    }
                                    if (e8m0VarB == null) {
                                        return new sfk0(this);
                                    }
                                    if (!e8m0VarB.equals(e8m0VarR3)) {
                                        if (e8m0VarB.equals(e8m0VarR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(b8m0Var2, e8m0VarR.b(g())));
                                            arrayListQ0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListQ0.add(b8m0Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!e8m0VarB.equals(e8m0VarR2) ? new Pair(b8m0Var2, e8m0VarB) : new Pair(b8m0Var2, e8m0VarR2.b(g())));
                                        }
                                    }
                                    arrayListQ0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListQ0 = arrayList4;
                            }
                            wfk0Var3 = wfk0VarF;
                            arrayList2 = arrayList5;
                            arrayListQ0 = arrayList4;
                        } else {
                            wfk0Var3 = wfk0VarF;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        wfk0VarF = wfk0Var3;
                    }
                    wfk0Var2 = wfk0VarF;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    wfk0Var2 = wfk0VarF;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    wfk0VarF = wfk0Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    Pair pair = (Pair) arrayList2.get(i2);
                    b8m0Var = (b8m0) pair.f46059a;
                    e8m0Var = (e8m0) pair.b;
                    e8m0Var.f7381a = j;
                    synchronized (xfk0.c) {
                        e8m0Var.b = b8m0Var.g();
                        b8m0Var.h(e8m0Var);
                    }
                }
            }
            if (arrayListQ0 != null) {
                size = arrayListQ0.size();
                for (i = 0; i < size; i++) {
                    iz40Var.l((b8m0) arrayListQ0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListQ0 = CollectionsKt.q0(arrayList3, arrayListQ0);
                }
                this.i = arrayListQ0;
            }
            return tfk0.f33870a;
        }
        arrayList = null;
        arrayListQ0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                Pair pair2 = (Pair) arrayList2.get(i2);
                b8m0Var = (b8m0) pair2.f46059a;
                e8m0Var = (e8m0) pair2.b;
                e8m0Var.f7381a = j;
                synchronized (xfk0.c) {
                    e8m0Var.b = b8m0Var.g();
                    b8m0Var.h(e8m0Var);
                }
            }
        }
        if (arrayListQ0 != null) {
            size = arrayListQ0.size();
            while (i < size) {
                iz40Var.l((b8m0) arrayListQ0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListQ0 = CollectionsKt.q0(arrayList3, arrayListQ0);
            }
            this.i = arrayListQ0;
        }
        return tfk0.f33870a;
    }
}
