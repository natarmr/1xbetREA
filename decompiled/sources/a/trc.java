package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class trc extends vw5 {
    public final urc d;
    public final vrc e;
    public final mne f;
    public final kh3 g;
    public final tc80 h;
    public final p7m0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trc(o8f o8fVar, urc urcVar, vrc vrcVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = urcVar;
        this.e = vrcVar;
        this.f = mneVar;
        this.g = kh3.OTHER;
        this.h = tc80.CLEAR_SEEN_BANNERS;
        this.i = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.i.o(null, i8d.b);
        sac.V(sjeVar, new e6c((byte) 12), new h8a(this, (byte) 16), this.f.c, new ya(this, null, (byte) 17), 8);
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
