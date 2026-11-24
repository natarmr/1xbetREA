package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class whd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xhd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whd0(xhd0 xhd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xhd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xhd0 xhd0Var = this.k;
        switch (b) {
            case 0:
                whd0 whd0Var = new whd0(xhd0Var, yjeVar, (byte) 0);
                whd0Var.j = obj;
                return whd0Var;
            default:
                whd0 whd0Var2 = new whd0(xhd0Var, yjeVar, (byte) 1);
                whd0Var2.j = obj;
                return whd0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((whd0) create((iid0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((whd0) create((hid0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xhd0 xhd0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                iid0 iid0Var = (iid0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                fl70 fl70Var = xhd0.S1;
                xhd0Var.G0().f.setText(iid0Var.f14825a);
                xhd0Var.G0().b.setFirstButtonEnabled(iid0Var.c);
                return Unit.f46060a;
            default:
                hid0 hid0Var = (hid0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (hid0Var != null) {
                    if (hid0Var instanceof zhd0) {
                        fl70 fl70Var2 = xhd0.S1;
                        xhd0Var.G0().e.setErrorText("");
                        xhd0Var.G0().e.f(false);
                    } else if (hid0Var instanceof fid0) {
                        fl70 fl70Var3 = xhd0.S1;
                        ii iiVar = xhd0Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = xhd0Var.H(R.string.attention);
                        String strH2 = xhd0Var.H(R.string.qr_auth_enabled);
                        String strH3 = xhd0Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC = xhd0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (hid0Var instanceof aid0) {
                        j120.Y(xhd0Var);
                    } else if (hid0Var instanceof bid0) {
                        boolean z = ((bid0) hid0Var).f2655a;
                        fl70 fl70Var4 = xhd0.S1;
                        xhd0Var.G0().d.setVisibility(z ? 0 : 8);
                    } else if (hid0Var instanceof gid0) {
                        String str = ((gid0) hid0Var).f11341a;
                        fl70 fl70Var5 = xhd0.S1;
                        xhd0Var.G0().e.setErrorText(str);
                        xhd0Var.G0().e.f(true);
                    } else if (hid0Var instanceof eid0) {
                        String str2 = ((eid0) hid0Var).f7855a;
                        fl70 fl70Var6 = xhd0.S1;
                        ii iiVar2 = xhd0Var.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = xhd0Var.H(R.string.error);
                        String strH5 = xhd0Var.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str2, (CharSequence) strH5, (String) null, (String) null, "TOKEN_EXPIRED_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC2 = xhd0Var.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (hid0Var instanceof cid0) {
                        fl70 fl70Var7 = xhd0.S1;
                        ii iiVar3 = xhd0Var.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = xhd0Var.H(R.string.network_error);
                        String strH7 = xhd0Var.H(R.string.check_connection);
                        String strH8 = xhd0Var.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = xhd0Var.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else if (hid0Var instanceof did0) {
                        fl70 fl70Var8 = xhd0.S1;
                        ii iiVar4 = xhd0Var.L1;
                        if (iiVar4 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH9 = xhd0Var.H(R.string.caution);
                        String strH10 = xhd0Var.H(R.string.close_the_activation_process_new);
                        String strH11 = xhd0Var.H(R.string.interrupt);
                        strH11.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, xhd0Var.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC4 = xhd0Var.C();
                        eVarC4.getClass();
                        iiVar4.d(dialogFields4, eVarC4);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
