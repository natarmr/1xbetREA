package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/b720;", "La/iw5;", "La/i620;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b720 extends iw5 implements i620 {
    public mli k2;
    public ii l2;
    public lgn0 m2;
    public iw20 n2;
    public ynb o2;
    public wdk0 p2;
    public vq q2;
    public mdk0 r2;
    public wjk u2;
    public static final /* synthetic */ iiy[] x2 = {new ez40(b720.class, "simpleBetGame", "getSimpleBetGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;", 0), new ez40(b720.class, "entryPointType", "getEntryPointType()Lorg/xplatform/analytics/domain/AnalyticsEventModel$EntryPointType;", 0)};
    public static final evz w2 = new evz();
    public final yzn0 s2 = new yzn0("SIMPLE_BET_GAME_BUNDLE_KEY");
    public final yzn0 t2 = new yzn0("ANALYTICS_ENTRY_POINT_TYPE_BUNDLE_KEY");
    public final a8z v2 = xbc.a0(this, sre0.f32672a.b(nn20.class), null, new m620(this, (byte) 6), 14);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        lel lelVar;
        long backgroundContent;
        fetVar.e0(-1060748289);
        k3t0 k3t0VarQ0 = Q0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object yw10Var = new yw10(1, this, b720.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/make_bet/impl/presentation/ui_state/MakeBetSideEffect;)V", 0, (byte) 7);
            fetVar.o0(yw10Var);
            objP = yw10Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarQ0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        ugd ugdVarM = null;
        if (zI2 || objP2 == obj) {
            objP2 = new khx(k3t0VarQ0, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) Q0()).y(fetVar);
        Object objP3 = fetVar.P();
        if (objP3 == obj) {
            objP3 = ((d820) pz40VarY.getValue()).f5623a;
            fetVar.o0(objP3);
        }
        ug20 ug20Var = (ug20) objP3;
        zbr zbrVar = ((d820) pz40VarY.getValue()).d;
        cw5 cw5VarO0 = iw5.O0(1, fetVar);
        int iOrdinal = ug20Var.ordinal();
        if (iOrdinal == 0) {
            lelVar = kel.f18158a;
        } else if (iOrdinal == 1) {
            lelVar = jel.f16379a;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            lelVar = iel.f14638a;
        }
        lel lelVar2 = lelVar;
        ug20 ug20Var2 = ug20.c;
        if (ug20Var == ug20Var2) {
            pz40 pz40Var = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackground();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
        }
        cw5 cw5VarA = cw5.a(cw5VarO0, true, false, false, lelVar2, backgroundContent, 6);
        if (ug20Var != ug20Var2 || zbrVar == null) {
            fetVar.e0(1618542750);
            fetVar.r(false);
        } else {
            fetVar.e0(1618330060);
            ugdVarM = u1c.M(39328785, new ngz(zbrVar, this, (byte) 9), fetVar);
            fetVar.r(false);
        }
        bw5 bw5Var = new bw5(cw5VarA, (xdr) null, ugdVarM, u1c.M(-958714192, new ngz(pz40VarY, this, (byte) 10), fetVar), 6);
        fetVar.r(false);
        return bw5Var;
    }

    public final ms2 P0() {
        return (ms2) this.t2.n(this, x2[1]);
    }

    public final k3t0 Q0() {
        return (k3t0) this.v2.getValue();
    }

    public final void R0(String str, String str2, String str3) {
        ii iiVar = this.l2;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        DialogFields dialogFields = new DialogFields((CharSequence) H(R.string.error), (CharSequence) str, (CharSequence) str3, H(R.string.cancel), (String) null, str2, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.u2 = (wjk) context;
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gp30.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gp30 gp30Var = (gp30) (ze3Var instanceof gp30 ? ze3Var : null);
            if (gp30Var != null) {
                m0k0 m0k0Var = (m0k0) this.s2.n(this, x2[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                ms2 ms2VarP0 = P0();
                i1w0VarF.getClass();
                cad cadVar = gp30Var.f11664a;
                d1p d1pVar = gp30Var.b;
                wsf0 wsf0Var = gp30Var.e;
                iip iipVar = gp30Var.c;
                drm0 drm0Var = gp30Var.d;
                sue sueVar = gp30Var.g;
                vqc vqcVar = gp30Var.h;
                clc clcVar = gp30Var.i;
                bzu bzuVar = gp30Var.j;
                iw20 iw20Var = gp30Var.k;
                o2j0 o2j0Var = gp30Var.l;
                nr00 nr00Var = gp30Var.m;
                onv onvVar = gp30Var.p;
                duj dujVar = gp30Var.q;
                m1e m1eVar = gp30Var.r;
                ouu ouuVar = gp30Var.o;
                onv onvVar2 = gp30Var.n;
                ctf0 ctf0Var = gp30Var.s;
                wdk0 wdk0Var = gp30Var.t;
                ii iiVar = gp30Var.v;
                lgn0 lgn0Var = gp30Var.u;
                nb7 nb7Var = gp30Var.w;
                h0f h0fVar = gp30Var.x;
                gst0 gst0Var = gp30Var.y;
                zlt0 zlt0Var = gp30Var.z;
                mii0 mii0Var = gp30Var.A;
                vqc vqcVar2 = gp30Var.C;
                yo4 yo4Var = gp30Var.B;
                x0u x0uVar = gp30Var.D;
                h3c h3cVar = gp30Var.E;
                lbu lbuVar = gp30Var.F;
                dzu dzuVar = gp30Var.G;
                v88 v88Var = gp30Var.H;
                peg0 peg0Var = gp30Var.f;
                wyu wyuVar = gp30Var.I;
                pyu pyuVar = gp30Var.K;
                q4u q4uVar = gp30Var.J;
                rou rouVar = gp30Var.L;
                sjl0 sjl0Var = gp30Var.M;
                ih5 ih5Var = gp30Var.N;
                ih5 ih5Var2 = gp30Var.O;
                iqt iqtVar = gp30Var.P;
                ntu ntuVar = gp30Var.Q;
                epi0 epi0Var = gp30Var.R;
                edo edoVar = gp30Var.S;
                zfo zfoVar = gp30Var.T;
                d1pVar.getClass();
                iipVar.getClass();
                sueVar.getClass();
                o2j0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                nb7Var.getClass();
                h0fVar.getClass();
                gst0Var.getClass();
                wyuVar.getClass();
                sjl0Var.getClass();
                edoVar.getClass();
                zfoVar.getClass();
                this.k2 = (mli) new qfi(cadVar, o2j0Var, sueVar, clcVar, wsf0Var, iw20Var, d1pVar, bzuVar, onvVar2, vqcVar, iipVar, drm0Var, nr00Var, peg0Var, onvVar, epi0Var, m0k0Var, ms2VarP0, i1w0VarF, dujVar, m1eVar, ctf0Var, wdk0Var, iiVar, lgn0Var, nb7Var, h0fVar, gst0Var, zlt0Var, ouuVar, mii0Var, yo4Var, vqcVar2, x0uVar, h3cVar, lbuVar, dzuVar, v88Var, wyuVar, pyuVar, q4uVar, rouVar, sjl0Var, ih5Var, ih5Var2, iqtVar, ntuVar, edoVar, zfoVar).f28635a.get();
                this.l2 = iiVar;
                this.m2 = lgn0Var;
                this.n2 = ((clc) nr00Var.f23980a).f();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.o2 = ynbVarI;
                this.p2 = wdk0Var;
                vq vqVarW = sueVar.w();
                x1x.x(vqVarW);
                this.q2 = vqVarW;
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(gp30.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        wjk wjkVar = this.u2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        wjk wjkVar = this.u2;
        if (wjkVar != null) {
            ((ApplicationActivity) wjkVar).I(true);
        }
        L0().K = true;
        L0().N(3);
    }
}
