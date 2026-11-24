package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gjf0 extends w46 {
    public final usd b;
    public final zn00 c;
    public final mne d;
    public final duj e;
    public final ctf0 f;
    public final i1w0 g;
    public final boolean h;
    public final p7m0 i;
    public final ol60 j;
    public bby k;
    public final c4m0 l;

    public gjf0(vzg0 vzg0Var, usd usdVar, zn00 zn00Var, mne mneVar, duj dujVar, ctf0 ctf0Var, i1w0 i1w0Var, m1e m1eVar, boolean z) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = usdVar;
        this.c = zn00Var;
        this.d = mneVar;
        this.e = dujVar;
        this.f = ctf0Var;
        this.g = i1w0Var;
        this.h = z;
        this.i = q7m0.a(new ejf0("", false, false, false));
        this.j = new ol60(3);
        c4m0 c4m0Var = this.l;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.l = sac.T(new fnq(m1eVar.b(), new fjf0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new st20(2, yjeVar, (byte) 27));
        }
    }

    public final void w(CharSequence charSequence) {
        p7m0 p7m0Var;
        Object value;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        String str = string;
        do {
            p7m0Var = this.i;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ejf0.a((ejf0) value, false, str, str.length() > 0, false, 9)));
        this.j.f(xif0.f40943a);
    }
}
