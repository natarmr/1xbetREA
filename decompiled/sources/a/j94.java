package a;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.AuthenticatorFilterViewModel$ViewModelState;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j94 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j94(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f16119a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        StepInputUiModel stepInputUiModel;
        Double dI;
        byte b = 1;
        byte b2 = 0;
        yje yjeVar = null;
        switch (this.f16119a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((l94) this.receiver).M(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((l94) this.receiver).M(th2);
                return Unit.f46060a;
            case 2:
                pa4 pa4Var = (pa4) obj;
                pa4Var.getClass();
                ((k3t0) this.receiver).x(pa4Var);
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((Function1) this.receiver).invoke(th3);
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((Function1) ((jhy) this.receiver)).invoke(th4);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((Function1) this.receiver).invoke(th5);
                return Unit.f46060a;
            case 6:
                sj4 sj4Var = (sj4) obj;
                sj4Var.getClass();
                cj4 cj4Var = (cj4) this.receiver;
                gfk0 gfk0Var = cj4.U1;
                yje yjeVar2 = null;
                if (sj4Var instanceof rj4) {
                    int i = ((rj4) sj4Var).f30573a;
                    Object objN = cj4Var.S1.n(cj4.V1[0], cj4Var);
                    objN.getClass();
                    ComposeView composeView = ((eyq) objN).f8639a;
                    tkz tkzVarQ = x0x.Q(cj4Var.u1);
                    rwj rwjVar = tvk.f34603a;
                    qjj.W(tkzVarQ, ys10.f43147a, null, new d21((Object) cj4Var, i, (Object) composeView, yjeVar2, (byte) 2), 2);
                } else {
                    cj4Var.getClass();
                    if (sj4Var.equals(mj4.f21876a)) {
                        if (cj4Var.M1 == null) {
                            Intrinsics.h("authEntryPointsDialogFactory");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = cj4Var.C();
                        eVarC.getClass();
                        pek0.n(eVarC, false);
                    } else if (sj4Var instanceof nj4) {
                        nj4 nj4Var = (nj4) sj4Var;
                        String str = nj4Var.f23616a;
                        String str2 = nj4Var.b;
                        boolean z = nj4Var.c;
                        ii iiVar = cj4Var.P1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = cj4Var.H(R.string.close);
                        strH.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, z ? cj4Var.H(R.string.get_help) : null, (String) null, "KEY_REQUEST_SUPPORT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = cj4Var.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (sj4Var instanceof oj4) {
                        d7a d7aVar = ((oj4) sj4Var).f25343a;
                        if (cj4Var.O1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH2 = cj4Var.H(R.string.authorization);
                        strH2.getClass();
                        gl5.q(cj4Var, "KEY_REQUEST_CAPTCHA_CODE_DIALOG", d7aVar, strH2);
                    } else if (sj4Var instanceof lj4) {
                        j120.d0(cj4Var.o0(), "open/paysystems");
                    } else if (sj4Var.equals(pj4.f27070a)) {
                        ii iiVar2 = cj4Var.P1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = cj4Var.H(R.string.error);
                        String strH4 = cj4Var.H(R.string.something_went_wrong);
                        String strH5 = cj4Var.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = cj4Var.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (sj4Var.equals(qj4.f28819a)) {
                        new nvu(cj4Var.o0()).Z();
                        kxq kxqVarB = cj4Var.B();
                        if (kxqVarB == null || !kxqVarB.isFinishing()) {
                            Context contextO0 = cj4Var.o0();
                            Toast.makeText(contextO0, contextO0.getString(R.string.double_click_exit), 1).show();
                        }
                    } else {
                        if (!sj4Var.equals(kj4.f18368a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = cj4Var.B();
                        if (kxqVarB2 != null) {
                            kxqVarB2.finishAffinity();
                        }
                    }
                }
                cj4Var.G0().x(nh4.f23515a);
                return Unit.f46060a;
            case 7:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((Function1) this.receiver).invoke(th6);
                return Unit.f46060a;
            case 8:
                b94 b94Var = (b94) obj;
                b94Var.getClass();
                cp4 cp4Var = (cp4) this.receiver;
                gfk0 gfk0Var2 = cp4.P1;
                cp4Var.getClass();
                if (b94Var.equals(a94.f458a)) {
                    wdk0 wdk0Var = cp4Var.K1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH6 = cp4Var.H(R.string.authenticator_disabled);
                    strH6.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH6, null, null, null, null, 124), cp4Var, null, null, false, null, 1020);
                } else {
                    if (!(b94Var instanceof z84)) {
                        t9f.b();
                        return null;
                    }
                    String str3 = ((z84) b94Var).f43949a;
                    wdk0 wdk0Var2 = cp4Var.K1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(pek0.f26859a, str3, null, null, null, null, 124), cp4Var, null, null, false, null, 1020);
                }
                ((k3t0) cp4Var.O1.getValue()).x(j74.f16022a);
                return Unit.f46060a;
            case 9:
                k74 k74Var = (k74) obj;
                k74Var.getClass();
                ((k3t0) this.receiver).x(k74Var);
                return Unit.f46060a;
            case 10:
                xo4 xo4Var = (xo4) obj;
                xo4Var.getClass();
                qp4 qp4Var = (qp4) this.receiver;
                hfk0 hfk0Var = qp4.R1;
                wdk0 wdk0Var3 = qp4Var.G0().q;
                String str4 = xo4Var.c;
                String strH7 = qp4Var.H(R.string.coupon_save_copyed);
                strH7.getClass();
                j120.M(qp4Var, wdk0Var3, "authenticator", str4, strH7, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                return Unit.f46060a;
            case 11:
                c860 c860Var = (c860) obj;
                c860Var.getClass();
                cq4 cq4Var = (cq4) this.receiver;
                cq4Var.getClass();
                zj2 zj2Var = cq4Var.c;
                zj2Var.getClass();
                AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState = (AuthenticatorFilterViewModel$ViewModelState) zj2Var.getValue();
                authenticatorFilterViewModel$ViewModelState.getClass();
                zj2Var.f(AuthenticatorFilterViewModel$ViewModelState.a(authenticatorFilterViewModel$ViewModelState, c860Var, null, 6));
                return Unit.f46060a;
            case 12:
                q760 q760Var = (q760) obj;
                q760Var.getClass();
                ((cq4) this.receiver).x(q760Var);
                return Unit.f46060a;
            case 13:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                cq4 cq4Var2 = (cq4) this.receiver;
                zj2 zj2Var2 = cq4Var2.c;
                if (bundle.getBoolean("BUNDLE_RESULT_CANCELED", false)) {
                    zj2Var2.getClass();
                    AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelStateA = (AuthenticatorFilterViewModel$ViewModelState) zj2Var2.getValue();
                    authenticatorFilterViewModel$ViewModelStateA.getClass();
                    NotificationPeriodInfo notificationPeriodInfo = authenticatorFilterViewModel$ViewModelStateA.b;
                    if (notificationPeriodInfo.d != 0 && notificationPeriodInfo.c != 0) {
                        authenticatorFilterViewModel$ViewModelStateA = AuthenticatorFilterViewModel$ViewModelState.a(authenticatorFilterViewModel$ViewModelStateA, null, NotificationPeriodInfo.a(notificationPeriodInfo, null, "", 0L, 1), 5);
                    }
                    zj2Var2.f(authenticatorFilterViewModel$ViewModelStateA);
                    cq4Var2.x(((AuthenticatorFilterViewModel$ViewModelState) zj2Var2.getValue()).c);
                } else {
                    long j = bundle.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L);
                    long j2 = bundle.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L);
                    if (j2 == 0) {
                        AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState2 = (AuthenticatorFilterViewModel$ViewModelState) zj2Var2.getValue();
                        authenticatorFilterViewModel$ViewModelState2.getClass();
                        zj2Var2.f(AuthenticatorFilterViewModel$ViewModelState.a(authenticatorFilterViewModel$ViewModelState2, null, NotificationPeriodInfo.a(authenticatorFilterViewModel$ViewModelState2.b, q760.CUSTOM, cq4.w(1000 * j).concat(" - ..."), j, 8), 5));
                        cq4Var2.d.f(new yp4(j, 0L));
                    } else {
                        AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState3 = (AuthenticatorFilterViewModel$ViewModelState) zj2Var2.getValue();
                        authenticatorFilterViewModel$ViewModelState3.getClass();
                        long j3 = j * 1000;
                        long j4 = j2 * 1000;
                        String strW = cq4.w(j3);
                        String strW2 = cq4.w(j4);
                        NotificationPeriodInfo notificationPeriodInfo2 = authenticatorFilterViewModel$ViewModelState3.b;
                        notificationPeriodInfo2.getClass();
                        zj2Var2.f(AuthenticatorFilterViewModel$ViewModelState.a(authenticatorFilterViewModel$ViewModelState3, null, new NotificationPeriodInfo(q760.CUSTOM, strW + " - " + strW2, j3, j4), 5));
                    }
                }
                return Unit.f46060a;
            case 14:
                dr4 dr4Var = (dr4) obj;
                dr4Var.getClass();
                cr4 cr4Var = (cr4) this.receiver;
                pek0 pek0Var = cr4.n2;
                boolean zR = cr4Var.R();
                phf0 phf0Var = cr4Var.k2;
                if (!zR) {
                    iiy[] iiyVarArr = cr4.o2;
                    vcc.f0(i120.V(new Pair(phf0Var.n(cr4Var, iiyVarArr[0]), dr4Var.f6542a)), cr4Var, phf0Var.n(cr4Var, iiyVarArr[0]));
                    cr4Var.y0();
                }
                ((gr4) cr4Var.m2.getValue()).x(xq4.f41297a);
                return Unit.f46060a;
            case 15:
                zq4 zq4Var = (zq4) obj;
                zq4Var.getClass();
                ((gr4) this.receiver).x(zq4Var);
                return Unit.f46060a;
            case 16:
                xo4 xo4Var2 = (xo4) obj;
                xo4Var2.getClass();
                ku4 ku4Var = (ku4) this.receiver;
                ku4Var.getClass();
                i8i.D("action", "accept", ku4Var.p.f42966a, "authenticator_request_click");
                ku4Var.u.f44833a.a(cui0.b(new j1p("accept", (byte) 0)), 3346L);
                sac.V(jiu0.a(ku4Var), new it4(ku4Var, b), new lt4(ku4Var, (byte) 0), null, new zt4(ku4Var, xo4Var2, yjeVar, b2), 12);
                return Unit.f46060a;
            case 17:
                xo4 xo4Var3 = (xo4) obj;
                xo4Var3.getClass();
                ku4 ku4Var2 = (ku4) this.receiver;
                ku4Var2.getClass();
                i8i.D("action", "decline", ku4Var2.p.f42966a, "authenticator_request_click");
                ku4Var2.u.f44833a.a(cui0.b(new j1p("decline", (byte) 0)), 3346L);
                sac.V(jiu0.a(ku4Var2), new it4(ku4Var2, (byte) 3), new lt4(ku4Var2, (byte) 3), null, new zt4(ku4Var2, xo4Var3, yjeVar, b), 12);
                return Unit.f46060a;
            case 18:
                k3q k3qVar = (k3q) obj;
                k3qVar.getClass();
                ku4 ku4Var3 = (ku4) this.receiver;
                ku4Var3.getClass();
                int iOrdinal = k3qVar.b.ordinal();
                if (iOrdinal == 0) {
                    ku4Var3.B = new NotificationTypeInfo();
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    ku4Var3.C = new NotificationPeriodInfo();
                }
                p7m0 p7m0Var = ku4Var3.A;
                do {
                    value = p7m0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj2 : (List) value) {
                        if (!Intrinsics.d((k3q) obj2, k3qVar)) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!p7m0Var.m(value, arrayList));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str5 = (String) obj;
                str5.getClass();
                fy4 fy4Var = (fy4) this.receiver;
                fy4Var.getClass();
                p7m0 p7m0Var2 = fy4Var.c0;
                do {
                    value2 = p7m0Var2.getValue();
                    stepInputUiModel = (StepInputUiModel) value2;
                    dI = kotlin.text.b.i(str5);
                } while (!p7m0Var2.m(value2, StepInputUiModel.a(stepInputUiModel, dI != null ? dI.doubleValue() : -1.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, true, false, false, false, false, false, 129022)));
                return Unit.f46060a;
            case 20:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((fy4) this.receiver).z(th7);
                return Unit.f46060a;
            case 21:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((fy4) this.receiver).z(th8);
                return Unit.f46060a;
            case 22:
                k75 k75Var = (k75) obj;
                k75Var.getClass();
                ((g85) this.receiver).x(k75Var);
                return Unit.f46060a;
            case 23:
                e2k0 e2k0Var = (e2k0) obj;
                e2k0Var.getClass();
                si5 si5Var = (si5) this.receiver;
                hfk0 hfk0Var2 = si5.Q1;
                if (e2k0Var instanceof d2k0) {
                    xdk0 xdk0Var = ((d2k0) e2k0Var).f5360a;
                    wdk0 wdk0Var4 = si5Var.M1;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var4, xdk0Var, si5Var, null, null, false, null, 1020);
                } else {
                    si5Var.getClass();
                    if (e2k0Var.equals(c2k0.f3628a)) {
                        ii iiVar3 = si5Var.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH8 = si5Var.H(R.string.caution);
                        String strH9 = si5Var.H(R.string.payment_balance_error);
                        String strH10 = si5Var.H(R.string.ok_new);
                        strH10.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, si5Var.H(R.string.cancel), (String) null, "PAYMENT_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC4 = si5Var.C();
                        eVarC4.getClass();
                        iiVar3.d(dialogFields3, eVarC4);
                    } else {
                        if (!(e2k0Var instanceof b2k0)) {
                            t9f.b();
                            return null;
                        }
                        j120.c0(si5Var.o0(), "open/paymentconsultant");
                    }
                }
                si5Var.G0().x(n1k0.f22754a);
                return Unit.f46060a;
            case 24:
                a2k0 a2k0Var = (a2k0) obj;
                a2k0Var.getClass();
                ((k3t0) this.receiver).x(a2k0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((duj) this.receiver).a(th10);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((duj) this.receiver).a(th11);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((duj) this.receiver).a(th12);
                return Unit.f46060a;
            default:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((duj) this.receiver).a(th13);
                return Unit.f46060a;
        }
    }
}
