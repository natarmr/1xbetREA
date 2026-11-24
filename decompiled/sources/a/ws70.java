package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ws70 extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final ctf0 o;
    public final zpu p;
    public final String q;

    public ws70(ctf0 ctf0Var, zpu zpuVar, String str, mne mneVar) {
        ctf0Var.getClass();
        fq60 fq60Var = new fq60((byte) 27);
        wk60 wk60Var = new wk60((byte) 27);
        vs10 vs10Var = mneVar.c;
        super(null, fq60Var, wk60Var, cvm0.p(vs10Var, vs10Var), null);
        this.o = ctf0Var;
        this.p = zpuVar;
        this.q = str;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        cs70 cs70Var = (cs70) obj;
        cs70Var.getClass();
        boolean z = cs70Var instanceof as70;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, us70.a((us70) value5, ((as70) cs70Var).f1379a, null, false, 6)));
            return;
        }
        if (cs70Var instanceof zr70) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, us70.a((us70) value4, 0, ((zr70) cs70Var).f44839a, false, 5)));
            return;
        }
        if (cs70Var instanceof yr70) {
            i3t0.K(this, null, null, new epp(this, yjeVar, (byte) 18), 3);
            return;
        }
        boolean z2 = cs70Var instanceof bs70;
        ss70 ss70Var = ss70.f32712a;
        if (z2) {
            if (!((us70) D()).c) {
                G(ss70Var);
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, us70.a((us70) value3, 0, null, true, 3)));
            return;
        }
        if (cs70Var instanceof xr70) {
            if (!((us70) D()).c) {
                G(ss70Var);
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, us70.a((us70) value2, 0, null, true, 3)));
            return;
        }
        if (!(cs70Var instanceof vr70)) {
            if (cs70Var instanceof wr70) {
                E();
            }
        } else {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value, us70.a((us70) value, 0, null, false, 3)));
        }
    }
}
