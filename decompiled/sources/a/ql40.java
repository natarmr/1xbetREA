package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ql40 extends vw5 {
    public final mne d;
    public final x4u e;
    public final ani0 f;
    public final kh3 g;
    public final gsd h;
    public final p7m0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql40(o8f o8fVar, mne mneVar, x4u x4uVar, ani0 ani0Var, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = mneVar;
        this.e = x4uVar;
        this.f = ani0Var;
        this.g = kh3.CONFIG;
        this.h = gsd.MARKETING_NAME;
        this.i = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.i.o(null, i8d.b);
        sac.V(sjeVar, new bw20((Object) this, (Object) sjeVar, (byte) 25), new np30(this, (byte) 8), this.d.c, new w620((Object) this, (yje) null, (byte) 13), 8);
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
