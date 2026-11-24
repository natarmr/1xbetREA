package a;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class re4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30316a;
    public final /* synthetic */ ze4 b;

    public /* synthetic */ re4(ze4 ze4Var, byte b) {
        this.f30316a = b;
        this.b = ze4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30316a;
        ze4 ze4Var = this.b;
        switch (b) {
            case 0:
                yf4 yf4Var = (yf4) obj;
                qek0 qek0Var = ze4.g2;
                yf4Var.getClass();
                boolean z = yf4Var instanceof xf4;
                ze4 ze4Var2 = this.b;
                Object[] objArr = 0;
                if (z) {
                    int i = ((xf4) yf4Var).f40774a;
                    Object objN = ze4Var2.f2.n(ze4.h2[0], ze4Var2);
                    objN.getClass();
                    ComposeView composeView = ((tik) objN).f34013a;
                    tkz tkzVarQ = x0x.Q(ze4Var2.u1);
                    rwj rwjVar = tvk.f34603a;
                    qjj.W(tkzVarQ, ys10.f43147a, null, new d21((Object) ze4Var2, i, (Object) composeView, (yje) (objArr == true ? 1 : 0), (byte) 1), 2);
                } else if (yf4Var.equals(sf4.f32100a)) {
                    if (ze4Var2.Z1 == null) {
                        Intrinsics.h("authEntryPointsDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = ze4Var2.C();
                    eVarC.getClass();
                    pek0.n(eVarC, false);
                } else if (yf4Var instanceof tf4) {
                    tf4 tf4Var = (tf4) yf4Var;
                    String str = tf4Var.f33849a;
                    String str2 = tf4Var.b;
                    boolean z2 = tf4Var.c;
                    ii iiVar = ze4Var2.c2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = ze4Var2.H(R.string.close);
                    strH.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, z2 ? ze4Var2.H(R.string.get_help) : null, (String) null, "KEY_REQUEST_SUPPORT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC2 = ze4Var2.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                } else if (yf4Var instanceof uf4) {
                    d7a d7aVar = ((uf4) yf4Var).f35561a;
                    if (ze4Var2.b2 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH2 = ze4Var2.H(R.string.authorization);
                    strH2.getClass();
                    gl5.q(ze4Var2, "KEY_REQUEST_CAPTCHA_CODE_DIALOG", d7aVar, strH2);
                } else if (yf4Var instanceof rf4) {
                    j120.d0(ze4Var2.o0(), "open/paysystems");
                } else if (yf4Var.equals(vf4.f37313a)) {
                    ii iiVar2 = ze4Var2.c2;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH3 = ze4Var2.H(R.string.error);
                    String strH4 = ze4Var2.H(R.string.something_went_wrong);
                    String strH5 = ze4Var2.H(R.string.ok_new);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC3 = ze4Var2.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                } else if (yf4Var.equals(wf4.f39050a)) {
                    new nvu(ze4Var2.o0()).Z();
                    kxq kxqVarB = ze4Var2.B();
                    if (kxqVarB == null || !kxqVarB.isFinishing()) {
                        Context contextO0 = ze4Var2.o0();
                        Toast.makeText(contextO0, contextO0.getString(R.string.double_click_exit), 1).show();
                    }
                } else {
                    if (!yf4Var.equals(qf4.f28611a)) {
                        t9f.b();
                        return null;
                    }
                    kxq kxqVarB2 = ze4Var2.B();
                    if (kxqVarB2 != null) {
                        kxqVarB2.finishAffinity();
                    }
                }
                ze4Var2.K0().x(md4.f21579a);
                return Unit.f46060a;
            case 1:
                iqt0 iqt0Var = (iqt0) obj;
                qek0 qek0Var2 = ze4.g2;
                iqt0Var.getClass();
                ze4Var.K0().x(new wd4(iqt0Var));
                return Unit.f46060a;
            case 2:
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                qek0 qek0Var3 = ze4.g2;
                confirmationNewPlaceResultType.getClass();
                ze4Var.K0().x(new yd4(confirmationNewPlaceResultType));
                return Unit.f46060a;
            case 3:
                x5q0 x5q0Var = (x5q0) obj;
                qek0 qek0Var4 = ze4.g2;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    k3t0 k3t0VarK0 = ze4Var.K0();
                    String str3 = ((w5q0) x5q0Var).f38596a;
                    str3.getClass();
                    k3t0VarK0.x(new he4(str3));
                }
                return Unit.f46060a;
            case 4:
                x5q0 x5q0Var2 = (x5q0) obj;
                qek0 qek0Var5 = ze4.g2;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    k3t0 k3t0VarK1 = ze4Var.K0();
                    String str4 = ((w5q0) x5q0Var2).f38596a;
                    str4.getClass();
                    k3t0VarK1.x(new ge4(str4));
                }
                return Unit.f46060a;
            case 5:
                String str5 = (String) obj;
                qek0 qek0Var6 = ze4.g2;
                str5.getClass();
                ze4Var.K0().x(new ie4(str5));
                return Unit.f46060a;
            default:
                qek0 qek0Var7 = ze4.g2;
                ze4Var.K0().x(new fe4((ghk0) obj));
                return Unit.f46060a;
        }
    }
}
