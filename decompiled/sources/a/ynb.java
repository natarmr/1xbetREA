package a;

import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ynb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii f42932a;

    public ynb(ii iiVar) {
        iiVar.getClass();
        this.f42932a = iiVar;
    }

    public static void b(ynb ynbVar, bm5 bm5Var, String str, androidx.fragment.app.e eVar, boolean z, String str2, int i) {
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 32) != 0) {
            z = true;
        }
        boolean z2 = (i & 64) != 0;
        boolean z3 = (i & 128) != 0;
        boolean z4 = (i & 256) != 0;
        ynbVar.getClass();
        bm5Var.getClass();
        str.getClass();
        eVar.getClass();
        xnb.w2.getClass();
        if (eVar.J("ChangeBalanceDialog") == null) {
            xnb xnbVar = new xnb();
            iiy[] iiyVarArr = xnb.x2;
            xnbVar.k2.u(xnbVar, iiyVarArr[0], bm5Var);
            xnbVar.p2.x(xnbVar, iiyVarArr[5], str2);
            xnbVar.l2.x(xnbVar, iiyVarArr[1], "");
            xnbVar.m2.x(xnbVar, iiyVarArr[2], "");
            xnbVar.n2.x(xnbVar, iiyVarArr[3], str);
            xnbVar.o2.v(xnbVar, iiyVarArr[4], z);
            xnbVar.q2.v(xnbVar, iiyVarArr[6], z2);
            xnbVar.r2.v(xnbVar, iiyVarArr[7], z4);
            xnbVar.s2.v(xnbVar, iiyVarArr[8], z3);
            xnbVar.H0(eVar, "ChangeBalanceDialog");
        }
    }

    public final void a(String str, String str2, androidx.fragment.app.e eVar, String str3, String str4, ql5 ql5Var) {
        str.getClass();
        str2.getClass();
        eVar.getClass();
        str3.getClass();
        str4.getClass();
        ql5Var.getClass();
        bj5 bj5Var = qnb.i2;
        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) str3, str4, (String) null, "CHANGE_BALANCE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        bj5Var.getClass();
        qnb qnbVar = new qnb();
        qnbVar.R0(dialogFields);
        String str5 = dialogFields.f;
        if (str5 == null) {
            str5 = "";
        }
        iiy[] iiyVarArr = qnb.j2;
        qnbVar.f2.x(qnbVar, iiyVarArr[0], str5);
        qnbVar.g2.x(qnbVar, iiyVarArr[1], "GET_BALANCE_REQUEST_KEY");
        qnbVar.h2.u(qnbVar, iiyVarArr[2], ql5Var);
        this.f42932a.c(qnbVar, eVar);
    }
}
