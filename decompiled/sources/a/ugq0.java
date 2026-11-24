package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ugq0 extends vw5 {
    public final drm0 d;
    public final dpi0 e;
    public final ls00 f;
    public final mne g;
    public final kh3 h;
    public final tc80 i;
    public final p7m0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugq0(o8f o8fVar, drm0 drm0Var, dpi0 dpi0Var, ls00 ls00Var, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        ls00Var.getClass();
        this.d = drm0Var;
        this.e = dpi0Var;
        this.f = ls00Var;
        this.g = mneVar;
        this.h = kh3.OTHER;
        this.i = tc80.TIME_DIFF;
        this.j = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.j.o(null, i8d.b);
        sac.V(sjeVar, tgq0.f33926a, new h3q0((Object) this, (byte) 14), this.g.c, new meq0((Object) this, (Object) sjeVar, (yje) null, (byte) 4), 8);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.h;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.j;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.i;
    }
}
