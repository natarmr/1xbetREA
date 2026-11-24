package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vt60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37989a;
    public final /* synthetic */ xt60 b;

    public /* synthetic */ vt60(xt60 xt60Var, byte b) {
        this.f37989a = b;
        this.b = xt60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37989a) {
            case 0:
                xuz xuzVar = xt60.V1;
                ((lwk) obj).getClass();
                xt60 xt60Var = this.b;
                o2t.e(xt60Var.F(), xt60Var, new vt60(xt60Var, (byte) 2), new ut60(xt60Var, (byte) 1), null, 18);
                return new ty2(xt60Var, (byte) 17);
            case 1:
                xt60 xt60Var2 = this.b;
                kiu0 kiu0Var = xt60Var2.Q1;
                qu60 qu60Var = (qu60) obj;
                xuz xuzVar2 = xt60.V1;
                qu60Var.getClass();
                if (qu60Var instanceof nu60) {
                    peg0 peg0Var = xt60Var2.P1;
                    if (peg0Var == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    ynb ynbVarI = ((yzn0) peg0Var.b).i();
                    bm5 bm5Var = bm5.d;
                    androidx.fragment.app.e eVarC = xt60Var2.C();
                    eVarC.getClass();
                    ynb.b(ynbVarI, bm5Var, null, eVarC, false, "SELECT_BALANCE_REQUEST_KEY", 494);
                    xt60Var2.C().u0("SELECT_BALANCE_REQUEST_KEY", xt60Var2, new viq(xt60Var2, (byte) 29));
                } else if (qu60Var instanceof ou60) {
                    ii iiVar = xt60Var2.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = xt60Var2.H(R.string.congratulations);
                    String strH2 = xt60Var2.H(R.string.lucky_wheel_free_spin_message);
                    String strH3 = xt60Var2.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_FREE_SPIN", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1496);
                    androidx.fragment.app.e eVarC2 = xt60Var2.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                } else if (qu60Var instanceof pu60) {
                    String str = ((pu60) qu60Var).f27600a;
                    wdk0 wdk0Var = xt60Var2.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), xt60Var2, null, null, false, null, 1020);
                } else if (qu60Var instanceof lu60) {
                    ((k370) kiu0Var.getValue()).y(y270.f41893a);
                } else {
                    if (!(qu60Var instanceof mu60)) {
                        t9f.b();
                        return null;
                    }
                    ((k370) kiu0Var.getValue()).y(new z270(true));
                }
                xt60Var2.G0().x(xs60.f41401a);
                return Unit.f46060a;
            default:
                long jLongValue = ((Long) obj).longValue();
                xuz xuzVar3 = xt60.V1;
                xt60 xt60Var3 = this.b;
                o2t.b(xt60Var3.F(), jLongValue, xt60Var3.K1.n(xt60Var3, xt60.W1[0]));
                xt60Var3.G0().x(new zs60(jLongValue));
                return Unit.f46060a;
        }
    }
}
