package a;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xrs0 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f41385a;
    public final int b;
    public final List c;
    public final fq80 d;
    public final SparseIntArray e;
    public final tyj f;
    public final jfn0 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final l7d0 k;
    public xiq l;
    public huo m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ass0 r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public xrs0(int i, int i2, jfn0 jfn0Var, coq0 coq0Var, tyj tyjVar) {
        this.f = tyjVar;
        this.f41385a = i;
        this.b = i2;
        this.g = jfn0Var;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(coq0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(coq0Var);
        }
        this.d = new fq80(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new l7d0((byte) 1);
        this.m = huo.f0;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (ass0) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new anh0(new afm0(this)));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [a.ass0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        guo guoVar2;
        ?? r1;
        int i;
        byte b;
        byte b2;
        byte b3;
        boolean z;
        long jR;
        long length = guoVar.getLength();
        byte b4 = this.f41385a;
        boolean z2 = b4 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            l7d0 l7d0Var = this.k;
            if (length != -1 && !z2 && !l7d0Var.d) {
                int i2 = this.t;
                coq0 coq0Var = l7d0Var.b;
                fq80 fq80Var = l7d0Var.c;
                if (i2 <= 0) {
                    l7d0Var.a(guoVar);
                    return 0;
                }
                if (l7d0Var.f) {
                    if (l7d0Var.h == -9223372036854775807L) {
                        l7d0Var.a(guoVar);
                        return 0;
                    }
                    if (l7d0Var.e) {
                        long j2 = l7d0Var.g;
                        if (j2 == -9223372036854775807L) {
                            l7d0Var.a(guoVar);
                            return 0;
                        }
                        l7d0Var.i = coq0Var.c(l7d0Var.h) - coq0Var.b(j2);
                        l7d0Var.a(guoVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, guoVar.getLength());
                    if (guoVar.getPosition() != 0) {
                        mtcVar.f22363a = 0L;
                        return 1;
                    }
                    fq80Var.J(iMin);
                    guoVar.g();
                    guoVar.n(fq80Var.f9961a, 0, iMin);
                    int i3 = fq80Var.c;
                    for (int i4 = fq80Var.b; i4 < i3; i4++) {
                        if (fq80Var.f9961a[i4] == 71) {
                            jR = ltt0.r(fq80Var, i4, i2);
                            if (jR != -9223372036854775807L) {
                                l7d0Var.g = jR;
                                l7d0Var.e = true;
                                return 0;
                            }
                        }
                    }
                    jR = -9223372036854775807L;
                    l7d0Var.g = jR;
                    l7d0Var.e = true;
                    return 0;
                }
                long length2 = guoVar.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (guoVar.getPosition() != j3) {
                    mtcVar.f22363a = j3;
                    return 1;
                }
                fq80Var.J(iMin2);
                guoVar.g();
                guoVar.n(fq80Var.f9961a, 0, iMin2);
                int i5 = fq80Var.b;
                int i6 = fq80Var.c;
                for (int i7 = i6 - 188; i7 >= i5; i7--) {
                    byte[] bArr = fq80Var.f9961a;
                    int i8 = 0;
                    for (int i9 = -4; i9 <= 4; i9++) {
                        int i10 = (i9 * 188) + i7;
                        if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                            i8++;
                            if (i8 == 5) {
                                long jR2 = ltt0.r(fq80Var, i7, i2);
                                if (jR2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jR2;
                                break;
                            }
                        } else {
                            i8 = 0;
                        }
                    }
                }
                l7d0Var.h = j;
                l7d0Var.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                b = b4;
            } else {
                this.p = true;
                long j4 = l7d0Var.i;
                if (j4 != -9223372036854775807L) {
                    coq0 coq0Var2 = l7d0Var.b;
                    int i11 = this.t;
                    bj5 bj5Var = new bj5();
                    zz2 zz2Var = new zz2();
                    zz2Var.f45232a = i11;
                    zz2Var.b = coq0Var2;
                    zz2Var.c = new fq80();
                    i = 1;
                    z = false;
                    b = b4;
                    xiq xiqVar = new xiq(bj5Var, zz2Var, j4, j4 + 1, 0L, length, 188L, 940);
                    this.l = xiqVar;
                    this.m.f(xiqVar.f40957a);
                } else {
                    i = 1;
                    z = false;
                    b = b4;
                    this.m.f(new ca5(j4));
                }
            }
            if (this.q) {
                this.q = z;
                b(0L, 0L);
                if (guoVar.getPosition() != 0) {
                    mtcVar.f22363a = 0L;
                    return i;
                }
            }
            xiq xiqVar2 = this.l;
            if (xiqVar2 != null && xiqVar2.c != null) {
                return xiqVar2.a(guoVar, mtcVar);
            }
            guoVar2 = guoVar;
            r1 = z;
        } else {
            guoVar2 = guoVar;
            r1 = 0;
            i = 1;
            b = b4;
        }
        fq80 fq80Var2 = this.d;
        byte[] bArr2 = fq80Var2.f9961a;
        if (9400 - fq80Var2.b < 188) {
            int iA = fq80Var2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, fq80Var2.b, bArr2, r1, iA);
            }
            fq80Var2.K(bArr2, iA);
        }
        while (true) {
            int iA2 = fq80Var2.a();
            ?? r7 = this.h;
            if (iA2 >= 188) {
                int i12 = fq80Var2.b;
                int i13 = fq80Var2.c;
                byte[] bArr3 = fq80Var2.f9961a;
                int i14 = i12;
                while (i14 < i13 && bArr3[i14] != 71) {
                    i14++;
                }
                fq80Var2.M(i14);
                int i15 = i14 + 188;
                if (i15 > i13) {
                    int i16 = (i14 - i12) + this.s;
                    this.s = i16;
                    b2 = b;
                    b3 = 2;
                    if (b2 == 2 && i16 > 376) {
                        throw kq80.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b2 = b;
                    b3 = 2;
                    this.s = r1;
                }
                int i17 = fq80Var2.c;
                if (i15 > i17) {
                    return r1;
                }
                int iM = fq80Var2.m();
                if ((8388608 & iM) != 0) {
                    fq80Var2.M(i15);
                    return r1;
                }
                ?? r10 = (4194304 & iM) != 0 ? 1 : r1;
                int i18 = (2096896 & iM) >> 8;
                ?? r14 = (iM & 32) != 0 ? 1 : r1;
                ?? r8 = (iM & 16) != 0 ? (ass0) r7.get(i18) : 0;
                if (r8 == 0) {
                    fq80Var2.M(i15);
                    return r1;
                }
                if (b2 != b3) {
                    int i19 = iM & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i20 = sparseIntArray.get(i18, i19 - 1);
                    sparseIntArray.put(i18, i19);
                    if (i20 == i19) {
                        fq80Var2.M(i15);
                        return r1;
                    }
                    if (i19 != ((i20 + 1) & 15)) {
                        r8.c();
                    }
                }
                if (r14 != 0) {
                    int iZ = fq80Var2.z();
                    r10 = (r10 == true ? 1 : 0) | ((fq80Var2.z() & 64) != 0 ? b3 : r1);
                    fq80Var2.N(iZ - 1);
                }
                boolean z3 = this.o;
                if (b2 == b3 || z3 || !this.j.get(i18, r1)) {
                    fq80Var2.L(i15);
                    r8.a(r10, fq80Var2);
                    fq80Var2.L(i17);
                }
                if (b2 != b3 && !z3 && this.o && length != -1) {
                    this.q = true;
                }
                fq80Var2.M(i15);
                return r1;
            }
            int i21 = fq80Var2.c;
            int i22 = guoVar2.read(bArr2, i21, 9400 - i21);
            if (i22 == -1) {
                for (?? r4 = r1; r4 < r7.size(); r4++) {
                    ass0 ass0Var = (ass0) r7.valueAt(r4);
                    if (ass0Var instanceof al90) {
                        al90 al90Var = (al90) ass0Var;
                        ?? r3 = (!z2 || al90Var.e()) ? i : r1;
                        int i23 = al90Var.c;
                        if (((i23 == 3 && al90Var.j == -1) || i23 == i) && ((!z2 || !(al90Var.f1058a instanceof jjv)) && r3 != 0)) {
                            al90Var.a(1, new fq80());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            fq80Var2.L(i21 + i22);
            i = 1;
        }
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        xiq xiqVar;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        x0x.K(this.f41385a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            coq0 coq0Var = (coq0) list.get(i);
            synchronized (coq0Var) {
                j3 = coq0Var.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = coq0Var.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                coq0Var.f(j2);
            }
        }
        if (j2 != 0 && (xiqVar = this.l) != null) {
            xiqVar.d(j2);
        }
        this.d.J(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ass0) sparseArray.valueAt(i2)).c();
        }
        this.s = 0;
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.d.f9961a;
        guj gujVar = (guj) guoVar;
        gujVar.b(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    gujVar.a(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        if ((this.b & 1) == 0) {
            huoVar = new o24(huoVar, this.g);
        }
        this.m = huoVar;
    }

    @Override // a.fuo
    public final void release() {
    }
}
