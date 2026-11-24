package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class czq0 extends vw5 {
    public final ttb0 d;
    public final mne e;
    public final kh3 f;
    public final tc80 g;
    public final p7m0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czq0(o8f o8fVar, ttb0 ttb0Var, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = ttb0Var;
        this.e = mneVar;
        this.f = kh3.OTHER;
        this.g = tc80.TOP_CHAMP_EVENTS;
        this.h = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.h.o(null, i8d.b);
        sac.V(sjeVar, bzq0.f3484a, new h3q0((Object) this, (byte) 22), this.e.c, new hlq0(this, sjeVar, null), 8);
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
