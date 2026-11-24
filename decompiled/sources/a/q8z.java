package a;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q8z implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s8z f28321a;
    public final int b;
    public final boolean c;
    public final float d;
    public final uj30 e;
    public final float f;
    public final boolean g;
    public final vne h;
    public final w6k i;
    public final int j;
    public final Function1 k;
    public final Function1 l;
    public final int m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final ma80 r;
    public final int s;
    public final int t;

    public q8z(s8z s8zVar, int i, boolean z, float f, uj30 uj30Var, float f2, boolean z2, vne vneVar, w6k w6kVar, int i2, Function1 function1, Function1 function2, int i3, List list, int i4, int i5, int i6, ma80 ma80Var, int i7, int i8) {
        this.f28321a = s8zVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = uj30Var;
        this.f = f2;
        this.g = z2;
        this.h = vneVar;
        this.i = w6kVar;
        this.j = i2;
        this.k = function1;
        this.l = function2;
        this.m = i3;
        this.n = list;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = ma80Var;
        this.s = i7;
        this.t = i8;
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

    public final q8z g(int i, boolean z) {
        s8z s8zVar;
        List list;
        int i2;
        char c;
        int i3;
        if (this.g) {
            return null;
        }
        List list2 = this.n;
        if (list2.isEmpty() || (s8zVar = this.f28321a) == null) {
            return null;
        }
        int i4 = s8zVar.h;
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        r8z r8zVar = (r8z) CollectionsKt.U(list2);
        r8z r8zVar2 = (r8z) CollectionsKt.d0(list2);
        if (r8zVar.A || r8zVar2.A) {
            return null;
        }
        int i6 = this.p;
        int i7 = this.o;
        ma80 ma80Var = this.r;
        if (i < 0) {
            if (Math.min((r8zVar.m() + m8x.b0(r8zVar, ma80Var)) - i7, (r8zVar2.m() + m8x.b0(r8zVar2, ma80Var)) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - m8x.b0(r8zVar, ma80Var), i6 - m8x.b0(r8zVar2, ma80Var)) <= i) {
            return null;
        }
        int size = list2.size();
        int i8 = 0;
        while (i8 < size) {
            r8z r8zVar3 = (r8z) list2.get(i8);
            boolean z2 = r8zVar3.c;
            if (r8zVar3.A) {
                list = list2;
                i2 = size;
            } else {
                long j = r8zVar3.x;
                long j2 = 4294967295L;
                char c2 = ' ';
                r8zVar3.x = (((long) (z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L))) & 4294967295L);
                if (z) {
                    int size2 = r8zVar3.h.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        zaz zazVarA = r8zVar3.k.a(i9, r8zVar3.b);
                        if (zazVarA != null) {
                            long j3 = zazVarA.l;
                            if (z2) {
                                c = c2;
                                i3 = (int) (j3 >> c);
                            } else {
                                c = c2;
                                i3 = ((int) (j3 >> c)) + i;
                            }
                            zazVarA.l = (((long) (z2 ? ((int) (j3 & j2)) + i : (int) (j3 & j2))) & j2) | (((long) i3) << c);
                        } else {
                            j2 = j2;
                            c = c2;
                        }
                        i9++;
                        list2 = list2;
                        c2 = c;
                        j2 = j2;
                        size = size;
                    }
                }
                list = list2;
                i2 = size;
            }
            i8++;
            list2 = list;
            size = i2;
        }
        return new q8z(this.f28321a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, ma80Var, this.s, this.t);
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
