package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class rdz implements xbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9z f30309a;

    public rdz(d9z d9zVar) {
        this.f30309a = d9zVar;
    }

    @Override // a.xbz
    public final int a() {
        d9z d9zVar = this.f30309a;
        return (-d9zVar.j().o) + d9zVar.j().s;
    }

    @Override // a.xbz
    public final float b() {
        d9z d9zVar = this.f30309a;
        int iH = d9zVar.h();
        int i = d9zVar.i();
        return d9zVar.d() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }

    @Override // a.xbz
    public final m3d c() {
        return new m3d(-1, -1);
    }

    @Override // a.xbz
    public final Object d(int i, u52 u52Var) {
        v0h0 v0h0Var = d9z.w;
        Object objL = this.f30309a.l(i, 0, u52Var);
        return objL == wne.f39444a ? objL : Unit.f46060a;
    }

    @Override // a.xbz
    public final int e() {
        d9z d9zVar = this.f30309a;
        return (int) (d9zVar.j().r == ma80.f21447a ? d9zVar.j().h() & 4294967295L : d9zVar.j().h() >> 32);
    }

    @Override // a.xbz
    public final float f() {
        d9z d9zVar = this.f30309a;
        return (d9zVar.h() * 500) + d9zVar.i();
    }
}
