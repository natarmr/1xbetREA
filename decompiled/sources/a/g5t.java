package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g5t extends vw5 {
    public final jdu d;
    public final pru e;
    public final mne f;
    public final kh3 g;
    public final tc80 h;
    public final p7m0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5t(o8f o8fVar, jdu jduVar, pru pruVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = jduVar;
        this.e = pruVar;
        this.f = mneVar;
        this.g = kh3.OTHER;
        this.h = tc80.GAMES_CONFIG;
        this.i = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.i.o(null, i8d.b);
        sac.V(sjeVar, f5t.f8979a, new jcs(this, (byte) 12), this.f.c, new cbq(this, sjeVar, null, (byte) 22), 8);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.g;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.i;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.h;
    }
}
