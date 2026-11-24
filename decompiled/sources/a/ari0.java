package a;

import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class ari0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bri0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ari0(bri0 bri0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bri0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bri0 bri0Var = this.k;
        switch (b) {
            case 0:
                ari0 ari0Var = new ari0(bri0Var, yjeVar, (byte) 0);
                ari0Var.j = obj;
                return ari0Var;
            default:
                ari0 ari0Var2 = new ari0(bri0Var, yjeVar, (byte) 1);
                ari0Var2.j = obj;
                return ari0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ari0) create((rri0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ari0) create((ori0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.i) {
            case 0:
                rri0 rri0Var = (rri0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (rri0Var != null) {
                    boolean z = rri0Var instanceof qri0;
                    bri0 bri0Var = this.k;
                    if (z) {
                        lme0 lme0Var = bri0.V1;
                        bri0Var.G0().g.setVisibility(0);
                    } else if (rri0Var instanceof pri0) {
                        lme0 lme0Var2 = bri0.V1;
                        bri0Var.G0().g.setVisibility(8);
                        pri0 pri0Var = (pri0) rri0Var;
                        bri0Var.G0().f.setVisibility(pri0Var.f27467a ? 0 : 8);
                        bri0Var.G0().f.setRequirements(pri0Var.b);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                ori0 ori0Var = (ori0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(ori0Var, dri0.f6561a);
                bri0 bri0Var2 = this.k;
                if (zD) {
                    lme0 lme0Var3 = bri0.V1;
                    bri0Var2.G0().e.setErrorText("");
                    bri0Var2.G0().c.setErrorText("");
                    bri0Var2.G0().e.f(false);
                    bri0Var2.G0().c.f(false);
                } else if (Intrinsics.d(ori0Var, iri0.f15257a)) {
                    lme0 lme0Var4 = bri0.V1;
                    ii iiVar = bri0Var2.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = bri0Var2.H(R.string.attention);
                    String strH2 = bri0Var2.H(R.string.close_the_activation_process_new);
                    String strH3 = bri0Var2.H(R.string.interrupt);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, bri0Var2.H(R.string.cancel), (String) null, "REQUEST_BACK_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = bri0Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (Intrinsics.d(ori0Var, lri0.f20534a)) {
                    lme0 lme0Var5 = bri0.V1;
                    wdk0 wdk0Var = bri0Var2.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH4 = bri0Var2.H(R.string.password_has_changed);
                    strH4.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH4, null, null, null, null, 124), bri0Var2, null, null, false, null, 1020);
                } else if (Intrinsics.d(ori0Var, mri0.f22274a)) {
                    lme0 lme0Var6 = bri0.V1;
                    ii iiVar2 = bri0Var2.N1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = bri0Var2.H(R.string.password_has_changed);
                    String strH6 = bri0Var2.H(R.string.password_has_changed_need_authorized);
                    String strH7 = bri0Var2.H(R.string.make_login);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, "REQUEST_PASSWORD_CHANGED_AUTH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 472);
                    androidx.fragment.app.e eVarC2 = bri0Var2.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else if (Intrinsics.d(ori0Var, fri0.f10020a)) {
                    lme0 lme0Var7 = bri0.V1;
                    bri0Var2.G0().e.setErrorText(bri0Var2.H(R.string.password_does_not_meet_the_requirements_error));
                    bri0Var2.G0().e.f(true);
                } else if (Intrinsics.d(ori0Var, gri0.f11779a)) {
                    lme0 lme0Var8 = bri0.V1;
                    bri0Var2.G0().c.setErrorText(bri0Var2.H(R.string.passwords_is_incorrect));
                    bri0Var2.G0().c.f(true);
                } else if (ori0Var instanceof kri0) {
                    wdk0 wdk0Var2 = bri0Var2.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, ((kri0) ori0Var).f18766a, null, null, null, null, 124), bri0Var2, null, null, false, null, 1020);
                } else if (ori0Var instanceof jri0) {
                    String str = ((jri0) ori0Var).f17005a;
                    lme0 lme0Var9 = bri0.V1;
                    ii iiVar3 = bri0Var2.N1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH8 = bri0Var2.H(R.string.error);
                    String strH9 = bri0Var2.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) str, (CharSequence) strH9, (String) null, (String) null, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC3 = bri0Var2.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                } else if (ori0Var instanceof nri0) {
                    lme0 lme0Var10 = bri0.V1;
                    ii iiVar4 = bri0Var2.N1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH10 = bri0Var2.H(R.string.error);
                    String strH11 = bri0Var2.H(R.string.request_error);
                    String strH12 = bri0Var2.H(R.string.ok_new);
                    strH12.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC4 = bri0Var2.C();
                    eVarC4.getClass();
                    iiVar4.d(dialogFields4, eVarC4);
                } else if (ori0Var instanceof eri0) {
                    j120.Y(bri0Var2);
                } else {
                    if (!(ori0Var instanceof hri0)) {
                        t9f.b();
                        return null;
                    }
                    j120.g0(bri0Var2.o0(), i120.V(new Pair("SHOW_AUTHORIZATION", Boolean.TRUE)));
                }
                return Unit.f46060a;
        }
    }
}
