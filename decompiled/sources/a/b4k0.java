package a;

/* JADX INFO: loaded from: classes5.dex */
public final class b4k0 extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final x3k0 o;
    public final mne p;
    public final awu q;
    public c4m0 r;

    public b4k0(vzg0 vzg0Var, x3k0 x3k0Var, mne mneVar, ctf0 ctf0Var, awu awuVar) {
        ctf0Var.getClass();
        hwi0 hwi0Var = new hwi0((byte) 23);
        huh0 huh0Var = new huh0(x3k0Var, ctf0Var, (byte) 21);
        vs10 vs10Var = mneVar.c;
        super(null, hwi0Var, huh0Var, cvm0.p(vs10Var, vs10Var), null);
        this.o = x3k0Var;
        this.p = mneVar;
        this.q = awuVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object obj2;
        v3k0 v3k0Var = (v3k0) obj;
        v3k0Var.getClass();
        super.x(v3k0Var);
        if (v3k0Var.equals(t3k0.f33273a)) {
            v3c.N(this.r);
            return;
        }
        if (!v3k0Var.equals(u3k0.f35002a)) {
            t9f.b();
            return;
        }
        v3c.N(this.r);
        h3m0 h3m0Var = this.o.b;
        if (h3m0Var.equals(g3m0.f10617a)) {
            obj2 = gfb.class;
        } else {
            if (!h3m0Var.equals(f3m0.f8871a)) {
                t9f.b();
                return;
            }
            obj2 = ffb.class;
        }
        this.r = i3t0.L(this, new fnq(this.q.a(), new qkb0(this, obj2, (yje) null, (byte) 21), (byte) 4), this.p.f22085a, null, 2);
    }
}
