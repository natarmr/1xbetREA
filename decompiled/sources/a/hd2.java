package a;

import android.gov.nist.core.LexerCore;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class hd2 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final mne o;
    public final vzg0 p;
    public final nvu q;
    public final i1w0 r;
    public final gle0 s;
    public final duj t;
    public final m1e u;
    public final xfu v;
    public final eyg0 w;
    public bby x;
    public c4m0 y;

    public hd2(mne mneVar, vzg0 vzg0Var, nvu nvuVar, g2v g2vVar, i1w0 i1w0Var, gle0 gle0Var, ctf0 ctf0Var, duj dujVar, m1e m1eVar, pru pruVar, xfu xfuVar, eyg0 eyg0Var) {
        wb2 wb2Var = new wb2(pruVar, vzg0Var, g2vVar, (byte) 1);
        uc ucVar = new uc(ctf0Var, (byte) 20);
        rwj rwjVar = mneVar.f22085a;
        super(null, wb2Var, ucVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = mneVar;
        this.p = vzg0Var;
        this.q = nvuVar;
        this.r = i1w0Var;
        this.s = gle0Var;
        this.t = dujVar;
        this.u = m1eVar;
        this.v = xfuVar;
        this.w = eyg0Var;
        i3t0.K(this, null, null, new pn(this, null, (byte) 6), 3);
    }

    public final void M() {
        e3c.n(this.x);
        this.x = i3t0.K(this, null, new m51(this, (byte) 17), new m91(this, null, (byte) 1), 1);
    }

    public final void N() {
        e3c.n(this.y);
        this.y = sac.T(new fnq(this.u.b(), new pa((Object) this, (yje) null, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), this.o.b), new gd2(this, null, (byte) 1));
    }

    @Override // a.diu0
    public final void v() {
        chf0 chf0Var = qx40.f29464a;
        qx40.a(hd2.class.getSimpleName());
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        vc2 vc2Var = (vc2) obj;
        vc2Var.getClass();
        super.x(vc2Var);
        if (vc2Var instanceof mc2) {
            mc2 mc2Var = (mc2) vc2Var;
            if (mc2Var.equals(kc2.f18038a)) {
                N();
                return;
            }
            if (mc2Var.equals(lc2.f19779a)) {
                e3c.n(this.y);
                e3c.n(this.x);
                return;
            } else if (mc2Var.equals(jc2.f16255a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(vc2Var instanceof uc2)) {
            t9f.b();
            return;
        }
        uc2 uc2Var = (uc2) vc2Var;
        boolean z2 = uc2Var instanceof oc2;
        byte b = 18;
        i1w0 i1w0Var = this.r;
        if (z2) {
            i1w0Var.d(new df1(this, cui0.b(Long.valueOf(((oc2) uc2Var).f25008a)), b));
            return;
        }
        boolean z3 = uc2Var instanceof tc2;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.p;
        if (z3) {
            G(new xc2(true));
            long j = ((tc2) uc2Var).f33698a;
            LinkedHashSet linkedHashSetE = ((ad2) D()).b.contains(Long.valueOf(j)) ? eui0.e(((ad2) D()).b, Long.valueOf(j)) : eui0.h(((ad2) D()).b, Long.valueOf(j));
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, ad2.a((ad2) value5, null, linkedHashSetE, false, false, false, false, null, LexerCore.ID_NO_WHITESPACE)));
            vzg0Var.e("SAVED_SELECTED_SPORTS_IDS_KEY", linkedHashSetE);
            return;
        }
        if (uc2Var.equals(rc2.f30218a)) {
            M();
            return;
        }
        if (uc2Var instanceof nc2) {
            jtl jtlVar = ((nc2) uc2Var).f23270a;
            if (jtlVar.equals(sh00.b)) {
                i1w0Var.d(new df1(this, ((ad2) D()).b, b));
                return;
            } else {
                if (jtlVar.equals(sh00.f32186a)) {
                    G(new xc2(false));
                    return;
                }
                return;
            }
        }
        if (uc2Var instanceof sc2) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, ad2.a((ad2) value4, null, null, false, false, false, false, ((sc2) uc2Var).f31966a, 3583)));
            return;
        }
        if (uc2Var.equals(qc2.f28467a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, ad2.a((ad2) value3, null, null, false, true, false, false, null, 4079)));
            M();
            return;
        }
        if (!(uc2Var instanceof pc2)) {
            t9f.b();
            return;
        }
        boolean z4 = ((pc2) uc2Var).f26737a;
        this.w.n(z4);
        if (z4) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, ad2.a((ad2) value2, null, null, z4, false, false, false, null, 4091)));
            return;
        }
        p7m0 p7m0Var5 = ocjVar.f25029a;
        do {
            value = p7m0Var5.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var5.m(value, ad2.a((ad2) value, null, xun.f41520a, false, false, false, false, null, 4089)));
        vzg0Var.e("SAVED_SELECTED_SPORTS_IDS_KEY", null);
    }
}
