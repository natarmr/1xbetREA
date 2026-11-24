package a;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mcz implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncz f21570a;
    public final int b;
    public final boolean c;
    public final float d;
    public final uj30 e;
    public final float f;
    public final boolean g;
    public final vne h;
    public final w6k i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final ma80 q;
    public final int r;
    public final int s;

    public mcz(ncz nczVar, int i, boolean z, float f, uj30 uj30Var, float f2, boolean z2, vne vneVar, w6k w6kVar, long j, int i2, List list, int i3, int i4, int i5, boolean z3, ma80 ma80Var, int i6, int i7) {
        this.f21570a = nczVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = uj30Var;
        this.f = f2;
        this.g = z2;
        this.h = vneVar;
        this.i = w6kVar;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = z3;
        this.q = ma80Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // a.uj30
    public final Map a() {
        return this.e.a();
    }

    @Override // a.uj30
    public final void b() {
        this.e.b();
    }

    @Override // a.uj30
    public final Function1 c() {
        return this.e.c();
    }

    @Override // a.uj30
    public final Function2 d() {
        return this.e.d();
    }

    @Override // a.uj30
    public final Function1 e() {
        return this.e.e();
    }

    @Override // a.uj30
    public final int f() {
        return this.e.f();
    }

    public final mcz g(int i, boolean z) {
        ncz nczVar;
        int i2;
        int i3;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (nczVar = this.f21570a) == null) {
            return null;
        }
        int iM = nczVar.m();
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= iM) {
            return null;
        }
        ncz nczVar2 = (ncz) CollectionsKt.U(list);
        ncz nczVar3 = (ncz) CollectionsKt.d0(list);
        if (nczVar2.w || nczVar3.w) {
            return null;
        }
        int i5 = nczVar2.p;
        int i6 = this.n;
        int i7 = this.m;
        if (i < 0) {
            if (Math.min((nczVar2.m() + i5) - i7, (nczVar3.m() + nczVar3.p) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - nczVar3.p) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            ncz nczVar4 = (ncz) list.get(i8);
            boolean z2 = nczVar4.c;
            int[] iArr = nczVar4.A;
            if (!nczVar4.w) {
                nczVar4.p += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int size2 = nczVar4.b.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        zaz zazVarA = nczVar4.n.a(i11, nczVar4.l);
                        if (zazVarA != null) {
                            long j = zazVarA.l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            zazVarA.l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i8 = i8;
                        }
                        i11++;
                        i8 = i8;
                    }
                }
            }
            i8++;
        }
        return new mcz(this.f21570a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final long h() {
        uj30 uj30Var = this.e;
        return (((long) uj30Var.j()) << 32) | (((long) uj30Var.f()) & 4294967295L);
    }

    @Override // a.uj30
    public final int j() {
        return this.e.j();
    }
}
