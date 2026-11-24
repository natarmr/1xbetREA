package a;

import android.javax.sip.message.Response;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class mh1 extends i3t0 {
    public static final String E0 = je1.class.getSimpleName();
    public final vd1 A;
    public bby A0;
    public final ix0 B;
    public bby B0;
    public final s91 C;
    public bby C0;
    public final erc D;
    public bby D0;
    public final hru E;
    public final edu F;
    public final zr1 G;
    public final pw70 H;
    public final qu I;
    public final kb0 J;
    public final moc K;
    public final roq0 L;
    public final tzi M;
    public final ctf0 N;
    public final ytt O;
    public final jh70 P;
    public final qyg0 Q;
    public final uzc0 R;
    public final pyg0 S;
    public final jlx T;
    public final duj U;
    public final u58 V;
    public final s64 W;
    public final kc60 X;
    public final oeg0 Y;
    public final jc0 Z;
    public final rpt a0;
    public final pmi b0;
    public final s31 c0;
    public final cyu d0;
    public final cmt e0;
    public bby f0;
    public bby g0;
    public bby h0;
    public bby i0;
    public final c4m0 j0;
    public final c4m0 k0;
    public bby l0;
    public bby m0;
    public bby n0;
    public final mne o;
    public bby o0;
    public final iqt p;
    public c4m0 p0;
    public final q0u q;
    public bby q0;
    public final g3j r;
    public bby r0;
    public final wti s;
    public bby s0;
    public final khf0 t;
    public bby t0;
    public final trm0 u;
    public bby u0;
    public final b8u v;
    public bby v0;
    public final o470 w;
    public bby w0;
    public final xmt x;
    public bby x0;
    public final pyt y;
    public bby y0;
    public final pwi z;
    public bby z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public mh1(mne mneVar, iqt iqtVar, ntu ntuVar, m1e m1eVar, q0u q0uVar, g3j g3jVar, wti wtiVar, khf0 khf0Var, trm0 trm0Var, b8u b8uVar, o470 o470Var, xmt xmtVar, pyt pytVar, pwi pwiVar, vd1 vd1Var, ix0 ix0Var, s91 s91Var, erc ercVar, jqt jqtVar, hru hruVar, edu eduVar, zr1 zr1Var, pw70 pw70Var, dmt dmtVar, qu quVar, kb0 kb0Var, moc mocVar, roq0 roq0Var, tzi tziVar, ctf0 ctf0Var, ytt yttVar, jh70 jh70Var, qyg0 qyg0Var, uzc0 uzc0Var, pyg0 pyg0Var, jlx jlxVar, duj dujVar, u58 u58Var, bzt bztVar, s64 s64Var, kc60 kc60Var, oeg0 oeg0Var, jc0 jc0Var, rpt rptVar, pmi pmiVar, s31 s31Var, cyu cyuVar, yfu yfuVar, pru pruVar, wiu wiuVar, cmt cmtVar) {
        m1eVar.getClass();
        s91Var.getClass();
        pw70Var.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        byte b = 11;
        yje yjeVar = null;
        super(new pg1((Object) pruVar, (Object) ntuVar, (Object) iqtVar, (Object) wiuVar, (Object) bztVar, (Object) dmtVar, (Object) yfuVar, (byte) 0), cvm0.p(vs10Var, mneVar.f22085a), new uc(ctf0Var, b), (yzn0) null);
        this.o = mneVar;
        this.p = iqtVar;
        this.q = q0uVar;
        this.r = g3jVar;
        this.s = wtiVar;
        this.t = khf0Var;
        this.u = trm0Var;
        this.v = b8uVar;
        this.w = o470Var;
        this.x = xmtVar;
        this.y = pytVar;
        this.z = pwiVar;
        this.A = vd1Var;
        this.B = ix0Var;
        this.C = s91Var;
        this.D = ercVar;
        this.E = hruVar;
        this.F = eduVar;
        this.G = zr1Var;
        this.H = pw70Var;
        this.I = quVar;
        this.J = kb0Var;
        this.K = mocVar;
        this.L = roq0Var;
        this.M = tziVar;
        this.N = ctf0Var;
        this.O = yttVar;
        this.P = jh70Var;
        this.Q = qyg0Var;
        this.R = uzc0Var;
        this.S = pyg0Var;
        this.T = jlxVar;
        this.U = dujVar;
        this.V = u58Var;
        this.W = s64Var;
        this.X = kc60Var;
        this.Y = oeg0Var;
        this.Z = jc0Var;
        this.a0 = rptVar;
        this.b0 = pmiVar;
        this.c0 = s31Var;
        this.d0 = cyuVar;
        this.e0 = cmtVar;
        c4m0 c4m0Var = this.j0;
        byte b2 = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.j0 = sac.T(new fnq(m1eVar.b(), new ug1(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new i8(2, this, mh1.class, "showError", "showError(Ljava/lang/Throwable;)V", 4, (byte) 12));
        }
        i3t0.F(this, kb0Var, null, new og1(this, b), new g20((byte) 29), 117);
        byte b3 = 0;
        sac.T(new fnq(dtb.z(i120.W(kc60Var.a()), 1), new vg1(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new i8(2, this, mh1.class, "showError", "showError(Ljava/lang/Throwable;)V", 4, (byte) 13));
        c4m0 c4m0Var2 = this.k0;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.k0 = sac.T(new fnq(jqtVar.a(), new ug1(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new pd(2, yjeVar, (byte) 6));
        }
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        i3t0.A(this, g3jVar, q2j.f28000a, dvjVar, null, 4);
        i3t0.F(this, jc0Var, null, null, new g20((byte) 27), 119);
        ercVar.a(true);
    }

    public final List M() {
        return q3d.j(this.q0, this.r0, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0, this.D0);
    }

    public final void N(ql5 ql5Var) {
        Object value;
        if (((pf1) D()).s != ql5Var.f28916a || (((pf1) D()).x instanceof hlc0)) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, pf1.a((pf1) value, null, 0, 0, false, ql5Var.f28916a, null, false, null, null, null, null, null, null, false, null, false, -524289, 15)));
            R();
        }
    }

    public final void O() {
        Object value;
        oyg0 oyg0Var;
        Object value2;
        yje yjeVar = null;
        byte b = 1;
        byte b2 = 3;
        byte b3 = 4;
        fnq fnqVar = new fnq(new p6d(this.b0.w(), this.X.a(), new kh1((Object) this, yjeVar, (byte) 0), b), new vg1(this, yjeVar, b2), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.o;
        sac.T(fnqVar, d5c.S(bvcVarA, mneVar.b), new vg1(this, yjeVar, b3));
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, pf1.a((pf1) value, null, 0, 0, false, 0L, null, false, null, null, null, null, null, null, false, null, false, -4194305, 15)));
        bby bbyVar = this.f0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.f0 = sac.V(jiu0.a(this), new og1(this, b3), null, mneVar.b, new jc1(this, yjeVar, b), 10);
        }
        byte b4 = 8;
        if (this.p.f15225a.a()) {
            bby bbyVar2 = this.h0;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.h0 = sac.V(jiu0.a(this), new og1(this, (byte) 2), null, mneVar.b, new ug1(this, yjeVar, (byte) 9), 10);
            }
            sac.V(jiu0.a(this), new og1(this, (byte) 6), null, mneVar.b, new ug1(this, yjeVar, (byte) 7), 10);
            R();
        } else {
            sac.V(jiu0.a(this), ih1.f14758a, null, mneVar.f22085a, new ug1(this, yjeVar, b4), 10);
            bby bbyVar3 = this.h0;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
        }
        if (!(((pf1) D()).B instanceof rtc0)) {
            if (((pf1) D()).k) {
                bby bbyVar4 = this.n0;
                if (bbyVar4 == null || !bbyVar4.isActive()) {
                    this.n0 = sac.V(jiu0.a(this), new og1(this, (byte) 5), null, mneVar.b, new lh1(this, null), 10);
                }
            } else {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, pf1.a((pf1) value2, null, 0, 0, false, 0L, null, false, null, null, null, stc0.f32767a, null, null, false, null, false, -268435457, 15)));
            }
        }
        if (((pf1) D()).m) {
            bby bbyVar5 = this.o0;
            if (bbyVar5 == null || !bbyVar5.isActive()) {
                this.o0 = sac.V(jiu0.a(this), new og1(this, b2), null, mneVar.b, new oa(this, yjeVar, b4), 10);
            }
        }
    }

    public final void P(d7v d7vVar) {
        this.v0 = bww.R(jiu0.a(this), this.v0, M(), this.o.b, ah1.f852a, null, new l1(this, d7vVar, null, (byte) 23), 40);
    }

    public final void Q() {
        this.w0 = bww.R(jiu0.a(this), this.w0, M(), this.o.b, ch1.f4341a, null, new ug1(this, null, (byte) 4), 40);
    }

    public final void R() {
        bby bbyVar = this.g0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.g0 = sac.V(jiu0.a(this), new og1(this, (byte) 8), new nc((Object) this, (byte) 20), this.o.b, new hh1(this, null), 8);
        }
    }

    public final void S(long j) {
        bby bbyVar = this.i0;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.i0 = sac.f0(jiu0.a(this), j, TimeUnit.SECONDS, this.o.b, new og1(this, b), new wg1(this, null, (byte) 3), 32);
        }
    }

    public final void T(Throwable th) {
        Object value;
        if (th != null) {
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, pf1.a((pf1) value, null, 0, 0, false, 0L, null, true, null, null, null, null, null, null, false, null, false, -4718593, 15)));
                return;
            }
            if (th instanceof jfp) {
                sac.V(jiu0.a(this), jh1.f16504a, null, this.o.f22085a, new wg1(this, null, (byte) 4), 10);
                return;
            }
        }
        this.U.b(th, new yr0(th, (byte) 6));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        pf1 pf1Var;
        ud1 ud1Var = (ud1) obj;
        ud1Var.getClass();
        super.x(ud1Var);
        if (ud1Var.equals(vc1.f37166a)) {
            E();
            return;
        }
        boolean zEquals = ud1Var.equals(wc1.f38903a);
        byte b = 2;
        yje yjeVar = null;
        mne mneVar = this.o;
        if (zEquals) {
            this.q0 = bww.R(jiu0.a(this), this.q0, M(), mneVar.b, null, null, new ug1(this, yjeVar, b), 56);
            return;
        }
        if (ud1Var.equals(yc1.f42364a)) {
            this.V.l("my_aggregator");
            y1p y1pVar = y1p.MAIN;
            this.W.c("my_aggregator");
            this.s0 = bww.R(jiu0.a(this), this.s0, M(), mneVar.b, fh1.f9522a, null, new ug1(this, yjeVar, (byte) 5), 40);
            return;
        }
        byte b2 = 1;
        if (ud1Var.equals(zc1.f44145a)) {
            this.t0 = bww.R(jiu0.a(this), this.t0, M(), mneVar.f22085a, null, null, new wg1(this, yjeVar, b2), 56);
            return;
        }
        if (ud1Var instanceof ad1) {
            this.m0 = bww.R(jiu0.a(this), this.m0, M(), mneVar.f22085a, null, null, new bh0(this, ((ad1) ud1Var).f655a, yjeVar, b), 56);
            return;
        }
        if (ud1Var instanceof cd1) {
            this.B0 = bww.R(jiu0.a(this), this.B0, M(), mneVar.f22085a, null, null, new yg1(this, ((cd1) ud1Var).f4138a, yjeVar, (byte) 0), 56);
            return;
        }
        if (ud1Var instanceof dd1) {
            this.C0 = bww.R(jiu0.a(this), this.C0, M(), mneVar.f22085a, null, null, new qa(this, ((dd1) ud1Var).f5872a, yjeVar, (byte) 19), 56);
            return;
        }
        if (ud1Var instanceof fd1) {
            P(d7v.b);
            return;
        }
        if (ud1Var.equals(jd1.f16306a)) {
            Q();
            return;
        }
        if (ud1Var.equals(kd1.f18083a)) {
            i3t0.A(this, this.J, eb0.f7494a, mneVar.b, null, 4);
            return;
        }
        if (ud1Var.equals(md1.f21574a)) {
            this.x0 = bww.R(jiu0.a(this), this.x0, M(), mneVar.b, gh1.f11276a, null, new ug1(this, yjeVar, (byte) 6), 40);
            return;
        }
        if (ud1Var instanceof rd1) {
            this.y0 = bww.R(jiu0.a(this), this.y0, M(), mneVar.f22085a, null, null, new qa(this, ((rd1) ud1Var).f30268a, yjeVar, (byte) 20), 56);
            return;
        }
        if (ud1Var.equals(sd1.f32012a)) {
            this.r0 = bww.R(jiu0.a(this), this.r0, M(), mneVar.b, null, null, new ug1(this, yjeVar, (byte) 3), 56);
            return;
        }
        if (ud1Var instanceof td1) {
            td1 td1Var = (td1) ud1Var;
            this.z0 = bww.R(jiu0.a(this), this.z0, M(), mneVar.b, dh1.f6071a, null, new eh1(this, td1Var.f33742a, td1Var.b, null), 40);
            return;
        }
        byte b3 = 0;
        if (ud1Var instanceof gd1) {
            I(mneVar.f22085a, new og1(this, b3), new uw(this, ((gd1) ud1Var).f11085a, yjeVar, (byte) 1));
            return;
        }
        if (ud1Var.equals(xc1.f40624a)) {
            this.A0 = bww.R(jiu0.a(this), this.A0, M(), mneVar.f22085a, null, null, new wg1(this, yjeVar, b3), 56);
            return;
        }
        boolean zEquals2 = ud1Var.equals(ld1.f19826a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                pf1Var = (pf1) value2;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, pf1.a(pf1Var, null, 0, 0, false, 0L, null, false, hlc0.f13252a, wuc0.f39786a, pf1Var.f, utc0.f36249a, null, null, false, null, false, -490733569, 15)));
            O();
            return;
        }
        if (ud1Var.equals(qd1.f28511a)) {
            this.Y.c().d(new og1(this, (byte) 9));
            return;
        }
        boolean zEquals3 = ud1Var.equals(pd1.f26784a);
        erc ercVar = this.D;
        if (zEquals3) {
            ercVar.a(true);
            if (!((pf1) D()).E) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, pf1.a((pf1) value, null, 0, 0, false, 0L, null, false, null, null, null, null, null, null, true, null, false, Integer.MAX_VALUE, 15)));
                S(0L);
            }
            O();
            return;
        }
        if (ud1Var.equals(od1.f25055a)) {
            ercVar.a(false);
            return;
        }
        if (ud1Var instanceof id1) {
            fvc0 fvc0Var = ((id1) ud1Var).f14560a;
            if (fvc0Var instanceof cvc0) {
                P(((cvc0) fvc0Var).f5024a);
                return;
            }
            if (fvc0Var instanceof dvc0) {
                Q();
                return;
            }
            if (fvc0Var instanceof evc0) {
                long j = ((evc0) fvc0Var).f8461a;
                i8i.D("screen", "aggregator_promo", this.A.f37210a, "tournaments_open");
                b1j.v("aggregator_promo", this.G.f44833a, 3329L);
                this.C.c(new AggregatorScreenModel(null, null, 0L, new sm1(j), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return;
            }
            return;
        }
        if (ud1Var instanceof hd1) {
            hd1 hd1Var = (hd1) ud1Var;
            kr5 kr5Var = hd1Var.f12847a;
            int i = hd1Var.b;
            bby bbyVar = this.m0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.m0 = sac.V(jiu0.a(this), new og1(this, (byte) 10), null, mneVar.b, new mc0(kr5Var, this, i, null), 10);
            return;
        }
        if (ud1Var instanceof nd1) {
            int i2 = ((nd1) ud1Var).f23319a;
            bby bbyVar2 = this.l0;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.l0 = sac.V(jiu0.a(this), new og1(this, (byte) 7), null, mneVar.b, new defpackage.e(this, i2, yjeVar, b2), 10);
            return;
        }
        if (ud1Var.equals(bd1.f2378a)) {
            this.u0 = bww.R(jiu0.a(this), this.u0, M(), mneVar.f22085a, null, null, new wg1(this, yjeVar, b), 56);
            return;
        }
        if (!(ud1Var instanceof ed1)) {
            t9f.b();
            return;
        }
        ed1 ed1Var = (ed1) ud1Var;
        this.D0 = bww.R(jiu0.a(this), this.D0, M(), mneVar.f22085a, null, null, new zg1(this, ed1Var.f7594a, ed1Var.b, null, (byte) 0), 56);
    }
}
