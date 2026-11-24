package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class zbz implements xbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zbk f44142a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ boolean c;

    public zbz(xcz xczVar, boolean z) {
        this.b = xczVar;
        this.c = z;
        this.f44142a = jgk0.b(new a7s(xczVar, (byte) 2));
    }

    @Override // a.xbz
    public final int a() {
        xcz xczVar = this.b;
        return (-xczVar.j().m) + xczVar.j().r;
    }

    @Override // a.xbz
    public final float b() {
        xcz xczVar = this.b;
        int iH = xczVar.h();
        int i = xczVar.i();
        return xczVar.d() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }

    @Override // a.xbz
    public final m3d c() {
        boolean z = this.c;
        zbk zbkVar = this.f44142a;
        return z ? new m3d(((Number) zbkVar.getValue()).intValue(), 1) : new m3d(1, ((Number) zbkVar.getValue()).intValue());
    }

    @Override // a.xbz
    public final Object d(int i, u52 u52Var) {
        v0h0 v0h0Var = xcz.y;
        Object objL = this.b.l(i, 0, u52Var);
        return objL == wne.f39444a ? objL : Unit.f46060a;
    }

    @Override // a.xbz
    public final int e() {
        xcz xczVar = this.b;
        return (int) (xczVar.j().q == ma80.f21447a ? xczVar.j().h() & 4294967295L : xczVar.j().h() >> 32);
    }

    @Override // a.xbz
    public final float f() {
        xcz xczVar = this.b;
        return (xczVar.h() * 500) + xczVar.i();
    }
}
