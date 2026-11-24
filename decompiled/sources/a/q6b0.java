package a;

import android.os.Bundle;
import android.text.SpannableString;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class q6b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u6b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6b0(u6b0 u6b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = u6b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u6b0 u6b0Var = this.k;
        switch (b) {
            case 0:
                q6b0 q6b0Var = new q6b0(u6b0Var, yjeVar, (byte) 0);
                q6b0Var.j = obj;
                return q6b0Var;
            default:
                q6b0 q6b0Var2 = new q6b0(u6b0Var, yjeVar, (byte) 1);
                q6b0Var2.j = obj;
                return q6b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q6b0) create((mo4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q6b0) create((j9b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        u6b0 u6b0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                mo4 mo4Var = (mo4) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                SpannableString spannableString = mo4Var.f22117a;
                String str = mo4Var.b;
                xi70 xi70Var = u6b0.e2;
                Bundle bundle = u6b0Var.g;
                if (bundle == null) {
                    bundle = new Bundle();
                    u6b0Var.s0(bundle);
                }
                bundle.putString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", str);
                ii iiVar = u6b0Var.S1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = u6b0Var.H(R.string.attention);
                String string = spannableString.toString();
                String strH2 = u6b0Var.H(R.string.copy_info);
                strH2.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) string, (CharSequence) strH2, u6b0Var.H(R.string.ok), (String) null, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = u6b0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
            default:
                j9b0 j9b0Var = (j9b0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                h9b0 h9b0Var = h9b0.f12666a;
                if (!Intrinsics.d(j9b0Var, h9b0Var)) {
                    if (!(j9b0Var instanceof i9b0)) {
                        t9f.b();
                        return null;
                    }
                    xi70 xi70Var2 = u6b0.e2;
                    qog0 qog0VarD = m7x.P(u6b0Var, "android.permission.POST_NOTIFICATIONS", new String[0]).d();
                    boolean zR = n7x.r(n4c.J(qog0VarD.b, tx3.g0(qog0VarD.c)));
                    qog0VarD.e = new r6b0(u6b0Var, (byte) 0);
                    qog0VarD.f29072a.add(new s6b0(qog0VarD, u6b0Var, zR, (byte) 0));
                    qog0VarD.a();
                    p7m0 p7m0Var = u6b0Var.J0().H0;
                    p7m0Var.getClass();
                    p7m0Var.o(null, h9b0Var);
                }
                return Unit.f46060a;
        }
    }
}
