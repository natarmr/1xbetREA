package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.base.api.navigation.MarketsParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lhx;", "La/yx5;", "<init>", "()V", "a/ihx", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lhx extends yx5 {
    public final i9o0 K1;
    public ndf0 L1;
    public vq M1;
    public e720 N1;
    public ii O1;
    public qta0 P1;
    public wdk0 Q1;
    public lgn0 R1;
    public ogx S1;
    public final s0r U1;
    public final a8z V1;
    public final boolean W1;
    public final khf0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(lhx.class, "binding", "getBinding()Lorg/xplatform/sportgame/markets/insights/impl/databinding/FragmentInsightsMarketsBinding;", 0), new ez40(lhx.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;", 0)};
    public static final ihx Y1 = new ihx();

    public lhx() {
        super(R.layout.fragment_insights_markets);
        this.K1 = i9o0.f14396a;
        this.U1 = ltt0.o(this, jhx.f16549a);
        this.V1 = xbc.a0(this, sre0.f32672a.b(dix.class), null, new hhx(this, (byte) 1), 14);
        this.W1 = true;
        this.X1 = new khf0("INSIGHTS_MARKETS_SCREEN_PARAMS_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        vq vqVar = this.M1;
        yje yjeVar = null;
        if (vqVar == null) {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
        ii iiVar = this.O1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        e720 e720Var = this.N1;
        if (e720Var == null) {
            Intrinsics.h("makeBetBottomSheetProvider");
            throw null;
        }
        lgn0 lgn0Var = this.R1;
        if (lgn0Var == null) {
            Intrinsics.h("successBetAlertManager");
            throw null;
        }
        wdk0 wdk0Var = this.Q1;
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
        z430Var.b(new br2(), new ghx(this, (byte) 0));
        gmq gmqVarC = ((i3t0) G0()).C();
        khx khxVar = new khx((Object) this, (Object) z430Var, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w((i89) gmqVarC, clzVarW, khxVar, (yje) null), 3);
        Object objN = this.U1.n(Z1[0], this);
        objN.getClass();
        pkd.h(((u0r) objN).f34868a, new owp0(this), null, new ugd(-54880330, true, new tx(this, (byte) 22)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.fragment.app.Fragment] */
    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pgx.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pgx pgxVar = (pgx) (ze3Var instanceof pgx ? ze3Var : null);
            if (pgxVar != null) {
                MarketsParams.InsightsSubGame insightsSubGame = (MarketsParams.InsightsSubGame) this.X1.n(this, Z1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                for (?? r1 = this; r1 != 0; r1 = r1.y) {
                    if (r1 instanceof ocl0) {
                        ocl0 ocl0Var = (ocl0) r1;
                        for (?? r4 = this; r4 != 0; r4 = r4.y) {
                            if (r4 instanceof odf0) {
                                hhx hhxVar = new hhx(this, (byte) 0);
                                i1w0VarF.getClass();
                                cad cadVar = pgxVar.f26972a;
                                pcl0 pcl0VarU = ocl0Var.u(hhxVar);
                                qoi qoiVar = pgxVar.M;
                                wdk0 wdk0Var = pgxVar.b;
                                lgn0 lgn0Var = pgxVar.c;
                                sue sueVar = pgxVar.d;
                                m1e m1eVar = pgxVar.e;
                                duj dujVar = pgxVar.f;
                                ctf0 ctf0Var = pgxVar.g;
                                gst0 gst0Var = pgxVar.h;
                                btt0 btt0Var = pgxVar.i;
                                b3c0 b3c0Var = pgxVar.j;
                                j1q0 j1q0Var = pgxVar.k;
                                r9u r9uVar = pgxVar.l;
                                reu reuVar = pgxVar.m;
                                u8u u8uVar = pgxVar.H;
                                edu eduVar = pgxVar.I;
                                rmd0 rmd0Var = pgxVar.n;
                                ii iiVar = pgxVar.o;
                                wsf0 wsf0Var = pgxVar.E;
                                edo edoVar = pgxVar.p;
                                zfo zfoVar = pgxVar.q;
                                us3 us3Var = pgxVar.r;
                                knf0 knf0Var = pgxVar.s;
                                gii0 gii0Var = pgxVar.t;
                                iip iipVar = pgxVar.u;
                                iw20 iw20Var = pgxVar.v;
                                fvt0 fvt0Var = pgxVar.w;
                                onv onvVar = pgxVar.x;
                                d1p d1pVar = pgxVar.y;
                                drm0 drm0Var = pgxVar.z;
                                v88 v88Var = pgxVar.A;
                                onv onvVar2 = pgxVar.B;
                                kt2 kt2Var = pgxVar.C;
                                peg0 peg0Var = pgxVar.D;
                                vwb0 vwb0Var = pgxVar.F;
                                ouu ouuVar = pgxVar.G;
                                pdf0 pdf0VarB = ((odf0) r4).b();
                                bzu bzuVar = pgxVar.J;
                                o2j0 o2j0Var = pgxVar.K;
                                vqc vqcVar = pgxVar.L;
                                jw20 jw20Var = pgxVar.N;
                                ndf0 ndf0Var = pgxVar.O;
                                pcl0VarU.getClass();
                                sueVar.getClass();
                                rmd0Var.getClass();
                                iipVar.getClass();
                                d1pVar.getClass();
                                o2j0Var.getClass();
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
                                edoVar.getClass();
                                zfoVar.getClass();
                                us3Var.getClass();
                                knf0Var.getClass();
                                gii0Var.getClass();
                                kt2Var.getClass();
                                vwb0Var.getClass();
                                eji ejiVar = new eji(cadVar, pcl0VarU, sueVar, rmd0Var, iipVar, iw20Var, fvt0Var, onvVar, d1pVar, onvVar2, wsf0Var, pdf0VarB, drm0Var, jw20Var, qoiVar, bzuVar, o2j0Var, vqcVar, i1w0VarF, insightsSubGame, wdk0Var, lgn0Var, m1eVar, dujVar, ctf0Var, gst0Var, j1q0Var, r9uVar, reuVar, u8uVar, eduVar, iiVar, edoVar, zfoVar, knf0Var, v88Var, kt2Var, peg0Var, ouuVar, ndf0Var);
                                this.L1 = ndf0Var;
                                vq vqVarW = sueVar.w();
                                x1x.x(vqVarW);
                                this.M1 = vqVarW;
                                this.N1 = ((ali) onvVar2.f25567a).z();
                                this.O1 = iiVar;
                                this.P1 = qoiVar.a();
                                this.Q1 = wdk0Var;
                                this.R1 = lgn0Var;
                                this.S1 = (ogx) ejiVar.J.get();
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
        jf4.n(b1j.i(pgx.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.V1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        G0().x(dhx.b);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(dhx.f6114a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.W1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
