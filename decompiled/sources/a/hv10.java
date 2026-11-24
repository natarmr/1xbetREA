package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La/hv10;", "La/yx5;", "La/ia50;", "La/tgn0;", "La/d9o0;", "<init>", "()V", "a/atz", Payload.TYPE_APP}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hv10 extends yx5 implements ia50, tgn0, d9o0 {
    public ski K1;
    public s9m0 L1;
    public final kiu0 M1;
    public ndk0 N1;
    public final s0r O1;
    public final boolean P1;
    public wxs0 Q1;
    public ii R1;
    public wdk0 S1;
    public r12 U1;
    public lao0 V1;
    public long W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(hv10.class, "binding", "getBinding()Lorg/xplatform/client1/databinding/FragmentApplicationBinding;", 0)};
    public static final atz X1 = new atz();

    public hv10() {
        super(R.layout.fragment_application);
        be00 be00Var = new be00(new cv10(this, (byte) 1), (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 27), (byte) 28));
        this.M1 = agc.G(this, sre0.f32672a.b(w220.class), new j210(a8zVarA, (byte) 18), new j210(a8zVarA, (byte) 19), be00Var);
        this.O1 = ltt0.o(this, fv10.f10192a);
        this.P1 = true;
        this.W1 = -1L;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        w220 w220VarI0 = I0();
        yje yjeVar = null;
        w220VarI0.w(new epp(w220VarI0, yjeVar, (byte) 16));
        if (bundle == null) {
            w220 w220VarI1 = I0();
            sac.V(jiu0.a(w220VarI1), m220.f21036a, null, null, new o120(w220VarI1, yjeVar, (byte) 13), 14);
        }
        if (this.Q1 == null) {
            Intrinsics.h("userAgreementFeature");
            throw null;
        }
        byte b = 1;
        F().u0("USER_AGREEMENT_DIALOG_REQUEST_KEY", this, new dv10(this, b));
        dem0.q(n0().r(), ghn0.b, this, new ev10(this, (byte) 0));
        dem0.q(n0().r(), ghn0.f11308a, this, new ev10(this, b));
        dem0.q(n0().r(), ghn0.c, this, new ev10(this, (byte) 2));
        lao0 lao0Var = this.V1;
        if (lao0Var != null) {
            H0().b.setTabBarDSModel(lao0Var);
        }
        H0().b.setOnTabClickListener(new km00(this, (byte) 11));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ks10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ks10 ks10Var = (ks10) (ze3Var instanceof ks10 ? ze3Var : null);
            if (ks10Var != null) {
                a4n0.f(this).getClass();
                y3v y3vVar = ks10Var.u1;
                z4u z4uVar = ks10Var.v1;
                e6e e6eVar = ks10Var.f18793a;
                gr70 gr70Var = ks10Var.X0;
                hru hruVar = ks10Var.b;
                bwl bwlVar = ks10Var.c;
                zx10 zx10Var = ks10Var.d;
                onv onvVar = ks10Var.e;
                nr00 nr00Var = ks10Var.g;
                ljf0 ljf0Var = ks10Var.f;
                ort ortVar = ks10Var.h;
                eqx eqxVar = ks10Var.i;
                rjo rjoVar = ks10Var.j;
                ugf0 ugf0Var = ks10Var.k;
                zx10 zx10Var2 = ks10Var.l;
                v6j0 v6j0Var = ks10Var.m;
                hs00 hs00Var = ks10Var.n;
                ii iiVar = ks10Var.x0;
                c5k c5kVar = ks10Var.o;
                kt2 kt2Var = ks10Var.p;
                wsf0 wsf0Var = ks10Var.t0;
                ag3 ag3Var = ks10Var.q;
                rv3 rv3Var = ks10Var.r;
                v88 v88Var = ks10Var.s;
                lsn lsnVar = ks10Var.r0;
                ouu ouuVar = ks10Var.t;
                iqt iqtVar = ks10Var.u;
                lbu lbuVar = ks10Var.v;
                qv2 qv2Var = ks10Var.w;
                kut kutVar = ks10Var.x;
                nv20 nv20Var = ks10Var.y;
                kj5 kj5Var = ks10Var.z;
                gle0 gle0Var = ks10Var.A;
                o2j0 o2j0Var = ks10Var.j0;
                mne mneVar = ks10Var.B;
                vqc vqcVar = ks10Var.C;
                eyg0 eyg0Var = ks10Var.D;
                h760 h760Var = ks10Var.E;
                bj5 bj5Var = ks10Var.F;
                oct octVar = ks10Var.G;
                fvt0 fvt0Var = ks10Var.s0;
                std stdVar = ks10Var.H;
                j1q0 j1q0Var = ks10Var.I;
                r9u r9uVar = ks10Var.J;
                pru pruVar = ks10Var.K;
                duj dujVar = ks10Var.L;
                fhj fhjVar = ks10Var.M;
                jlx jlxVar = ks10Var.N;
                grj grjVar = ks10Var.O;
                zn00 zn00Var = ks10Var.P;
                qu quVar = ks10Var.Q;
                yox yoxVar = ks10Var.R;
                ctf0 ctf0Var = ks10Var.S;
                jw20 jw20Var = ks10Var.T;
                s2m0 s2m0Var = ks10Var.U;
                jcu jcuVar = ks10Var.V;
                ix0 ix0Var = ks10Var.W;
                gw60 gw60Var = ks10Var.X;
                us00 us00Var = ks10Var.Z;
                ntu ntuVar = ks10Var.Y;
                fvt0 fvt0Var2 = ks10Var.a0;
                peg0 peg0Var = ks10Var.b0;
                onv onvVar2 = ks10Var.c0;
                dq00 dq00Var = ks10Var.d0;
                g2v g2vVar = ks10Var.e0;
                rpc rpcVar = ks10Var.f0;
                art artVar = ks10Var.g0;
                wxs0 wxs0Var = ks10Var.h0;
                rou rouVar = ks10Var.i0;
                drm0 drm0Var = ks10Var.k0;
                ik4 ik4Var = ks10Var.l0;
                s64 s64Var = ks10Var.m0;
                nr nrVar = ks10Var.n0;
                ugf0 ugf0Var2 = ks10Var.o0;
                cge0 cge0Var = ks10Var.p0;
                clc clcVar = ks10Var.q0;
                pmi0 pmi0Var = ks10Var.u0;
                zx10 zx10Var3 = ks10Var.v0;
                ytt yttVar = ks10Var.w0;
                sue sueVar = ks10Var.y0;
                he1 he1Var = ks10Var.z0;
                nh70 nh70Var = ks10Var.A0;
                roi0 roi0Var = ks10Var.B0;
                nr00 nr00Var2 = ks10Var.C0;
                iip iipVar = ks10Var.D0;
                wsf0 wsf0Var2 = ks10Var.E0;
                m1e m1eVar = ks10Var.H0;
                fvt0 fvt0Var3 = ks10Var.F0;
                onv onvVar3 = ks10Var.G0;
                wdk0 wdk0Var = ks10Var.I0;
                a1d a1dVar = ks10Var.J0;
                eke0 eke0Var = ks10Var.K0;
                nek nekVar = ks10Var.L0;
                ivn ivnVar = ks10Var.M0;
                v6k v6kVar = ks10Var.N0;
                bb6 bb6Var = ks10Var.O0;
                mi70 mi70Var = ks10Var.P0;
                p12 p12Var = ks10Var.Q0;
                rqt rqtVar = ks10Var.S0;
                s9m0 s9m0Var = ks10Var.R0;
                lp4 lp4Var = ks10Var.T0;
                poq0 poq0Var = ks10Var.U0;
                qxg0 qxg0Var = ks10Var.W0;
                cr crVar = ks10Var.V0;
                wdd0 wdd0Var = ks10Var.Y0;
                pmi pmiVar = ks10Var.Z0;
                ouu ouuVar2 = ks10Var.a1;
                gg5 gg5Var = ks10Var.b1;
                pyu pyuVar = ks10Var.c1;
                jru jruVar = ks10Var.d1;
                onv onvVar4 = ks10Var.e1;
                xsu xsuVar = ks10Var.f1;
                x20 x20Var = ks10Var.g1;
                mii0 mii0Var = ks10Var.h1;
                roi0 roi0Var2 = ks10Var.i1;
                xuz xuzVar = ks10Var.j1;
                pyg pygVar = ks10Var.k1;
                qho qhoVar = ks10Var.l1;
                s1p s1pVar = ks10Var.m1;
                nvu nvuVar = ks10Var.n1;
                lk5 lk5Var = ks10Var.o1;
                evz evzVar = ks10Var.p1;
                yk5 yk5Var = ks10Var.q1;
                qgd qgdVar = ks10Var.r1;
                lef0 lef0Var = ks10Var.s1;
                wsf0 wsf0Var3 = ks10Var.t1;
                h3c h3cVar = ks10Var.w1;
                nr00 nr00Var3 = ks10Var.x1;
                hn4 hn4Var = ks10Var.y1;
                dpc dpcVar = ks10Var.z1;
                ani0 ani0Var = ks10Var.A1;
                ba50 ba50Var = ks10Var.B1;
                oeg0 oeg0Var = ks10Var.C1;
                eb50 eb50Var = ks10Var.D1;
                lbu lbuVar2 = ks10Var.E1;
                bzu bzuVar = ks10Var.F1;
                n4u n4uVar = ks10Var.G1;
                kys0 kys0Var = ks10Var.H1;
                fsd fsdVar = ks10Var.I1;
                e6eVar.getClass();
                gr70Var.getClass();
                lp4Var.getClass();
                sueVar.getClass();
                o2j0Var.getClass();
                iipVar.getClass();
                wdd0Var.getClass();
                pygVar.getClass();
                iiVar.getClass();
                v6j0Var.getClass();
                kt2Var.getClass();
                rv3Var.getClass();
                h760Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                s1pVar.getClass();
                hn4Var.getClass();
                ba50Var.getClass();
                oeg0Var.getClass();
                eb50Var.getClass();
                fsdVar.getClass();
                this.K1 = (ski) new tki(e6eVar, hruVar, nr00Var3, bwlVar, zx10Var, onvVar, nr00Var, ljf0Var, drm0Var, ugf0Var2, cge0Var, clcVar, yoxVar, zx10Var3, nv20Var, sueVar, wsf0Var, he1Var, nh70Var, roi0Var, o2j0Var, fvt0Var3, onvVar3, nr00Var2, a1dVar, nekVar, eke0Var, iipVar, wsf0Var2, ivnVar, v6kVar, p12Var, rqtVar, lp4Var, poq0Var, gr70Var, lsnVar, wdd0Var, pyuVar, jruVar, onvVar4, xsuVar, roi0Var2, xuzVar, pygVar, evzVar, lef0Var, wsf0Var3, hn4Var, bzuVar, y3vVar, iiVar, ortVar, eqxVar, rjoVar, ugf0Var, zx10Var2, v6j0Var, hs00Var, c5kVar, kt2Var, ag3Var, rv3Var, v88Var, ouuVar, iqtVar, lbuVar, qv2Var, kutVar, kj5Var, gle0Var, mneVar, vqcVar, eyg0Var, h760Var, bj5Var, octVar, fvt0Var, stdVar, r9uVar, pruVar, dujVar, fhjVar, jlxVar, grjVar, zn00Var, quVar, ctf0Var, jw20Var, s2m0Var, jcuVar, ix0Var, gw60Var, us00Var, fvt0Var2, peg0Var, ntuVar, onvVar2, dq00Var, g2vVar, rpcVar, artVar, wxs0Var, rouVar, ik4Var, s64Var, nrVar, pmi0Var, yttVar, m1eVar, wdk0Var, bb6Var, mi70Var, s9m0Var, qxg0Var, crVar, pmiVar, ouuVar2, gg5Var, x20Var, mii0Var, qhoVar, s1pVar, nvuVar, lk5Var, yk5Var, z4uVar, qgdVar, h3cVar, dpcVar, ani0Var, ba50Var, oeg0Var, eb50Var, lbuVar2, n4uVar, kys0Var, fsdVar).w1.get();
                this.L1 = new s9m0();
                this.Q1 = wxs0Var;
                this.R1 = iiVar;
                this.S1 = wdk0Var;
                r12 r12Var = (r12) ((p12) p12Var.b).b;
                x1x.x(r12Var);
                this.U1 = r12Var;
                return;
            }
        }
        jf4.n(b1j.i(ks10.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = I0().y1;
        yje yjeVar = null;
        z210 z210Var = new z210(this, yjeVar, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cm10(ol60Var, clzVarW, z210Var, (yje) null), 3);
        ol60 ol60Var2 = I0().x1;
        byte b = 0;
        gv10 gv10Var = new gv10(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cm10(ol60Var2, clzVarW2, gv10Var, (yje) null), 3);
        p7m0 p7m0Var = I0().B1;
        int i = 4;
        Class<hv10> cls = hv10.class;
        dm10 dm10Var = new dm10(2, this, cls, "tabBarStateHandle", "tabBarStateHandle(Lorg/xplatform/client1/features/main/TabBarState;)V", i, (byte) 11);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new cm10(p7m0Var, clzVarW3, dm10Var, (yje) null), 3);
        w220 w220VarI0 = I0();
        ewt ewtVar = new ewt(new fnq(((qe50) w220VarI0.s.b).f28566a, new x120(w220VarI0, yjeVar, b), (byte) 4), w220VarI0, (byte) 23);
        dm10 dm10Var2 = new dm10(2, this, cls, "setCurrentTab", "setCurrentTab(Lorg/xplatform/client1/features/main/MainTabState;)V", i, (byte) 12);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new cm10(ewtVar, clzVarW4, dm10Var2, (yje) null), 3);
        p7m0 p7m0Var2 = I0().z1;
        dm10 dm10Var3 = new dm10(2, this, cls, "betSlipState", "betSlipState(Lorg/xplatform/client1/features/main/BetSlipState;)V", i, (byte) 13);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new cm10((gmq) p7m0Var2, clzVarW5, dm10Var3, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = ((xkn) ((rrc) I0().g0.b).b).f41036a;
        slx slxVar = new slx(this, yjeVar, (byte) 28);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new cm10(p7m0Var3, clzVarW6, slxVar, (yje) null), 3);
        p7m0 p7m0Var4 = I0().l0.Z;
        gv10 gv10Var2 = new gv10(this, yjeVar, (byte) 1);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new cm10(p7m0Var4, clzVarW7, gv10Var2, (yje) null), 3);
        w220 w220VarI1 = I0();
        ltb ltbVarB = aoq.b(w220VarI1.A1, w220VarI1.l0.a0);
        gv10 gv10Var3 = new gv10(this, yjeVar, (byte) 2);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new cm10(ltbVarB, clzVarW8, gv10Var3, (yje) null), 3);
    }

    public final sao0 G0() {
        Object objPrevious;
        List listP = C().c.p();
        listP.getClass();
        ListIterator listIterator = listP.listIterator(listP.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            Fragment fragment = (Fragment) objPrevious;
            if ((fragment instanceof sao0) && ((sao0) fragment).S()) {
                break;
            }
        }
        Fragment fragment2 = (Fragment) objPrevious;
        if (fragment2 == null || !(fragment2 instanceof sao0)) {
            return null;
        }
        return (sao0) fragment2;
    }

    public final byq H0() {
        Object objN = this.O1.n(Y1[0], this);
        objN.getClass();
        return (byq) objN;
    }

    public final w220 I0() {
        return (w220) this.M1.getValue();
    }

    public final void J0(cb50 cb50Var) {
        androidx.fragment.app.e eVarC;
        sao0 sao0VarG0 = G0();
        if (sao0VarG0 != null) {
            sao0VarG0.C().I(R.id.container);
        }
        w220 w220VarI0 = I0();
        sao0 sao0VarG1 = G0();
        w220VarI0.w(new gc4(w220VarI0, cb50Var, (sao0VarG1 == null || (eVarC = sao0VarG1.C()) == null) ? 0 : eVarC.P(), null, (byte) 4));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        byte b = 0;
        if (bundle == null) {
            ouu ouuVar = I0().s;
            ConcurrentHashMap concurrentHashMap = ((hr00) ouuVar.c).b.b;
            Collection collectionValues = concurrentHashMap.values();
            collectionValues.getClass();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                i1w0 i1w0Var = ((ejc) it.next()).f7902a;
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, v0w0.f36602a), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            }
            concurrentHashMap.clear();
            ((qe50) ouuVar.b).f28566a.n(qe50.c);
        }
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new dv10(this, b));
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        w220 w220VarI0 = I0();
        bby bbyVar = w220VarI0.i1;
        if (bbyVar != null) {
            if (!bbyVar.isActive()) {
                bbyVar = null;
            }
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
        }
        if (w220VarI0.c1.f.e) {
            j400 j400Var = (j400) w220VarI0.W.b;
            bby bbyVar2 = j400Var.g;
            if (bbyVar2 != null && bbyVar2.isActive()) {
                j400Var.i = ((wen) l1e0.h(new wen(wen.k(j400Var.i, plq0.b(j400Var.k.f27198a))), new wen(ibc.w0(1L, bfn.MILLISECONDS)), new wen(ibc.w0(300L, bfn.SECONDS)))).f39026a;
                bby bbyVar3 = j400Var.g;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                j400Var.g = null;
            }
            bby bbyVar4 = j400Var.h;
            if (bbyVar4 != null && bbyVar4.isActive()) {
                j400Var.j = ((wen) l1e0.h(new wen(wen.k(j400Var.j, plq0.b(j400Var.l.f27198a))), new wen(ibc.w0(1L, bfn.MILLISECONDS)), new wen(ibc.w0(30L, bfn.SECONDS)))).f39026a;
                bby bbyVar5 = j400Var.h;
                if (bbyVar5 != null) {
                    bbyVar5.cancel(null);
                }
                j400Var.h = null;
            }
        }
        bby bbyVar6 = w220VarI0.l1;
        if (bbyVar6 != null) {
            if (!bbyVar6.isActive()) {
                bbyVar6 = null;
            }
            if (bbyVar6 != null) {
                bbyVar6.cancel(null);
            }
        }
        gu90 gu90Var = w220VarI0.A0;
        sje sjeVar = gu90Var.g;
        if (sjeVar != null) {
            d5c.G(sjeVar, null);
        }
        gu90Var.g = null;
        v3c.N(w220VarI0.m1);
        bby bbyVar7 = w220VarI0.h1;
        if (bbyVar7 != null) {
            if (!bbyVar7.isActive()) {
                bbyVar7 = null;
            }
            if (bbyVar7 != null) {
                bbyVar7.cancel(null);
            }
        }
        c4m0 c4m0Var = w220VarI0.s1;
        if (c4m0Var != null) {
            if (!c4m0Var.isActive()) {
                c4m0Var = null;
            }
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        w220 w220VarI0 = I0();
        w220VarI0.I();
        bby bbyVar = w220VarI0.n1;
        if (bbyVar == null || !bbyVar.isActive()) {
            w220VarI0.n1 = sac.V(jiu0.a(w220VarI0), g220.f10541a, null, null, new o120(w220VarI0, null, (byte) 10), 14);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        w220 w220VarI0 = I0();
        c4m0 c4m0Var = w220VarI0.e1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            w220VarI0.e1 = sac.T(new fnq(i120.W(new h2c(w220VarI0.U0.f2242a, (byte) 17)), new o120(w220VarI0, null, (byte) 11), (byte) 4), d5c.S(jiu0.a(w220VarI0), w220VarI0.C.c), foe.h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        v3c.N(I0().e1);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        qcc.X(this, new cv10(this, (byte) 0));
    }

    @Override // a.d9o0
    public final void m(int i) {
        FrameLayout frameLayout = H0().f3431a;
        TypedValue typedValue = j5d.f15927a;
        frameLayout.setBackgroundColor(j5d.a(o0(), i, false));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.P1;
    }
}
