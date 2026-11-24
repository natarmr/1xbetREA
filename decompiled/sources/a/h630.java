package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class h630 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i630 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h630(i630 i630Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i630Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        i630 i630Var = this.k;
        switch (b) {
            case 0:
                h630 h630Var = new h630(i630Var, yjeVar, (byte) 0);
                h630Var.j = obj;
                return h630Var;
            default:
                h630 h630Var2 = new h630(i630Var, yjeVar, (byte) 1);
                h630Var2.j = obj;
                return h630Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((h630) create((x630) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h630) create((r630) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        i630 i630Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                x630 x630Var = (x630) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (x630Var instanceof t630) {
                    FilterActionDialogUiModel filterActionDialogUiModel = ((t630) x630Var).f33396a;
                    evz evzVar = i630.k2;
                    pek pekVar = v2q.h2;
                    androidx.fragment.app.e eVarC = i630Var.C();
                    eVarC.getClass();
                    pekVar.getClass();
                    String str = v2q.j2;
                    if (eVarC.J(str) == null) {
                        v2q v2qVar = new v2q();
                        iiy[] iiyVarArr = v2q.i2;
                        v2qVar.f2.x(v2qVar, iiyVarArr[1], "REQUEST_FILTER_DIALOG_KEY");
                        v2qVar.g2.J(v2qVar, iiyVarArr[2], filterActionDialogUiModel);
                        v2qVar.H0(eVarC, str);
                    }
                } else {
                    if (!Intrinsics.d(x630Var, v630.f36853a)) {
                        t9f.b();
                        return null;
                    }
                    evz evzVar2 = i630.k2;
                    ii iiVar = i630Var.d2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = i630Var.H(R.string.reset_markets_settings);
                    String strH2 = i630Var.H(R.string.settings_will_be_reset_to_the_initial_state);
                    String strH3 = i630Var.H(R.string.yes);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, i630Var.H(R.string.cancel), (String) null, "RESET_SETTINGS_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = i630Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                    ccq0.V(i630Var, "RESET_SETTINGS_REQUEST_KEY", new e630(i630Var, (byte) 4));
                }
                return Unit.f46060a;
            default:
                r630 r630Var = (r630) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (r630Var != null) {
                    if (r630Var instanceof n630) {
                        evz evzVar3 = i630.k2;
                        i630Var.I0().d.setVisibility(0);
                        i630Var.I0().b.setVisibility(8);
                        ((u530) i630Var.j2.getValue()).A(((n630) r630Var).f22977a);
                    } else if (r630Var instanceof p630) {
                        jkm jkmVar = ((p630) r630Var).f26435a;
                        evz evzVar4 = i630.k2;
                        i630Var.I0().d.setVisibility(8);
                        DSLottieEmptyContainer dSLottieEmptyContainer = i630Var.I0().b;
                        dSLottieEmptyContainer.a(jkmVar);
                        dSLottieEmptyContainer.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
