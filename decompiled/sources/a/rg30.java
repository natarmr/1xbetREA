package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rg30 extends i3t0 {
    public final yqt o;
    public final yqt p;
    public final duj q;

    public rg30(yqt yqtVar, yqt yqtVar2, duj dujVar, mne mneVar) {
        rx00 rx00Var = new rx00(yqtVar2, (byte) 28);
        tr20 tr20Var = new tr20((byte) 8);
        rwj rwjVar = mneVar.f22085a;
        super(null, rx00Var, tr20Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = yqtVar;
        this.p = yqtVar2;
        this.q = dujVar;
        sac.V(jiu0.a(this), new b530((Object) this, (byte) 1), null, mneVar.b, new z210(this, null, (byte) 13), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        pg30 pg30Var = (pg30) obj;
        pg30Var.getClass();
        if (pg30Var instanceof og30) {
            G(new sg30(((og30) pg30Var).f25197a));
        } else if (pg30Var instanceof ng30) {
            E();
        } else {
            t9f.b();
        }
    }
}
