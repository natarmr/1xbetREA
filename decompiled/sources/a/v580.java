package a;

/* JADX INFO: loaded from: classes5.dex */
public final class v580 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final v480 o;
    public final mne p;
    public final awu q;
    public final ove r;
    public bby s;
    public c4m0 t;

    public v580(vzg0 vzg0Var, v480 v480Var, mne mneVar, awu awuVar, ove oveVar) {
        v480Var.getClass();
        pl70 pl70Var = new pl70(v480Var, (byte) 4);
        r580 r580Var = new r580((byte) 0);
        vs10 vs10Var = mneVar.c;
        super(null, pl70Var, r580Var, cvm0.p(vs10Var, vs10Var), null);
        this.o = v480Var;
        this.p = mneVar;
        this.q = awuVar;
        this.r = oveVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        i580 i580Var;
        i3m0 i3m0Var;
        String str;
        y380 y380Var = (y380) obj;
        y380Var.getClass();
        super.x(y380Var);
        if (y380Var.equals(r380.f29774a)) {
            v3c.N(this.s);
            v3c.N(this.t);
            return;
        }
        if (y380Var.equals(s380.f31544a)) {
            E();
            return;
        }
        yje yjeVar = null;
        if (y380Var.equals(t380.f33254a)) {
            i3t0.K(this, null, null, new epp(this, yjeVar, (byte) 19), 3);
            return;
        }
        if (y380Var.equals(u380.f34984a)) {
            v3c.N(this.s);
            this.s = i3t0.F(this, this.r, null, null, new zc70((byte) 9), 119);
            v3c.N(this.t);
            this.t = i3t0.L(this, new m430(this.q.a(), this, (byte) 17), this.p.f22085a, null, 2);
            return;
        }
        boolean z = y380Var instanceof w380;
        ove oveVar = this.r;
        if (z) {
            ebv0 ebv0Var = new ebv0(((i580) D()).f14181a);
            wav0 wav0Var = ((w380) y380Var).f38489a;
            v480 v480Var = this.o;
            i3t0.B(this, oveVar, new mbv0[]{ebv0Var, vfc.U(wav0Var, v480Var.c, v480Var.d)});
            return;
        }
        if (y380Var instanceof x380) {
            i3t0.B(this, oveVar, new mbv0[]{new ebv0(((i580) D()).f14181a), ((x380) y380Var).f40205a});
            return;
        }
        if (!(y380Var instanceof v380)) {
            t9f.b();
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            i580Var = (i580) value;
            this.f.getClass();
            v380 v380Var = (v380) y380Var;
            i3m0Var = v380Var.f36721a;
            str = v380Var.b;
            if (str.length() == 0) {
                str = null;
            }
        } while (!p7m0Var.m(value, i580.a(i580Var, null, i3m0Var, str, 1)));
    }
}
