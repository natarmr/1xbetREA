package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ouf extends vw5 {
    public final lsn d;
    public final q0u e;
    public final o470 f;
    public final mne g;
    public final kh3 h;
    public final upe i;
    public final p7m0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouf(o8f o8fVar, lsn lsnVar, q0u q0uVar, o470 o470Var, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = lsnVar;
        this.e = q0uVar;
        this.f = o470Var;
        this.g = mneVar;
        this.h = kh3.COUNTRIES_DICTIONARY;
        this.i = upe.CURRENCIES;
        this.j = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.j.o(null, i8d.b);
        sac.V(sjeVar, new v4f(this, sjeVar, (byte) 12), null, this.g.c, new fr9(this, null, (byte) 11), 10);
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
