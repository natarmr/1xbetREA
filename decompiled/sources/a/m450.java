package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class m450 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o450 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m450(o450 o450Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o450Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o450 o450Var = this.k;
        switch (b) {
            case 0:
                m450 m450Var = new m450(o450Var, yjeVar, (byte) 0);
                m450Var.j = obj;
                return m450Var;
            default:
                m450 m450Var2 = new m450(o450Var, yjeVar, (byte) 1);
                m450Var2.j = obj;
                return m450Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((m450) create((h3j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((m450) create((z450) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                h3j h3jVar = (h3j) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (h3jVar != null) {
                    atz atzVar = o450.V1;
                    d650 d650VarG0 = this.k.G0();
                    d650VarG0.h1.f(new v450(d650VarG0.M.b.a(R.string.daily_task_update_error, Arrays.copyOf(new Object[0], 0))));
                }
                return Unit.f46060a;
            default:
                z450 z450Var = (z450) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = z450Var instanceof w450;
                o450 o450Var = this.k;
                if (z) {
                    String str = ((w450) z450Var).f38529a;
                    atz atzVar2 = o450.V1;
                    ii iiVar = o450Var.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = o450Var.H(R.string.error);
                    String strH2 = o450Var.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = o450Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (z450Var instanceof v450) {
                    wdk0 wdk0Var = o450Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((v450) z450Var).f36762a, null, null, null, null, 124), o450Var, null, null, false, null, 1020);
                } else if (z450Var instanceof x450) {
                    roq0 roq0Var = o450Var.R1;
                    if (roq0Var == null) {
                        Intrinsics.h("tipsDialogScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = o450Var.C();
                    eVarC2.getClass();
                    roq0Var.d(eVarC2, 29, o450.class.getSimpleName());
                } else if (z450Var instanceof u450) {
                    DialogFields dialogFields2 = ((u450) z450Var).f35029a;
                    atz atzVar3 = o450.V1;
                    ii iiVar2 = o450Var.O1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = o450Var.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                } else if (Intrinsics.d(z450Var, y450.f41986a)) {
                    atz atzVar4 = o450.V1;
                    ynb ynbVar = o450Var.Q1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.e;
                    String string = o450Var.G().getString(R.string.gift_balance_dialog_description);
                    string.getClass();
                    androidx.fragment.app.e eVarC4 = o450Var.C();
                    eVarC4.getClass();
                    ynb.b(ynbVar, bm5Var, string, eVarC4, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", Response.BUSY_HERE);
                }
                return Unit.f46060a;
        }
    }
}
