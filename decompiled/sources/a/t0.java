package a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feed.navigation.OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;
import org.xplatform.market_statistic.navigation.MarketStatisticScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;
import org.xplatform.sportgame.bets_on_players.impl.navigation.BetsOnPlayersScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.cards_info_settings.impl.navigation.CardsInfoSettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.sportgame.markets.display_settings.impl.navigation.MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f33093a = b;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0638 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x063a A[LOOP:4: B:191:0x05f0->B:203:0x063a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x063e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wx40 wx40Var;
        Object value;
        Object iwVar;
        byte b = 1;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.f33093a) {
            case 0:
                obj.getClass();
                u0 u0Var = (u0) this.receiver;
                swq swqVarD = u0Var.d(obj);
                if (swqVarD == null) {
                    return null;
                }
                if (cey.n.contains(swqVarD)) {
                    wx40Var = wx40.f39914a;
                } else {
                    if (!cey.o.contains(swqVarD)) {
                        return null;
                    }
                    wx40Var = wx40.b;
                }
                zlf0 zlf0Var = (zlf0) ((w0) u0Var.f34829a.d).invoke(swqVarD);
                zlf0Var.getClass();
                if (zlf0Var == zlf0.IGNORE) {
                    return null;
                }
                if (!zlf0Var.a() || u0Var.h()) {
                    return new lov0(wx40Var, zlf0Var.a());
                }
                return null;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                s1 s1Var = (s1) this.receiver;
                jy40 jy40Var = s1Var.f1;
                if (zBooleanValue) {
                    s1Var.k1();
                } else {
                    if (s1Var.q != null) {
                        Object[] objArr6 = jy40Var.c;
                        long[] jArr = jy40Var.f17342a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            qjj.W(s1Var.N0(), null, null, new q1(s1Var, (jub0) objArr6[(i << 3) + i4], objArr2 == true ? 1 : 0, b2), 3);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                    }
                                    if (i3 == i2) {
                                        if (i != length) {
                                            i++;
                                        }
                                    }
                                } else if (i != length) {
                                    i++;
                                }
                            }
                        }
                        jub0 jub0Var = s1Var.h1;
                        if (jub0Var != null) {
                            qjj.W(s1Var.N0(), null, null, new q1(s1Var, jub0Var, objArr == true ? 1 : 0, (byte) 1), 3);
                        }
                    }
                    jy40Var.a();
                    s1Var.h1 = null;
                    s1Var.l1();
                }
                return Unit.f46060a;
            case 2:
                cc ccVar = (cc) obj;
                ccVar.getClass();
                ((ab) this.receiver).C(ccVar);
                return Unit.f46060a;
            case 3:
                cc ccVar2 = (cc) obj;
                ccVar2.getClass();
                ((ab) this.receiver).C(ccVar2);
                return Unit.f46060a;
            case 4:
                cc ccVar3 = (cc) obj;
                ccVar3.getClass();
                ((ab) this.receiver).C(ccVar3);
                return Unit.f46060a;
            case 5:
                cc ccVar4 = (cc) obj;
                ccVar4.getClass();
                ((ab) this.receiver).C(ccVar4);
                return Unit.f46060a;
            case 6:
                Throwable th = (Throwable) obj;
                th.getClass();
                ab abVar = (ab) this.receiver;
                abVar.d.b(th, new v9(abVar, b2));
                return Unit.f46060a;
            case 7:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ab abVar2 = (ab) this.receiver;
                abVar2.d.b(th2, new v9(abVar2, b2));
                return Unit.f46060a;
            case 8:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ab abVar3 = (ab) this.receiver;
                abVar3.d.b(th3, new v9(abVar3, b2));
                return Unit.f46060a;
            case 9:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ab abVar4 = (ab) this.receiver;
                abVar4.d.b(th4, new v9(abVar4, b2));
                return Unit.f46060a;
            case 10:
                kc kcVar = (kc) obj;
                kcVar.getClass();
                ((k3t0) this.receiver).x(kcVar);
                return Unit.f46060a;
            case 11:
                long jLongValue = ((Number) obj).longValue();
                qd qdVar = (qd) this.receiver;
                p7m0 p7m0Var = qdVar.i;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.TRUE));
                p7m0 p7m0Var2 = qdVar.j;
                ArrayList arrayListY = o050.Y(jLongValue, qdVar.h, qdVar.g.b);
                p7m0Var2.getClass();
                p7m0Var2.o(null, arrayListY);
                return Unit.f46060a;
            case 12:
                nk nkVar = (nk) obj;
                nkVar.getClass();
                wj wjVar = (wj) this.receiver;
                p7m0 p7m0Var3 = wjVar.w;
                ActionMenuDialogParams actionMenuDialogParams = wjVar.b;
                xr xrVar = wjVar.p;
                if (nkVar instanceof ck) {
                    px7 px7Var = ((yi) p7m0Var3.getValue()).m;
                    if (Intrinsics.d(px7Var, kx7.f19038a)) {
                        fno fnoVar = wjVar.q.f22745a;
                        js20 js20Var = (js20) fnoVar.b.b.getValue();
                        if (js20Var == null) {
                            throw new ef5();
                        }
                        long jA = js20Var.a();
                        cno cnoVar = fnoVar.f9848a;
                        cnoVar.a(jA).b = true;
                        HashMap map = (HashMap) cnoVar.a(jA).f2893a.getValue();
                        boolean zA = fno.a(map);
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            fnoVar.f9848a.b(jA, zA, ((Number) ((Map.Entry) it.next()).getKey()).longValue());
                        }
                    } else if (Intrinsics.d(px7Var, ox7.f25998a) || Intrinsics.d(px7Var, mx7.f22539a)) {
                        xrVar.v(actionMenuDialogParams.f, ((yi) p7m0Var3.getValue()).e ? "market_show" : "market_hide");
                        es esVar = wjVar.h;
                        goo gooVar = (goo) esVar.b;
                        xvm0 xvm0VarA = ((kym0) esVar.c).b.a();
                        if (xvm0VarA instanceof svm0) {
                            pmo pmoVar = ((ino) esVar.f8305a).f15084a;
                            pmoVar.b = true;
                            HashMap map2 = (HashMap) pmoVar.f27246a.getValue();
                            boolean zA2 = ino.a(map2);
                            Iterator it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                pmoVar.a((String) ((Map.Entry) it2.next()).getKey(), zA2);
                            }
                        } else if (xvm0VarA instanceof wvm0) {
                            gooVar.b();
                        } else if (!(xvm0VarA instanceof rvm0)) {
                            if (!(xvm0VarA instanceof tvm0)) {
                                t9f.b();
                                return null;
                            }
                            gooVar.b();
                        }
                    }
                } else if (nkVar instanceof dk) {
                    xrVar.v(actionMenuDialogParams.f, ((yi) p7m0Var3.getValue()).h ? "delete_from_fav" : "favor");
                    wjVar.c.d(new dj(wjVar, b2));
                } else if (nkVar instanceof ek) {
                    xrVar.v(actionMenuDialogParams.f, "graphics");
                    atz atzVar = wjVar.i;
                    MarketStatisticParams marketStatisticParams = new MarketStatisticParams(actionMenuDialogParams.e, actionMenuDialogParams.b);
                    atzVar.getClass();
                    wjVar.w(new MarketStatisticScreenFactoryImpl$getScreen$1(marketStatisticParams), false, false);
                } else if (nkVar instanceof kk) {
                    xrVar.v(actionMenuDialogParams.f, "alerts");
                    atz atzVar2 = wjVar.f;
                    long j2 = actionMenuDialogParams.f46984a;
                    long j3 = actionMenuDialogParams.f;
                    long j4 = actionMenuDialogParams.d;
                    boolean z = actionMenuDialogParams.e;
                    atzVar2.getClass();
                    wjVar.w(new OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1(j2, j4, j3, 0L, "", z), true, false);
                } else if (nkVar instanceof lk) {
                    xrVar.v(actionMenuDialogParams.f, "market_set");
                    qjj.W(jiu0.a(wjVar), null, null, new nj(wjVar, objArr4 == true ? 1 : 0, b), 3);
                } else if (nkVar instanceof mk) {
                    xrVar.v(actionMenuDialogParams.f, "statistics");
                    wjVar.w(((zfm0) wjVar.d).a(actionMenuDialogParams.f, actionMenuDialogParams.c), false, false);
                } else if (nkVar instanceof jk) {
                    sac.V(jiu0.a(wjVar), mj.f21869a, null, null, new wa(wjVar, objArr3 == true ? 1 : 0, b), 14);
                } else if (nkVar instanceof ak) {
                    xrVar.v(actionMenuDialogParams.f, "bets_on_players");
                    cl5 cl5Var = wjVar.s;
                    BetsOnPlayersScreenParams betsOnPlayersScreenParams = new BetsOnPlayersScreenParams(actionMenuDialogParams.f46984a, actionMenuDialogParams.e, actionMenuDialogParams.f);
                    cl5Var.getClass();
                    wjVar.w(new BetsOnPlayersScreenFactoryImpl$getScreen$1(betsOnPlayersScreenParams), false, false);
                } else if (nkVar instanceof fk) {
                    xrVar.v(actionMenuDialogParams.f, "change_view_market");
                    wjVar.t.getClass();
                    wjVar.w(new MarketsDisplaySettingsScreenFactoryImpl$getScreen$1(), false, false);
                } else {
                    if (!(nkVar instanceof bk)) {
                        t9f.b();
                        return null;
                    }
                    xrVar.v(actionMenuDialogParams.f, "setting_info_blocks");
                    wjVar.u.getClass();
                    wjVar.w(new CardsInfoSettingsScreenFactoryImpl$getScreen$1(), false, false);
                }
                return Unit.f46060a;
            case 13:
                Object objF = ((m0o0) this.receiver).f((yje) obj);
                return objF == wne.f39444a ? objF : Unit.f46060a;
            case 14:
                Object objF2 = ((m0o0) this.receiver).f((yje) obj);
                return objF2 == wne.f39444a ? objF2 : Unit.f46060a;
            case 15:
                Object objF3 = ((m0o0) this.receiver).f((yje) obj);
                return objF3 == wne.f39444a ? objF3 : Unit.f46060a;
            case 16:
                jt jtVar = (jt) obj;
                jtVar.getClass();
                ft ftVar = (ft) this.receiver;
                qek0 qek0Var = ft.N1;
                ftVar.getClass();
                a8z a8zVar = ftVar.L1;
                if (jtVar.equals(gt.f11856a)) {
                    ii iiVar = ((z5i) a8zVar.getValue()).l;
                    String strH = ftVar.H(R.string.confirmation);
                    String strH2 = ftVar.H(R.string.apply_pin_code);
                    String strH3 = ftVar.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, ftVar.H(R.string.cancel), (String) null, "REQUEST_SAVE_AUTH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = ftVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    if (!jtVar.equals(ht.f13606a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar2 = ((z5i) a8zVar.getValue()).l;
                    String strH4 = ftVar.H(R.string.confirmation);
                    String strH5 = ftVar.H(R.string.apply_biometrics);
                    String strH6 = ftVar.H(R.string.yes);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, ftVar.H(R.string.no), (String) null, "REQUEST_APPLY_BIOMETRY_AUTH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1488);
                    androidx.fragment.app.e eVarC2 = ftVar.C();
                    eVarC2.getClass();
                    iiVar2.a(dialogFields2, eVarC2);
                }
                ftVar.G0().x(ns.f24029a);
                return Unit.f46060a;
            case 17:
                ys ysVar = (ys) obj;
                ysVar.getClass();
                ((k3t0) this.receiver).x(ysVar);
                return Unit.f46060a;
            case 18:
                View view = (View) obj;
                view.getClass();
                xu xuVar = (xu) this.receiver;
                gfk0 gfk0Var = xu.Q1;
                pv pvVarJ0 = xuVar.J0();
                pvVarJ0.w(jiu0.a(pvVarJ0), new t0(1, pvVarJ0, pv.class, "onLaunchJobError", "onLaunchJobError(Ljava/lang/Throwable;)V", 0, (byte) 21), new lv((Object) pvVarJ0, v3c.R(view.getContext(), "com.google.android.apps.authenticator2"), (yje) (objArr5 == true ? 1 : 0), b2));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                pv pvVar = (pv) this.receiver;
                pvVar.h.b(th5, new iob0((Object) pvVar, (byte) 29));
                return Unit.f46060a;
            case 20:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((Function1) this.receiver).invoke(th6);
                return Unit.f46060a;
            case 21:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((pv) this.receiver).y(th7);
                return Unit.f46060a;
            case 22:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((pv) this.receiver).y(th8);
                return Unit.f46060a;
            case 23:
                xv xvVar = (xv) obj;
                xvVar.getClass();
                ((k3t0) this.receiver).x(xvVar);
                return Unit.f46060a;
            case 24:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ww wwVar = (ww) this.receiver;
                if (th9 instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th9;
                    b1j.w("error_code", Integer.valueOf(zhi0Var.c.getErrorCode()), wwVar.o.f44322a, "create_bill_error");
                    b1j.r(zhi0Var.c.getErrorCode(), wwVar.w.f16351a, 3277L);
                    if (zhi0Var.c == i2o.CurrencyAccountsLimitError) {
                        String message = th9.getMessage();
                        iwVar = new hw(message != null ? message : "");
                        i1w0 i1w0Var = wwVar.x;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else {
                        String message2 = th9.getMessage();
                        iwVar = new iw(message2 != null ? message2 : "", true);
                    }
                    wwVar.G(iwVar);
                } else {
                    wwVar.getClass();
                }
                th9.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                px pxVar = (px) obj;
                pxVar.getClass();
                ((k3t0) this.receiver).x(pxVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                j20 j20Var = (j20) obj;
                j20Var.getClass();
                m10 m10Var = (m10) this.receiver;
                pek0 pek0Var = m10.P1;
                m10Var.getClass();
                if (j20Var.equals(i20.f14026a)) {
                    Context contextD = m10Var.D();
                    if (contextD != null) {
                        Intent intentQ = j120.Q(contextD);
                        Intent intentPutExtra = intentQ != null ? intentQ.putExtra("OPEN_PAYMENT", true) : null;
                        if (intentPutExtra != null) {
                            m10Var.w0(intentPutExtra);
                        }
                    }
                } else {
                    if (!j20Var.equals(h20.f12309a)) {
                        t9f.b();
                        return null;
                    }
                    ccq0.V(m10Var, "KZ_FIRST_DEPOSIT_ALERT_REQUEST_KEY", new j10(m10Var, (byte) 2));
                    ii iiVar3 = m10Var.N1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = m10Var.C();
                    eVarC3.getClass();
                    String strH7 = m10Var.H(R.string.kz_identification_alert_freebet_dialog_title);
                    String strH8 = m10Var.H(R.string.kz_identification_freebet_alert_dialog_bonus_body_200);
                    String strH9 = m10Var.H(R.string.refill_account);
                    strH9.getClass();
                    iiVar3.d(new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, m10Var.H(R.string.later), (String) null, "KZ_FIRST_DEPOSIT_ALERT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488), eVarC3);
                }
                m10Var.G0().x(b10.f1784a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                d10 d10Var = (d10) obj;
                d10Var.getClass();
                ((k3t0) this.receiver).x(d10Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((u90) this.receiver).x(th10);
                return Unit.f46060a;
            default:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((u90) this.receiver).x(th11);
                return Unit.f46060a;
        }
    }
}
