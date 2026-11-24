package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wxo0 extends i3t0 {
    public final sxo0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxo0(sxo0 sxo0Var, ctf0 ctf0Var, mne mneVar) {
        super(null, new nxo0(sxo0Var, (byte) 1), new h0j0(ctf0Var, (byte) 13), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = sxo0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        lxo0 lxo0Var = (lxo0) obj;
        lxo0Var.getClass();
        super.x(lxo0Var);
        if (lxo0Var instanceof kxo0) {
            sxo0 sxo0Var = this.o;
            G(new txo0(new ojp0(sxo0Var.b, sxo0Var.c, ((kxo0) lxo0Var).f19066a.f2946a)));
        } else if (lxo0Var.equals(jxo0.f17318a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
