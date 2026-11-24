package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class dxd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ exd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dxd(exd exdVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = exdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        exd exdVar = this.k;
        switch (b) {
            case 0:
                dxd dxdVar = new dxd(exdVar, yjeVar, (byte) 0);
                dxdVar.j = obj;
                return dxdVar;
            case 1:
                dxd dxdVar2 = new dxd(exdVar, yjeVar, (byte) 1);
                dxdVar2.j = obj;
                return dxdVar2;
            default:
                dxd dxdVar3 = new dxd(exdVar, yjeVar, (byte) 2);
                dxdVar3.j = obj;
                return dxdVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dxd) create((wxd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dxd) create((ixd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dxd) create((vxd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        exd exdVar = this.k;
        switch (b) {
            case 0:
                wxd wxdVar = (wxd) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                usd usdVar = exd.U1;
                FrameLayout frameLayout = exdVar.H0().f;
                boolean z = wxdVar.f39926a;
                boolean z2 = wxdVar.c;
                frameLayout.setVisibility(z ? 0 : 8);
                exdVar.H0().b.setVisibility(!z2 ? 0 : 8);
                exdVar.H0().c.setVisibility(!z2 ? 0 : 8);
                DSLottieEmptyContainer dSLottieEmptyContainer = exdVar.H0().d;
                jkm jkmVar = wxdVar.d;
                int i = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                dSLottieEmptyContainer.setVisibility(z2 ? 0 : 8);
                exdVar.H0().b.setFirstButtonVisibility(wxdVar.f);
                exdVar.H0().b.setSecondButtonEnabled(wxdVar.h);
                exdVar.H0().b.setThirdButtonEnabled(wxdVar.g);
                return Unit.f46060a;
            case 1:
                ixd ixdVar = (ixd) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ixdVar != null) {
                    if (ixdVar instanceof gxd) {
                        usd usdVar2 = exd.U1;
                        exdVar.H0().i.setVisibility(8);
                    } else if (ixdVar instanceof hxd) {
                        usd usdVar3 = exd.U1;
                        exdVar.H0().i.setVisibility(0);
                        exdVar.H0().i.setText(((hxd) ixdVar).f13811a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                Integer numValueOf = Integer.valueOf(R.style.DSButton_Large_Secondary);
                Integer numValueOf2 = Integer.valueOf(R.style.DSButton_Large_Primary);
                vxd vxdVar = (vxd) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (vxdVar != null) {
                    boolean z3 = vxdVar instanceof jxd;
                    exd exdVar2 = this.k;
                    if (z3) {
                        String str = ((jxd) vxdVar).f17301a;
                        usd usdVar4 = exd.U1;
                        exdVar2.H0().h.setText(str);
                        exdVar2.H0().g.setVisibility(0);
                    } else if (vxdVar instanceof oxd) {
                        oxd oxdVar = (oxd) vxdVar;
                        String strH = oxdVar.f26006a;
                        String strH2 = oxdVar.b;
                        usd usdVar5 = exd.U1;
                        ii iiVarG0 = exdVar2.G0();
                        if (strH.length() == 0) {
                            strH = exdVar2.H(R.string.caution);
                            strH.getClass();
                        }
                        String str2 = strH;
                        if (strH2.length() == 0) {
                            strH2 = exdVar2.H(R.string.error_something_went_wrong);
                            strH2.getClass();
                        }
                        String strH3 = exdVar2.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) str2, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC = exdVar2.C();
                        eVarC.getClass();
                        iiVarG0.d(dialogFields, eVarC);
                    } else if (vxdVar instanceof qxd) {
                        String str3 = ((qxd) vxdVar).f29478a;
                        usd usdVar6 = exd.U1;
                        ii iiVarG1 = exdVar2.G0();
                        String strH4 = exdVar2.H(R.string.error);
                        String strH5 = exdVar2.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str3, (CharSequence) strH5, exdVar2.H(R.string.get_code_use_another_method), (String) null, "LIMIT_OPERATION_ERROR_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                        androidx.fragment.app.e eVarC2 = exdVar2.C();
                        eVarC2.getClass();
                        iiVarG1.d(dialogFields2, eVarC2);
                    } else if (vxdVar instanceof txd) {
                        usd usdVar7 = exd.U1;
                        ii iiVarG2 = exdVar2.G0();
                        String strH6 = exdVar2.H(R.string.caution);
                        String strH7 = exdVar2.H(R.string.operation_rejected);
                        String strH8 = exdVar2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC3 = exdVar2.C();
                        eVarC3.getClass();
                        iiVarG2.d(dialogFields3, eVarC3);
                    } else if (vxdVar instanceof uxd) {
                        usd usdVar8 = exd.U1;
                        ii iiVarG3 = exdVar2.G0();
                        String strH9 = exdVar2.H(R.string.error);
                        String strH10 = exdVar2.H(R.string.request_error);
                        String strH11 = exdVar2.H(R.string.ok_new);
                        strH11.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC4 = exdVar2.C();
                        eVarC4.getClass();
                        iiVarG3.d(dialogFields4, eVarC4);
                    } else if (vxdVar instanceof kxd) {
                        j120.Y(exdVar2);
                    } else if (vxdVar instanceof lxd) {
                        String str4 = ((lxd) vxdVar).f20809a;
                        usd usdVar9 = exd.U1;
                        DsTextField dsTextField = exdVar2.H0().h;
                        dsTextField.f(true ^ (str4 == null || str4.length() == 0));
                        dsTextField.setErrorText(str4);
                    } else if (vxdVar instanceof pxd) {
                        String str5 = ((pxd) vxdVar).f27748a;
                        usd usdVar10 = exd.U1;
                        ii iiVarG4 = exdVar2.G0();
                        String strH12 = exdVar2.H(R.string.caution);
                        String strH13 = exdVar2.H(R.string.interrupt);
                        strH13.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) str5, (CharSequence) strH13, exdVar2.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC5 = exdVar2.C();
                        eVarC5.getClass();
                        iiVarG4.d(dialogFields5, eVarC5);
                    } else if (vxdVar instanceof nxd) {
                        usd usdVar11 = exd.U1;
                        ii iiVarG5 = exdVar2.G0();
                        String strH14 = exdVar2.H(R.string.caution);
                        String strH15 = exdVar2.H(R.string.authenticator_enable_push_dialog_title);
                        String strH16 = exdVar2.H(R.string.open_settings);
                        strH16.getClass();
                        DialogFields dialogFields6 = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, exdVar2.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC6 = exdVar2.C();
                        eVarC6.getClass();
                        iiVarG5.d(dialogFields6, eVarC6);
                    } else if (vxdVar instanceof mxd) {
                        usd usdVar12 = exd.U1;
                        ii iiVarG6 = exdVar2.G0();
                        String strH17 = exdVar2.H(R.string.error);
                        String strH18 = exdVar2.H(R.string.something_went_wrong);
                        String strH19 = exdVar2.H(R.string.ok_new);
                        strH19.getClass();
                        DialogFields dialogFields7 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC7 = exdVar2.C();
                        eVarC7.getClass();
                        iiVarG6.d(dialogFields7, eVarC7);
                    } else if (vxdVar instanceof rxd) {
                        String str6 = ((rxd) vxdVar).f31259a;
                        pek0 pek0Var = pek0.f26859a;
                        usd usdVar13 = exd.U1;
                        wdk0 wdk0Var = exdVar2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(pek0Var, str6, null, null, null, null, 124), exdVar2, null, null, false, null, 1020);
                    } else if (vxdVar instanceof sxd) {
                        String str7 = ((sxd) vxdVar).f32972a;
                        usd usdVar14 = exd.U1;
                        ii iiVarG7 = exdVar2.G0();
                        String strH20 = exdVar2.H(R.string.error);
                        String strH21 = exdVar2.H(R.string.ok_new);
                        strH21.getClass();
                        DialogFields dialogFields8 = new DialogFields((CharSequence) strH20, (CharSequence) str7, (CharSequence) strH21, exdVar2.H(R.string.get_code_use_another_method), (String) null, "NO_AUTHENTICATOR_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                        androidx.fragment.app.e eVarC8 = exdVar2.C();
                        eVarC8.getClass();
                        iiVarG7.d(dialogFields8, eVarC8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
