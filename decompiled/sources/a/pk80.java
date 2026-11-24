package a;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pk80 implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27124a;
    public final int b;
    public final int c;
    public final int d;
    public final ma80 e;
    public final int f;
    public final int g;
    public final int h;
    public final wj30 i;
    public final wj30 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final ifk0 n;
    public final uj30 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final vne s;
    public final w6k t;
    public final long u;

    public pk80(List list, int i, int i2, int i3, ma80 ma80Var, int i4, int i5, int i6, wj30 wj30Var, wj30 wj30Var2, float f, int i7, boolean z, ifk0 ifk0Var, uj30 uj30Var, boolean z2, List list2, List list3, vne vneVar, w6k w6kVar, long j) {
        this.f27124a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = ma80Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = wj30Var;
        this.j = wj30Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = ifk0Var;
        this.o = uj30Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = vneVar;
        this.t = w6kVar;
        this.u = j;
    }

    @Override // a.uj30
    public final Map a() {
        return this.o.a();
    }

    @Override // a.uj30
    public final void b() {
        this.o.b();
    }

    @Override // a.uj30
    public final Function1 c() {
        return this.o.c();
    }

    @Override // a.uj30
    public final Function2 d() {
        return this.o.d();
    }

    @Override // a.uj30
    public final Function1 e() {
        return this.o.e();
    }

    @Override // a.uj30
    public final int f() {
        return this.o.f();
    }

    public final pk80 g(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.f27124a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        wj30 wj30Var = (wj30) CollectionsKt.U(list);
        wj30 wj30Var2 = (wj30) CollectionsKt.d0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((wj30Var.j + i3) - i5, (wj30Var2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - wj30Var.j, i4 - wj30Var2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((wj30) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((wj30) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((wj30) list3.get(i8)).a(i);
        }
        return new pk80(this.f27124a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long h() {
        uj30 uj30Var = this.o;
        return (((long) uj30Var.j()) << 32) | (((long) uj30Var.f()) & 4294967295L);
    }

    @Override // a.uj30
    public final int j() {
        return this.o.j();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pk80(iun iunVar, int i, int i2, int i3, int i4, int i5, int i6, ifk0 ifk0Var, uj30 uj30Var, vne vneVar, w6k w6kVar, long j) {
        ma80 ma80Var = ma80.b;
        iun iunVar2 = iun.f15405a;
        this(iunVar, i, i2, i3, ma80Var, i4, i5, i6, null, null, 0.0f, 0, false, ifk0Var, uj30Var, false, iunVar2, iunVar2, vneVar, w6kVar, j);
    }
}
