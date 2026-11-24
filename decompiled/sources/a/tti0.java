package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tti0 extends vw5 {
    public final mne d;
    public final kh3 e;
    public final qsf0 f;
    public final p7m0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tti0(o8f o8fVar, sqt sqtVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = mneVar;
        this.e = kh3.RESOLVE;
        this.f = qsf0.SET_UP_NETWORK;
        this.g = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.g.o(null, i8d.b);
        sac.V(sjeVar, new huh0(this, sjeVar, (byte) 4), null, this.d.c, new yng0(this, null, (byte) 14), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.e;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.g;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.f;
    }
}
