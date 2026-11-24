package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class u620 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ a720 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u620(a720 a720Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = a720Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a720 a720Var = this.j;
        switch (b) {
            case 0:
                return new u620(a720Var, yjeVar, (byte) 0);
            case 1:
                return new u620(a720Var, yjeVar, (byte) 1);
            case 2:
                return new u620(a720Var, yjeVar, (byte) 2);
            default:
                return new u620(a720Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit unit = (Unit) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((u620) create(unit, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a720 a720Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                a720 a720Var2 = this.j;
                ndk0 ndk0Var = a720Var2.p2;
                if (ndk0Var != null) {
                    ndk0Var.dismiss();
                }
                wdk0 wdk0Var = a720Var2.j2;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                pek0 pek0Var = pek0.f26859a;
                String strH = a720Var2.H(R.string.add_to_coupon_help_message);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, lwf.Y, rv00.B, new Integer(R.drawable.ic_glyph_select_inactive), 68), a720Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ndk0 ndk0Var2 = a720Var.p2;
                if (ndk0Var2 != null) {
                    ndk0Var2.dismiss();
                }
                vq vqVar = a720Var.i2;
                if (vqVar != null) {
                    a720Var.p2 = new mdk0(vqVar.b(a720Var, a720Var.Q0().r, new q620(a720Var, (byte) 5)).f41290a);
                    return Unit.f46060a;
                }
                Intrinsics.h("addEventToCouponDelegate");
                throw null;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                a720 a720Var3 = this.j;
                wdk0 wdk0Var2 = a720Var3.j2;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH2 = a720Var3.H(R.string.no_connection_title_with_hyphen);
                strH2.getClass();
                String strH3 = a720Var3.H(R.string.no_connection_description);
                strH3.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH2, strH3, null, gqw0.D1, null, 104), a720Var3, null, a720Var3.Q0().r, false, null, 1012);
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                xuz xuzVar = a720.x2;
                ii iiVar = a720Var.k2;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH4 = a720Var.H(R.string.optibet_market_info_title);
                String strH5 = a720Var.H(R.string.optibet_market_desc);
                String strH6 = a720Var.H(R.string.ok);
                strH6.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                androidx.fragment.app.e eVarC = a720Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
        }
    }
}
