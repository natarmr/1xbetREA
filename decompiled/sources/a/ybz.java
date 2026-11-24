package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ybz implements xbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk80 f42362a;
    public final /* synthetic */ boolean b;

    public ybz(xk80 xk80Var, boolean z) {
        this.f42362a = xk80Var;
        this.b = z;
    }

    @Override // a.xbz
    public final int a() {
        xk80 xk80Var = this.f42362a;
        return (-xk80Var.m().f) + xk80Var.m().d;
    }

    @Override // a.xbz
    public final float b() {
        xk80 xk80Var = this.f42362a;
        return zk80.a(xk80Var.m(), xk80Var.n());
    }

    @Override // a.xbz
    public final m3d c() {
        boolean z = this.b;
        xk80 xk80Var = this.f42362a;
        return z ? new m3d(xk80Var.n(), 1) : new m3d(1, xk80Var.n());
    }

    @Override // a.xbz
    public final Object d(int i, u52 u52Var) {
        Object objV = this.f42362a.v(i, 0.0f, u52Var);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    @Override // a.xbz
    public final int e() {
        xk80 xk80Var = this.f42362a;
        return (int) (xk80Var.m().e == ma80.f21447a ? xk80Var.m().h() & 4294967295L : xk80Var.m().h() >> 32);
    }

    @Override // a.xbz
    public final float f() {
        return k7x.B(this.f42362a);
    }
}
