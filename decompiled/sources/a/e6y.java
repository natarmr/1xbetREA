package a;

/* JADX INFO: loaded from: classes6.dex */
public final class e6y extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final mne A;
    public final ctf0 B;
    public final i1w0 C;
    public final m1e D;
    public c4m0 E;
    public c4m0 F;
    public final lbu o;
    public final ngu p;
    public final ngu q;
    public final ivn r;
    public final khf0 s;
    public final v88 t;
    public final ot u;
    public final b8u v;
    public final rou w;
    public final w5z x;
    public final ilt0 y;
    public final duj z;

    public e6y(vzg0 vzg0Var, hrc hrcVar, lbu lbuVar, ngu nguVar, ngu nguVar2, ivn ivnVar, khf0 khf0Var, v88 v88Var, ot otVar, b8u b8uVar, rou rouVar, w5z w5zVar, ilt0 ilt0Var, duj dujVar, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, m1e m1eVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wqv wqvVar = new wqv(hrcVar, ctf0Var, (byte) 18);
        bcn bcnVar = new bcn(ctf0Var, (byte) 26);
        rwj rwjVar = mneVar.f22085a;
        super(null, wqvVar, bcnVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = lbuVar;
        this.p = nguVar;
        this.q = nguVar2;
        this.r = ivnVar;
        this.s = khf0Var;
        this.t = v88Var;
        this.u = otVar;
        this.v = b8uVar;
        this.w = rouVar;
        this.x = w5zVar;
        this.y = ilt0Var;
        this.z = dujVar;
        this.A = mneVar;
        this.B = ctf0Var;
        this.C = i1w0Var;
        this.D = m1eVar;
        sac.V(jiu0.a(this), new z5y(this, (byte) 2), null, mneVar.f22085a, new b6y(this, null, (byte) 0), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        k5y k5yVar = (k5y) obj;
        k5yVar.getClass();
        if (k5yVar.equals(d5y.f5528a)) {
            G(r5y.f29911a);
            return;
        }
        byte b = 13;
        byte b2 = 0;
        yje yjeVar = null;
        if (k5yVar.equals(g5y.f10738a)) {
            G(p5y.f26427a);
            sac.V(jiu0.a(this), new z5y(this, b2), new y2x(this, b), this.A.b, new z8t(this, ((x5y) D()).c.b, yjeVar, (byte) 4), 8);
            return;
        }
        byte b3 = 1;
        if (k5yVar.equals(h5y.f12504a)) {
            sac.V(jiu0.a(this), new z5y(this, b3), null, null, new c6y(this, null), 14);
            return;
        }
        if (k5yVar.equals(e5y.f7256a)) {
            E();
            return;
        }
        int i = 2;
        if (!(k5yVar instanceof f5y)) {
            if (k5yVar.equals(i5y.f14216a)) {
                c4m0 c4m0Var = this.E;
                if (c4m0Var != null) {
                    v3c.N(c4m0Var);
                }
                c4m0 c4m0Var2 = this.F;
                if (c4m0Var2 != null) {
                    v3c.N(c4m0Var2);
                    return;
                }
                return;
            }
            if (!k5yVar.equals(j5y.f15957a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var3 = this.E;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                this.E = sac.T(new fnq(this.D.b(), new b6y(this, yjeVar, b3), (byte) 4), jiu0.a(this), new sax(i, yjeVar, (byte) 5));
                return;
            }
            return;
        }
        a8q0 a8q0Var = ((f5y) k5yVar).f8984a;
        j83 j83Var = a8q0Var.f440a;
        if (j83Var.b.length() > 13) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = j83Var.b;
        int length = str.length();
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
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
        }
        a8q0 a8q0VarB = a8q0.b(a8q0Var, sb.toString(), 0L, 6);
        ((x5y) D()).c.f45091a.setValue(a8q0VarB);
        H(new w1y(a8q0VarB, (byte) 3));
    }
}
