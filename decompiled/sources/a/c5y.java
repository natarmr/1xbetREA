package a;

/* JADX INFO: loaded from: classes6.dex */
public final class c5y extends i3t0 {
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

    public c5y(vzg0 vzg0Var, hrc hrcVar, lbu lbuVar, ngu nguVar, ngu nguVar2, khf0 khf0Var, v88 v88Var, ot otVar, b8u b8uVar, rou rouVar, w5z w5zVar, ilt0 ilt0Var, duj dujVar, m0u m0uVar, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, wyu wyuVar, ivn ivnVar, m1e m1eVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        byte b = 2;
        u1y u1yVar = new u1y(wyuVar, hrcVar, ctf0Var, b);
        bcn bcnVar = new bcn(ctf0Var, (byte) 25);
        rwj rwjVar = mneVar.f22085a;
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
        yje yjeVar = null;
        sac.V(jiu0.a(this), new y4y(this, b), null, mneVar.f22085a, new a5y(this, yjeVar, (byte) 0), 10);
        c4m0 c4m0Var = this.E;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            byte b2 = 4;
            this.E = sac.T(new fnq(m1eVar.b(), new slx(this, yjeVar, b), b2), jiu0.a(this), new sax(b, yjeVar, b2));
        }
    }

    public final void M(double d) {
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.g);
        pz40 pz40Var = ((zzx) D()).c.f43355a;
        int length = strC.length();
        ((hgk0) pz40Var).setValue(new a8q0(strC, s7n0.e(length, length), 4));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002d A[PHI: r11
  0x002d: PHI (r11v8 double) = (r11v5 double), (r11v6 double) binds: [B:5:0x002b, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        double d;
        Object value;
        zzx zzxVar;
        Object value2;
        zzx zzxVar2;
        m4y m4yVar = (m4y) obj;
        m4yVar.getClass();
        boolean zEquals = m4yVar.equals(h4y.f12455a);
        byte b = 27;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b2 = 0;
        yje yjeVar = null;
        if (zEquals) {
            epm0 epm0Var = ((zzx) D()).c.b;
            double d2 = epm0Var.f8196a;
            double d3 = d2 - epm0Var.b;
            double d4 = epm0Var.c;
            if (d3 < d4) {
                d3 = d4;
            } else {
                d4 = epm0Var.d;
                if (d2 > d4) {
                    d3 = d4;
                }
            }
            M(d3);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                zzxVar2 = (zzx) value2;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, zzx.a(zzxVar2, null, new yw6(zzxVar2.c.f43355a, epm0.a(epm0Var, d3, 62)), false, 27)));
            return;
        }
        if (m4yVar.equals(i4y.f14166a)) {
            epm0 epm0Var2 = ((zzx) D()).c.b;
            double d5 = epm0Var2.f8196a;
            double d6 = epm0Var2.b;
            if (d5 == -1.0d) {
                d = epm0Var2.c + d6;
            } else {
                d = d5 + d6;
                double d7 = epm0Var2.d;
                if (d > d7) {
                    d = d7;
                }
            }
            M(d);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                zzxVar = (zzx) value;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, zzx.a(zzxVar, null, new yw6(zzxVar.c.f43355a, epm0.a(epm0Var2, d, 62)), false, 27)));
            return;
        }
        byte b3 = 1;
        if (!(m4yVar instanceof j4y)) {
            if (m4yVar.equals(f4y.f8935a)) {
                G(s4y.f31631a);
                return;
            }
            if (m4yVar.equals(k4y.f17692a)) {
                G(q4y.f28124a);
                sac.V(jiu0.a(this), new y4y(this, b2), new y2x(this, (byte) 12), this.A.b, new a5y(this, yjeVar, b3), 8);
                return;
            }
            if (m4yVar.equals(l4y.f19433a)) {
                sac.V(jiu0.a(this), new y4y(this, b3), null, null, new r1w(this, yjeVar, b), 14);
                return;
            } else if (m4yVar.equals(g4y.f10691a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        a8q0 a8q0Var = ((j4y) m4yVar).f15907a;
        j83 j83Var = a8q0Var.f440a;
        if (j83Var.b.length() > 13) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = j83Var.b;
        int length = str.length();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            byte b4 = 2;
            if (i >= length) {
                a8q0 a8q0VarB = a8q0.b(a8q0Var, sb.toString(), 0L, 6);
                ((hgk0) ((zzx) D()).c.f43355a).setValue(a8q0VarB);
                H(new w1y(a8q0VarB, b4));
                return;
            }
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                if (sb.length() != 1 || sb.charAt(0) != '0' || cCharAt != '0' || z) {
                    if (sb.length() == 1 && sb.charAt(0) == '0' && cCharAt != '0' && !z) {
                        sb.deleteCharAt(0);
                    }
                    if (!z) {
                        sb.append(cCharAt);
                    } else if (i2 < 2) {
                        sb.append(cCharAt);
                        i2++;
                    }
                }
            } else if (cCharAt == '.' && !z && sb.length() > 0) {
                sb.append(cCharAt);
                z = true;
            }
            i++;
        }
    }
}
