package a;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class hxg0 implements ncs0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public androidx.media3.common.b D;
    public androidx.media3.common.b E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final exg0 f13813a;
    public final zz2 c;
    public final cil d;
    public final zhl e;
    public gxg0 f;
    public androidx.media3.common.b g;
    public ivn h;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public int y;
    public boolean z;
    public final vw3 b = new vw3();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public mcs0[] o = new mcs0[1000];

    public hxg0(lhf0 lhf0Var, cil cilVar, zhl zhlVar) {
        this.d = cilVar;
        this.e = zhlVar;
        this.f13813a = new exg0(lhf0Var);
        e9d0 e9d0Var = new e9d0((byte) 22);
        zz2 zz2Var = new zz2();
        zz2Var.b = new SparseArray();
        zz2Var.c = e9d0Var;
        zz2Var.f45232a = -1;
        this.c = zz2Var;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.B = true;
        this.A = true;
        this.G = true;
        this.u = Long.MIN_VALUE;
        this.x = -1;
        this.y = -1;
    }

    public final synchronized void A(long j) {
        if (j == this.u) {
            return;
        }
        this.u = j;
        this.x = -1;
        this.y = -1;
        if (j != Long.MIN_VALUE && j <= this.w) {
            for (int i = 0; i < this.p; i++) {
                int iP = p(i);
                C(this.q + i, this.m[iP], this.n[iP]);
                if (this.x != -1) {
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void B(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        x0x.A(z);
        this.s += i;
    }

    public final void C(int i, int i2, long j) {
        int i3;
        long j2 = this.u;
        if (j2 != Long.MIN_VALUE && this.x == -1) {
            if (j < j2) {
                this.y = -1;
                return;
            }
            int i4 = this.y;
            if (i4 == -1) {
                this.y = i;
                i4 = i;
            }
            int i5 = (i - i4) + 1;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 536870912) != 0;
            androidx.media3.common.b bVar = this.E;
            if (bVar == null || (i3 = bVar.r) == -1) {
                i3 = 16;
            }
            if (i5 >= i3 + 1 || z || z2) {
                this.x = i4;
                this.y = -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x012c, B:106:0x019c, B:108:0x01a5, B:89:0x0147, B:91:0x0162, B:95:0x016b, B:96:0x0170, B:98:0x0176, B:102:0x0184, B:104:0x0189, B:105:0x0199), top: B:114:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:89:0x0147 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x012c, B:106:0x019c, B:108:0x01a5, B:89:0x0147, B:91:0x0162, B:95:0x016b, B:96:0x0170, B:98:0x0176, B:102:0x0184, B:104:0x0189, B:105:0x0199), top: B:114:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0162 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x012c, B:106:0x019c, B:108:0x01a5, B:89:0x0147, B:91:0x0162, B:95:0x016b, B:96:0x0170, B:98:0x0176, B:102:0x0184, B:104:0x0189, B:105:0x0199), top: B:114:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0168  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x012c, B:106:0x019c, B:108:0x01a5, B:89:0x0147, B:91:0x0162, B:95:0x016b, B:96:0x0170, B:98:0x0176, B:102:0x0184, B:104:0x0189, B:105:0x0199), top: B:114:0x00c0 }] */
    @Override // a.ncs0
    public void b(long j, int i, int i2, int i3, mcs0 mcs0Var) {
        int i4;
        zz2 zz2Var;
        int i5;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.C) {
            androidx.media3.common.b bVar = this.D;
            bVar.getClass();
            c(bVar);
        }
        int i6 = i & 1;
        boolean z4 = i6 != 0;
        if (this.A) {
            if (!z4) {
                return;
            } else {
                this.A = false;
            }
        }
        long j2 = j + this.I;
        if (!this.G) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i6 == 0) {
                if (!this.H) {
                    f1t0.g0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.E);
                    this.H = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.J) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.p == 0) {
                        z3 = j2 > this.v;
                    } else {
                        synchronized (this) {
                            long jMax = Math.max(this.v, n(this.s));
                            if (jMax >= j2) {
                                z3 = false;
                            } else {
                                int i7 = this.p;
                                int iP = p(i7 - 1);
                                while (i7 > this.s && this.n[iP] >= j2) {
                                    i7--;
                                    iP--;
                                    if (iP == -1) {
                                        iP = this.i - 1;
                                    }
                                }
                                k(this.q + i7);
                                z3 = true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3) {
                return;
            } else {
                this.J = false;
            }
        }
        long j3 = (this.f13813a.g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i8 = this.p;
                if (i8 > 0) {
                    int iP2 = p(i8 - 1);
                    x0x.A(this.k[iP2] + ((long) this.l[iP2]) <= j3);
                }
                this.z = (536870912 & i4) != 0;
                this.w = Math.max(this.w, j2);
                C(this.q + this.p, i4, j2);
                int iP3 = p(this.p);
                this.n[iP3] = j2;
                this.k[iP3] = j3;
                this.l[iP3] = i2;
                this.m[iP3] = i4;
                this.o[iP3] = mcs0Var;
                this.j[iP3] = this.F;
                if (((SparseArray) this.c.b).size() == 0) {
                    androidx.media3.common.b bVar2 = this.E;
                    bVar2.getClass();
                    jf4 jf4Var = jf4.b;
                    zz2Var = this.c;
                    i5 = this.q + this.p;
                    fxg0 fxg0Var = new fxg0(bVar2, jf4Var);
                    sparseArray = (SparseArray) zz2Var.b;
                    if (zz2Var.f45232a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        x0x.K(z2);
                        zz2Var.f45232a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        x0x.A(z);
                        if (iKeyAt == i5) {
                            ((e9d0) zz2Var.c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, fxg0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.c.b;
                    if (!((fxg0) sparseArray2.valueAt(sparseArray2.size() - 1)).f10308a.equals(this.E)) {
                        androidx.media3.common.b bVar3 = this.E;
                        bVar3.getClass();
                        jf4 jf4Var2 = jf4.b;
                        zz2Var = this.c;
                        i5 = this.q + this.p;
                        fxg0 fxg0Var2 = new fxg0(bVar3, jf4Var2);
                        sparseArray = (SparseArray) zz2Var.b;
                        if (zz2Var.f45232a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            x0x.K(z2);
                            zz2Var.f45232a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i5 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            x0x.A(z);
                            if (iKeyAt == i5) {
                                ((e9d0) zz2Var.c).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i5, fxg0Var2);
                    }
                }
                int i9 = this.p + 1;
                this.p = i9;
                int i10 = this.i;
                if (i9 == i10) {
                    int i11 = i10 + 1000;
                    long[] jArr = new long[i11];
                    long[] jArr2 = new long[i11];
                    long[] jArr3 = new long[i11];
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    mcs0[] mcs0VarArr = new mcs0[i11];
                    int i12 = this.r;
                    int i13 = i10 - i12;
                    System.arraycopy(this.k, i12, jArr2, 0, i13);
                    System.arraycopy(this.n, this.r, jArr3, 0, i13);
                    System.arraycopy(this.m, this.r, iArr, 0, i13);
                    System.arraycopy(this.l, this.r, iArr2, 0, i13);
                    System.arraycopy(this.o, this.r, mcs0VarArr, 0, i13);
                    System.arraycopy(this.j, this.r, jArr, 0, i13);
                    int i14 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i13, i14);
                    System.arraycopy(this.n, 0, jArr3, i13, i14);
                    System.arraycopy(this.m, 0, iArr, i13, i14);
                    System.arraycopy(this.l, 0, iArr2, i13, i14);
                    System.arraycopy(this.o, 0, mcs0VarArr, i13, i14);
                    System.arraycopy(this.j, 0, jArr, i13, i14);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = mcs0VarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:21:0x0067, B:25:0x0070, B:18:0x0059), top: B:35:0x000a }] */
    @Override // a.ncs0
    public final void c(androidx.media3.common.b bVar) {
        androidx.media3.common.b bVarM = m(bVar);
        boolean z = false;
        this.C = false;
        this.D = bVar;
        synchronized (this) {
            try {
                this.B = false;
                if (!Objects.equals(bVarM, this.E)) {
                    if (((SparseArray) this.c.b).size() == 0) {
                        this.E = bVarM;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.c.b;
                        if (((fxg0) sparseArray.valueAt(sparseArray.size() - 1)).f10308a.equals(bVarM)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.b;
                            bVarM = ((fxg0) sparseArray2.valueAt(sparseArray2.size() - 1)).f10308a;
                            this.E = bVarM;
                        } else {
                            this.E = bVarM;
                        }
                    }
                    boolean z2 = this.G;
                    String str = bVarM.p;
                    this.G = z2 & (mg40.h(str) == 1 && mg40.a(str, bVarM.l));
                    this.H = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gxg0 gxg0Var = this.f;
        if (gxg0Var == null || !z) {
            return;
        }
        gxg0Var.t();
    }

    @Override // a.ncs0
    public final void d(fq80 fq80Var, int i, int i2) {
        while (i > 0) {
            exg0 exg0Var = this.f13813a;
            int iB = exg0Var.b(i);
            dr8 dr8Var = exg0Var.f;
            o52 o52Var = (o52) dr8Var.c;
            fq80Var.k(o52Var.f24666a, ((int) (exg0Var.g - dr8Var.f6545a)) + o52Var.b, iB);
            i -= iB;
            long j = exg0Var.g + ((long) iB);
            exg0Var.g = j;
            dr8 dr8Var2 = exg0Var.f;
            if (j == dr8Var2.b) {
                exg0Var.f = (dr8) dr8Var2.d;
            }
        }
    }

    @Override // a.ncs0
    public final int g(bbj bbjVar, int i, boolean z) throws EOFException {
        exg0 exg0Var = this.f13813a;
        int iB = exg0Var.b(i);
        dr8 dr8Var = exg0Var.f;
        o52 o52Var = (o52) dr8Var.c;
        int i2 = bbjVar.read(o52Var.f24666a, ((int) (exg0Var.g - dr8Var.f6545a)) + o52Var.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            c99.f();
            return 0;
        }
        long j = exg0Var.g + ((long) i2);
        exg0Var.g = j;
        dr8 dr8Var2 = exg0Var.f;
        if (j == dr8Var2.b) {
            exg0Var.f = (dr8) dr8Var2.d;
        }
        return i2;
    }

    public final long h(int i) {
        this.v = Math.max(this.v, n(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        zz2 zz2Var = this.c;
        SparseArray sparseArray = (SparseArray) zz2Var.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((e9d0) zz2Var.c).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = zz2Var.f45232a;
            if (i8 > 0) {
                zz2Var.f45232a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void i(boolean z, long j) {
        Throwable th;
        exg0 exg0Var = this.f13813a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long jH = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iL = l(i2, i, j, false);
                            if (iL != -1) {
                                jH = h(iL);
                            }
                        }
                    }
                    exg0Var.a(jH);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void j() {
        long jH;
        exg0 exg0Var = this.f13813a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        exg0Var.a(jH);
    }

    public final long k(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        x0x.A(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.w = Math.max(this.v, n(i5));
        if (i4 == 0 && this.z) {
            z = true;
        }
        this.z = z;
        int i6 = this.x;
        if (i6 != -1 && i < i6) {
            this.x = -1;
        }
        int i7 = this.y;
        if (i7 != -1 && i < i7) {
            this.y = -1;
        }
        zz2 zz2Var = this.c;
        SparseArray sparseArray = (SparseArray) zz2Var.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((e9d0) zz2Var.c).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        zz2Var.f45232a = sparseArray.size() > 0 ? Math.min(zz2Var.f45232a, sparseArray.size() - 1) : -1;
        int i8 = this.p;
        if (i8 == 0) {
            return 0L;
        }
        int iP = p(i8 - 1);
        return this.k[iP] + ((long) this.l[iP]);
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public androidx.media3.common.b m(androidx.media3.common.b bVar) {
        if (this.I == 0 || bVar.u == Long.MAX_VALUE) {
            return bVar;
        }
        awq awqVarA = bVar.a();
        awqVarA.t = bVar.u + this.I;
        return new androidx.media3.common.b(awqVarA);
    }

    public final long n(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iP = p(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iP]);
            if ((this.m[iP] & 1) != 0) {
                return jMax;
            }
            iP--;
            if (iP == -1) {
                iP = this.i - 1;
            }
        }
        return jMax;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int q(boolean z, long j) throws Throwable {
        try {
            try {
                int iP = p(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iP]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int iL = l(iP, i2 - i, j, true);
                if (iL == -1) {
                    return 0;
                }
                return iL;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized androidx.media3.common.b r() {
        return this.B ? null : this.E;
    }

    public final synchronized boolean s(boolean z) {
        androidx.media3.common.b bVar;
        int iO = o();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && iO >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (!(i == -1 && this.y != -1 && o() >= this.y)) {
                if (((fxg0) this.c.r(iO)).f10308a != this.g) {
                    return true;
                }
                return t(p(this.s));
            }
        }
        if (!z && !this.z && ((bVar = this.E) == null || bVar == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean t(int i) {
        ivn ivnVar = this.h;
        if (ivnVar == null || ivnVar.e() == 4) {
            return true;
        }
        if ((this.m[i] & 1073741824) != 0) {
            return false;
        }
        this.h.getClass();
        return false;
    }

    public final void u(androidx.media3.common.b bVar, hsj hsjVar) {
        androidx.media3.common.b bVar2 = this.g;
        boolean z = bVar2 == null;
        DrmInitData drmInitData = bVar2 == null ? null : bVar2.t;
        this.g = bVar;
        DrmInitData drmInitData2 = bVar.t;
        cil cilVar = this.d;
        int iD = cilVar.d(bVar);
        awq awqVarA = bVar.a();
        awqVarA.S = iD;
        hsjVar.b = new androidx.media3.common.b(awqVarA);
        hsjVar.f13586a = this.h;
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            ivn ivnVar = this.h;
            zhl zhlVar = this.e;
            ivn ivnVarC = cilVar.c(zhlVar, bVar);
            this.h = ivnVarC;
            hsjVar.f13586a = ivnVarC;
            if (ivnVar != null) {
                ivnVar.m(zhlVar);
            }
        }
    }

    public final synchronized long v() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[p(this.s)] : this.F;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    public final int w(hsj hsjVar, wkj wkjVar, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        vw3 vw3Var = this.b;
        synchronized (this) {
            wkjVar.h = false;
            int iO = o();
            int i3 = this.x;
            boolean z3 = i3 != -1 && iO >= i3;
            i2 = -5;
            if (this.s != this.p) {
                if ((i3 == -1 && this.y != -1 && o() >= this.y) || z3) {
                    if (z) {
                    }
                    wkjVar.b = 4;
                    wkjVar.i = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    androidx.media3.common.b bVar = ((fxg0) this.c.r(iO)).f10308a;
                    if (z2 || bVar != this.g) {
                        u(bVar, hsjVar);
                    } else {
                        int iP = p(this.s);
                        if (t(iP)) {
                            wkjVar.b = this.m[iP];
                            if (this.s == this.p - 1 && (z || this.z)) {
                                wkjVar.b(536870912);
                            }
                            wkjVar.i = this.n[iP];
                            vw3Var.f38129a = this.l[iP];
                            vw3Var.b = this.k[iP];
                            vw3Var.c = this.o[iP];
                            i2 = -4;
                        } else {
                            wkjVar.h = true;
                            i2 = -3;
                        }
                    }
                }
            } else if (!z || this.z || z3) {
                wkjVar.b = 4;
                wkjVar.i = Long.MIN_VALUE;
                i2 = -4;
            } else {
                androidx.media3.common.b bVar2 = this.E;
                if (bVar2 == null || (!z2 && bVar2 == this.g)) {
                    i2 = -3;
                } else {
                    u(bVar2, hsjVar);
                }
            }
        }
        if (i2 == -4 && !wkjVar.m(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                exg0 exg0Var = this.f13813a;
                vw3 vw3Var2 = this.b;
                if (z4) {
                    exg0.e(exg0Var.e, wkjVar, vw3Var2, exg0Var.c);
                } else {
                    exg0Var.e = exg0.e(exg0Var.e, wkjVar, vw3Var2, exg0Var.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void x(boolean z) {
        exg0 exg0Var = this.f13813a;
        dr8 dr8Var = exg0Var.d;
        if (((o52) dr8Var.c) != null) {
            lhf0 lhf0Var = exg0Var.f8575a;
            synchronized (lhf0Var) {
                ((xvj) lhf0Var.d).c.U(dr8Var);
                dr8 dr8Var2 = dr8Var;
                while (dr8Var2 != null) {
                    o52 o52Var = (o52) dr8Var2.c;
                    o52Var.getClass();
                    lhf0Var.G(o52Var);
                    dr8Var2 = (dr8) dr8Var2.d;
                    if (dr8Var2 == null || ((o52) dr8Var2.c) == null) {
                        dr8Var2 = null;
                    }
                }
            }
            dr8Var.c = null;
            dr8Var.d = null;
        }
        dr8 dr8Var3 = exg0Var.d;
        int i = exg0Var.b;
        x0x.K(((o52) dr8Var3.c) == null);
        dr8Var3.f6545a = 0L;
        dr8Var3.b = i;
        dr8 dr8Var4 = exg0Var.d;
        exg0Var.e = dr8Var4;
        exg0Var.f = dr8Var4;
        exg0Var.g = 0L;
        lhf0 lhf0Var2 = exg0Var.f8575a;
        synchronized (lhf0Var2) {
            ((xvj) lhf0Var2.d).c.b0();
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        zz2 zz2Var = this.c;
        SparseArray sparseArray = (SparseArray) zz2Var.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((e9d0) zz2Var.c).accept(sparseArray.valueAt(i2));
        }
        zz2Var.f45232a = -1;
        sparseArray.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    public final synchronized boolean y(int i) {
        synchronized (this) {
            this.s = 0;
            exg0 exg0Var = this.f13813a;
            exg0Var.e = exg0Var.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            int i4 = this.y;
            if (i4 != -1 && i >= i4) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0091 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean z(boolean r12, long r13) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L82
            r0 = 0
            r11.s = r0     // Catch: java.lang.Throwable -> L8a
            a.exg0 r1 = r11.f13813a     // Catch: java.lang.Throwable -> L8a
            a.dr8 r2 = r1.d     // Catch: java.lang.Throwable -> L8a
            r1.e = r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L87
            int r4 = r11.p(r0)     // Catch: java.lang.Throwable -> L7d
            long r1 = r11.u     // Catch: java.lang.Throwable -> L7d
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            long r5 = r11.w
            if (r3 == 0) goto L24
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L93
        L24:
            int r1 = r11.s     // Catch: java.lang.Throwable -> L82
            int r2 = r11.p     // Catch: java.lang.Throwable -> L82
            r9 = 1
            if (r1 == r2) goto L2d
            r3 = r9
            goto L2e
        L2d:
            r3 = r0
        L2e:
            if (r3 == 0) goto L3e
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L7d
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L7d
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 < 0) goto L3e
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 <= 0) goto L40
            if (r12 != 0) goto L40
        L3e:
            r3 = r11
            goto L80
        L40:
            boolean r3 = r11.G     // Catch: java.lang.Throwable -> L7d
            r10 = -1
            if (r3 == 0) goto L64
            int r2 = r2 - r1
            r1 = r0
        L47:
            if (r1 >= r2) goto L5d
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L1f
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L1f
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 < 0) goto L53
            r2 = r1
            goto L61
        L53:
            int r4 = r4 + 1
            int r3 = r11.i     // Catch: java.lang.Throwable -> L1f
            if (r4 != r3) goto L5a
            r4 = r0
        L5a:
            int r1 = r1 + 1
            goto L47
        L5d:
            if (r12 == 0) goto L60
            goto L61
        L60:
            r2 = r10
        L61:
            r3 = r11
            r6 = r13
            goto L6d
        L64:
            int r5 = r2 - r1
            r8 = 1
            r3 = r11
            r6 = r13
            int r2 = r3.l(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L7a
        L6d:
            if (r2 != r10) goto L71
            monitor-exit(r3)
            return r0
        L71:
            r3.t = r6     // Catch: java.lang.Throwable -> L7a
            int r11 = r3.s     // Catch: java.lang.Throwable -> L7a
            int r11 = r11 + r2
            r3.s = r11     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r3)
            return r9
        L7a:
            r0 = move-exception
        L7b:
            r12 = r0
            goto L93
        L7d:
            r0 = move-exception
            r3 = r11
            goto L7b
        L80:
            monitor-exit(r3)
            return r0
        L82:
            r0 = move-exception
            r3 = r11
        L84:
            r11 = r0
            r12 = r11
            goto L93
        L87:
            r0 = move-exception
            r3 = r11
            goto L84
        L8a:
            r0 = move-exception
            r3 = r11
        L8c:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L91
            throw r11     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            goto L84
        L91:
            r0 = move-exception
            goto L8c
        L93:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7a
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hxg0.z(boolean, long):boolean");
    }
}
