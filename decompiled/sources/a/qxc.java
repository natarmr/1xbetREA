package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qxc extends w46 {
    public final mvc b;
    public final duj c;
    public final m1e d;
    public final mne e;
    public final i1w0 f;
    public final lyt g;
    public final ntu h;
    public final ctf0 i;
    public final grj j;
    public final n0o0 k;
    public final ol60 l;
    public final p7m0 m;
    public c4m0 n;
    public bby o;

    public qxc(mvc mvcVar, duj dujVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, lyt lytVar, ntu ntuVar, ctf0 ctf0Var, grj grjVar) {
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = mvcVar;
        this.c = dujVar;
        this.d = m1eVar;
        this.e = mneVar;
        this.f = i1w0Var;
        this.g = lytVar;
        this.h = ntuVar;
        this.i = ctf0Var;
        this.j = grjVar;
        this.k = maz.b(new lxc(this, (byte) 1));
        this.l = new ol60(3);
        this.m = q7m0.a(new yvc(iun.f15405a, true, -1, null, 0L));
    }

    public final void w() {
        bby bbyVar = this.o;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.o = sac.g0(jiu0.a(this), "CmsNewsMainViewModel.getBanners", this.e.f22085a, new enc(1, this, qxc.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10), new mxc(this, null, (byte) 0), 86);
        }
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, yvc.a((yvc) value, null, 0, null, 10000L, 15)));
        w();
    }

    public final void y() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, yvc.a((yvc) value, null, 0, new jkm(okm.f25411a, ikm.f14933a, R.string.lottie_main_error, 0, R.string.data_retrieval_error, R.string.try_again_text, new lxc(this, (byte) 0)), 0L, 5)));
    }
}
