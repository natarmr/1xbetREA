package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class udo extends vw5 {
    public final u7u d;
    public final mne e;
    public final kh3 f;
    public final f5l0 g;
    public final p7m0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udo(o8f o8fVar, u7u u7uVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = u7uVar;
        this.e = mneVar;
        this.f = kh3.SPORT_DICTIONARY;
        this.g = f5l0.EVENT_GROUPS;
        this.h = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.h.o(null, i8d.b);
        sac.V(sjeVar, new qzn(this, sjeVar, (byte) 22), null, this.e.c, new hij(this, null, (byte) 13), 10);
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
