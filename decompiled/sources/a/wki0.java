package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class wki0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xki0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wki0(xki0 xki0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xki0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xki0 xki0Var = this.k;
        switch (b) {
            case 0:
                wki0 wki0Var = new wki0(xki0Var, yjeVar, (byte) 0);
                wki0Var.j = obj;
                return wki0Var;
            case 1:
                wki0 wki0Var2 = new wki0(xki0Var, yjeVar, (byte) 1);
                wki0Var2.j = obj;
                return wki0Var2;
            default:
                wki0 wki0Var3 = new wki0(xki0Var, yjeVar, (byte) 2);
                wki0Var3.j = obj;
                return wki0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wki0) create((hmi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wki0) create((zli0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wki0) create((dmi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xki0 xki0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                hmi0 hmi0Var = (hmi0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (hmi0Var != null) {
                    if (hmi0Var instanceof gmi0) {
                        iiy[] iiyVarArr = xki0.P1;
                        xki0Var.G0().f.setVisibility(8);
                        xki0Var.G0().c.setVisibility(8);
                        xki0Var.G0().d.setVisibility(8);
                        ((FrameLayout) xki0Var.G0().e.c).setVisibility(0);
                    } else if (hmi0Var instanceof fmi0) {
                        ra10 ra10Var = ((fmi0) hmi0Var).f9784a;
                        iiy[] iiyVarArr2 = xki0.P1;
                        xki0Var.G0().d.v(ra10Var);
                        xki0Var.G0().f.setVisibility(8);
                        xki0Var.G0().c.setVisibility(8);
                        xki0Var.G0().d.setVisibility(0);
                        ((FrameLayout) xki0Var.G0().e.c).setVisibility(8);
                    } else if (hmi0Var instanceof emi0) {
                        iiy[] iiyVarArr3 = xki0.P1;
                        xki0Var.G0().f.setVisibility(0);
                        xki0Var.G0().c.setVisibility(0);
                        xki0Var.G0().d.setVisibility(8);
                        ((FrameLayout) xki0Var.G0().e.c).setVisibility(8);
                    }
                }
                return Unit.f46060a;
            case 1:
                zli0 zli0Var = (zli0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr4 = xki0.P1;
                ((lki0) xki0Var.N1.getValue()).A(zli0Var.f44583a);
                xki0Var.G0().b.setEnabled(zli0Var.b);
                return Unit.f46060a;
            default:
                dmi0 dmi0Var = (dmi0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (dmi0Var != null) {
                    if (dmi0Var instanceof cmi0) {
                        iiy[] iiyVarArr5 = xki0.P1;
                        ii iiVar = xki0Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = xki0Var.H(R.string.caution);
                        String strH2 = xki0Var.H(R.string.limit_set_dialog_confirm_message);
                        String strH3 = xki0Var.H(R.string.yes);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, xki0Var.H(R.string.cancel), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = xki0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (dmi0Var instanceof ami0) {
                        iiy[] iiyVarArr6 = xki0.P1;
                        ii iiVar2 = xki0Var.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = xki0Var.H(R.string.caution);
                        String strH5 = xki0Var.H(R.string.something_went_wrong);
                        String strH6 = xki0Var.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC2 = xki0Var.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (dmi0Var instanceof bmi0) {
                        String str = ((bmi0) dmi0Var).f2838a;
                        iiy[] iiyVarArr7 = xki0.P1;
                        ii iiVar3 = xki0Var.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH7 = xki0Var.H(R.string.caution);
                        String strH8 = xki0Var.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = xki0Var.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    }
                }
                return Unit.f46060a;
        }
    }
}
