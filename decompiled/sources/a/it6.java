package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class it6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kt6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it6(kt6 kt6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kt6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kt6 kt6Var = this.k;
        switch (b) {
            case 0:
                it6 it6Var = new it6(kt6Var, yjeVar, (byte) 0);
                it6Var.j = obj;
                return it6Var;
            default:
                it6 it6Var2 = new it6(kt6Var, yjeVar, (byte) 1);
                it6Var2.j = obj;
                return it6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((it6) create((p920) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((it6) create((t920) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zp6 zp6Var;
        switch (this.i) {
            case 0:
                p920 p920Var = (p920) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                l920 l920Var = l920.f19631a;
                boolean zD = Intrinsics.d(p920Var, l920Var);
                kt6 kt6Var = this.k;
                if (!zD) {
                    if (p920Var instanceof n920) {
                        wdk0 wdk0Var = kt6Var.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((n920) p920Var).f23117a, null, null, null, null, 124), kt6Var, null, kt6Var.G0().d, false, null, 1012);
                    } else if (p920Var instanceof o920) {
                        o920 o920Var = (o920) p920Var;
                        bj5 bj5Var = kt6.Q1;
                        lgn0 lgn0Var = kt6Var.N1;
                        if (lgn0Var == null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        SuccessBetStringModel successBetStringModel = o920Var.d;
                        String str = o920Var.e;
                        String str2 = o920Var.f24860a;
                        String strH = kt6Var.H(R.string.coefficient);
                        strH.getClass();
                        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(str, str2, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(o920Var.b), "SIMPLE", kotlin.collections.a.c(new SuccessBetInfoItem.Simple(strH, o920Var.c))), kt6Var.p0().p0());
                        Fragment fragment = kt6Var.y;
                        yo8 yo8Var = fragment instanceof yo8 ? (yo8) fragment : null;
                        if (yo8Var != null) {
                            yo8Var.x0();
                        }
                    } else if (p920Var instanceof k920) {
                        ii iiVar = kt6Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH2 = kt6Var.H(R.string.error);
                        String str3 = ((k920) p920Var).f17897a;
                        String strH3 = kt6Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str3, (CharSequence) strH3, kt6Var.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = kt6Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else {
                        if (!(p920Var instanceof m920)) {
                            t9f.b();
                            return null;
                        }
                        wdk0 wdk0Var2 = kt6Var.M1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var2, ((m920) p920Var).f21394a, kt6Var, null, kt6Var.G0().d, false, null, 1012);
                    }
                }
                bj5 bj5Var2 = kt6.Q1;
                p7m0 p7m0Var = kt6Var.H0().l;
                p7m0Var.getClass();
                p7m0Var.o(null, l920Var);
                return Unit.f46060a;
            default:
                t920 t920Var = (t920) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(t920Var, q920.f28327a)) {
                    boolean zD2 = Intrinsics.d(t920Var, s920.f31832a);
                    kt6 kt6Var2 = this.k;
                    if (zD2) {
                        Fragment fragment2 = kt6Var2.y;
                        zp6Var = fragment2 instanceof zp6 ? (zp6) fragment2 : null;
                        if (zp6Var != null) {
                            zp6Var.E0(false);
                            gnm0.s(zp6Var.C());
                        }
                        bj5 bj5Var3 = kt6.Q1;
                        kt6Var2.G0().c.clearFocus();
                    } else {
                        if (!Intrinsics.d(t920Var, r920.f30057a)) {
                            t9f.b();
                            return null;
                        }
                        Fragment fragment3 = kt6Var2.y;
                        zp6Var = fragment3 instanceof zp6 ? (zp6) fragment3 : null;
                        if (zp6Var != null) {
                            zp6Var.E0(true);
                            gnm0.i(zp6Var.C());
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
