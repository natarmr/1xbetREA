package a;

import com.google.android.material.textview.MaterialTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class wyd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xyd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyd(xyd xydVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xydVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xyd xydVar = this.k;
        switch (b) {
            case 0:
                wyd wydVar = new wyd(xydVar, yjeVar, (byte) 0);
                wydVar.j = obj;
                return wydVar;
            default:
                wyd wydVar2 = new wyd(xydVar, yjeVar, (byte) 1);
                wydVar2.j = obj;
                return wydVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wyd) create((ezd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wyd) create((dzd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                ezd ezdVar = (ezd) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kud kudVar = xyd.U1;
                xyd xydVar = this.k;
                MaterialTextView materialTextView = xydVar.G0().d;
                String str = ezdVar.f8667a;
                String strI = xydVar.I(R.string.by_email_send_code_confirmation_desc_v2, str);
                strI.getClass();
                materialTextView.setText(z1x.G(str, strI));
                xydVar.G0().c.setTitle(ezdVar.c);
                return Unit.f46060a;
            default:
                dzd dzdVar = (dzd) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (dzdVar != null) {
                    boolean z = dzdVar instanceof yyd;
                    xyd xydVar2 = this.k;
                    if (z) {
                        if (xydVar2.M1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        yyd yydVar = (yyd) dzdVar;
                        gl5.p(xydVar2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", yydVar.f43461a, yydVar.b);
                    } else if (dzdVar instanceof zyd) {
                        wdk0 wdk0Var = xydVar2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((zyd) dzdVar).f45201a, null, null, null, null, 124), xydVar2, null, null, false, new Integer(R.dimen.space_16), 508);
                    } else if (dzdVar instanceof czd) {
                        String str2 = ((czd) dzdVar).f5219a;
                        kud kudVar2 = xyd.U1;
                        ii iiVar = xydVar2.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = xydVar2.H(R.string.error);
                        String strH2 = xydVar2.H(R.string.ok_new);
                        strH2.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str2, (CharSequence) strH2, (String) null, (String) null, "TOKEN_EXPIRED_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC = xydVar2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (dzdVar instanceof azd) {
                        kud kudVar3 = xyd.U1;
                        ii iiVar2 = xydVar2.N1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = xydVar2.H(R.string.attention);
                        String strH4 = xydVar2.H(R.string.close_the_activation_process_new);
                        String strH5 = xydVar2.H(R.string.cancel);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, xydVar2.H(R.string.interrupt), (String) null, "REQUEST_BACK_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = xydVar2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (dzdVar instanceof bzd) {
                        kud kudVar4 = xyd.U1;
                        ii iiVar3 = xydVar2.N1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = xydVar2.H(R.string.error);
                        String strH7 = xydVar2.H(R.string.request_error);
                        String strH8 = xydVar2.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC3 = xydVar2.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
