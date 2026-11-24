package a;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public final class a2y extends i3t0 {
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

    public a2y(vzg0 vzg0Var, hrc hrcVar, lbu lbuVar, ngu nguVar, ngu nguVar2, ivn ivnVar, khf0 khf0Var, v88 v88Var, ot otVar, b8u b8uVar, rou rouVar, w5z w5zVar, ilt0 ilt0Var, wyu wyuVar, duj dujVar, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, m1e m1eVar) {
        wyuVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        byte b = 0;
        u1y u1yVar = new u1y(wyuVar, hrcVar, ctf0Var, b);
        bcn bcnVar = new bcn(ctf0Var, (byte) 23);
        rwj rwjVar = mneVar.f22085a;
        super(null, u1yVar, bcnVar, cvm0.p(rwjVar, rwjVar), null);
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
        sac.V(jiu0.a(this), new x1y(this, (byte) 2), null, mneVar.f22085a, new y1y(this, null, b), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        s1y s1yVar;
        d1y d1yVar = (d1y) obj;
        d1yVar.getClass();
        if (d1yVar.equals(v0y.f36603a)) {
            G(m1y.f21031a);
            return;
        }
        byte b = 0;
        yje yjeVar = null;
        if (d1yVar.equals(y0y.f41830a)) {
            G(k1y.f17552a);
            sac.V(jiu0.a(this), new x1y(this, b), new y2x(this, (byte) 10), this.A.b, new z8t(this, ((s1y) D()).d.b, yjeVar, (byte) 3), 8);
            return;
        }
        byte b2 = 1;
        if (d1yVar.equals(z0y.f43592a)) {
            sac.V(jiu0.a(this), new x1y(this, b2), null, null, new r1w(this, yjeVar, (byte) 22), 14);
            return;
        }
        if (d1yVar.equals(w0y.f38372a)) {
            E();
            return;
        }
        byte b3 = 2;
        if (!(d1yVar instanceof x0y)) {
            if (d1yVar instanceof c1y) {
                float f = ((c1y) d1yVar).f3598a;
                double d = ((s1y) D()).d.c;
                double d2 = ((s1y) D()).d.d;
                pn40 pn40Var = pn40.f27267a;
                double dM = pn40.m(((d2 - d) * ((double) (f / 100.0f))) + d, p3u0.c, RoundingMode.HALF_UP);
                String strValueOf = String.valueOf(dM);
                pz40 pz40Var = ((s1y) D()).d.f1608a;
                int length = strValueOf.length();
                pz40Var.setValue(new a8q0(strValueOf, s7n0.e(length, length), 4));
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    s1yVar = (s1y) value;
                    this.f.getClass();
                } while (!p7m0Var.m(value, s1y.a(s1yVar, null, ax6.a(s1yVar.d, null, dM, 0.0d, 0.0d, 13), false, false, 119)));
                return;
            }
            if (d1yVar.equals(a1y.f97a)) {
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
            if (!d1yVar.equals(b1y.f1829a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var3 = this.E;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                this.E = sac.T(new fnq(this.D.b(), new y1y(this, yjeVar, b2), (byte) 4), jiu0.a(this), new sax(b3, yjeVar, b3));
                return;
            }
            return;
        }
        a8q0 a8q0Var = ((x0y) d1yVar).f40094a;
        j83 j83Var = a8q0Var.f440a;
        if (j83Var.b.length() > 13) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = j83Var.b;
        int length2 = str.length();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
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
        ((s1y) D()).d.f1608a.setValue(a8q0VarB);
        H(new w1y(a8q0VarB, b));
    }
}
