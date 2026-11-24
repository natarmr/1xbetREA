package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class v6j extends w46 {
    public final hnu b;
    public final mne c;
    public final g2v d;
    public final p7m0 e;
    public final c4m0 f;
    public boolean g;

    public v6j(hnu hnuVar, i1w0 i1w0Var, mne mneVar, g2v g2vVar, m1e m1eVar) {
        i1w0Var.getClass();
        this.b = hnuVar;
        this.c = mneVar;
        this.d = g2vVar;
        this.e = q7m0.a(new r6j(w()));
        c4m0 c4m0Var = this.f;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.f = slb.U(new fnq(m1eVar.b(), new u6j(this, yjeVar, (byte) 0), (byte) 4), jiu0.a(this));
        }
        sac.V(jiu0.a(this), new x2i((byte) 8), null, mneVar.f22085a, new u6j(this, yjeVar, b), 10);
    }

    public final jkm w() {
        return g2v.d(this.d, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new e8g(this, (byte) 27), 94);
    }

    public final void x(t6j t6jVar) {
        sac.V(jiu0.a(this), new x2i((byte) 7), null, this.c.c, new b1f(this, t6jVar, (yje) null, (byte) 15), 10);
    }
}
