package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ltm0 extends vw5 {
    public final nr d;
    public final mne e;
    public final kh3 f;
    public final utm0 g;
    public final p7m0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltm0(o8f o8fVar, nr nrVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = nrVar;
        this.e = mneVar;
        this.f = kh3.STRINGS;
        this.g = utm0.STRINGS;
        this.h = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.h.o(null, i8d.b);
        sac.V(sjeVar, new u5l0((Object) this, (Object) sjeVar, (byte) 22), null, this.e.c, new yng0(this, null, (byte) 28), 10);
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
