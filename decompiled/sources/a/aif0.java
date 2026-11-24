package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.date.ScrollableSquaredDateView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aif0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f922a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aif0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f922a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 1;
        yje yjeVar = null;
        switch (this.f922a) {
            case 0:
                fif0 fif0Var = (fif0) obj;
                fif0Var.getClass();
                bif0 bif0Var = (bif0) this.receiver;
                lme0 lme0Var = bif0.N1;
                bif0Var.getClass();
                a8z a8zVar = bif0Var.L1;
                if (fif0Var.equals(cif0.f4411a)) {
                    wdk0 wdk0Var = ((zni) a8zVar.getValue()).k;
                    qek0 qek0Var = qek0.f28589a;
                    String strH = bif0Var.H(R.string.authenticator_disabled);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), bif0Var, null, null, false, null, 1020);
                } else if (fif0Var.equals(dif0.f6135a)) {
                    ii iiVar = ((zni) a8zVar.getValue()).l;
                    String strH2 = bif0Var.H(R.string.error);
                    String strH3 = bif0Var.H(R.string.something_went_wrong);
                    String strH4 = bif0Var.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = bif0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    if (!(fif0Var instanceof eif0)) {
                        t9f.b();
                        return null;
                    }
                    wdk0.k(((zni) a8zVar.getValue()).k, new xdk0(pek0.f26859a, ((eif0) fif0Var).f7857a, null, null, null, null, 124), bif0Var, null, null, false, null, 1020);
                }
                ((k3t0) bif0Var.M1.getValue()).x(rhf0.f30488a);
                return Unit.f46060a;
            case 1:
                xhf0 xhf0Var = (xhf0) obj;
                xhf0Var.getClass();
                ((k3t0) this.receiver).x(xhf0Var);
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                gjf0 gjf0Var = (gjf0) this.receiver;
                gjf0Var.getClass();
                if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    gjf0Var.j.f(cjf0.f4458a);
                } else {
                    gjf0Var.e.b(th, new dke0(gjf0Var, (byte) 11));
                }
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((aqf0) this.receiver).z(th2);
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((aqf0) this.receiver).z(th3);
                return Unit.f46060a;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((aqf0) this.receiver).z(th4);
                return Unit.f46060a;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((aqf0) this.receiver).z(th5);
                return Unit.f46060a;
            case 7:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((aqf0) this.receiver).z(th6);
                return Unit.f46060a;
            case 8:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((aqf0) this.receiver).z(th7);
                return Unit.f46060a;
            case 9:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((aqf0) this.receiver).z(th8);
                return Unit.f46060a;
            case 10:
                String str = (String) obj;
                str.getClass();
                wuf0 wuf0Var = (wuf0) this.receiver;
                wuf0Var.getClass();
                sac.V(jiu0.a(wuf0Var), new wtf0(b), null, null, new k6d0((Object) str, (Object) wuf0Var, yjeVar, (byte) 15), 14);
                return Unit.f46060a;
            case 11:
                d9g0 d9g0Var = (d9g0) obj;
                d9g0Var.getClass();
                y5g0 y5g0Var = (y5g0) this.receiver;
                gle0 gle0Var = y5g0.Q1;
                oll0 oll0Var = y5g0Var.L1;
                if (oll0Var == null) {
                    Intrinsics.h("sportResultHistoryEventCardFragmentDelegate");
                    throw null;
                }
                oll0Var.a(y5g0Var, d9g0Var.f5700a);
                y5g0Var.H0().x(f5g0.f8960a);
                return Unit.f46060a;
            case 12:
                n5g0 n5g0Var = (n5g0) obj;
                n5g0Var.getClass();
                ((k3t0) this.receiver).x(n5g0Var);
                return Unit.f46060a;
            case 13:
                v7g0 v7g0Var = (v7g0) obj;
                v7g0Var.getClass();
                x6g0 x6g0Var = (x6g0) this.receiver;
                lme0 lme0Var2 = x6g0.Q1;
                x6g0Var.getClass();
                String strJ = sre0.f32672a.b(n7g0.class).J();
                if (x6g0Var.C().J(strJ) == null) {
                    cge0 cge0Var = n7g0.p2;
                    phf0 phf0Var = x6g0Var.N1;
                    iiy[] iiyVarArr = x6g0.R1;
                    String strN = phf0Var.n(x6g0Var, iiyVarArr[1]);
                    long jLongValue = x6g0Var.O1.n(x6g0Var, iiyVarArr[2]).longValue();
                    String str2 = v7g0Var.f36924a;
                    cge0Var.getClass();
                    strN.getClass();
                    n7g0 n7g0Var = new n7g0();
                    iiy[] iiyVarArr2 = n7g0.q2;
                    n7g0Var.l2.x(n7g0Var, iiyVarArr2[0], strN);
                    n7g0Var.m2.j(n7g0Var, iiyVarArr2[1], jLongValue);
                    n7g0Var.n2.x(n7g0Var, iiyVarArr2[2], str2);
                    n7g0Var.H0(x6g0Var.C(), strJ);
                }
                ((k3t0) x6g0Var.P1.getValue()).x(f6g0.f9008a);
                return Unit.f46060a;
            case 14:
                h6g0 h6g0Var = (h6g0) obj;
                h6g0Var.getClass();
                ((k3t0) this.receiver).x(h6g0Var);
                return Unit.f46060a;
            case 15:
                z6g0 z6g0Var = (z6g0) obj;
                z6g0Var.getClass();
                ((k3t0) this.receiver).x(z6g0Var);
                return Unit.f46060a;
            case 16:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                m8g0 m8g0Var = (m8g0) this.receiver;
                m8g0Var.u.b(th9, new dke0(m8g0Var, (byte) 16));
                return Unit.f46060a;
            case 17:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                pbg0 pbg0Var = (pbg0) this.receiver;
                pbg0Var.f.b(th10, new dke0(pbg0Var, (byte) 17));
                return Unit.f46060a;
            case 18:
                ing0 ing0Var = (ing0) obj;
                ing0Var.getClass();
                wlg0 wlg0Var = (wlg0) this.receiver;
                cge0 cge0Var2 = wlg0.X1;
                wlg0Var.getClass();
                rek0 rek0Var = rek0.b;
                if (!(ing0Var instanceof eng0)) {
                    if (ing0Var instanceof fng0) {
                        wlg0Var.w0(new Intent("android.intent.action.DIAL", ((fng0) ing0Var).f9836a));
                    } else if (ing0Var instanceof gng0) {
                        String str3 = ((gng0) ing0Var).f11585a;
                        kxq kxqVarN0 = wlg0Var.n0();
                        wdk0 wdk0Var2 = wlg0Var.N1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        if (j0g0.a(n6x.u0(kxqVarN0, wdk0Var2, str3)) != null) {
                            String strH5 = wlg0Var.H(R.string.open_browser_error_message);
                            strH5.getClass();
                            xdk0 xdk0Var = new xdk0(rek0Var, strH5, null, null, null, null, 124);
                            wdk0 wdk0Var3 = wlg0Var.N1;
                            if (wdk0Var3 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            wdk0.k(wdk0Var3, xdk0Var, wlg0Var, null, null, false, null, 1020);
                        }
                    } else {
                        if (!(ing0Var instanceof hng0)) {
                            t9f.b();
                            return null;
                        }
                        try {
                            wlg0Var.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(((hng0) ing0Var).f13351a)));
                        } catch (Exception unused) {
                            if (wlg0Var.N()) {
                                wdk0 wdk0Var4 = wlg0Var.N1;
                                if (wdk0Var4 == null) {
                                    Intrinsics.h("snackbarManager");
                                    throw null;
                                }
                                String strH6 = wlg0Var.H(R.string.intent_app_not_installed);
                                strH6.getClass();
                                wdk0.k(wdk0Var4, new xdk0(rek0Var, strH6, null, null, null, null, 124), wlg0Var, null, null, false, null, 1020);
                            }
                        }
                    }
                    break;
                } else {
                    String str4 = ((eng0) ing0Var).f8093a;
                    Context contextD = wlg0Var.D();
                    if (contextD != null) {
                        j120.c0(contextD, str4);
                    }
                }
                wlg0Var.G0().x(jlg0.f16716a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                olg0 olg0Var = (olg0) obj;
                olg0Var.getClass();
                ((k3t0) this.receiver).x(olg0Var);
                return Unit.f46060a;
            case 20:
                olg0 olg0Var2 = (olg0) obj;
                olg0Var2.getClass();
                ((k3t0) this.receiver).x(olg0Var2);
                return Unit.f46060a;
            case 21:
                rvg0 rvg0Var = (rvg0) obj;
                rvg0Var.getClass();
                avg0 avg0Var = (avg0) this.receiver;
                cge0 cge0Var3 = avg0.P1;
                avg0Var.getClass();
                if (rvg0Var instanceof ovg0) {
                    gl5 gl5Var = tj7.t2;
                    androidx.fragment.app.e eVarC2 = avg0Var.C();
                    eVarC2.getClass();
                    String str5 = avg0Var.G0().f46405a;
                    ovg0 ovg0Var = (ovg0) rvg0Var;
                    String str6 = ovg0Var.b;
                    double d = ovg0Var.f25924a;
                    double d2 = ovg0Var.c;
                    double d3 = ovg0Var.d;
                    boolean z = ovg0Var.e;
                    gl5Var.getClass();
                    gl5.n(eVarC2, str5, str6, d, d2, d3, z);
                } else if (rvg0Var instanceof pvg0) {
                    wdk0 wdk0Var5 = avg0Var.L1;
                    if (wdk0Var5 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var5, ((pvg0) rvg0Var).f27662a, avg0Var, null, null, false, null, 1020);
                } else {
                    if (!(rvg0Var instanceof qvg0)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.V(new Pair("BUNDLE_BET_ID", avg0Var.G0().f46405a), new Pair("REQUEST_KEY_HIDE_COUPON", Boolean.valueOf(((qvg0) rvg0Var).f29385a))), avg0Var, "REQUEST_KEY_SUCCESS_SALE");
                }
                avg0Var.H0().x(mtg0.f22369a);
                return Unit.f46060a;
            case 22:
                ttg0 ttg0Var = (ttg0) obj;
                ttg0Var.getClass();
                ((k3t0) this.receiver).x(ttg0Var);
                return Unit.f46060a;
            case 23:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((w6h0) this.receiver).w(th11);
                return Unit.f46060a;
            case 24:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((w6h0) this.receiver).w(th12);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((w6h0) this.receiver).w(th13);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Date date = (Date) obj;
                date.getClass();
                ScrollableSquaredDateView scrollableSquaredDateView = (ScrollableSquaredDateView) this.receiver;
                int i = ScrollableSquaredDateView.j;
                scrollableSquaredDateView.d(date);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Date date2 = (Date) obj;
                date2.getClass();
                ScrollableSquaredDateView scrollableSquaredDateView2 = (ScrollableSquaredDateView) this.receiver;
                int i2 = ScrollableSquaredDateView.j;
                scrollableSquaredDateView2.d(date2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hhh0 hhh0Var = (hhh0) obj;
                hhh0Var.getClass();
                xfh0 xfh0Var = (xfh0) this.receiver;
                cge0 cge0Var4 = xfh0.V1;
                if (hhh0Var instanceof fhh0) {
                    ujd ujdVar = xfh0Var.L1;
                    if (ujdVar == null) {
                        Intrinsics.h("altDesignGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(xfh0Var, ((fhh0) hhh0Var).f9541a);
                } else if (hhh0Var instanceof ghh0) {
                    oll0 oll0Var2 = xfh0Var.K1;
                    if (oll0Var2 == null) {
                        Intrinsics.h("sportResultHistoryEventCardFragmentDelegate");
                        throw null;
                    }
                    oll0Var2.a(xfh0Var, ((ghh0) hhh0Var).f11299a);
                } else {
                    xfh0Var.getClass();
                    if (!hhh0Var.equals(ehh0.f7810a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(xfh0Var);
                }
                xfh0Var.G0().x(neh0.f23386a);
                return Unit.f46060a;
            default:
                xeh0 xeh0Var = (xeh0) obj;
                xeh0Var.getClass();
                ((k3t0) this.receiver).x(xeh0Var);
                return Unit.f46060a;
        }
    }
}
