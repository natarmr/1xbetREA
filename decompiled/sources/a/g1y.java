package a;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g1y extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10536a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1y(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f10536a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v7, types: [android.view.View] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Dialog dialog;
        Window window;
        Dialog dialog2;
        Window window2;
        Dialog dialog3;
        Window window3;
        Dialog dialog4;
        Window window4;
        Object value;
        Object decorView = null;
        switch (this.f10536a) {
            case 0:
                r1y r1yVar = (r1y) obj;
                r1yVar.getClass();
                h1y h1yVar = (h1y) this.receiver;
                int i = h1y.q2;
                h1yVar.getClass();
                if (r1yVar.equals(l1y.f19282a)) {
                    gnm0.i(h1yVar.C());
                } else if (r1yVar.equals(o1y.f24505a)) {
                    gnm0.s(h1yVar.C());
                } else if (r1yVar.equals(k1y.f17552a)) {
                    j120.Y(h1yVar);
                    View view = h1yVar.l1;
                    if (view != null) {
                        view.clearFocus();
                    }
                } else if (r1yVar.equals(m1y.f21031a)) {
                    ynb ynbVar = h1yVar.o2;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.m;
                    androidx.fragment.app.e eVarC = h1yVar.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else if (r1yVar instanceof q1y) {
                    q1y q1yVar = (q1y) r1yVar;
                    lgn0 lgn0Var = h1yVar.n2;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH = h1yVar.H(R.string.bet_processed_successfully);
                    strH.getClass();
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
                    String str = q1yVar.e;
                    String str2 = q1yVar.c;
                    String strH2 = h1yVar.H(R.string.bet_sum);
                    strH2.getClass();
                    pn40 pn40Var = pn40.f27267a;
                    lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(str, str2, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(q1yVar.b), "JACKPOT", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, h1yVar.o0()), strH2, pn40.c(q1yVar.d, p3u0.c), q1yVar.f, true))), h1yVar.p0());
                    if (!h1yVar.R()) {
                        h1yVar.y0();
                    }
                } else if (r1yVar instanceof p1y) {
                    p1y p1yVar = (p1y) r1yVar;
                    String str3 = p1yVar.f26227a;
                    boolean z = p1yVar.b;
                    wdk0 wdk0Var = h1yVar.l2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    if (!z && (dialog = h1yVar.S1) != null && (window = dialog.getWindow()) != null) {
                        decorView = window.getDecorView();
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str3, null, null, null, null, 124), h1yVar, null, decorView, false, null, 1012);
                    if (z && !h1yVar.R()) {
                        h1yVar.y0();
                    }
                } else {
                    if (!(r1yVar instanceof n1y)) {
                        t9f.b();
                        return null;
                    }
                    String str4 = ((n1y) r1yVar).f22775a;
                    ii iiVar = h1yVar.m2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH3 = h1yVar.H(R.string.error);
                    String strH4 = h1yVar.H(R.string.replenish);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) str4, (CharSequence) strH4, h1yVar.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC2 = h1yVar.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                }
                ((k3t0) h1yVar.p2.getValue()).x(w0y.f38372a);
                return Unit.f46060a;
            case 1:
                d1y d1yVar = (d1y) obj;
                d1yVar.getClass();
                ((k3t0) this.receiver).x(d1yVar);
                return Unit.f46060a;
            case 2:
                w3y w3yVar = (w3y) obj;
                w3yVar.getClass();
                o3y o3yVar = (o3y) this.receiver;
                int i2 = o3y.q2;
                o3yVar.getClass();
                if (w3yVar.equals(q3y.f28074a)) {
                    gnm0.i(o3yVar.C());
                } else if (w3yVar.equals(t3y.f33291a)) {
                    gnm0.s(o3yVar.C());
                } else if (w3yVar.equals(p3y.f26323a)) {
                    j120.Y(o3yVar);
                    View view2 = o3yVar.l1;
                    if (view2 != null) {
                        view2.clearFocus();
                    }
                } else if (w3yVar.equals(r3y.f29809a)) {
                    ynb ynbVar2 = o3yVar.o2;
                    if (ynbVar2 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var2 = bm5.m;
                    androidx.fragment.app.e eVarC3 = o3yVar.C();
                    eVarC3.getClass();
                    ynb.b(ynbVar2, bm5Var2, null, eVarC3, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else if (w3yVar instanceof v3y) {
                    v3y v3yVar = (v3y) w3yVar;
                    lgn0 lgn0Var2 = o3yVar.n2;
                    if (lgn0Var2 == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH5 = o3yVar.H(R.string.bet_processed_successfully);
                    strH5.getClass();
                    SuccessBetStringModel successBetStringModel2 = new SuccessBetStringModel(strH5, null, null, null);
                    String str5 = v3yVar.e;
                    String str6 = v3yVar.c;
                    String strH6 = o3yVar.H(R.string.bet_sum);
                    strH6.getClass();
                    pn40 pn40Var2 = pn40.f27267a;
                    lgn0Var2.c(successBetStringModel2, new SuccessBetAlertModel(str5, str6, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(v3yVar.b), "JACKPOT", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, o3yVar.o0()), strH6, pn40.c(v3yVar.d, p3u0.c), v3yVar.f, true))), o3yVar.p0());
                    o3yVar.x0();
                } else if (w3yVar instanceof u3y) {
                    u3y u3yVar = (u3y) w3yVar;
                    String str7 = u3yVar.f35018a;
                    boolean z2 = u3yVar.b;
                    wdk0 wdk0Var2 = o3yVar.l2;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    if (!z2 && (dialog2 = o3yVar.S1) != null && (window2 = dialog2.getWindow()) != null) {
                        decorView = window2.getDecorView();
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, str7, null, null, null, null, 124), o3yVar, null, decorView, false, null, 1012);
                    if (z2) {
                        o3yVar.x0();
                    }
                } else {
                    if (!(w3yVar instanceof s3y)) {
                        t9f.b();
                        return null;
                    }
                    String str8 = ((s3y) w3yVar).f31579a;
                    ii iiVar2 = o3yVar.m2;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = o3yVar.H(R.string.error);
                    String strH8 = o3yVar.H(R.string.replenish);
                    strH8.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH7, (CharSequence) str8, (CharSequence) strH8, o3yVar.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC4 = o3yVar.C();
                    eVarC4.getClass();
                    iiVar2.d(dialogFields2, eVarC4);
                }
                ((k3t0) o3yVar.p2.getValue()).x(g3y.f10636a);
                return Unit.f46060a;
            case 3:
                m3y m3yVar = (m3y) obj;
                m3yVar.getClass();
                ((k3t0) this.receiver).x(m3yVar);
                return Unit.f46060a;
            case 4:
                x4y x4yVar = (x4y) obj;
                x4yVar.getClass();
                p4y p4yVar = (p4y) this.receiver;
                int i3 = p4y.q2;
                p4yVar.getClass();
                if (x4yVar.equals(r4y.f29860a)) {
                    gnm0.i(p4yVar.C());
                } else if (x4yVar.equals(u4y.f35072a)) {
                    gnm0.s(p4yVar.C());
                } else if (x4yVar.equals(q4y.f28124a)) {
                    j120.Y(p4yVar);
                    View view3 = p4yVar.l1;
                    if (view3 != null) {
                        view3.clearFocus();
                    }
                } else if (x4yVar.equals(s4y.f31631a)) {
                    ynb ynbVar3 = p4yVar.o2;
                    if (ynbVar3 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var3 = bm5.m;
                    androidx.fragment.app.e eVarC5 = p4yVar.C();
                    eVarC5.getClass();
                    ynb.b(ynbVar3, bm5Var3, null, eVarC5, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else if (x4yVar instanceof w4y) {
                    w4y w4yVar = (w4y) x4yVar;
                    lgn0 lgn0Var3 = p4yVar.n2;
                    if (lgn0Var3 == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH9 = p4yVar.H(R.string.bet_processed_successfully);
                    strH9.getClass();
                    SuccessBetStringModel successBetStringModel3 = new SuccessBetStringModel(strH9, null, null, null);
                    String str9 = w4yVar.e;
                    String str10 = w4yVar.c;
                    String strH10 = p4yVar.H(R.string.bet_sum);
                    strH10.getClass();
                    pn40 pn40Var3 = pn40.f27267a;
                    lgn0Var3.c(successBetStringModel3, new SuccessBetAlertModel(str9, str10, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(w4yVar.b), "JACKPOT", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, p4yVar.o0()), strH10, pn40.c(w4yVar.d, p3u0.c), w4yVar.f, true))), p4yVar.p0());
                    p4yVar.x0();
                } else if (x4yVar instanceof v4y) {
                    v4y v4yVar = (v4y) x4yVar;
                    String str11 = v4yVar.f36805a;
                    boolean z3 = v4yVar.b;
                    wdk0 wdk0Var3 = p4yVar.l2;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    if (!z3 && (dialog3 = p4yVar.S1) != null && (window3 = dialog3.getWindow()) != null) {
                        decorView = window3.getDecorView();
                    }
                    wdk0.k(wdk0Var3, new xdk0(rek0.b, str11, null, null, null, null, 124), p4yVar, null, decorView, false, null, 1012);
                    if (z3) {
                        p4yVar.x0();
                    }
                } else {
                    if (!(x4yVar instanceof t4y)) {
                        t9f.b();
                        return null;
                    }
                    String str12 = ((t4y) x4yVar).f33344a;
                    ii iiVar3 = p4yVar.m2;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH11 = p4yVar.H(R.string.error);
                    String strH12 = p4yVar.H(R.string.replenish);
                    strH12.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH11, (CharSequence) str12, (CharSequence) strH12, p4yVar.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC6 = p4yVar.C();
                    eVarC6.getClass();
                    iiVar3.d(dialogFields3, eVarC6);
                }
                ((k3t0) p4yVar.p2.getValue()).x(g4y.f10691a);
                return Unit.f46060a;
            case 5:
                m4y m4yVar = (m4y) obj;
                m4yVar.getClass();
                ((k3t0) this.receiver).x(m4yVar);
                return Unit.f46060a;
            case 6:
                w5y w5yVar = (w5y) obj;
                w5yVar.getClass();
                o5y o5yVar = (o5y) this.receiver;
                int i4 = o5y.q2;
                o5yVar.getClass();
                if (w5yVar.equals(q5y.f28175a)) {
                    gnm0.i(o5yVar.C());
                } else if (w5yVar.equals(t5y.f33392a)) {
                    gnm0.s(o5yVar.C());
                } else if (w5yVar.equals(p5y.f26427a)) {
                    j120.Y(o5yVar);
                    View view4 = o5yVar.l1;
                    if (view4 != null) {
                        view4.clearFocus();
                    }
                } else if (w5yVar.equals(r5y.f29911a)) {
                    ynb ynbVar4 = o5yVar.o2;
                    if (ynbVar4 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var4 = bm5.m;
                    androidx.fragment.app.e eVarC7 = o5yVar.C();
                    eVarC7.getClass();
                    ynb.b(ynbVar4, bm5Var4, null, eVarC7, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else if (w5yVar instanceof v5y) {
                    v5y v5yVar = (v5y) w5yVar;
                    lgn0 lgn0Var4 = o5yVar.n2;
                    if (lgn0Var4 == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH13 = o5yVar.H(R.string.bet_processed_successfully);
                    strH13.getClass();
                    SuccessBetStringModel successBetStringModel4 = new SuccessBetStringModel(strH13, null, null, null);
                    String str13 = v5yVar.e;
                    String str14 = v5yVar.c;
                    String strH14 = o5yVar.H(R.string.bet_sum);
                    strH14.getClass();
                    pn40 pn40Var4 = pn40.f27267a;
                    lgn0Var4.c(successBetStringModel4, new SuccessBetAlertModel(str13, str14, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(v5yVar.b), "JACKPOT", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, o5yVar.o0()), strH14, pn40.c(v5yVar.d, p3u0.c), v5yVar.f, true))), o5yVar.p0());
                    if (!o5yVar.R()) {
                        o5yVar.y0();
                    }
                } else if (w5yVar instanceof u5y) {
                    u5y u5yVar = (u5y) w5yVar;
                    String str15 = u5yVar.f35116a;
                    boolean z4 = u5yVar.b;
                    wdk0 wdk0Var4 = o5yVar.l2;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    if (!z4 && (dialog4 = o5yVar.S1) != null && (window4 = dialog4.getWindow()) != null) {
                        decorView = window4.getDecorView();
                    }
                    wdk0.k(wdk0Var4, new xdk0(rek0.b, str15, null, null, null, null, 124), o5yVar, null, decorView, false, null, 1012);
                    if (z4 && !o5yVar.R()) {
                        o5yVar.y0();
                    }
                } else {
                    if (!(w5yVar instanceof s5y)) {
                        t9f.b();
                        return null;
                    }
                    String str16 = ((s5y) w5yVar).f31678a;
                    ii iiVar4 = o5yVar.m2;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH15 = o5yVar.H(R.string.error);
                    String strH16 = o5yVar.H(R.string.replenish);
                    strH16.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH15, (CharSequence) str16, (CharSequence) strH16, o5yVar.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC8 = o5yVar.C();
                    eVarC8.getClass();
                    iiVar4.d(dialogFields4, eVarC8);
                }
                ((k3t0) o5yVar.p2.getValue()).x(e5y.f7256a);
                return Unit.f46060a;
            case 7:
                k5y k5yVar = (k5y) obj;
                k5yVar.getClass();
                ((k3t0) this.receiver).x(k5yVar);
                return Unit.f46060a;
            case 8:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((duj) this.receiver).a(th);
                return Unit.f46060a;
            case 9:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                t6y t6yVar = (t6y) this.receiver;
                n6y n6yVar = new n6y(sa10.b(t6yVar.e, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                p7m0 p7m0Var = t6yVar.o;
                p7m0Var.getClass();
                p7m0Var.o(null, n6yVar);
                t6yVar.i.a(th2);
                return Unit.f46060a;
            case 10:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                f8y f8yVar = (f8y) this.receiver;
                f8yVar.t.b(th3, new v1x((byte) 25));
                q0y q0yVar = ((th3 instanceof UnknownHostException) || (th3 instanceof el50) || (th3 instanceof SocketTimeoutException)) ? q0y.f27925a : q0y.b;
                boolean zN = agc.N(th3);
                long j = (zN || (th3 instanceof ff5) || (th3 instanceof qct) || (th3 instanceof fhi0)) ? 10000L : ((u7y) f8yVar.D()).d;
                p7m0 p7m0Var2 = f8yVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    f8yVar.f.getClass();
                } while (!p7m0Var2.m(value, u7y.a((u7y) value, new m7y(q0yVar), null, j, zN, 6)));
                return Unit.f46060a;
            case 11:
                ((eby) this.receiver).m((Throwable) obj);
                return Unit.f46060a;
            case 12:
                aty atyVar = (aty) obj;
                atyVar.getClass();
                return ((bty) this.receiver).N(atyVar);
            case 13:
                oyy oyyVar = (oyy) obj;
                oyyVar.getClass();
                gyy gyyVar = (gyy) this.receiver;
                rqt rqtVar = gyy.P1;
                wdk0 wdk0Var5 = gyyVar.M1;
                if (wdk0Var5 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var5, new xdk0(rek0.b, oyyVar.f26080a, null, null, null, null, 124), gyyVar, null, null, false, null, 1020);
                gyyVar.G0().x(wxy.f39951a);
                return Unit.f46060a;
            case 14:
                eyy eyyVar = (eyy) obj;
                eyyVar.getClass();
                ((k3t0) this.receiver).x(eyyVar);
                return Unit.f46060a;
            case 15:
                nzy nzyVar = (nzy) obj;
                nzyVar.getClass();
                ((k3t0) this.receiver).x(nzyVar);
                return Unit.f46060a;
            case 16:
                c1z c1zVar = (c1z) obj;
                c1zVar.getClass();
                s0z s0zVar = (s0z) this.receiver;
                bst bstVar = s0z.U1;
                s0zVar.getClass();
                art artVar = q0z.n2;
                n3q n3qVar = c1zVar.f3599a;
                List list = c1zVar.b;
                artVar.getClass();
                list.getClass();
                q0z q0zVar = new q0z();
                iiy[] iiyVarArr = q0z.o2;
                q0zVar.k2.x(q0zVar, iiyVarArr[0], "FILTER_RESULT_KEY");
                q0zVar.l2.u(q0zVar, iiyVarArr[1], n3qVar);
                q0zVar.m2.D(q0zVar, iiyVarArr[2], list);
                androidx.fragment.app.e eVarC9 = s0zVar.C();
                eVarC9.getClass();
                sj3.D0(q0zVar, eVarC9);
                ((k3t0) s0zVar.S1.getValue()).x(b0z.f1782a);
                return Unit.f46060a;
            case 17:
                l0z l0zVar = (l0z) obj;
                l0zVar.getClass();
                ((k3t0) this.receiver).x(l0zVar);
                return Unit.f46060a;
            case 18:
                g950 g950Var = (g950) obj;
                g950Var.getClass();
                return ((p9z) this.receiver).N(g950Var);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g950 g950Var2 = (g950) obj;
                g950Var2.getClass();
                return ((p9z) this.receiver).O(g950Var2);
            case 20:
                moz mozVar = (moz) obj;
                mozVar.getClass();
                ((k3t0) this.receiver).x(mozVar);
                return Unit.f46060a;
            case 21:
                npz npzVar = (npz) obj;
                npzVar.getClass();
                hpz hpzVar = (hpz) this.receiver;
                tqt tqtVar = hpz.O1;
                hpzVar.getClass();
                boolean zEquals = npzVar.equals(lpz.f20462a);
                xoz xozVar = xoz.f41244a;
                if (zEquals) {
                    ii iiVar5 = hpzVar.L1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH17 = hpzVar.H(R.string.attention);
                    String strH18 = hpzVar.H(R.string.change_the_limit_question);
                    String strH19 = hpzVar.H(R.string.yes);
                    strH19.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, hpzVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC10 = hpzVar.C();
                    eVarC10.getClass();
                    iiVar5.d(dialogFields5, eVarC10);
                    hpzVar.G0().x(xozVar);
                } else if (npzVar instanceof mpz) {
                    String str17 = ((mpz) npzVar).f22200a;
                    ii iiVar6 = hpzVar.L1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH20 = hpzVar.H(R.string.attention);
                    String strH21 = hpzVar.H(R.string.yes);
                    strH21.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH20, (CharSequence) str17, (CharSequence) strH21, (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC11 = hpzVar.C();
                    eVarC11.getClass();
                    iiVar6.d(dialogFields6, eVarC11);
                    hpzVar.G0().x(xozVar);
                } else {
                    if (!npzVar.equals(kpz.f18697a)) {
                        t9f.b();
                        return null;
                    }
                    hpzVar.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    hpzVar.G0().x(xozVar);
                    hpzVar.G0().x(cpz.f4772a);
                }
                return Unit.f46060a;
            case 22:
                epz epzVar = (epz) obj;
                epzVar.getClass();
                ((k3t0) this.receiver).x(epzVar);
                return Unit.f46060a;
            case 23:
                iqz iqzVar = (iqz) obj;
                iqzVar.getClass();
                bqz bqzVar = (bqz) this.receiver;
                art artVar2 = bqz.O1;
                bqzVar.getClass();
                boolean zEquals2 = iqzVar.equals(gqz.f11757a);
                rpz rpzVar = rpz.f30908a;
                if (zEquals2) {
                    ii iiVar7 = bqzVar.L1;
                    if (iiVar7 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH22 = bqzVar.H(R.string.attention);
                    String strH23 = bqzVar.H(R.string.change_the_limit_question);
                    String strH24 = bqzVar.H(R.string.yes);
                    strH24.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH22, (CharSequence) strH23, (CharSequence) strH24, bqzVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC12 = bqzVar.C();
                    eVarC12.getClass();
                    iiVar7.d(dialogFields7, eVarC12);
                    bqzVar.G0().x(rpzVar);
                } else if (iqzVar instanceof hqz) {
                    String str18 = ((hqz) iqzVar).f13507a;
                    ii iiVar8 = bqzVar.L1;
                    if (iiVar8 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH25 = bqzVar.H(R.string.attention);
                    String strH26 = bqzVar.H(R.string.yes);
                    strH26.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH25, (CharSequence) str18, (CharSequence) strH26, (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC13 = bqzVar.C();
                    eVarC13.getClass();
                    iiVar8.d(dialogFields8, eVarC13);
                    bqzVar.G0().x(rpzVar);
                } else {
                    if (!iqzVar.equals(fqz.f9998a)) {
                        t9f.b();
                        return null;
                    }
                    bqzVar.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    bqzVar.G0().x(rpzVar);
                    bqzVar.G0().x(wpz.f39566a);
                }
                return Unit.f46060a;
            case 24:
                ypz ypzVar = (ypz) obj;
                ypzVar.getClass();
                ((k3t0) this.receiver).x(ypzVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                drz drzVar = (drz) obj;
                drzVar.getClass();
                wqz wqzVar = (wqz) this.receiver;
                bst bstVar2 = wqz.Q1;
                wqzVar.getClass();
                boolean zEquals3 = drzVar.equals(brz.f3102a);
                mqz mqzVar = mqz.f22244a;
                if (zEquals3) {
                    ii iiVar9 = wqzVar.L1;
                    if (iiVar9 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH27 = wqzVar.H(R.string.attention);
                    String strH28 = wqzVar.H(R.string.change_the_limit_question);
                    String strH29 = wqzVar.H(R.string.yes);
                    strH29.getClass();
                    DialogFields dialogFields9 = new DialogFields((CharSequence) strH27, (CharSequence) strH28, (CharSequence) strH29, wqzVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC14 = wqzVar.C();
                    eVarC14.getClass();
                    iiVar9.d(dialogFields9, eVarC14);
                    wqzVar.G0().x(mqzVar);
                } else if (drzVar instanceof crz) {
                    String str19 = ((crz) drzVar).f4867a;
                    ii iiVar10 = wqzVar.L1;
                    if (iiVar10 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH30 = wqzVar.H(R.string.attention);
                    String strH31 = wqzVar.H(R.string.yes);
                    strH31.getClass();
                    DialogFields dialogFields10 = new DialogFields((CharSequence) strH30, (CharSequence) str19, (CharSequence) strH31, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC15 = wqzVar.C();
                    eVarC15.getClass();
                    iiVar10.d(dialogFields10, eVarC15);
                    wqzVar.G0().x(mqzVar);
                } else {
                    if (!drzVar.equals(arz.f1367a)) {
                        t9f.b();
                        return null;
                    }
                    wqzVar.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    wqzVar.G0().x(mqzVar);
                    wqzVar.G0().x(rqz.f30955a);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                tqz tqzVar = (tqz) obj;
                tqzVar.getClass();
                ((k3t0) this.receiver).x(tqzVar);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                stz stzVar = (stz) obj;
                stzVar.getClass();
                ctz ctzVar = (ctz) this.receiver;
                atz atzVar = ctz.O1;
                ctzVar.getClass();
                boolean zEquals4 = stzVar.equals(qtz.f29323a);
                jsz jszVar = jsz.f17075a;
                if (zEquals4) {
                    ii iiVar11 = ctzVar.L1;
                    if (iiVar11 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH32 = ctzVar.H(R.string.attention);
                    String strH33 = ctzVar.H(R.string.change_the_limit_question);
                    String strH34 = ctzVar.H(R.string.yes);
                    strH34.getClass();
                    DialogFields dialogFields11 = new DialogFields((CharSequence) strH32, (CharSequence) strH33, (CharSequence) strH34, ctzVar.H(R.string.cancel), (String) null, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC16 = ctzVar.C();
                    eVarC16.getClass();
                    iiVar11.d(dialogFields11, eVarC16);
                    ctzVar.G0().x(jszVar);
                } else if (stzVar instanceof rtz) {
                    String str20 = ((rtz) stzVar).f31099a;
                    ii iiVar12 = ctzVar.L1;
                    if (iiVar12 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH35 = ctzVar.H(R.string.error);
                    decorView = StringsKt.W(str20) ? null : str20;
                    if (decorView == null) {
                        decorView = ctzVar.H(R.string.error_something_went_wrong);
                        decorView.getClass();
                    }
                    String strH36 = ctzVar.H(R.string.ok);
                    strH36.getClass();
                    DialogFields dialogFields12 = new DialogFields((CharSequence) strH35, (CharSequence) decorView, (CharSequence) strH36, (String) null, (String) null, "SHOW_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC17 = ctzVar.C();
                    eVarC17.getClass();
                    iiVar12.d(dialogFields12, eVarC17);
                    ctzVar.G0().x(jszVar);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                usz uszVar = (usz) obj;
                uszVar.getClass();
                ((k3t0) this.receiver).x(uszVar);
                return Unit.f46060a;
            default:
                tuz tuzVar = (tuz) obj;
                tuzVar.getClass();
                ((k3t0) this.receiver).x(tuzVar);
                return Unit.f46060a;
        }
    }
}
