package a;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fez implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9428a;
    public final int[] b;
    public final float c;
    public final uj30 d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final kez i;
    public final yox j;
    public final w6k k;
    public final int l;
    public final List m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final vne t;
    public final ma80 u;

    public fez(int[] iArr, int[] iArr2, float f, uj30 uj30Var, float f2, boolean z, boolean z2, boolean z3, kez kezVar, yox yoxVar, w6k w6kVar, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, vne vneVar) {
        this.f9428a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = uj30Var;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = kezVar;
        this.j = yoxVar;
        this.k = w6kVar;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = vneVar;
        this.u = z2 ? ma80.f21447a : ma80.b;
    }

    @Override // a.uj30
    public final Map a() {
        return this.d.a();
    }

    @Override // a.uj30
    public final void b() {
        this.d.b();
    }

    @Override // a.uj30
    public final Function1 c() {
        return this.d.c();
    }

    @Override // a.uj30
    public final Function2 d() {
        return this.d.d();
    }

    @Override // a.uj30
    public final Function1 e() {
        return this.d.e();
    }

    @Override // a.uj30
    public final int f() {
        return this.d.f();
    }

    public final fez g(int i, boolean z) {
        char c;
        long j;
        long j2;
        int i2;
        if (this.h) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty()) {
            return null;
        }
        int[] iArr = this.f9428a;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.b;
        if (iArr2.length == 0) {
            return null;
        }
        int i3 = this.r;
        int i4 = this.p;
        int i5 = i4 - i3;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            hez hezVar = (hez) list.get(i6);
            if (hezVar.u) {
                return null;
            }
            if ((hezVar.m() <= 0) != (hezVar.m() + i <= 0)) {
                return null;
            }
            int iM = hezVar.m();
            int i7 = this.o;
            if (iM <= i7) {
                if (i < 0) {
                    if ((hezVar.n() + hezVar.m()) - i7 <= (-i)) {
                        return null;
                    }
                } else if (i7 - hezVar.m() <= i) {
                    return null;
                }
            }
            if (hezVar.n() + hezVar.m() >= i5) {
                if (i < 0) {
                    if ((hezVar.n() + hezVar.m()) - i4 <= (-i)) {
                        return null;
                    }
                } else if (i4 - hezVar.m() <= i) {
                    return null;
                }
            }
        }
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            hez hezVar2 = (hez) list.get(i8);
            boolean z2 = hezVar2.d;
            if (!hezVar2.u) {
                long j3 = hezVar2.w;
                char c2 = ' ';
                long j4 = 4294967295L;
                hezVar2.w = (((long) (z2 ? (int) (j3 >> 32) : ((int) (j3 >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j3 & 4294967295L)) + i : (int) (j3 & 4294967295L))) & 4294967295L);
                if (z) {
                    int size3 = hezVar2.c.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        zaz zazVarA = hezVar2.j.a(i9, hezVar2.b);
                        if (zazVarA != null) {
                            char c3 = c2;
                            long j5 = zazVarA.l;
                            if (z2) {
                                c = c3;
                                j2 = j5;
                                i2 = (int) (j2 >> c);
                            } else {
                                c = c3;
                                j2 = j5;
                                i2 = ((int) (j2 >> c)) + i;
                            }
                            int i10 = z2 ? ((int) (j2 & j4)) + i : (int) (j2 & j4);
                            j = j4;
                            zazVarA.l = (((long) i10) & j) | (((long) i2) << c);
                        } else {
                            c = c2;
                            j = j4;
                        }
                        i9++;
                        c2 = c;
                        j4 = j;
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr3[i11] = iArr2[i11] - i;
        }
        return new fez(iArr, iArr3, i, this.d, this.e, this.f || i > 0, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    @Override // a.uj30
    public final int j() {
        return this.d.j();
    }
}
