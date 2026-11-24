package a;

import android.app.Dialog;
import android.content.Intent;
import android.os.PowerManager;
import android.view.ViewGroup;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.online_call.impl.service.OnlineCallService;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gk70 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11432a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk70(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f11432a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PowerManager.WakeLock wakeLock;
        PowerManager.WakeLock wakeLock2;
        Window window;
        Object value;
        Object value2;
        Object value3;
        String str;
        Object value4;
        d980 d980Var;
        a980 a980Var;
        byte b = 16;
        byte b2 = 15;
        byte b3 = 1;
        yje yjeVar = null;
        switch (this.f11432a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((jk70) this.receiver).x(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((jk70) this.receiver).x(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((jk70) this.receiver).x(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((jk70) this.receiver).x(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((yk70) this.receiver).x(th5);
                return Unit.f46060a;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((yk70) this.receiver).x(th6);
                return Unit.f46060a;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((yk70) this.receiver).x(th7);
                return Unit.f46060a;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((yk70) this.receiver).x(th8);
                return Unit.f46060a;
            case 8:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ol70 ol70Var = (ol70) this.receiver;
                ol70Var.getClass();
                sac.V(jiu0.a(ol70Var), nl70.f23714a, null, ol70Var.l.f22085a, new wk70(ol70Var, th9, yjeVar, (byte) 3), 10);
                return Unit.f46060a;
            case 9:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                nm70 nm70Var = (nm70) this.receiver;
                nm70Var.getClass();
                sac.V(jiu0.a(nm70Var), km70.f18525a, null, nm70Var.r.f22085a, new wk70(nm70Var, th10, yjeVar, (byte) 6), 10);
                return Unit.f46060a;
            case 10:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((to70) this.receiver).C(th11);
                return Unit.f46060a;
            case 11:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((to70) this.receiver).C(th12);
                return Unit.f46060a;
            case 12:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((to70) this.receiver).C(th13);
                return Unit.f46060a;
            case 13:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((sp70) this.receiver).E(th14);
                return Unit.f46060a;
            case 14:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((sp70) this.receiver).E(th15);
                return Unit.f46060a;
            case 15:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((sp70) this.receiver).E(th16);
                return Unit.f46060a;
            case 16:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((sp70) this.receiver).E(th17);
                return Unit.f46060a;
            case 17:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((sp70) this.receiver).E(th18);
                return Unit.f46060a;
            case 18:
                cu70 cu70Var = (cu70) obj;
                cu70Var.getClass();
                kr70 kr70Var = (kr70) this.receiver;
                jh70 jh70Var = kr70.S1;
                kr70Var.getClass();
                if (cu70Var.equals(zt70.f44943a)) {
                    ii iiVar = kr70Var.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = kr70Var.H(R.string.error);
                    String strH2 = kr70Var.H(R.string.internet_error_repeat);
                    String strH3 = kr70Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "NETWORK_CONNECTION_LOST_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = kr70Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (cu70Var.equals(wt70.f39727a)) {
                    wdk0 wdk0Var = kr70Var.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH4 = kr70Var.H(R.string.connection_error);
                    strH4.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH4, null, null, null, null, 124), kr70Var, null, null, false, null, 1020);
                } else if (cu70Var.equals(xt70.f41451a)) {
                    wdk0 wdk0Var2 = kr70Var.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    pek0 pek0Var = pek0.f26859a;
                    String strH5 = kr70Var.H(R.string.support_sip_call_error_message);
                    strH5.getClass();
                    wdk0.k(wdk0Var2, new xdk0(pek0Var, strH5, null, null, null, Integer.valueOf(R.drawable.ic_glyph_support), 92), kr70Var, null, null, false, null, 1020);
                } else if (cu70Var.equals(yt70.f43204a)) {
                    ii iiVar2 = kr70Var.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH6 = kr70Var.H(R.string.error);
                    String strH7 = kr70Var.H(R.string.frequent_language_change);
                    String strH8 = kr70Var.H(R.string.ok_new);
                    strH8.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC2 = kr70Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else if (cu70Var instanceof bu70) {
                    String str2 = ((bu70) cu70Var).f3218a;
                    ii iiVar3 = kr70Var.M1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH9 = kr70Var.H(R.string.caution);
                    String strH10 = kr70Var.H(R.string.permission_message_phone);
                    String strH11 = kr70Var.H(R.string.permission_allow);
                    strH11.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, kr70Var.H(R.string.cancel), (String) null, str2, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC3 = kr70Var.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                } else if (cu70Var.equals(st70.f32760a)) {
                    qog0 qog0Var = (qog0) kr70Var.Q1.getValue();
                    lz9 lz9Var = new lz9(qog0Var, kr70Var, b3);
                    qog0Var.getClass();
                    qog0Var.f29072a.add(lz9Var);
                    qog0Var.a();
                } else if (cu70Var.equals(tt70.f34497a)) {
                    if (!sj3.p0(kr70Var.n0(), OnlineCallService.class)) {
                        kr70Var.n0().startService(new Intent(kr70Var.o0(), (Class<?>) OnlineCallService.class));
                    }
                } else if (cu70Var instanceof vt70) {
                    boolean z = ((vt70) cu70Var).f37991a;
                    PowerManager.WakeLock wakeLockNewWakeLock = kr70Var.R1;
                    if (wakeLockNewWakeLock == null) {
                        Object systemService = kr70Var.n0().getSystemService("power");
                        systemService.getClass();
                        wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(536870944, "ProximitySensor.TAG");
                        kr70Var.R1 = wakeLockNewWakeLock;
                    }
                    if (z) {
                        if ((wakeLockNewWakeLock == null || !wakeLockNewWakeLock.isHeld()) && (wakeLock2 = kr70Var.R1) != null) {
                            wakeLock2.acquire();
                        }
                    } else if (wakeLockNewWakeLock != null && wakeLockNewWakeLock.isHeld() && (wakeLock = kr70Var.R1) != null) {
                        wakeLock.release();
                    }
                } else if (cu70Var.equals(ut70.f36244a)) {
                    int i = qfc.m2;
                    androidx.fragment.app.e eVarC4 = kr70Var.C();
                    eVarC4.getClass();
                    if (eVarC4.J("ChooseLanguageBottomSheetDialog") == null) {
                        new qfc().H0(eVarC4, "ChooseLanguageBottomSheetDialog");
                    }
                } else {
                    if (!(cu70Var instanceof au70)) {
                        t9f.b();
                        return null;
                    }
                    String str3 = ((au70) cu70Var).f1464a;
                    nh70 nh70Var = gs70.r2;
                    androidx.fragment.app.e eVarC5 = kr70Var.C();
                    eVarC5.getClass();
                    nh70Var.getClass();
                    String str4 = gs70.t2;
                    if (eVarC5.J(str4) == null) {
                        gs70 gs70Var = new gs70();
                        gs70Var.q2.x(gs70Var, gs70.s2[0], str3);
                        gs70Var.H0(eVarC5, str4);
                    }
                }
                kr70Var.G0().x(fq70.f9959a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pq70 pq70Var = (pq70) obj;
                pq70Var.getClass();
                ((k3t0) this.receiver).x(pq70Var);
                return Unit.f46060a;
            case 20:
                ts70 ts70Var = (ts70) obj;
                ts70Var.getClass();
                gs70 gs70Var2 = (gs70) this.receiver;
                nh70 nh70Var2 = gs70.r2;
                gs70Var2.getClass();
                if (ts70Var instanceof qs70) {
                    Dialog dialog = gs70Var2.S1;
                    ViewGroup viewGroup = (dialog == null || (window = dialog.getWindow()) == null) ? null : (ViewGroup) window.findViewById(android.R.id.content);
                    wdk0 wdk0Var3 = gs70Var2.m2;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, new xdk0(rek0.b, ((qs70) ts70Var).f29246a, null, null, null, null, 124), gs70Var2, null, viewGroup, false, null, 1012);
                } else if (ts70Var instanceof ss70) {
                    ii iiVar4 = gs70Var2.k2;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH12 = gs70Var2.H(R.string.attention);
                    String strH13 = gs70Var2.H(R.string.rate_consultant_rating_not_saved);
                    String strH14 = gs70Var2.H(R.string.rate_consultant_interrupt);
                    strH14.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, gs70Var2.H(R.string.rate_consultant_cancel), (String) null, "DIALOG_EXIT_WITHOUT_SAVE_REQUEST", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = gs70Var2.C();
                    eVarC6.getClass();
                    iiVar4.d(dialogFields4, eVarC6);
                } else if (ts70Var instanceof rs70) {
                    ii iiVar5 = gs70Var2.k2;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH15 = gs70Var2.H(R.string.chat_rate_saved);
                    String strH16 = gs70Var2.H(R.string.chat_rate_thanks);
                    String strH17 = gs70Var2.H(R.string.ok);
                    strH17.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, (String) null, (String) null, "DIALOG_EXIT_WITH_SUCCESS_REQUEST", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1496);
                    androidx.fragment.app.e eVarC7 = gs70Var2.C();
                    eVarC7.getClass();
                    iiVar5.d(dialogFields5, eVarC7);
                }
                gs70Var2.P0().x(wr70.f39626a);
                return Unit.f46060a;
            case 21:
                cs70 cs70Var = (cs70) obj;
                cs70Var.getClass();
                ((k3t0) this.receiver).x(cs70Var);
                return Unit.f46060a;
            case 22:
                cs70 cs70Var2 = (cs70) obj;
                cs70Var2.getClass();
                ((k3t0) this.receiver).x(cs70Var2);
                return Unit.f46060a;
            case 23:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                n880 n880Var = (n880) this.receiver;
                p7m0 p7m0Var = n880Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    n880Var.f.getClass();
                } while (!p7m0Var.m(value, y780.a((y780) value, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 229375)));
                n880Var.C.b(th19, new ds60(n880Var, b2));
                return Unit.f46060a;
            case 24:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                n880 n880Var2 = (n880) this.receiver;
                p7m0 p7m0Var2 = n880Var2.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    n880Var2.f.getClass();
                } while (!p7m0Var2.m(value2, y780.a((y780) value2, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 229375)));
                n880Var2.C.b(th20, new ds60(n880Var2, b2));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                n880 n880Var3 = (n880) this.receiver;
                p7m0 p7m0Var3 = n880Var3.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    n880Var3.f.getClass();
                } while (!p7m0Var3.m(value3, y780.a((y780) value3, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 229375)));
                n880Var3.C.b(th21, new ds60(n880Var3, b2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iqt0 iqt0Var = (iqt0) obj;
                iqt0Var.getClass();
                aa80 aa80Var = (aa80) this.receiver;
                aa80Var.getClass();
                aa80Var.h.a(iqt0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str5 = (String) obj;
                str5.getClass();
                aa80 aa80Var2 = (aa80) this.receiver;
                aa80Var2.getClass();
                p7m0 p7m0Var4 = aa80Var2.z;
                a980 a980Var2 = ((d980) p7m0Var4.getValue()).d;
                if (a980Var2 != null && (str = a980Var2.e) != null) {
                    do {
                        value4 = p7m0Var4.getValue();
                        d980Var = (d980) value4;
                        a980 a980Var3 = d980Var.d;
                        if (a980Var3 != null) {
                            int i2 = a980Var3.f465a;
                            String str6 = a980Var3.b;
                            String str7 = a980Var3.c;
                            String str8 = a980Var3.d;
                            boolean z2 = a980Var3.f;
                            str7.getClass();
                            str8.getClass();
                            a980Var = new a980(i2, str6, str7, str8, str, z2);
                        } else {
                            a980Var = null;
                        }
                    } while (!p7m0Var4.m(value4, d980.a(d980Var, false, null, c980.a(d980Var.c, str5, "", 1), a980Var, null, false, false, 115)));
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th22 = (Throwable) obj;
                th22.getClass();
                aa80 aa80Var3 = (aa80) this.receiver;
                aa80Var3.B(false);
                aa80Var3.p.b(th22, new ds60(aa80Var3, b));
                return Unit.f46060a;
            default:
                Throwable th23 = (Throwable) obj;
                th23.getClass();
                aa80 aa80Var4 = (aa80) this.receiver;
                aa80Var4.B(false);
                aa80Var4.p.b(th23, new ds60(aa80Var4, b));
                return Unit.f46060a;
        }
    }
}
