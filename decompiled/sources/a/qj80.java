package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class qj80 implements uaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xk80 f28825a;
    public final int b;

    public qj80(xk80 xk80Var, int i) {
        this.f28825a = xk80Var;
        this.b = i;
    }

    @Override // a.uaz
    public final boolean a() {
        return !this.f28825a.m().f27124a.isEmpty();
    }

    @Override // a.uaz
    public final int b() {
        return this.f28825a.n();
    }

    @Override // a.uaz
    public final int c() {
        int i;
        xk80 xk80Var = this.f28825a;
        if (xk80Var.m().f27124a.size() == 0) {
            return 0;
        }
        int iC = n6x.C(xk80Var.m());
        int i2 = xk80Var.m().b + xk80Var.m().c;
        if (i2 != 0 && (i = iC / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // a.uaz
    public final int d() {
        return Math.max(0, this.f28825a.e - this.b);
    }

    @Override // a.uaz
    public final int e() {
        xk80 xk80Var = this.f28825a;
        return Math.min(xk80Var.n() - 1, ((wj30) CollectionsKt.d0(xk80Var.m().f27124a)).f39244a + this.b);
    }
}
