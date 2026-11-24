package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vpe extends vw5 {
    public final vl00 d;
    public final pru e;
    public final mne f;
    public final kh3 g;
    public final upe h;
    public final p7m0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpe(o8f o8fVar, vl00 vl00Var, pru pruVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = vl00Var;
        this.e = pruVar;
        this.f = mneVar;
        this.g = kh3.COUNTRIES_DICTIONARY;
        this.h = upe.COUNTRIES_WITH_MASKS;
        this.i = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.i.o(null, i8d.b);
        sac.V(sjeVar, new h6c(this, sjeVar, (byte) 23), null, this.f.c, new igb((Object) this, (yje) null, (byte) 13), 10);
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
