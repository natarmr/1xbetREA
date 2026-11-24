package a;

import androidx.core.widget.ContentLoadingProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class mud extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nud k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mud(nud nudVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nudVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nud nudVar = this.k;
        switch (b) {
            case 0:
                mud mudVar = new mud(nudVar, yjeVar, (byte) 0);
                mudVar.j = obj;
                return mudVar;
            case 1:
                mud mudVar2 = new mud(nudVar, yjeVar, (byte) 1);
                mudVar2.j = obj;
                return mudVar2;
            default:
                mud mudVar3 = new mud(nudVar, yjeVar, (byte) 2);
                mudVar3.j = obj;
                return mudVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mud) create((fvd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mud) create((tud) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mud) create((evd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        nud nudVar = this.k;
        switch (b) {
            case 0:
                fvd fvdVar = (fvd) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kud kudVar = nud.b2;
                ContentLoadingProgressBar contentLoadingProgressBar = nudVar.H0().f;
                boolean z = fvdVar.f10208a;
                boolean z2 = fvdVar.e;
                contentLoadingProgressBar.setVisibility(z ? 0 : 8);
                nudVar.H0().b.setVisibility(!z2 ? 0 : 8);
                nudVar.H0().c.setVisibility(!z2 ? 0 : 8);
                DSLottieEmptyContainer dSLottieEmptyContainer = nudVar.H0().d;
                jkm jkmVar = fvdVar.f;
                int i = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                dSLottieEmptyContainer.setVisibility(z2 ? 0 : 8);
                nudVar.H0().b.setFirstButtonVisibility(fvdVar.b);
                nudVar.H0().b.setSecondButtonEnabled(fvdVar.d);
                nudVar.H0().b.setThirdButtonEnabled(fvdVar.c);
                return Unit.f46060a;
            case 1:
                tud tudVar = (tud) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (tudVar != null) {
                    if (tudVar instanceof rud) {
                        kud kudVar2 = nud.b2;
                        nudVar.H0().i.setVisibility(8);
                    } else if (tudVar instanceof sud) {
                        kud kudVar3 = nud.b2;
                        nudVar.H0().i.setVisibility(0);
                        nudVar.H0().i.setText(((sud) tudVar).f32813a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                Integer numValueOf = Integer.valueOf(R.style.DSButton_Large_Secondary);
                Integer numValueOf2 = Integer.valueOf(R.style.DSButton_Large_Primary);
                evd evdVar = (evd) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (evdVar != null) {
                    boolean z3 = evdVar instanceof avd;
                    nud nudVar2 = this.k;
                    if (z3) {
                        wdk0 wdk0Var = nudVar2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(qek0.f28589a, ((avd) evdVar).f1519a, null, null, null, null, 124), nudVar2, null, null, false, null, 1020);
                    } else if (evdVar instanceof uud) {
                        String str = ((uud) evdVar).f36294a;
                        kud kudVar4 = nud.b2;
                        nudVar2.H0().h.setText(str);
                        nudVar2.H0().g.setVisibility(0);
                    } else if (evdVar instanceof yud) {
                        yud yudVar = (yud) evdVar;
                        String strH = yudVar.f43263a;
                        String strH2 = yudVar.b;
                        kud kudVar5 = nud.b2;
                        ii iiVarG0 = nudVar2.G0();
                        if (strH.length() == 0) {
                            strH = nudVar2.H(R.string.caution);
                            strH.getClass();
                        }
                        String str2 = strH;
                        if (strH2.length() == 0) {
                            strH2 = nudVar2.H(R.string.error_something_went_wrong);
                            strH2.getClass();
                        }
                        String strH3 = nudVar2.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) str2, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC = nudVar2.C();
                        eVarC.getClass();
                        iiVarG0.d(dialogFields, eVarC);
                    } else if (evdVar instanceof zud) {
                        String str3 = ((zud) evdVar).f45005a;
                        kud kudVar6 = nud.b2;
                        ii iiVarG1 = nudVar2.G0();
                        String strH4 = nudVar2.H(R.string.error);
                        String strH5 = nudVar2.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str3, (CharSequence) strH5, nudVar2.H(R.string.get_code_use_another_method), (String) null, "LIMIT_OPERATION_ERROR_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                        androidx.fragment.app.e eVarC2 = nudVar2.C();
                        eVarC2.getClass();
                        iiVarG1.d(dialogFields2, eVarC2);
                    } else if (evdVar instanceof cvd) {
                        kud kudVar7 = nud.b2;
                        ii iiVarG2 = nudVar2.G0();
                        String strH6 = nudVar2.H(R.string.caution);
                        String strH7 = nudVar2.H(R.string.operation_rejected);
                        String strH8 = nudVar2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC3 = nudVar2.C();
                        eVarC3.getClass();
                        iiVarG2.d(dialogFields3, eVarC3);
                    } else if (evdVar instanceof dvd) {
                        kud kudVar8 = nud.b2;
                        ii iiVarG3 = nudVar2.G0();
                        String strH9 = nudVar2.H(R.string.error);
                        String strH10 = nudVar2.H(R.string.request_error);
                        String strH11 = nudVar2.H(R.string.ok_new);
                        strH11.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC4 = nudVar2.C();
                        eVarC4.getClass();
                        iiVarG3.d(dialogFields4, eVarC4);
                    } else if (evdVar instanceof vud) {
                        String str4 = ((vud) evdVar).f38043a;
                        kud kudVar9 = nud.b2;
                        DsTextField dsTextField = nudVar2.H0().h;
                        dsTextField.f(true ^ (str4 == null || str4.length() == 0));
                        dsTextField.setErrorText(str4);
                    } else if (evdVar instanceof wud) {
                        kud kudVar10 = nud.b2;
                        ii iiVarG4 = nudVar2.G0();
                        String strH12 = nudVar2.H(R.string.error);
                        String strH13 = nudVar2.H(R.string.something_went_wrong);
                        String strH14 = nudVar2.H(R.string.ok_new);
                        strH14.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC5 = nudVar2.C();
                        eVarC5.getClass();
                        iiVarG4.d(dialogFields5, eVarC5);
                    } else if (evdVar instanceof xud) {
                        kud kudVar11 = nud.b2;
                        ii iiVarG5 = nudVar2.G0();
                        String strH15 = nudVar2.H(R.string.confirmation);
                        String strH16 = nudVar2.H(R.string.authenticator_enable_push_dialog_title);
                        String strH17 = nudVar2.H(R.string.open_settings);
                        strH17.getClass();
                        DialogFields dialogFields6 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, nudVar2.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC6 = nudVar2.C();
                        eVarC6.getClass();
                        iiVarG5.d(dialogFields6, eVarC6);
                    } else if (evdVar instanceof bvd) {
                        String str5 = ((bvd) evdVar).f3274a;
                        kud kudVar12 = nud.b2;
                        ii iiVarG6 = nudVar2.G0();
                        String strH18 = nudVar2.H(R.string.error);
                        String strH19 = nudVar2.H(R.string.ok_new);
                        strH19.getClass();
                        DialogFields dialogFields7 = new DialogFields((CharSequence) strH18, (CharSequence) str5, (CharSequence) strH19, nudVar2.H(R.string.get_code_use_another_method), (String) null, "NO_AUTHENTICATOR_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                        androidx.fragment.app.e eVarC7 = nudVar2.C();
                        eVarC7.getClass();
                        iiVarG6.d(dialogFields7, eVarC7);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
