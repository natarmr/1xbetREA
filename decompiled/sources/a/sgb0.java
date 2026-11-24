package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sgb0 extends vw5 {
    public final oo00 d;
    public final mne e;
    public final kh3 f;
    public final tc80 g;
    public final p7m0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgb0(o8f o8fVar, oo00 oo00Var, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = oo00Var;
        this.e = mneVar;
        this.f = kh3.OTHER;
        this.g = tc80.CLEAR_SEEN_BANNERS;
        this.h = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.h.o(null, i8d.b);
        sac.V(sjeVar, rgb0.f30425a, new ssa0(this, (byte) 5), this.e.c, new f8b0(this, sjeVar, null), 8);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.f;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.h;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.g;
    }
}
