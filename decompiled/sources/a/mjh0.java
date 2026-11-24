package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mjh0 extends i3t0 {
    public final zqt o;
    public final yqt p;
    public final duj q;

    public mjh0(zqt zqtVar, yqt yqtVar, duj dujVar, mne mneVar) {
        igh0 igh0Var = new igh0((byte) 10);
        w0h0 w0h0Var = new w0h0((byte) 24);
        rwj rwjVar = mneVar.f22085a;
        super(null, igh0Var, w0h0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = zqtVar;
        this.p = yqtVar;
        this.q = dujVar;
        sac.V(jiu0.a(this), new gwg0(this, (byte) 11), null, mneVar.b, new tmg0(this, null, (byte) 2), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        hjh0 hjh0Var = (hjh0) obj;
        hjh0Var.getClass();
        if (hjh0Var instanceof gjh0) {
            G(new ojh0(((gjh0) hjh0Var).f11396a));
        } else if (hjh0Var instanceof fjh0) {
            E();
        } else {
            t9f.b();
        }
    }
}
