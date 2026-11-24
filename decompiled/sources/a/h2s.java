package a;

import android.content.Context;
import android.widget.Toast;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h2s extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12350a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2s(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f12350a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 12;
        byte b2 = 3;
        byte b3 = 20;
        byte b4 = 1;
        byte b5 = 0;
        yje yjeVar = null;
        switch (this.f12350a) {
            case 0:
                v1s v1sVar = (v1s) obj;
                v1sVar.getClass();
                ((k3t0) this.receiver).x(v1sVar);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                k4s k4sVar = (k4s) this.receiver;
                k4sVar.v.f(th, new j3s(k4sVar, b5));
                return Unit.f46060a;
            case 2:
                q7s q7sVar = (q7s) obj;
                q7sVar.getClass();
                i7s i7sVar = (i7s) this.receiver;
                nek nekVar = i7s.a2;
                i7sVar.getClass();
                if (q7sVar instanceof n7s) {
                    j120.P(i7sVar, new gmo(i7sVar, q7sVar, (byte) 23));
                } else if (q7sVar.equals(o7s.f24801a)) {
                    j120.P(i7sVar, new e7s(i7sVar, b4));
                } else if (q7sVar.equals(o7s.b)) {
                    wdk0 wdk0Var = i7sVar.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH = i7sVar.H(R.string.one_click_bet_disabled_message);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), i7sVar, null, null, false, null, 1020);
                } else if (q7sVar instanceof p7s) {
                    i7sVar.C().t0(i120.V(new Pair("BUNDLE_KEY_GAME_ID", Long.valueOf(((p7s) q7sVar).f26521a))), "REQUEST_KEY_UPDATE_GAME_ID");
                } else {
                    if (!(q7sVar instanceof m7s)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var2 = i7sVar.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH2 = i7sVar.H(((m7s) q7sVar).f21335a);
                    strH2.getClass();
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, strH2, null, null, null, null, 124), i7sVar, null, null, false, null, 1020);
                }
                i7sVar.I0().x(n6s.f23009a);
                return Unit.f46060a;
            case 3:
                v6s v6sVar = (v6s) obj;
                v6sVar.getClass();
                ((k3t0) this.receiver).x(v6sVar);
                return Unit.f46060a;
            case 4:
                v6s v6sVar2 = (v6s) obj;
                v6sVar2.getClass();
                ((k3t0) this.receiver).x(v6sVar2);
                return Unit.f46060a;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                g9s g9sVar = (g9s) this.receiver;
                g9sVar.t.f(th2, new b8s(g9sVar, b4));
                return Unit.f46060a;
            case 6:
                dbs dbsVar = (dbs) obj;
                dbsVar.getClass();
                ((k3t0) this.receiver).x(dbsVar);
                return Unit.f46060a;
            case 7:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                sbs sbsVar = (sbs) this.receiver;
                sbsVar.q.b(th3, new jar(sbsVar, b));
                return Unit.f46060a;
            case 8:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                sbs sbsVar2 = (sbs) this.receiver;
                int i = sbs.D;
                sbsVar2.q.b(th4, new jar(sbsVar2, b));
                return Unit.f46060a;
            case 9:
                amr amrVar = (amr) obj;
                amrVar.getClass();
                ((k3t0) this.receiver).x(amrVar);
                return Unit.f46060a;
            case 10:
                mjs mjsVar = (mjs) obj;
                mjsVar.getClass();
                cjs cjsVar = (cjs) this.receiver;
                nek nekVar2 = cjs.a2;
                cjsVar.getClass();
                if (mjsVar instanceof jjs) {
                    j120.P(cjsVar, new gmo(cjsVar, mjsVar, (byte) 24));
                } else if (mjsVar.equals(kjs.f18401a)) {
                    j120.P(cjsVar, new xis(cjsVar, b2));
                } else if (mjsVar.equals(kjs.b)) {
                    wdk0 wdk0Var3 = cjsVar.O1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var2 = qek0.f28589a;
                    String strH3 = cjsVar.H(R.string.one_click_bet_disabled_message);
                    strH3.getClass();
                    wdk0.k(wdk0Var3, new xdk0(qek0Var2, strH3, null, null, null, null, 124), cjsVar, null, null, false, null, 1020);
                } else if (mjsVar instanceof ljs) {
                    cjsVar.C().t0(i120.V(new Pair("BUNDLE_KEY_GAME_ID", Long.valueOf(((ljs) mjsVar).f20166a))), "REQUEST_KEY_UPDATE_GAME_ID");
                } else {
                    if (!(mjsVar instanceof ijs)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var4 = cjsVar.O1;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var2 = rek0.b;
                    String strH4 = cjsVar.H(((ijs) mjsVar).f14890a);
                    strH4.getClass();
                    wdk0.k(wdk0Var4, new xdk0(rek0Var2, strH4, null, null, null, null, 124), cjsVar, null, null, false, null, 1020);
                }
                cjsVar.I0().x(mis.f21860a);
                return Unit.f46060a;
            case 11:
                sis sisVar = (sis) obj;
                sisVar.getClass();
                ((k3t0) this.receiver).x(sisVar);
                return Unit.f46060a;
            case 12:
                sis sisVar2 = (sis) obj;
                sisVar2.getClass();
                ((k3t0) this.receiver).x(sisVar2);
                return Unit.f46060a;
            case 13:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                yks yksVar = (yks) this.receiver;
                yksVar.t.f(th5, new vjs(yksVar, b5));
                return Unit.f46060a;
            case 14:
                pns pnsVar = (pns) obj;
                pnsVar.getClass();
                gns gnsVar = (gns) this.receiver;
                pek pekVar = gns.R1;
                gnsVar.getClass();
                if (pnsVar instanceof nns) {
                    wdk0 wdk0Var5 = gnsVar.L1;
                    if (wdk0Var5 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    pek0 pek0Var = pek0.f26859a;
                    String strH5 = gnsVar.H(R.string.mns_unsupported_sport);
                    strH5.getClass();
                    wdk0.k(wdk0Var5, new xdk0(pek0Var, strH5, null, null, null, null, 124), gnsVar, null, null, false, null, 1020);
                } else if (pnsVar instanceof hns) {
                    Context contextO0 = gnsVar.o0();
                    Toast.makeText(contextO0, contextO0.getString(R.string.data_load_error), 1).show();
                } else if (pnsVar instanceof jns) {
                    androidx.fragment.app.e eVarC = gnsVar.C();
                    eVarC.getClass();
                    if (!gns.H0(eVarC)) {
                        ii iiVar = gnsVar.K1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = gnsVar.H(R.string.confirmation);
                        String strH7 = gnsVar.H(R.string.system_push_notification_setting);
                        String strH8 = gnsVar.H(R.string.open_settings);
                        strH8.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, gnsVar.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = gnsVar.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    }
                } else if (pnsVar instanceof mns) {
                    androidx.fragment.app.e eVarC3 = gnsVar.C();
                    eVarC3.getClass();
                    if (!gns.H0(eVarC3)) {
                        ii iiVar2 = gnsVar.K1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH9 = gnsVar.H(R.string.confirmation);
                        String strH10 = gnsVar.H(R.string.push_tracking_alert_message);
                        String strH11 = gnsVar.H(R.string.activate);
                        strH11.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, gnsVar.H(R.string.cancel), (String) null, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC4 = gnsVar.C();
                        eVarC4.getClass();
                        iiVar2.d(dialogFields2, eVarC4);
                    }
                } else if (pnsVar instanceof ons) {
                    Context contextO1 = gnsVar.o0();
                    Toast.makeText(contextO1, contextO1.getString(R.string.error), 1).show();
                    gnsVar.G0().x(new sms(gns.class.getSimpleName()));
                } else if (pnsVar instanceof ins) {
                    vcc.f0(i120.V(new Pair("bundle_key_notification_update", Boolean.TRUE)), gnsVar, "request_key_notification_updated");
                    gnsVar.G0().x(new sms(gns.class.getSimpleName()));
                } else if (pnsVar instanceof lns) {
                    Context contextO2 = gnsVar.o0();
                    Toast.makeText(contextO2, contextO2.getString(R.string.error), 1).show();
                    gnsVar.G0().x(new sms(gns.class.getSimpleName()));
                } else {
                    if (!(pnsVar instanceof kns)) {
                        t9f.b();
                        return null;
                    }
                    androidx.fragment.app.e eVarC5 = gnsVar.C();
                    eVarC5.getClass();
                    if (!gns.H0(eVarC5)) {
                        ii iiVar3 = gnsVar.K1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH12 = gnsVar.H(R.string.attention);
                        String strH13 = gnsVar.H(R.string.self_exclusion_changes_prohibited);
                        String strH14 = gnsVar.H(R.string.ok_new);
                        strH14.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, (String) null, (String) null, "REQUEST_SELF_EXCLUSION_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC6 = gnsVar.C();
                        eVarC6.getClass();
                        iiVar3.d(dialogFields3, eVarC6);
                    }
                }
                gnsVar.G0().x(qms.f29000a);
                return Unit.f46060a;
            case 15:
                ans ansVar = (ans) obj;
                ansVar.getClass();
                ((k3t0) this.receiver).x(ansVar);
                return Unit.f46060a;
            case 16:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((zns) this.receiver).Q(th6);
                return Unit.f46060a;
            case 17:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((zns) this.receiver).Q(th7);
                return Unit.f46060a;
            case 18:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                zns znsVar = (zns) this.receiver;
                znsVar.getClass();
                qjj.W(jiu0.a(znsVar), null, null, new j0s(th8, znsVar, yjeVar, (byte) 5), 3);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((zns) this.receiver).Q(th9);
                return Unit.f46060a;
            case 20:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((zns) this.receiver).Q(th10);
                return Unit.f46060a;
            case 21:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((zns) this.receiver).Q(th11);
                return Unit.f46060a;
            case 22:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((zns) this.receiver).Q(th12);
                return Unit.f46060a;
            case 23:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                q3t q3tVar = (q3t) this.receiver;
                q3tVar.getClass();
                sac.V(jiu0.a(q3tVar), p3t.f26316a, null, q3tVar.l.f22085a, new cbq(q3tVar, th13, yjeVar, b3), 10);
                return Unit.f46060a;
            case 24:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                q3t q3tVar2 = (q3t) this.receiver;
                q3tVar2.getClass();
                sac.V(jiu0.a(q3tVar2), p3t.f26316a, null, q3tVar2.l.f22085a, new cbq(q3tVar2, th14, yjeVar, b3), 10);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((a9t) this.receiver).x(th15);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((a9t) this.receiver).x(th16);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((a9t) this.receiver).x(th17);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((a9t) this.receiver).x(th18);
                return Unit.f46060a;
            default:
                zft zftVar = (zft) obj;
                zftVar.getClass();
                wft wftVar = (wft) this.receiver;
                bek bekVar = wft.n2;
                nk90 nk90Var = zftVar.f44315a;
                yzn0 yzn0Var = wftVar.m2;
                iiy[] iiyVarArr = wft.o2;
                vcc.f0(i120.V(new Pair("GENDER_CHOICE_ITEM_KEY", nk90Var)), wftVar, "GENDER_CHOICE_ITEM_KEY");
                wftVar.y0();
                ((k3t0) wftVar.l2.getValue()).x(qft.f28653a);
                return Unit.f46060a;
        }
    }
}
