package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class al5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bl5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al5(bl5 bl5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bl5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bl5 bl5Var = this.k;
        switch (b) {
            case 0:
                al5 al5Var = new al5(bl5Var, yjeVar, (byte) 0);
                al5Var.j = obj;
                return al5Var;
            default:
                al5 al5Var2 = new al5(bl5Var, yjeVar, (byte) 1);
                al5Var2.j = obj;
                return al5Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((al5) create((jj5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((al5) create((pi5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                jj5 jj5Var = (jj5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (jj5Var != null) {
                    boolean z = jj5Var instanceof hj5;
                    bl5 bl5Var = this.k;
                    if (z) {
                        j120.c0(bl5Var.o0(), "open/paymentconsultant");
                    } else if (jj5Var instanceof ij5) {
                        ii iiVar = bl5Var.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        kl5 kl5Var = pnb.i2;
                        String strH = bl5Var.H(R.string.attention);
                        ij5 ij5Var = (ij5) jj5Var;
                        String str = ij5Var.f14856a;
                        String strH2 = bl5Var.H(R.string.ok_new);
                        strH2.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, bl5Var.H(R.string.cancel), (String) null, "CHANGE_BALANCE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        ql5 ql5Var = ij5Var.b;
                        kl5Var.getClass();
                        pnb pnbVarF = kl5.f(dialogFields, ql5Var);
                        androidx.fragment.app.e eVarC = bl5Var.C();
                        eVarC.getClass();
                        iiVar.c(pnbVarF, eVarC);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                pi5 pi5Var = (pi5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (pi5Var instanceof oi5) {
                    bl5 bl5Var2 = this.k;
                    wdk0 wdk0Var = bl5Var2.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((oi5) pi5Var).f25295a, null, null, null, null, 124), bl5Var2, null, null, false, null, 1020);
                    bl5Var2.G0().G();
                }
                return Unit.f46060a;
        }
    }
}
