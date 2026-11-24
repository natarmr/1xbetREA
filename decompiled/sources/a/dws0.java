package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dws0 extends w46 {
    public final mne b;
    public final ojj c;
    public final ctf0 d;
    public final duj e;
    public final i1w0 f;
    public final s9m0 g;
    public final im4 h;
    public final p7m0 i;
    public final ol60 j;
    public bby k;
    public final c4m0 l;

    public dws0(vzg0 vzg0Var, mne mneVar, ojj ojjVar, ctf0 ctf0Var, duj dujVar, i1w0 i1w0Var, m1e m1eVar, s9m0 s9m0Var, im4 im4Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = mneVar;
        this.c = ojjVar;
        this.d = ctf0Var;
        this.e = dujVar;
        this.f = i1w0Var;
        this.g = s9m0Var;
        this.h = im4Var;
        this.i = q7m0.a(new bws0("", "", "", false, false, true));
        this.j = new ol60(3);
        c4m0 c4m0Var = this.l;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.l = sac.T(new fnq(m1eVar.b(), new cws0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new tri0(2, yjeVar, (byte) 24));
        }
    }

    public final void w(CharSequence charSequence) {
        String string;
        p7m0 p7m0Var;
        Object value;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        String str = string;
        do {
            p7m0Var = this.i;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, bws0.a((bws0) value, false, null, str, "", str.length() > 0, false, 35)));
    }
}
