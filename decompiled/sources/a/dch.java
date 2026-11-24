package a;

import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dch extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final mne A;
    public c4m0 B;
    public c4m0 C;
    public bby D;
    public final bby E;
    public final CyberBottomSheetParams o;
    public final boolean p;
    public final b8u q;
    public final j910 r;
    public final dgu s;
    public final f7u t;
    public final rtu u;
    public final pru v;
    public final hjd w;
    public final lbu x;
    public final luu y;
    public final j3c z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dch(vzg0 vzg0Var, CyberBottomSheetParams cyberBottomSheetParams, boolean z, b8u b8uVar, j910 j910Var, dgu dguVar, f7u f7uVar, rtu rtuVar, pru pruVar, hjd hjdVar, lbu lbuVar, luu luuVar, j3c j3cVar, y78 y78Var, r9u r9uVar, ctf0 ctf0Var, mne mneVar) {
        r9uVar.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(new x3h((byte) 27), cvm0.p(vs10Var, rwjVar), new sw8((Object) ctf0Var, (Object) y78Var, (Object) r9uVar, (byte) 19), (yzn0) null);
        this.o = cyberBottomSheetParams;
        this.p = z;
        this.q = b8uVar;
        this.r = j910Var;
        this.s = dguVar;
        this.t = f7uVar;
        this.u = rtuVar;
        this.v = pruVar;
        this.w = hjdVar;
        this.x = lbuVar;
        this.y = luuVar;
        this.z = j3cVar;
        this.A = mneVar;
        i3t0.K(this, null, null, new pn(this, null, (byte) 19), 3);
        i3t0.K(this, rwjVar, null, new xg0((i3t0) this, (yje) null, (byte) 7), 2);
        bby bbyVar = this.E;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.E = i3t0.F(this, hjdVar, null, null, new p1h((byte) 6), 119);
    }

    public final void M(RelatedParams relatedParams) {
        bby bbyVar = this.D;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.D = sac.V(jiu0.a(this), new hfg(this, (byte) 16), null, this.A.f22085a, new ybh(this, relatedParams, null, (byte) 0), 10);
    }

    public final void N(RelatedParams relatedParams) {
        bby bbyVar = this.D;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.D = sac.V(jiu0.a(this), new v4f(this, relatedParams, (byte) 28), null, this.A.f22085a, new ybh(this, relatedParams, null, (byte) 1), 10);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void x(qbh qbhVar) {
        Object value;
        gmq eu4Var;
        Object value2;
        Object value3;
        Object value4;
        qbhVar.getClass();
        super.x(qbhVar);
        boolean z = qbhVar instanceof nbh;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            nbh nbhVar = (nbh) qbhVar;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, ubh.a((ubh) value4, nbhVar.f23239a, false, null, null, false, false, null, null, null, 510)));
            return;
        }
        byte b = 1;
        if (qbhVar instanceof kbh) {
            H(new yfg((kbh) qbhVar, b));
            return;
        }
        byte b2 = 5;
        byte b3 = 3;
        yje yjeVar = null;
        if (qbhVar instanceof ibh) {
            ibh ibhVar = (ibh) qbhVar;
            i3t0.K(this, null, null, new ffd(this, ibhVar, yjeVar, b2), 3);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, ubh.a((ubh) value3, null, false, tbh.c, ibhVar.f14486a, false, false, null, null, null, 499)));
            return;
        }
        if (qbhVar instanceof hbh) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, ubh.a((ubh) value2, null, false, tbh.d, null, false, false, null, null, null, 507)));
            return;
        }
        if (qbhVar instanceof mbh) {
            c4m0 c4m0Var = this.B;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            b8u b8uVar = this.q;
            fnq fnqVar = new fnq(b8uVar.d(), new ach(this, yjeVar, (byte) 0), (byte) 4);
            bvc bvcVarA = jiu0.a(this);
            mne mneVar = this.A;
            sje sjeVarS = d5c.S(bvcVarA, mneVar.f22085a);
            foe foeVar = foe.h;
            this.B = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var2 = this.C;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            if (this.p) {
                j910 j910Var = this.r;
                eu4Var = i120.W(aoq.c(new m430(((b8u) j910Var.b).d(), j910Var, (byte) 5), new za60(yjeVar, j910Var, b3)));
            } else {
                eu4Var = new eu4(Boolean.FALSE, (byte) 12);
            }
            this.C = sac.T(new fnq(i120.W(new p6d(i120.W(eu4Var), i120.W(new a1g(b8uVar.d(), this, (byte) 3)), new y0g(3, (yje) null, (byte) 2), (byte) 1)), new ach(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foeVar);
            return;
        }
        if (qbhVar instanceof lbh) {
            c4m0 c4m0Var3 = this.B;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            c4m0 c4m0Var4 = this.C;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            bby bbyVar = this.D;
            if (bbyVar != null) {
                e3c.n(bbyVar);
                return;
            }
            return;
        }
        if (qbhVar instanceof jbh) {
            E();
            return;
        }
        if (qbhVar instanceof obh) {
            i3t0.A(this, this.w, ((obh) qbhVar).f24978a, null, null, 6);
            return;
        }
        if (!(qbhVar instanceof pbh)) {
            t9f.b();
            return;
        }
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value = p7m0Var4.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var4.m(value, ubh.a((ubh) value, null, false, tbh.b, null, false, false, null, null, null, 507)));
        RelatedParams relatedParams = ((ubh) D()).f35380a;
        if (relatedParams != null) {
            N(relatedParams);
        }
    }

    public final RelatedParams P(jlr jlrVar) {
        if (jlrVar == null) {
            return null;
        }
        if (jlrVar instanceof xkr) {
            m9s m9sVar = ((xkr) jlrVar).d;
            return new RelatedParams(m9sVar.x, m9sVar.f21426a, m9sVar.A, ozb.N(m9sVar.o, m9sVar.p), m9sVar.o, m9sVar.p);
        }
        if (!(jlrVar instanceof clr)) {
            return null;
        }
        CyberBottomSheetParams cyberBottomSheetParams = this.o;
        return new RelatedParams(cyberBottomSheetParams.c, cyberBottomSheetParams.f46506a, cyberBottomSheetParams.f, ozb.N(cyberBottomSheetParams.d, cyberBottomSheetParams.e), cyberBottomSheetParams.d, cyberBottomSheetParams.e);
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.B;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        c4m0 c4m0Var2 = this.C;
        if (c4m0Var2 != null) {
            e3c.n(c4m0Var2);
        }
        bby bbyVar = this.D;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        bby bbyVar2 = this.E;
        if (bbyVar2 != null) {
            e3c.n(bbyVar2);
        }
    }
}
