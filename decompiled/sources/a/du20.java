package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;
import org.xplatform.sportgame.markets.settings.impl.presentation.models.FilterActionDialogUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class du20 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du20(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f6681a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = 3;
        byte b2 = 0;
        yje yjeVar = null;
        switch (this.f6681a) {
            case 0:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                ((Function1) this.receiver).invoke(xgl0Var);
                return Unit.f46060a;
            case 1:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                ((Function1) this.receiver).invoke(wgl0Var);
                return Unit.f46060a;
            case 2:
                xgl0 xgl0Var2 = (xgl0) obj;
                xgl0Var2.getClass();
                ((Function1) this.receiver).invoke(xgl0Var2);
                return Unit.f46060a;
            case 3:
                x330 x330Var = (x330) obj;
                x330Var.getClass();
                v330 v330Var = (v330) this.receiver;
                xuz xuzVar = v330.Q1;
                v330Var.getClass();
                if (!x330Var.equals(x330.f40197a)) {
                    t9f.b();
                    return null;
                }
                ii iiVar = v330Var.N1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = v330Var.H(R.string.caution);
                String strH2 = v330Var.H(R.string.apply_changes);
                String strH3 = v330Var.H(R.string.yes);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, v330Var.H(R.string.no), (String) null, "REQUEST_SAVE_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = v330Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
            case 4:
                ny20 ny20Var = (ny20) obj;
                ny20Var.getClass();
                ((k3t0) this.receiver).x(ny20Var);
                return Unit.f46060a;
            case 5:
                hui0 hui0Var = (hui0) obj;
                hui0Var.getClass();
                e730 e730Var = (e730) this.receiver;
                e730Var.getClass();
                int iOrdinal = hui0Var.ordinal();
                if (iOrdinal == 0) {
                    sac.V(jiu0.a(e730Var), new du20(1, e730Var.j, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, null, new a730(e730Var, yjeVar, b), 14);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    e730Var.r.g(u630.f35119a);
                }
                return Unit.f46060a;
            case 6:
                gw20 gw20Var = (gw20) obj;
                gw20Var.getClass();
                qoj0 qoj0Var = ((e730) this.receiver).r;
                int iOrdinal2 = gw20Var.c.ordinal();
                if (iOrdinal2 == 0) {
                    qoj0Var.g(new s630(new FilterActionDialogUiModel(gw20Var.f12005a, gw20Var.b, ji.UNPINE, ji.HIDE)));
                } else if (iOrdinal2 == 1) {
                    qoj0Var.g(new s630(new FilterActionDialogUiModel(gw20Var.f12005a, gw20Var.b, ji.PINE, ji.SHOW)));
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    qoj0Var.g(new s630(new FilterActionDialogUiModel(gw20Var.f12005a, gw20Var.b, ji.PINE, ji.HIDE)));
                }
                return Unit.f46060a;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b630 b630Var = (b630) this.receiver;
                htz htzVar = b630.m2;
                b630Var.R0(zBooleanValue);
                return Unit.f46060a;
            case 8:
                iui0 iui0Var = (iui0) obj;
                iui0Var.getClass();
                f730 f730Var = (f730) this.receiver;
                f730Var.getClass();
                int iOrdinal3 = iui0Var.ordinal();
                if (iOrdinal3 == 0) {
                    sac.V(jiu0.a(f730Var), new du20(1, f730Var.j, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, null, new b730(f730Var, yjeVar, b), 14);
                } else {
                    if (iOrdinal3 != 1) {
                        t9f.b();
                        return null;
                    }
                    f730Var.s.f(v630.f36853a);
                }
                return Unit.f46060a;
            case 9:
                hw20 hw20Var = (hw20) obj;
                hw20Var.getClass();
                String str = hw20Var.f13751a;
                ol60 ol60Var = ((f730) this.receiver).s;
                int iOrdinal4 = hw20Var.c.ordinal();
                if (iOrdinal4 == 0) {
                    ol60Var.f(new t630(new org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel(str, hw20Var.b, ki.UNPINE, ki.HIDE)));
                } else if (iOrdinal4 == 1) {
                    ol60Var.f(new t630(new org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel(str, hw20Var.b, ki.PINE, ki.SHOW)));
                } else {
                    if (iOrdinal4 != 2) {
                        t9f.b();
                        return null;
                    }
                    ol60Var.f(new t630(new org.xplatform.cyber.game.core.betting.presentation.settings.FilterActionDialogUiModel(str, hw20Var.b, ki.PINE, ki.HIDE)));
                }
                return Unit.f46060a;
            case 10:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                i630 i630Var = (i630) this.receiver;
                evz evzVar = i630.k2;
                i630Var.R0(zBooleanValue2);
                return Unit.f46060a;
            case 11:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((duj) this.receiver).a(th);
                return Unit.f46060a;
            case 12:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((duj) this.receiver).a(th2);
                return Unit.f46060a;
            case 13:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((duj) this.receiver).a(th3);
                return Unit.f46060a;
            case 14:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((duj) this.receiver).a(th4);
                return Unit.f46060a;
            case 15:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((duj) this.receiver).a(th5);
                return Unit.f46060a;
            case 16:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((duj) this.receiver).a(th6);
                return Unit.f46060a;
            case 17:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((duj) this.receiver).a(th7);
                return Unit.f46060a;
            case 18:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((duj) this.receiver).a(th8);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case 20:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((duj) this.receiver).a(th10);
                return Unit.f46060a;
            case 21:
                CardIdentity cardIdentity = (CardIdentity) obj;
                cardIdentity.getClass();
                ncl0 ncl0Var = (ncl0) ((ca30) this.receiver);
                ncl0Var.getClass();
                ncl0Var.y.O(((zqs) ((p7m0) ncl0Var.w()).getValue()).c);
                ncl0Var.c.e("KEY_INFO_CARD_IDENTITY", cardIdentity);
                p7m0 p7m0Var = ncl0Var.N;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, wqs.a((wqs) value, null, 0, cardIdentity, 3)));
                return Unit.f46060a;
            case 22:
                int iIntValue = ((Number) obj).intValue();
                ncl0 ncl0Var2 = (ncl0) ((ca30) this.receiver);
                p7m0 p7m0Var2 = ncl0Var2.N;
                if (((wqs) p7m0Var2.getValue()).b != iIntValue) {
                    ncl0Var2.y.O(((zqs) ((p7m0) ncl0Var2.w()).getValue()).c);
                    ncl0Var2.c.e("KEY_BROADCAST_POSITION", Integer.valueOf(iIntValue));
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, wqs.a((wqs) value2, null, iIntValue, null, 5)));
                }
                return Unit.f46060a;
            case 23:
                d0k0 d0k0Var = (d0k0) obj;
                d0k0Var.getClass();
                ncl0 ncl0Var3 = (ncl0) ((ea30) this.receiver);
                ncl0Var3.getClass();
                sac.V(jiu0.a(ncl0Var3), null, null, ncl0Var3.o.f22085a, new lcl0(ncl0Var3, d0k0Var, yjeVar, b2), 11);
                return Unit.f46060a;
            case 24:
                ub30 ub30Var = (ub30) obj;
                ub30Var.getClass();
                ((k3t0) this.receiver).x(ub30Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pb30 pb30Var = (pb30) obj;
                pb30Var.getClass();
                ((k3t0) this.receiver).x(pb30Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sg30 sg30Var = (sg30) obj;
                sg30Var.getClass();
                qg30 qg30Var = (qg30) this.receiver;
                evz evzVar2 = qg30.o2;
                vcc.f0(i120.V(new Pair("RESULT_ON_MATCH_TYPE_SELECTED_LISTENER_KEY", sg30Var.f32141a)), qg30Var, qg30Var.m2.n(qg30Var, qg30.p2[0]));
                ((k3t0) qg30Var.l2.getValue()).x(ng30.f23466a);
                qg30Var.y0();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                pg30 pg30Var = (pg30) obj;
                pg30Var.getClass();
                ((k3t0) this.receiver).x(pg30Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                c140 c140Var = (c140) obj;
                c140Var.getClass();
                bz30 bz30Var = (bz30) this.receiver;
                wsz wszVar = bz30.P1;
                if (c140Var instanceof w040) {
                    w040 w040Var = (w040) c140Var;
                    ynb ynbVarI = ((yzn0) bz30Var.G0().v0.b).i();
                    x1x.x(ynbVarI);
                    String strH4 = bz30Var.H(R.string.attention);
                    strH4.getClass();
                    String str2 = w040Var.f38332a;
                    androidx.fragment.app.e eVarC2 = bz30Var.C();
                    eVarC2.getClass();
                    String strH5 = bz30Var.H(R.string.ok_new);
                    strH5.getClass();
                    String strH6 = bz30Var.H(R.string.cancel);
                    strH6.getClass();
                    ynbVarI.a(strH4, str2, eVarC2, strH5, strH6, w040Var.b);
                } else {
                    bz30Var.getClass();
                    if (c140Var.equals(x040.f40053a)) {
                        ynb ynbVarI2 = ((yzn0) bz30Var.G0().v0.b).i();
                        x1x.x(ynbVarI2);
                        bm5 bm5Var = bm5.g;
                        androidx.fragment.app.e eVarC3 = bz30Var.C();
                        eVarC3.getClass();
                        ynb.b(ynbVarI2, bm5Var, null, eVarC3, false, "SELECT_BALANCE_REQUEST_KEY", 430);
                    } else if (c140Var.equals(a140.f52a)) {
                        nr00 nr00Var = bz30Var.G0().x0;
                        androidx.fragment.app.e eVarC4 = bz30Var.C();
                        eVarC4.getClass();
                        jvp0 jvp0Var = jvp0.f17215a;
                        s9m0.m(eVarC4);
                    } else if (c140Var.equals(z040.f43547a)) {
                        ii iiVar2 = bz30Var.G0().w0;
                        String strH7 = bz30Var.H(R.string.alert_call_pass_identification_title);
                        String strH8 = bz30Var.H(R.string.alert_call_pass_identification_message);
                        String strH9 = bz30Var.H(R.string.pass_identification);
                        strH9.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, bz30Var.H(R.string.later), (String) null, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 464);
                        androidx.fragment.app.e eVarC5 = bz30Var.C();
                        eVarC5.getClass();
                        iiVar2.d(dialogFields2, eVarC5);
                    } else if (c140Var instanceof y040) {
                        wdk0.k(bz30Var.G0().u0, new xdk0(rek0.b, ((y040) c140Var).f41788a, null, null, null, null, 124), bz30Var, null, null, false, null, 1020);
                    } else if (c140Var.equals(u040.f34837a)) {
                        bz30Var.C().t0(i120.V(new Pair("UPDATED_BALANCE_KEY", Boolean.TRUE)), "UPDATED_BALANCE_KEY");
                    } else if (c140Var.equals(v040.f36566a)) {
                        ii iiVar3 = bz30Var.G0().w0;
                        String strH10 = bz30Var.H(R.string.attention);
                        String strH11 = bz30Var.H(R.string.country_blocking);
                        String strH12 = bz30Var.H(R.string.ok_new);
                        strH12.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC6 = bz30Var.C();
                        eVarC6.getClass();
                        iiVar3.d(dialogFields3, eVarC6);
                    } else if (c140Var instanceof t040) {
                        String str3 = ((t040) c140Var).f33101a;
                        Context contextO0 = bz30Var.o0();
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                            intent.setFlags(268435456);
                            intent.setData(Uri.parse(str3));
                            contextO0.startActivity(intent);
                        } catch (Throwable unused) {
                            e0g0 e0g0Var2 = j0g0.b;
                        }
                        break;
                    } else if (c140Var instanceof b140) {
                        b140 b140Var = (b140) c140Var;
                        bz30Var.o0().startService(new Intent(b140Var.b).setComponent(new ComponentName(bz30Var.o0(), b140Var.f1790a)));
                    } else {
                        if (!c140Var.equals(s040.f31396a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB = bz30Var.B();
                        if (kxqVarB != null && tdc.U(kxqVarB.r())) {
                            bz30Var.H0().x(new xu30(bz30.class.getSimpleName()));
                        }
                    }
                }
                bz30Var.H0().x(ut30.f36239a);
                return Unit.f46060a;
            default:
                cv30 cv30Var = (cv30) obj;
                cv30Var.getClass();
                ((k3t0) this.receiver).x(cv30Var);
                return Unit.f46060a;
        }
    }
}
