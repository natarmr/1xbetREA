package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yb0 extends w46 {
    public final duj b;
    public final mne c;
    public final tzi d;
    public final trm0 e;
    public final m2c f;
    public final ol60 g = new ol60(3);
    public final p7m0 h = q7m0.a(xb0.f40577a);
    public bby i;

    public yb0(kc60 kc60Var, duj dujVar, mne mneVar, tzi tziVar, trm0 trm0Var, m2c m2cVar) {
        this.b = dujVar;
        this.c = mneVar;
        this.d = tziVar;
        this.e = trm0Var;
        this.f = m2cVar;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new qa(this, null, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), rb0.h);
    }

    public final void w() {
        bby bbyVar = this.i;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.i = sac.V(jiu0.a(this), new t90(1, this.b, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, this.c.b, new pa((Object) this, (yje) null, (byte) 9), 10);
        }
    }
}
