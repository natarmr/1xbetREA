package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class iez implements xbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mez f14660a;

    public iez(mez mezVar) {
        this.f14660a = mezVar;
    }

    @Override // a.xbz
    public final int a() {
        mez mezVar = this.f14660a;
        return mezVar.i().q + mezVar.i().r;
    }

    @Override // a.xbz
    public final float b() {
        mez mezVar = this.f14660a;
        int iG = mezVar.g();
        int iH = mezVar.h();
        return mezVar.d() ? (iG * 500) + iH + 100.0f : (iG * 500) + iH;
    }

    @Override // a.xbz
    public final m3d c() {
        return new m3d(-1, -1);
    }

    @Override // a.xbz
    public final Object d(int i, u52 u52Var) {
        v0h0 v0h0Var = mez.x;
        Object objK = this.f14660a.k(i, 0, u52Var);
        return objK == wne.f39444a ? objK : Unit.f46060a;
    }

    @Override // a.xbz
    public final int e() {
        mez mezVar = this.f14660a;
        return (int) (mezVar.i().u == ma80.f21447a ? mezVar.i().n & 4294967295L : mezVar.i().n >> 32);
    }

    @Override // a.xbz
    public final float f() {
        mez mezVar = this.f14660a;
        return (mezVar.g() * 500) + mezVar.h();
    }
}
