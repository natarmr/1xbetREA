package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class q8c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r8c0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8c0(r8c0 r8c0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r8c0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r8c0 r8c0Var = this.k;
        switch (b) {
            case 0:
                q8c0 q8c0Var = new q8c0(r8c0Var, yjeVar, (byte) 0);
                q8c0Var.j = obj;
                return q8c0Var;
            default:
                q8c0 q8c0Var2 = new q8c0(r8c0Var, yjeVar, (byte) 1);
                q8c0Var2.j = obj;
                return q8c0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q8c0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q8c0) create((sac0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xi70 xi70Var = r8c0.U1;
                ((g8c0) this.k.S1.getValue()).A(list);
                return Unit.f46060a;
            default:
                sac0 sac0Var = (sac0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(sac0Var, qac0.f28388a);
                r8c0 r8c0Var = this.k;
                if (zD) {
                    xi70 xi70Var2 = r8c0.U1;
                    wdk0 wdk0Var = r8c0Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH = r8c0Var.H(R.string.access_denied_with_bonus_currency_message);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), r8c0Var, null, null, false, null, 1020);
                } else {
                    if (!(sac0Var instanceof rac0)) {
                        t9f.b();
                        return null;
                    }
                    String str = ((rac0) sac0Var).f30128a;
                    xi70 xi70Var3 = r8c0.U1;
                    ii iiVar = r8c0Var.Q1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH2 = r8c0Var.H(R.string.error);
                    String strH3 = r8c0Var.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC = r8c0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                }
                return Unit.f46060a;
        }
    }
}
