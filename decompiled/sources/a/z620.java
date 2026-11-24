package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/z620;", "La/iw5;", "La/i620;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z620 extends iw5 implements i620 {
    public ghi k2;
    public ii l2;
    public ynb m2;
    public wdk0 n2;
    public iw20 o2;
    public wjk s2;
    public static final /* synthetic */ iiy[] v2 = {new ez40(z620.class, "finBetInfoModel", "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;", 0), new ez40(z620.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(z620.class, "styleType", "getStyleType()Lorg/xplatform/remoteconfig/domain/models/MakeBetScreenStyleType;", 0)};
    public static final uuz u2 = new uuz();
    public final khf0 p2 = new khf0("EXTRA_BET_INFO");
    public final yzn0 q2 = new yzn0("REQUEST_KEY");
    public final yzn0 r2 = new yzn0("STYLETYPE_KEY");
    public final a8z t2 = xbc.a0(this, sre0.f32672a.b(ln20.class), null, new p620(this, (byte) 0), 14);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        long backgroundContent;
        fetVar.e0(-1215392013);
        k3t0 k3t0VarQ0 = Q0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object yw10Var = new yw10(1, this, z620.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/models/MakeBetSideEffect;)V", 0, (byte) 8);
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
        ug20 ug20Var = ((d820) pz40VarY.getValue()).f5623a;
        zbr zbrVar = ((d820) pz40VarY.getValue()).d;
        cw5 cw5VarO0 = iw5.O0(1, fetVar);
        ug20 ug20Var2 = ug20.c;
        lel lelVar = ug20Var == ug20Var2 ? iel.f14638a : jel.f16379a;
        if (ug20Var == ug20Var2) {
            pz40 pz40Var = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackground();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
        }
        cw5 cw5VarA = cw5.a(cw5VarO0, true, false, false, lelVar, backgroundContent, 6);
        if (ug20Var != ug20Var2 || zbrVar == null) {
            fetVar.e0(-1167806742);
            fetVar.r(false);
        } else {
            fetVar.e0(-1168019432);
            ugdVarM = u1c.M(1724317829, new ngz(zbrVar, this, (byte) 7), fetVar);
            fetVar.r(false);
        }
        bw5 bw5Var = new bw5(cw5VarA, (xdr) null, ugdVarM, u1c.M(841390180, new ngz(pz40VarY, this, (byte) 8), fetVar), 6);
        fetVar.r(false);
        return bw5Var;
    }

    public final i6q P0(Fragment fragment) {
        fragment.getClass();
        Fragment fragment2 = fragment.y;
        if (fragment2 != null) {
            return fragment2 instanceof i6q ? (i6q) fragment2 : P0(fragment2);
        }
        jf4.n("MakeBetLoaderFragment not found");
        return null;
    }

    public final k3t0 Q0() {
        return (k3t0) this.t2.getValue();
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
            this.s2 = (wjk) context;
        }
        wjk wjkVar = this.s2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(r6q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            r6q r6qVar = (r6q) (ze3Var instanceof r6q ? ze3Var : null);
            if (r6qVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = v2;
                hhi hhiVarA = r6qVar.a(i1w0VarF, (FinBetInfoModel) this.p2.n(this, iiyVarArr[0]), z620.class.getSimpleName(), (ua20) this.r2.n(this, iiyVarArr[2]));
                this.k2 = (ghi) hhiVarA.T.get();
                this.l2 = hhiVarA.G;
                ynb ynbVarI = ((yzn0) hhiVarA.x.b).i();
                x1x.x(ynbVarI);
                this.m2 = ynbVarI;
                this.n2 = hhiVarA.f13064a;
                this.o2 = hhiVarA.O;
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(r6q.class, "Cannot create dependency "));
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        wjk wjkVar = this.s2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        vcc.f0(i120.V(new Pair("REQUEST_FINISH_MAKE_BET_DIALOG_KEY", Boolean.TRUE)), this, (String) this.q2.n(this, v2[1]));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().K = true;
        L0().N(3);
    }
}
