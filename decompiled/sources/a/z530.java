package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionDialogUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class z530 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b630 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z530(b630 b630Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b630Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b630 b630Var = this.k;
        switch (b) {
            case 0:
                z530 z530Var = new z530(b630Var, yjeVar, (byte) 0);
                z530Var.j = obj;
                return z530Var;
            default:
                z530 z530Var2 = new z530(b630Var, yjeVar, (byte) 1);
                z530Var2.j = obj;
                return z530Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z530) create((w630) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z530) create((q630) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        b630 b630Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                w630 w630Var = (w630) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (w630Var instanceof s630) {
                    FilterActionDialogUiModel filterActionDialogUiModel = ((s630) w630Var).f31683a;
                    htz htzVar = b630.m2;
                    nek nekVar = u2q.h2;
                    androidx.fragment.app.e eVarC = b630Var.C();
                    eVarC.getClass();
                    nekVar.getClass();
                    if (eVarC.J("FILTER_ACTION_DIALOG_TAG") == null) {
                        u2q u2qVar = new u2q();
                        iiy[] iiyVarArr = u2q.i2;
                        u2qVar.f2.x(u2qVar, iiyVarArr[1], "REQUEST_FILTER_DIALOG_KEY");
                        u2qVar.g2.J(u2qVar, iiyVarArr[2], filterActionDialogUiModel);
                        u2qVar.H0(eVarC, "FILTER_ACTION_DIALOG_TAG");
                    }
                } else {
                    if (!Intrinsics.d(w630Var, u630.f35119a)) {
                        t9f.b();
                        return null;
                    }
                    htz htzVar2 = b630.m2;
                    ii iiVar = b630Var.d2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = b630Var.H(R.string.reset_markets_settings);
                    String strH2 = b630Var.H(R.string.settings_will_be_reset_to_the_initial_state);
                    String strH3 = b630Var.H(R.string.yes);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, b630Var.H(R.string.cancel), (String) null, "RESET_SETTINGS_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = b630Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                    ccq0.V(b630Var, "RESET_SETTINGS_REQUEST_KEY", new w530(b630Var, (byte) 5));
                    ccq0.T(b630Var, "RESET_SETTINGS_REQUEST_KEY", new w530(b630Var, (byte) 6));
                }
                return Unit.f46060a;
            default:
                q630 q630Var = (q630) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (q630Var != null) {
                    if (q630Var instanceof m630) {
                        htz htzVar3 = b630.m2;
                        b630Var.I0().d.setVisibility(0);
                        b630Var.I0().b.setVisibility(8);
                        ((t530) b630Var.l2.getValue()).A(((m630) q630Var).f21249a);
                    } else if (q630Var instanceof o630) {
                        ra10 ra10Var = ((o630) q630Var).f24715a;
                        htz htzVar4 = b630.m2;
                        b630Var.I0().d.setVisibility(8);
                        LottieView lottieView = b630Var.I0().b;
                        lottieView.v(ra10Var);
                        lottieView.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
