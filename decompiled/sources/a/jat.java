package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jat extends vw5 {
    public final mkt0 d;
    public final kqc e;
    public final mne f;
    public final n4u g;
    public final wtt h;
    public final pru i;
    public final kh3 j;
    public final tc80 k;
    public final List l;
    public final p7m0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jat(o8f o8fVar, g5t g5tVar, mkt0 mkt0Var, kqc kqcVar, mne mneVar, n4u n4uVar, wtt wttVar, pru pruVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        g5tVar.getClass();
        this.d = mkt0Var;
        this.e = kqcVar;
        this.f = mneVar;
        this.g = n4uVar;
        this.h = wttVar;
        this.i = pruVar;
        this.j = kh3.OTHER;
        this.k = tc80.GAMES_PREVIEW;
        this.l = kotlin.collections.a.c(g5tVar);
        this.m = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.m.o(null, i8d.b);
        sac.V(sjeVar, iat.f14454a, new jcs(this, (byte) 16), this.f.c, new cbq(this, sjeVar, null, (byte) 25), 8);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.j;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.m;
    }

    @Override // a.vw5
    public final List d() {
        return this.l;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.k;
    }
}
