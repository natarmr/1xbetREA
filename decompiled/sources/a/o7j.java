package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class o7j extends w46 {
    public final tru b;
    public final xsu c;
    public final mne d;
    public final duj e;
    public final g2v f;
    public final p7m0 g;
    public final c4m0 h;
    public bby i;
    public boolean j;
    public String k;

    public o7j(tru truVar, xsu xsuVar, i1w0 i1w0Var, mne mneVar, duj dujVar, g2v g2vVar, m1e m1eVar) {
        i1w0Var.getClass();
        this.b = truVar;
        this.c = xsuVar;
        this.d = mneVar;
        this.e = dujVar;
        this.f = g2vVar;
        this.g = q7m0.a(i7j.f14294a);
        this.k = "";
        c4m0 c4m0Var = this.h;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.h = slb.U(new fnq(m1eVar.b(), new n7j(this, null, b), (byte) 4), jiu0.a(this));
        }
    }

    public final jkm w() {
        return g2v.d(this.f, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new e8g(this, (byte) 29), 94);
    }

    public final void x(String str) {
        str.getClass();
        this.k = str;
        sac.V(jiu0.a(this), new h7j(this, (byte) 1), null, this.d.b, new e9g(this, str, null, (byte) 15), 10);
    }

    public final void y(m7j m7jVar) {
        sac.V(jiu0.a(this), new x2i((byte) 10), null, this.d.c, new b1f((Object) this, (Object) m7jVar, (yje) null, (byte) 17), 10);
    }
}
