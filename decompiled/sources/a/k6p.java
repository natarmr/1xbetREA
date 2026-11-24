package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class k6p extends w46 {
    public final i1w0 b;
    public final hzg c;
    public final z8u d;
    public final yzn0 e;
    public final j3c f;
    public final mne g;
    public final g2v h;
    public final duj i;
    public final ifp j;
    public final msu k;
    public final khf0 l;
    public final ivn m;
    public final m1e n;
    public final luu o;
    public bby p;
    public bby q;
    public c4m0 r;
    public boolean s;
    public final ol60 t;
    public final p7m0 u;

    public k6p(vzg0 vzg0Var, i1w0 i1w0Var, hzg hzgVar, z8u z8uVar, yzn0 yzn0Var, j3c j3cVar, mne mneVar, g2v g2vVar, duj dujVar, pru pruVar, vqc vqcVar, ifp ifpVar, msu msuVar, khf0 khf0Var, vqc vqcVar2, ivn ivnVar, m1e m1eVar, luu luuVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = hzgVar;
        this.d = z8uVar;
        this.e = yzn0Var;
        this.f = j3cVar;
        this.g = mneVar;
        this.h = g2vVar;
        this.i = dujVar;
        this.j = ifpVar;
        this.k = msuVar;
        this.l = khf0Var;
        this.m = ivnVar;
        this.n = m1eVar;
        this.o = luuVar;
        this.t = new ol60(3);
        this.u = q7m0.a(new e6p(kotlin.collections.a.c(y5p.f42059a)));
    }

    public final jkm w() {
        return g2v.d(this.h, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new ntl(this, (byte) 26), 94);
    }

    public final void x() {
        v3c.N(this.q);
        bvc bvcVarA = jiu0.a(this);
        Class<k6p> cls = k6p.class;
        k4p k4pVar = new k4p(1, this, cls, "handleLoadingError", "handleLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 5);
        mne mneVar = this.g;
        yje yjeVar = null;
        this.q = sac.V(bvcVarA, k4pVar, null, mneVar.f22085a, new j6p(this, yjeVar, (byte) 2), 10);
        v3c.N(this.p);
        byte b = 1;
        this.p = sac.V(jiu0.a(this), new k4p(b, this, cls, "handleLoadingError", "handleLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, mneVar.f22085a, new e3p(this, yjeVar, b), 10);
    }
}
