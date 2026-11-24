package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class g7u0 extends w46 {
    public final int b;
    public final ctf0 c;
    public final xsu d;
    public final mne e;
    public final h32 f;
    public final i1w0 g;
    public final yo4 h;
    public final zr1 i;
    public final p7m0 j;

    public g7u0(vzg0 vzg0Var, int i, ctf0 ctf0Var, xsu xsuVar, mne mneVar, h32 h32Var, i1w0 i1w0Var, yo4 yo4Var, zr1 zr1Var, String str, g2v g2vVar) {
        ctf0Var.getClass();
        h32Var.getClass();
        this.b = i;
        this.c = ctf0Var;
        this.d = xsuVar;
        this.e = mneVar;
        this.f = h32Var;
        this.g = i1w0Var;
        this.h = yo4Var;
        this.i = zr1Var;
        this.j = q7m0.a(new u6u0(iun.f15405a, g2v.d(g2vVar, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new avs0(0, this, g7u0.class, "loadVenues", "loadVenues()V", 0, (byte) 1), 94), false, true));
        w();
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        yje yjeVar;
        do {
            p7m0Var = this.j;
            value = p7m0Var.getValue();
            yjeVar = null;
        } while (!p7m0Var.m(value, u6u0.a((u6u0) value, null, false, true, 3)));
        sac.V(jiu0.a(this), new npt0(this, (byte) 4), null, this.e.f22085a, new k6s0(this, yjeVar, (byte) 15), 10);
    }
}
