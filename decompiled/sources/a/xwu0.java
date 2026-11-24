package a;

import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xwu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41628a;
    public final /* synthetic */ ywu0 b;

    public /* synthetic */ xwu0(ywu0 ywu0Var, byte b) {
        this.f41628a = b;
        this.b = ywu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41628a;
        ywu0 ywu0Var = this.b;
        switch (b) {
            case 0:
                sxu0 sxu0Var = (sxu0) obj;
                sxs0 sxs0Var = ywu0.s2;
                sxu0Var.getClass();
                if (sxu0Var.equals(kxu0.f19076a)) {
                    if (!ywu0Var.R()) {
                        ywu0Var.y0();
                    }
                } else if (sxu0Var.equals(lxu0.f20833a)) {
                    j120.Y(ywu0Var);
                } else if (sxu0Var instanceof jxu0) {
                    DialogFields dialogFields = ((jxu0) sxu0Var).f17328a;
                    ii iiVar = ywu0Var.m2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = ywu0Var.C();
                    eVarC.getClass();
                    iiVar.a(dialogFields, eVarC);
                } else if (sxu0Var instanceof mxu0) {
                    mxu0 mxu0Var = (mxu0) sxu0Var;
                    String str = mxu0Var.f22576a;
                    String str2 = mxu0Var.b;
                    eke0 eke0Var = tck0.t2;
                    androidx.fragment.app.e eVarC2 = ywu0Var.C();
                    eVarC2.getClass();
                    r34 r34Var = ywu0Var.p2;
                    iiy[] iiyVarArr = ywu0.t2;
                    long jLongValue = r34Var.n(ywu0Var, iiyVarArr[2]).longValue();
                    long jLongValue2 = ywu0Var.o2.n(ywu0Var, iiyVarArr[1]).longValue();
                    boolean zBooleanValue = ywu0Var.n2.n(ywu0Var, iiyVarArr[0]).booleanValue();
                    eke0Var.getClass();
                    str2.getClass();
                    String str3 = tck0.v2;
                    if (eVarC2.J(str3) == null) {
                        tck0 tck0Var = new tck0();
                        iiy[] iiyVarArr2 = tck0.u2;
                        tck0Var.m2.x(tck0Var, iiyVarArr2[0], "REQUEST_CODE");
                        tck0Var.p2.x(tck0Var, iiyVarArr2[3], str);
                        tck0Var.q2.j(tck0Var, iiyVarArr2[4], jLongValue);
                        tck0Var.r2.j(tck0Var, iiyVarArr2[5], jLongValue2);
                        tck0Var.n2.v(tck0Var, iiyVarArr2[1], zBooleanValue);
                        tck0Var.o2.x(tck0Var, iiyVarArr2[2], str2);
                        tck0Var.H0(eVarC2, str3);
                    }
                } else if (sxu0Var instanceof nxu0) {
                    d7a d7aVar = ((nxu0) sxu0Var).f24300a;
                    if (ywu0Var.l2 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH = ywu0Var.H(R.string.confirmation);
                    strH.getClass();
                    gl5.q(ywu0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
                } else if (sxu0Var instanceof pxu0) {
                    Toast.makeText(ywu0Var.o0(), ((pxu0) sxu0Var).f27773a, 1).show();
                } else if (sxu0Var instanceof oxu0) {
                    String str4 = ((oxu0) sxu0Var).f26030a;
                    String strH2 = ywu0Var.H(R.string.error);
                    strH2.getClass();
                    ywu0Var.Q0(strH2, str4, n12.b);
                } else if (sxu0Var instanceof qxu0) {
                    String str5 = ((qxu0) sxu0Var).f29506a;
                    String strH3 = ywu0Var.H(R.string.casino_pay_in_alert);
                    strH3.getClass();
                    ywu0Var.Q0(strH3, str5, n12.f22727a);
                } else {
                    if (!(sxu0Var instanceof rxu0)) {
                        t9f.b();
                        return null;
                    }
                    String str6 = ((rxu0) sxu0Var).f31283a;
                    String strH4 = ywu0Var.H(R.string.casino_pay_out_alert);
                    strH4.getClass();
                    ywu0Var.Q0(strH4, str6, n12.f22727a);
                }
                ywu0Var.P0().x(wvu0.f39857a);
                return Unit.f46060a;
            default:
                iqt0 iqt0Var = (iqt0) obj;
                sxs0 sxs0Var2 = ywu0.s2;
                iqt0Var.getClass();
                ywu0Var.P0().x(new bwu0(iqt0Var));
                return Unit.f46060a;
        }
    }
}
