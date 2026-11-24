package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$BetValue;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$UiState;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final class aun0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bun0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aun0(bun0 bun0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bun0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bun0 bun0Var = this.k;
        switch (b) {
            case 0:
                aun0 aun0Var = new aun0(bun0Var, yjeVar, (byte) 0);
                aun0Var.j = obj;
                return aun0Var;
            case 1:
                aun0 aun0Var2 = new aun0(bun0Var, yjeVar, (byte) 1);
                aun0Var2.j = obj;
                return aun0Var2;
            default:
                aun0 aun0Var3 = new aun0(bun0Var, yjeVar, (byte) 2);
                aun0Var3.j = obj;
                return aun0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((aun0) create((iun0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((aun0) create((nun0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((aun0) create((SwipexChangeBetValueViewModel$UiState) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strC;
        byte b = this.i;
        bun0 bun0Var = this.k;
        switch (b) {
            case 0:
                iun0 iun0Var = (iun0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (iun0Var instanceof hun0) {
                    DsAccountSelection dsAccountSelection = bun0Var.Q0().c;
                    dsAccountSelection.setVisibility(0);
                    hun0 hun0Var = (hun0) iun0Var;
                    dsAccountSelection.setAccountTitle(hun0Var.d);
                    dsAccountSelection.x(hun0Var.f13691a, hun0Var.b);
                    bun0Var.Q0().h.clearFocus();
                } else if (Intrinsics.d(iun0Var, fun0.f10173a)) {
                    bun0Var.Q0().c.setVisibility(8);
                } else {
                    if (!Intrinsics.d(iun0Var, gun0.f11939a)) {
                        t9f.b();
                        return null;
                    }
                    bun0Var.Q0().c.setVisibility(0);
                }
                return Unit.f46060a;
            case 1:
                nun0 nun0Var = (nun0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (nun0Var != null) {
                    boolean z = nun0Var instanceof mun0;
                    bun0 bun0Var2 = this.k;
                    if (z) {
                        ynb ynbVar = bun0Var2.e2;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.j;
                        androidx.fragment.app.e eVarC = bun0Var2.C();
                        eVarC.getClass();
                        ynb.b(ynbVar, bm5Var, null, eVarC, false, "CHANGE_BALANCE_REQUEST_KEY", 398);
                    } else if (nun0Var instanceof jun0) {
                        wdk0 wdk0Var = bun0Var2.c2;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((jun0) nun0Var).f17164a, null, null, null, null, 124), bun0Var2, null, bun0Var2.Q0().f4995a, false, null, 1012);
                    } else if (nun0Var instanceof lun0) {
                        bun0Var2.Q0().h.setText(null);
                    } else if (nun0Var instanceof kun0) {
                        bun0Var2.x0();
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                SwipexChangeBetValueViewModel$UiState swipexChangeBetValueViewModel$UiState = (SwipexChangeBetValueViewModel$UiState) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = swipexChangeBetValueViewModel$UiState.c;
                boolean z3 = swipexChangeBetValueViewModel$UiState.j;
                if (!z2) {
                    DsTextField dsTextField = bun0Var.Q0().h;
                    SwipexChangeBetValueViewModel$BetValue swipexChangeBetValueViewModel$BetValue = swipexChangeBetValueViewModel$UiState.b;
                    String str = swipexChangeBetValueViewModel$BetValue.f47114a;
                    if (str == null || str.length() == 0) {
                        strC = "";
                    } else {
                        pn40 pn40Var = pn40.f27267a;
                        strC = pn40.c(pn40.n(swipexChangeBetValueViewModel$BetValue.b, 6), p3u0.g);
                    }
                    dsTextField.setText(strC);
                    DsTextField dsTextField2 = bun0Var.Q0().h;
                    CharSequence text = bun0Var.Q0().h.getText();
                    dsTextField2.setSelection(text != null ? text.length() : 0);
                }
                bun0Var.Q0().h.setMinusButtonEnabled(swipexChangeBetValueViewModel$UiState.h);
                bun0Var.Q0().h.setPlusButtonEnabled(swipexChangeBetValueViewModel$UiState.i);
                bun0Var.Q0().h.setMinusButtonVisible(z3);
                bun0Var.Q0().h.setPlusButtonVisible(z3);
                bun0Var.Q0().h.setHelperText(swipexChangeBetValueViewModel$UiState.m);
                double d = swipexChangeBetValueViewModel$UiState.d;
                DsButton dsButton = bun0Var.Q0().d;
                pn40 pn40Var2 = pn40.f27267a;
                p3u0 p3u0Var = p3u0.c;
                dsButton.l(pn40.c(d, p3u0Var));
                bun0Var.Q0().e.l(pn40.c(2.0d * d, p3u0Var));
                bun0Var.Q0().f.l(pn40.c(5.0d * d, p3u0Var));
                bun0Var.Q0().g.l(pn40.c(10.0d * d, p3u0Var));
                bun0Var.Q0().b.setEnabled(swipexChangeBetValueViewModel$UiState.k);
                return Unit.f46060a;
        }
    }
}
