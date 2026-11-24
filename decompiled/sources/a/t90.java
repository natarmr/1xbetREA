package a;

import android.graphics.Bitmap;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.main_menu.impl.presentation.common.views.AggregatorBanner;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t90 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t90(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f33537a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33537a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((u90) this.receiver).x(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((u90) this.receiver).x(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((duj) this.receiver).a(th3);
                return Unit.f46060a;
            case 3:
                AggregatorBanner aggregatorBanner = (AggregatorBanner) this.receiver;
                int i = AggregatorBanner.s;
                aggregatorBanner.d((Bitmap) obj);
                return Boolean.TRUE;
            case 4:
                AggregatorBanner aggregatorBanner2 = (AggregatorBanner) this.receiver;
                int i2 = AggregatorBanner.s;
                aggregatorBanner2.c((Throwable) obj);
                return Boolean.TRUE;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((Function1) this.receiver).invoke(th4);
                return Unit.f46060a;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((Function1) this.receiver).invoke(th5);
                return Unit.f46060a;
            case 7:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((Function1) this.receiver).invoke(th6);
                return Unit.f46060a;
            case 8:
                vd0 vd0Var = (vd0) obj;
                vd0Var.getClass();
                jd0 jd0Var = (jd0) this.receiver;
                gfk0 gfk0Var = jd0.P1;
                jd0Var.getClass();
                if (!Intrinsics.d(vd0Var, vd0.f37209a)) {
                    t9f.b();
                    return null;
                }
                View viewQ0 = jd0Var.q0();
                j120.X(viewQ0);
                viewQ0.requestFocus();
                jd0Var.H0().x(ad0.f654a);
                return Unit.f46060a;
            case 9:
                gd0 gd0Var = (gd0) obj;
                gd0Var.getClass();
                ((k3t0) this.receiver).x(gd0Var);
                return Unit.f46060a;
            case 10:
                gg0 gg0Var = (gg0) obj;
                gg0Var.getClass();
                nf0 nf0Var = (nf0) this.receiver;
                hfk0 hfk0Var = nf0.S1;
                if (!(gg0Var instanceof eg0)) {
                    nf0Var.getClass();
                    if (!gg0Var.equals(fg0.f9467a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar = nf0Var.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = nf0Var.H(R.string.error);
                    String strH2 = nf0Var.H(R.string.game_not_available_now);
                    String strH3 = nf0Var.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = nf0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (((eg0) gg0Var).f7738a instanceof mb0) {
                    ynb ynbVar = nf0Var.N1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.e;
                    String strH4 = nf0Var.H(R.string.gift_balance_dialog_description);
                    strH4.getClass();
                    androidx.fragment.app.e eVarC2 = nf0Var.C();
                    eVarC2.getClass();
                    ynb.b(ynbVar, bm5Var, strH4, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                }
                nf0Var.G0().x(se0.f32056a);
                return Unit.f46060a;
            case 11:
                hf0 hf0Var = (hf0) obj;
                hf0Var.getClass();
                ((k3t0) this.receiver).x(hf0Var);
                return Unit.f46060a;
            case 12:
                ql0 ql0Var = (ql0) obj;
                ql0Var.getClass();
                ((k3t0) this.receiver).x(ql0Var);
                return Unit.f46060a;
            case 13:
                tr0 tr0Var = (tr0) obj;
                tr0Var.getClass();
                jq0 jq0Var = (jq0) this.receiver;
                qek0 qek0Var = jq0.P1;
                jq0Var.getClass();
                List list = tr0Var.f34400a;
                AggregatorSortingOptionModel aggregatorSortingOptionModel = tr0Var.b;
                lme0 lme0Var = jlk0.n2;
                androidx.fragment.app.e eVarF = jq0Var.F();
                lme0Var.getClass();
                lme0.b(eVarF, "SELECT_SORT_OPTION_REQUEST_KEY", list, aggregatorSortingOptionModel);
                jq0Var.G0().x(qp0.f29093a);
                return Unit.f46060a;
            case 14:
                bq0 bq0Var = (bq0) obj;
                bq0Var.getClass();
                ((gs0) this.receiver).x(bq0Var);
                return Unit.f46060a;
            case 15:
                iw0 iw0Var = (iw0) obj;
                iw0Var.getClass();
                hu0 hu0Var = (hu0) this.receiver;
                rek0 rek0Var = hu0.Y1;
                hu0Var.getClass();
                if (iw0Var instanceof gw0) {
                    gw0 gw0Var = (gw0) iw0Var;
                    svs0 svs0Var = pwu0.q2;
                    androidx.fragment.app.e eVarC3 = hu0Var.C();
                    eVarC3.getClass();
                    long j = gw0Var.f12000a;
                    long j2 = gw0Var.b;
                    svs0Var.getClass();
                    pwu0 pwu0Var = new pwu0();
                    iiy[] iiyVarArr = pwu0.r2;
                    pwu0Var.l2.j(pwu0Var, iiyVarArr[0], j);
                    pwu0Var.m2.j(pwu0Var, iiyVarArr[1], j2);
                    pwu0Var.n2.x(pwu0Var, iiyVarArr[2], "");
                    pwu0Var.H0(eVarC3, pwu0.class.getSimpleName());
                } else if (iw0Var instanceof hw0) {
                    String str = ((hw0) iw0Var).f13748a;
                    wdk0 wdk0Var = hu0Var.W1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackBarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), hu0Var, null, null, false, null, 1020);
                } else if (iw0Var instanceof dw0) {
                    dw0 dw0Var = (dw0) iw0Var;
                    String str2 = dw0Var.f6771a;
                    String str3 = dw0Var.b;
                    String str4 = dw0Var.c;
                    qog0 qog0Var = (qog0) hu0Var.R1.getValue();
                    if (qog0Var != null) {
                        fu0 fu0Var = new fu0(qog0Var, str2, hu0Var, str4, str3, (byte) 0);
                        hu0Var = hu0Var;
                        qog0Var.f29072a.add(fu0Var);
                        qog0Var.a();
                    }
                } else if (iw0Var.equals(fw0.f10238a)) {
                    ii iiVar2 = hu0Var.V1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = hu0Var.H(R.string.caution);
                    String strH6 = hu0Var.H(R.string.something_went_wrong);
                    String strH7 = hu0Var.H(R.string.ok_new);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, "ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC4 = hu0Var.C();
                    eVarC4.getClass();
                    iiVar2.d(dialogFields2, eVarC4);
                }
                hu0Var.G0().x(ms0.f22296a);
                return Unit.f46060a;
            case 16:
                vs0 vs0Var = (vs0) obj;
                vs0Var.getClass();
                ((k3t0) this.receiver).x(vs0Var);
                return Unit.f46060a;
            case 17:
                vu0 vu0Var = (vu0) obj;
                vu0Var.getClass();
                uu0 uu0Var = (uu0) this.receiver;
                gfk0 gfk0Var2 = uu0.o2;
                av0 av0Var = vu0Var.f38030a;
                vcc.f0(i120.V(new Pair("RESULT_GAME_MODE_LISTENER_KEY", av0Var)), uu0Var, uu0Var.l2.n(uu0Var, uu0.p2[1]));
                uu0Var.y0();
                ((k3t0) uu0Var.n2.getValue()).x(qu0.f29325a);
                return Unit.f46060a;
            case 18:
                lv0 lv0Var = (lv0) obj;
                lv0Var.getClass();
                kv0 kv0Var = (kv0) this.receiver;
                hfk0 hfk0Var2 = kv0.n2;
                kv0Var.getClass();
                String str5 = lv0Var.f20698a;
                Bundle bundle = new Bundle();
                bundle.putString("RESULT_GAME_NICKNAME_LISTENER_KEY", str5);
                vcc.f0(bundle, kv0Var, kv0Var.k2.n(kv0Var, kv0.o2[0]));
                kv0Var.y0();
                kv0Var.P0().x(cv0.f5010a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((duj) this.receiver).a(th7);
                return Unit.f46060a;
            case 20:
                ((zw0) this.receiver).i((View) obj);
                return Unit.f46060a;
            case 21:
                ((zw0) this.receiver).i((View) obj);
                return Unit.f46060a;
            case 22:
                jy0 jy0Var = (jy0) obj;
                jy0Var.getClass();
                ((k3t0) this.receiver).x(jy0Var);
                return Unit.f46060a;
            case 23:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((a01) this.receiver).S(th8);
                return Unit.f46060a;
            case 24:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((a01) this.receiver).R(th10);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((a01) this.receiver).R(th11);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((a01) this.receiver).S(th12);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p11 p11Var = (p11) obj;
                p11Var.getClass();
                e11 e11Var = (e11) this.receiver;
                qek0 qek0Var2 = e11.W1;
                e11Var.getClass();
                if (p11Var instanceof j11) {
                    ob0 ob0Var = ((j11) p11Var).f15708a;
                    if (ob0Var instanceof mb0) {
                        String str6 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar2 = e11Var.M1;
                        if (ynbVar2 == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var2 = bm5.e;
                        androidx.fragment.app.e eVarC5 = e11Var.C();
                        eVarC5.getClass();
                        ynb.b(ynbVar2, bm5Var2, str6, eVarC5, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var.equals(lb0.f19732a)) {
                        e11Var.G0().x(p01.f26124a);
                    } else {
                        if (!ob0Var.equals(nb0.f23215a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB = e11Var.B();
                        if (kxqVarB != null) {
                            ii iiVar3 = e11Var.O1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = kxqVarB.getString(R.string.attention);
                            String string2 = kxqVarB.getString(R.string.selected_balance_unavailable_description);
                            String string3 = kxqVarB.getString(R.string.ok);
                            string3.getClass();
                            iiVar3.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    }
                } else if (p11Var.equals(k11.f17496a)) {
                    ii iiVar4 = e11Var.O1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH8 = e11Var.H(R.string.confirmation);
                    String strH9 = e11Var.H(R.string.refuse_bonus);
                    String strH10 = e11Var.H(R.string.yes);
                    strH10.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, e11Var.H(R.string.no), (String) null, "REQUEST_REFUSE_BONUS", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = e11Var.C();
                    eVarC6.getClass();
                    iiVar4.d(dialogFields3, eVarC6);
                } else if (p11Var.equals(m11.f20980a)) {
                    wdk0 wdk0Var2 = e11Var.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var3 = qek0.f28589a;
                    String strH11 = e11Var.H(R.string.casino_gifts_bonus_activated);
                    strH11.getClass();
                    wdk0.k(wdk0Var2, new xdk0(qek0Var3, strH11, null, null, null, null, 124), e11Var, null, null, false, null, 1020);
                } else if (p11Var.equals(l11.f19225a)) {
                    qcc.c0(e11Var);
                } else if (p11Var instanceof o11) {
                    o11 o11Var = (o11) p11Var;
                    String str7 = o11Var.f24455a;
                    String str8 = o11Var.b;
                    String str9 = o11Var.c;
                    ii iiVar5 = e11Var.O1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields4 = new DialogFields((CharSequence) str7, (CharSequence) str8, (CharSequence) str9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC7 = e11Var.C();
                    eVarC7.getClass();
                    iiVar5.d(dialogFields4, eVarC7);
                } else {
                    if (!(p11Var instanceof n11)) {
                        t9f.b();
                        return null;
                    }
                    String str10 = ((n11) p11Var).f22725a;
                    wdk0 wdk0Var3 = e11Var.N1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, new xdk0(rek0.b, str10, null, null, null, null, 124), e11Var, null, null, false, null, 1020);
                }
                e11Var.G0().x(m01.f20931a);
                return Unit.f46060a;
            default:
                b11 b11Var = (b11) obj;
                b11Var.getClass();
                ((k3t0) this.receiver).x(b11Var);
                return Unit.f46060a;
        }
    }
}
