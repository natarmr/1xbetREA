package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/w430;", "La/yx5;", "<init>", "()V", "a/u430", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w430 extends yx5 {
    public final i9o0 K1;
    public ndf0 L1;
    public vq M1;
    public e720 N1;
    public x430 O1;
    public qta0 P1;
    public ii Q1;
    public wdk0 R1;
    public lgn0 S1;
    public final s0r U1;
    public final a8z V1;
    public final boolean W1;
    public final khf0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(w430.class, "binding", "getBinding()Lorg/xplatform/sportgame/markets/base/impl/databinding/FragmentMarketsBinding;", 0), new ez40(w430.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;", 0)};
    public static final u430 Y1 = new u430();

    public w430() {
        super(R.layout.fragment_markets);
        this.K1 = i9o0.f14396a;
        this.U1 = ltt0.o(this, v430.f36760a);
        this.V1 = xbc.a0(this, sre0.f32672a.b(l830.class), null, new t430(this, (byte) 1), 14);
        this.W1 = true;
        this.X1 = new khf0("MARKETS_SCREEN_PARAMS_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.U1.n(Z1[0], this);
        objN.getClass();
        pkd.h(((x1r) objN).f40133a, new owp0(this), null, new ugd(-2071002826, true, new tx(this, (byte) 26)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // a.yx5
    public final void C0() {
        cb50 cb50VarV = efx.v(this);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(y430.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            y430 y430Var = (y430) (ze3Var instanceof y430 ? ze3Var : null);
            if (y430Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                for (?? r2 = this; r2 != 0; r2 = r2.y) {
                    if (r2 instanceof ocl0) {
                        ocl0 ocl0Var = (ocl0) r2;
                        for (?? r5 = this; r5 != 0; r5 = r5.y) {
                            if (r5 instanceof odf0) {
                                MarketsParams.StandardSubGame standardSubGame = (MarketsParams.StandardSubGame) this.X1.n(this, Z1[1]);
                                t430 t430Var = new t430(this, (byte) 0);
                                cb50VarV.getClass();
                                i1w0VarF.getClass();
                                pcl0 pcl0VarU = ocl0Var.u(t430Var);
                                cad cadVar = y430Var.f41983a;
                                wdk0 wdk0Var = y430Var.b;
                                lgn0 lgn0Var = y430Var.c;
                                pdf0 pdf0VarB = ((odf0) r5).b();
                                sue sueVar = y430Var.d;
                                m1e m1eVar = y430Var.e;
                                duj dujVar = y430Var.f;
                                ctf0 ctf0Var = y430Var.g;
                                wsf0 wsf0Var = y430Var.p;
                                gst0 gst0Var = y430Var.h;
                                btt0 btt0Var = y430Var.i;
                                b3c0 b3c0Var = y430Var.j;
                                j1q0 j1q0Var = y430Var.k;
                                r9u r9uVar = y430Var.l;
                                ndf0 ndf0Var = y430Var.M;
                                reu reuVar = y430Var.m;
                                rmd0 rmd0Var = y430Var.n;
                                ii iiVar = y430Var.o;
                                knf0 knf0Var = y430Var.q;
                                iip iipVar = y430Var.r;
                                iw20 iw20Var = y430Var.s;
                                fvt0 fvt0Var = y430Var.t;
                                onv onvVar = y430Var.u;
                                d1p d1pVar = y430Var.v;
                                drm0 drm0Var = y430Var.w;
                                v88 v88Var = y430Var.x;
                                onv onvVar2 = y430Var.y;
                                kt2 kt2Var = y430Var.z;
                                peg0 peg0Var = y430Var.A;
                                vwb0 vwb0Var = y430Var.B;
                                ouu ouuVar = y430Var.C;
                                jw20 jw20Var = y430Var.D;
                                cs00 cs00Var = y430Var.E;
                                edo edoVar = y430Var.F;
                                zfo zfoVar = y430Var.G;
                                u8u u8uVar = y430Var.H;
                                edu eduVar = y430Var.I;
                                bzu bzuVar = y430Var.J;
                                o2j0 o2j0Var = y430Var.K;
                                vqc vqcVar = y430Var.L;
                                qoi qoiVar = y430Var.N;
                                pcl0VarU.getClass();
                                sueVar.getClass();
                                rmd0Var.getClass();
                                iipVar.getClass();
                                d1pVar.getClass();
                                cs00Var.getClass();
                                qoiVar.getClass();
                                wdk0Var.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                gst0Var.getClass();
                                btt0Var.getClass();
                                b3c0Var.getClass();
                                j1q0Var.getClass();
                                r9uVar.getClass();
                                iiVar.getClass();
                                knf0Var.getClass();
                                kt2Var.getClass();
                                vwb0Var.getClass();
                                edoVar.getClass();
                                zfoVar.getClass();
                                o2j0Var.getClass();
                                hli hliVar = new hli(cadVar, pcl0VarU, sueVar, rmd0Var, iipVar, iw20Var, fvt0Var, onvVar, d1pVar, wsf0Var, onvVar2, jw20Var, drm0Var, pdf0VarB, bzuVar, qoiVar, o2j0Var, vqcVar, standardSubGame, i1w0VarF, wdk0Var, lgn0Var, dujVar, ctf0Var, gst0Var, j1q0Var, r9uVar, reuVar, iiVar, knf0Var, v88Var, kt2Var, peg0Var, ouuVar, edoVar, zfoVar, u8uVar, eduVar, ndf0Var);
                                this.L1 = ndf0Var;
                                vq vqVarW = sueVar.w();
                                x1x.x(vqVarW);
                                this.M1 = vqVarW;
                                this.N1 = ((ali) onvVar2.f25567a).z();
                                this.O1 = (x430) hliVar.I.get();
                                this.P1 = qoiVar.a();
                                this.Q1 = iiVar;
                                this.R1 = wdk0Var;
                                this.S1 = lgn0Var;
                                return;
                            }
                        }
                        jf4.n("Can't find feature provider!");
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(y430.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.V1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        G0().x(my20.f22586a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(ly20.f20845a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        vq vqVar = this.M1;
        yje yjeVar = null;
        if (vqVar == null) {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
        ii iiVar = this.Q1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        e720 e720Var = this.N1;
        if (e720Var == null) {
            Intrinsics.h("makeBetBottomSheetProvider");
            throw null;
        }
        lgn0 lgn0Var = this.S1;
        if (lgn0Var == null) {
            Intrinsics.h("successBetAlertManager");
            throw null;
        }
        wdk0 wdk0Var = this.R1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        qta0 qta0Var = this.P1;
        if (qta0Var == null) {
            Intrinsics.h("polybetRulesDialogFactory");
            throw null;
        }
        z430 z430Var = new z430(this, vqVar, iiVar, e720Var, lgn0Var, wdk0Var, qta0Var);
        z430Var.b(new zq2(), new r430(this, (byte) 0));
        gmq gmqVarC = ((i3t0) G0()).C();
        khx khxVar = new khx((Object) this, (Object) z430Var, yjeVar, (byte) 14);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new mw20((i89) gmqVarC, clzVarW, khxVar, (yje) null), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.W1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
