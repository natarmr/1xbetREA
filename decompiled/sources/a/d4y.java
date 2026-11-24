package a;

/* JADX INFO: loaded from: classes6.dex */
public final class d4y extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final mne A;
    public final ctf0 B;
    public final i1w0 C;
    public final ivn D;
    public final c4m0 E;
    public final lbu o;
    public final ngu p;
    public final ngu q;
    public final khf0 r;
    public final v88 s;
    public final ot t;
    public final b8u u;
    public final rou v;
    public final w5z w;
    public final ilt0 x;
    public final duj y;
    public final m0u z;

    public d4y(vzg0 vzg0Var, hrc hrcVar, lbu lbuVar, ngu nguVar, ngu nguVar2, khf0 khf0Var, v88 v88Var, ot otVar, b8u b8uVar, rou rouVar, w5z w5zVar, ilt0 ilt0Var, duj dujVar, m0u m0uVar, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, wyu wyuVar, ivn ivnVar, m1e m1eVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        byte b = 1;
        u1y u1yVar = new u1y(wyuVar, hrcVar, ctf0Var, b);
        bcn bcnVar = new bcn(ctf0Var, (byte) 24);
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(null, u1yVar, bcnVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = lbuVar;
        this.p = nguVar;
        this.q = nguVar2;
        this.r = khf0Var;
        this.s = v88Var;
        this.t = otVar;
        this.u = b8uVar;
        this.v = rouVar;
        this.w = w5zVar;
        this.x = ilt0Var;
        this.y = dujVar;
        this.z = m0uVar;
        this.A = mneVar;
        this.B = ctf0Var;
        this.C = i1w0Var;
        this.D = ivnVar;
        byte b2 = 2;
        sac.V(jiu0.a(this), new z3y(this, b2), null, mneVar.f22085a, new b4y(this, yjeVar, (byte) 0), 10);
        c4m0 c4m0Var = this.E;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.E = sac.T(new fnq(m1eVar.b(), new slx(this, yjeVar, b), (byte) 4), jiu0.a(this), new sax(b2, yjeVar, (byte) 3));
        }
    }

    public final void M(double d) {
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        pz40 pz40Var = ((x3y) D()).c.f41594a;
        int length = strC.length();
        ((hgk0) pz40Var).setValue(new a8q0(strC, s7n0.e(length, length), 4));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002d A[PHI: r11
  0x002d: PHI (r11v7 double) = (r11v4 double), (r11v5 double) binds: [B:5:0x002b, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        double d;
        Object value;
        x3y x3yVar;
        Object value2;
        x3y x3yVar2;
        m3y m3yVar = (m3y) obj;
        m3yVar.getClass();
        boolean zEquals = m3yVar.equals(h3y.f12408a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b = 0;
        yje yjeVar = null;
        if (zEquals) {
            dpm0 dpm0Var = ((x3y) D()).c.b;
            double d2 = dpm0Var.f6476a;
            double d3 = d2 - dpm0Var.b;
            double d4 = dpm0Var.c;
            if (d3 < d4) {
                d3 = d4;
            } else {
                d4 = dpm0Var.d;
                if (d2 > d4) {
                    d3 = d4;
                }
            }
            M(d3);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                x3yVar2 = (x3y) value2;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, x3y.a(x3yVar2, null, new xw6(x3yVar2.c.f41594a, dpm0.a(dpm0Var, d3, 62)), false, 27)));
            return;
        }
        if (m3yVar.equals(i3y.f14121a)) {
            dpm0 dpm0Var2 = ((x3y) D()).c.b;
            double d5 = dpm0Var2.f6476a;
            double d6 = dpm0Var2.b;
            if (d5 == -1.0d) {
                d = dpm0Var2.c + d6;
            } else {
                d = d5 + d6;
                double d7 = dpm0Var2.d;
                if (d > d7) {
                    d = d7;
                }
            }
            M(d);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                x3yVar = (x3y) value;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, x3y.a(x3yVar, null, new xw6(x3yVar.c.f41594a, dpm0.a(dpm0Var2, d, 62)), false, 27)));
            return;
        }
        byte b2 = 1;
        if (!(m3yVar instanceof j3y)) {
            if (m3yVar.equals(f3y.f8886a)) {
                G(r3y.f29809a);
                return;
            }
            if (m3yVar.equals(k3y.f17642a)) {
                G(p3y.f26323a);
                sac.V(jiu0.a(this), new z3y(this, b), new y2x(this, (byte) 11), this.A.b, new b4y(this, yjeVar, b2), 8);
                return;
            }
            if (m3yVar.equals(l3y.f19378a)) {
                sac.V(jiu0.a(this), new z3y(this, b2), null, null, new r1w(this, yjeVar, (byte) 24), 14);
                return;
            } else if (m3yVar.equals(g3y.f10636a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        a8q0 a8q0Var = ((j3y) m3yVar).f15858a;
        j83 j83Var = a8q0Var.f440a;
        if (j83Var.b.length() > 13) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = j83Var.b;
        int length = str.length();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                if (sb.length() != 1 || sb.charAt(0) != '0' || cCharAt != '0' || z) {
                    if (sb.length() == 1 && sb.charAt(0) == '0' && cCharAt != '0' && !z) {
                        sb.deleteCharAt(0);
                    }
                    if (!z) {
                        sb.append(cCharAt);
                    } else if (i < 2) {
                        sb.append(cCharAt);
                        i++;
                    }
                }
            } else if (cCharAt == '.' && !z && sb.length() > 0) {
                sb.append(cCharAt);
                z = true;
            }
        }
        a8q0 a8q0VarB = a8q0.b(a8q0Var, sb.toString(), 0L, 6);
        ((hgk0) ((x3y) D()).c.f41594a).setValue(a8q0VarB);
        H(new w1y(a8q0VarB, b2));
    }
}
