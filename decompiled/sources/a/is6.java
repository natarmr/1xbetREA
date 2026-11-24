package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/is6;", "La/iw5;", "La/i620;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class is6 extends iw5 implements i620 {
    public static final /* synthetic */ int r2 = 0;
    public fiu0 k2;
    public ii l2;
    public lgn0 m2;
    public ynb n2;
    public wdk0 o2;
    public wjk p2;
    public final a8z q2 = xbc.b0(this, sre0.f32672a.b(dt6.class), new hs6(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        lel lelVar;
        long backgroundContent;
        fetVar.e0(-1259998544);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object ur6Var = new ur6(1, this, is6.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/bet_constructor/impl/makebet/presentation/actual/ui_state/MakeBetSideEffect;)V", 0, (byte) 5);
            fetVar.o0(ur6Var);
            objP = ur6Var;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        ugd ugdVarM = null;
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(k3t0VarP0, this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
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
        boolean z = ug20Var != ug20.f35603a;
        ug20 ug20Var2 = ug20.c;
        if (ug20Var == ug20Var2) {
            pz40 pz40Var = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackground();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
        }
        cw5 cw5VarA = cw5.a(cw5VarO0, true, false, z, lelVar2, backgroundContent, 6);
        if (ug20Var != ug20Var2 || zbrVar == null) {
            fetVar.e0(1399049709);
            fetVar.r(false);
        } else {
            fetVar.e0(1398837019);
            ugdVarM = u1c.M(-1279695166, new ab4((Object) zbrVar, (Object) this, (byte) 5), fetVar);
            fetVar.r(false);
        }
        bw5 bw5Var = new bw5(cw5VarA, (xdr) null, ugdVarM, u1c.M(492395361, new ab4((Object) pz40VarY, (Object) this, (byte) 6), fetVar), 6);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.q2.getValue();
    }

    public final void Q0(String str, String str2, String str3) {
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
            this.p2 = (wjk) context;
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(js6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            js6 js6Var = (js6) (ze3Var instanceof js6 ? ze3Var : null);
            if (js6Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ctf0 ctf0Var = js6Var.f17035a;
                cad cadVar = js6Var.b;
                drm0 drm0Var = js6Var.c;
                iip iipVar = js6Var.d;
                gii0 gii0Var = js6Var.e;
                gs6 gs6Var = js6Var.f;
                knf0 knf0Var = js6Var.g;
                v88 v88Var = js6Var.h;
                ort ortVar = js6Var.j;
                btt0 btt0Var = js6Var.k;
                peg0 peg0Var = js6Var.i;
                au0 au0Var = js6Var.A;
                wsf0 wsf0Var = js6Var.l;
                vby vbyVar = js6Var.m;
                lgn0 lgn0Var = js6Var.n;
                ii iiVar = js6Var.o;
                rqt rqtVar = js6Var.p;
                duj dujVar = js6Var.q;
                buo0 buo0Var = js6Var.r;
                bn6 bn6Var = js6Var.s;
                ih5 ih5Var = js6Var.t;
                ih5 ih5Var2 = js6Var.u;
                gg5 gg5Var = js6Var.v;
                l7k l7kVar = js6Var.w;
                m1e m1eVar = js6Var.x;
                vwb0 vwb0Var = js6Var.y;
                pru pruVar = js6Var.z;
                bzu bzuVar = js6Var.B;
                wdk0 wdk0Var = js6Var.C;
                fvt0 fvt0Var = js6Var.D;
                j1q0 j1q0Var = js6Var.E;
                o2j0 o2j0Var = js6Var.F;
                rou rouVar = js6Var.G;
                pyu pyuVar = js6Var.H;
                q4u q4uVar = js6Var.I;
                zlt0 zlt0Var = js6Var.J;
                lbu lbuVar = js6Var.K;
                wyu wyuVar = js6Var.L;
                x0u x0uVar = js6Var.M;
                iqt iqtVar = js6Var.N;
                x1u x1uVar = js6Var.O;
                zri zriVar = js6Var.P;
                r9u r9uVar = js6Var.Q;
                cmt cmtVar = js6Var.R;
                iipVar.getClass();
                o2j0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                gs6Var.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                vbyVar.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                vwb0Var.getClass();
                wdk0Var.getClass();
                j1q0Var.getClass();
                wyuVar.getClass();
                r9uVar.getClass();
                this.k2 = new fiu0(Collections.singletonMap(dt6.class, (n8i) new w9i(cadVar, drm0Var, iipVar, wsf0Var, bzuVar, peg0Var, fvt0Var, o2j0Var, i1w0VarF, ctf0Var, au0Var, lgn0Var, gii0Var, gs6Var, knf0Var, v88Var, btt0Var, ortVar, vbyVar, iiVar, rqtVar, dujVar, buo0Var, bn6Var, ih5Var, ih5Var2, gg5Var, l7kVar, m1eVar, pruVar, wdk0Var, rouVar, pyuVar, q4uVar, zlt0Var, lbuVar, wyuVar, x0uVar, iqtVar, x1uVar, zriVar, r9uVar, cmtVar).N));
                this.l2 = iiVar;
                this.m2 = lgn0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.n2 = ynbVarI;
                this.o2 = wdk0Var;
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(js6.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        wjk wjkVar = this.p2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        wjk wjkVar = this.p2;
        if (wjkVar != null) {
            ((ApplicationActivity) wjkVar).I(true);
        }
        L0().K = true;
        L0().N(3);
    }
}
