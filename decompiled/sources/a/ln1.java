package a;

import android.javax.sip.message.Response;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ln1 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20323a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f20323a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        bt1 bt1Var;
        byte b = 20;
        switch (this.f20323a) {
            case 0:
                fn1 fn1Var = (fn1) obj;
                fn1Var.getClass();
                ((k3t0) this.receiver).x(fn1Var);
                return Unit.f46060a;
            case 1:
                ts1 ts1Var = (ts1) obj;
                ts1Var.getClass();
                ((k3t0) this.receiver).x(ts1Var);
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((uv1) this.receiver).T(th);
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((uv1) this.receiver).T(th2);
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                uv1 uv1Var = (uv1) this.receiver;
                p7m0 p7m0Var = uv1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uv1Var.f.getClass();
                    bt1Var = bt1.f3159a;
                } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, bt1Var, bt1Var, bt1Var, bt1Var, null, null, false, false, false, null, null, null, null, null, 33552511)));
                uv1Var.r.b(th3, new o00(uv1Var, b));
                return Unit.f46060a;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((uv1) this.receiver).T(th4);
                return Unit.f46060a;
            case 6:
                cz1 cz1Var = (cz1) obj;
                cz1Var.getClass();
                ty1 ty1Var = (ty1) this.receiver;
                rek0 rek0Var = ty1.R1;
                ty1Var.getClass();
                if (cz1Var instanceof yy1) {
                    if (((yy1) cz1Var).f43447a instanceof mb0) {
                        ynb ynbVar = ty1Var.M1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        String strH = ty1Var.H(R.string.gift_balance_dialog_description);
                        strH.getClass();
                        androidx.fragment.app.e eVarC = ty1Var.C();
                        eVarC.getClass();
                        ynb.b(ynbVar, bm5Var, strH, eVarC, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    }
                } else if (cz1Var instanceof az1) {
                    az1 az1Var = (az1) cz1Var;
                    long j = az1Var.f1695a;
                    String str = az1Var.b;
                    cl1.o2.getClass();
                    cl1 cl1VarG = gfk0.g(j, str);
                    androidx.fragment.app.e eVarC2 = ty1Var.C();
                    eVarC2.getClass();
                    sj3.D0(cl1VarG, eVarC2);
                } else if (cz1Var instanceof bz1) {
                    bz1 bz1Var = (bz1) cz1Var;
                    ii iiVar = ty1Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields = new DialogFields((CharSequence) bz1Var.f3443a, (CharSequence) bz1Var.b, (CharSequence) bz1Var.c, (String) null, (String) null, "DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC3 = ty1Var.C();
                    eVarC3.getClass();
                    iiVar.d(dialogFields, eVarC3);
                } else {
                    if (!(cz1Var instanceof zy1)) {
                        t9f.b();
                        return null;
                    }
                    kxq kxqVarB = ty1Var.B();
                    if (kxqVarB != null && tdc.U(kxqVarB.r())) {
                        ty1Var.G0().x(xx1.f41636a);
                    }
                }
                ty1Var.G0().x(lx1.f20791a);
                return Unit.f46060a;
            case 7:
                by1 by1Var = (by1) obj;
                by1Var.getClass();
                ((k3t0) this.receiver).x(by1Var);
                return Unit.f46060a;
            case 8:
                l32 l32Var = (l32) obj;
                l32Var.getClass();
                org.xplatform.special_event.impl.alleventsgames.presentation.a aVar = (org.xplatform.special_event.impl.alleventsgames.presentation.a) this.receiver;
                hfk0 hfk0Var = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                aVar.getClass();
                if (l32Var instanceof j32) {
                    ujd ujdVar = aVar.N1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(aVar, ((j32) l32Var).f15810a);
                } else {
                    if (!(l32Var instanceof k32)) {
                        t9f.b();
                        return null;
                    }
                    oll0 oll0Var = aVar.K1;
                    if (oll0Var == null) {
                        Intrinsics.h("sportResultHistoryEventCardFragmentDelegate");
                        throw null;
                    }
                    oll0Var.a(aVar, ((k32) l32Var).f17597a);
                }
                aVar.H0().x(j22.f15761a);
                return Unit.f46060a;
            case 9:
                t22 t22Var = (t22) obj;
                t22Var.getClass();
                ((k3t0) this.receiver).x(t22Var);
                return Unit.f46060a;
            case 10:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                t42 t42Var = (t42) this.receiver;
                jdk0 jdk0Var = t42.p2;
                t42Var.getClass();
                phf0 phf0Var = t42Var.m2;
                if (b52Var.equals(w42.f38524a)) {
                    t42Var.y0();
                } else if (b52Var instanceof x42) {
                    vcc.f0(i120.V(new Pair("REQUEST_HISTORY_KEY", HistoryDateFilterTypeModel.d)), t42Var, phf0Var.n(t42Var, t42.q2[2]));
                    t42Var.y0();
                } else if (b52Var instanceof z42) {
                    xi70 xi70Var = de90.k2;
                    androidx.fragment.app.e eVarC4 = t42Var.C();
                    eVarC4.getClass();
                    z42 z42Var = (z42) b52Var;
                    long j2 = z42Var.f43747a;
                    int i = z42Var.b;
                    xi70Var.getClass();
                    xi70.f(eVarC4, j2, 0L, i, "DATE_PICKER_REQUEST_KEY");
                } else if (b52Var instanceof a52) {
                    kud kudVar = vcj.m2;
                    DateCalendarBottomSheetParams dateCalendarBottomSheetParams = ((a52) b52Var).f248a;
                    androidx.fragment.app.e eVarC5 = t42Var.C();
                    eVarC5.getClass();
                    kudVar.getClass();
                    kud.g(dateCalendarBottomSheetParams, eVarC5, "HISTORY_DAY_PICKER_KEY");
                } else if (b52Var instanceof y42) {
                    kwd kwdVar = dej.l2;
                    DateRangeCalendarBottomSheetParams dateRangeCalendarBottomSheetParams = ((y42) b52Var).f41980a;
                    androidx.fragment.app.e eVarC6 = t42Var.C();
                    eVarC6.getClass();
                    kwdVar.getClass();
                    kwd.h(dateRangeCalendarBottomSheetParams, eVarC6);
                } else {
                    if (!(b52Var instanceof v42)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.V(new Pair("SELECTED_DATE_KEY", Boolean.TRUE)), t42Var, phf0Var.n(t42Var, t42.q2[2]));
                    t42Var.y0();
                }
                t42Var.Q0().x(k42.f17647a);
                return Unit.f46060a;
            case 11:
                b72 b72Var = (b72) obj;
                b72Var.getClass();
                w62 w62Var = (w62) this.receiver;
                pek0 pek0Var = w62.Q1;
                w62Var.getClass();
                if (b72Var instanceof z62) {
                    j120.P(w62Var, new mc((Object) w62Var, (Object) b72Var, (byte) 18));
                } else if (b72Var.equals(y62.f42074a)) {
                    j120.Y(w62Var);
                } else {
                    if (!(b72Var instanceof a72)) {
                        t9f.b();
                        return null;
                    }
                    wdk0.k(((esi) w62Var.N1.getValue()).q, new xdk0(rek0.b, ((a72) b72Var).f344a, null, null, null, null, 124), w62Var, null, null, false, null, 1020);
                }
                w62Var.G0().x(a62.f298a);
                return Unit.f46060a;
            case 12:
                s62 s62Var = (s62) obj;
                s62Var.getClass();
                ((k3t0) this.receiver).x(s62Var);
                return Unit.f46060a;
            case 13:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                n92 n92Var = (n92) this.receiver;
                n92Var.T.f(th5, new g92(n92Var, (byte) 0));
                return Unit.f46060a;
            case 14:
                va2 va2Var = (va2) obj;
                va2Var.getClass();
                ia2 ia2Var = (ia2) this.receiver;
                rek0 rek0Var2 = ia2.Q1;
                ia2Var.getClass();
                a8z a8zVar = ia2Var.N1;
                if (va2Var instanceof ua2) {
                    j120.P(ia2Var, new mc((Object) ia2Var, (Object) va2Var, (byte) 19));
                } else if (va2Var.equals(sa2.f31873a)) {
                    j120.Y(ia2Var);
                } else {
                    if (!(va2Var instanceof ta2)) {
                        t9f.b();
                        return null;
                    }
                    ((dbi) ((wii) a8zVar.getValue()).k.f3330a).o().r(ia2Var, ((wii) a8zVar.getValue()).h, ((ta2) va2Var).f33594a);
                }
                ia2Var.G0().x(q92.f28326a);
                return Unit.f46060a;
            case 15:
                ea2 ea2Var = (ea2) obj;
                ea2Var.getClass();
                ((k3t0) this.receiver).x(ea2Var);
                return Unit.f46060a;
            case 16:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((zb2) this.receiver).N(th6);
                return Unit.f46060a;
            case 17:
                be2 be2Var = (be2) obj;
                be2Var.getClass();
                vd2 vd2Var = (vd2) this.receiver;
                gfk0 gfk0Var = vd2.R1;
                if (be2Var instanceof zd2) {
                    ujd ujdVarD = ((b8i) vd2Var.M1.getValue()).f2158a.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(vd2Var, ((zd2) be2Var).f44192a);
                } else {
                    vd2Var.getClass();
                    if (be2Var.equals(yd2.f42412a)) {
                        j120.Y(vd2Var);
                    } else {
                        if (!(be2Var instanceof ae2)) {
                            t9f.b();
                            return null;
                        }
                        wdk0.k(((b8i) vd2Var.M1.getValue()).p, new xdk0(rek0.b, ((ae2) be2Var).f705a, null, null, null, null, 124), vd2Var, null, null, false, null, 1020);
                    }
                }
                ((k3t0) vd2Var.N1.getValue()).x(id2.f14561a);
                return Unit.f46060a;
            case 18:
                sd2 sd2Var = (sd2) obj;
                sd2Var.getClass();
                ((k3t0) this.receiver).x(sd2Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                le2 le2Var = (le2) this.receiver;
                le2Var.w.b(th7, new fa2((Object) le2Var, (byte) 3));
                return Unit.f46060a;
            case 20:
                ub2 ub2Var = (ub2) obj;
                ub2Var.getClass();
                ((k3t0) this.receiver).x(ub2Var);
                return Unit.f46060a;
            case 21:
                vc2 vc2Var = (vc2) obj;
                vc2Var.getClass();
                ((k3t0) this.receiver).x(vc2Var);
                return Unit.f46060a;
            case 22:
                x3g0 x3g0Var = (x3g0) obj;
                x3g0Var.getClass();
                ef2 ef2Var = (ef2) this.receiver;
                hfk0 hfk0Var2 = ef2.V1;
                ef2Var.getClass();
                a8z a8zVar2 = ef2Var.N1;
                if (x3g0Var instanceof w3g0) {
                    ((dbi) ((ksi) a8zVar2.getValue()).b.f3330a).o().r(ef2Var, ((ksi) a8zVar2.getValue()).i, ((w3g0) x3g0Var).f38501a);
                } else if (x3g0Var instanceof u3g0) {
                    View viewQ0 = ef2Var.q0();
                    j120.X(viewQ0);
                    viewQ0.requestFocus();
                } else {
                    if (!(x3g0Var instanceof v3g0)) {
                        t9f.b();
                        return null;
                    }
                    k3t0 k3t0VarL0 = ef2Var.L0();
                    lme0 lme0Var = b9g0.f2207a;
                    k3t0VarL0.x(new ve2(((v3g0) x3g0Var).f36732a));
                }
                ((k3t0) ef2Var.R1.getValue()).x(g3g0.f10610a);
                return Unit.f46060a;
            case 23:
                q3g0 q3g0Var = (q3g0) obj;
                q3g0Var.getClass();
                ((k3t0) this.receiver).x(q3g0Var);
                return Unit.f46060a;
            case 24:
                hf2 hf2Var = (hf2) obj;
                hf2Var.getClass();
                ef2 ef2Var2 = (ef2) this.receiver;
                hfk0 hfk0Var3 = ef2.V1;
                ef2Var2.getClass();
                if (hf2Var instanceof gf2) {
                    j120.P(ef2Var2, new mc(ef2Var2, ((gf2) hf2Var).f11185a, b));
                } else {
                    if (!hf2Var.equals(ff2.f9431a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(ef2Var2);
                }
                ef2Var2.L0().x(me2.f21624a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                zc2 zc2Var = (zc2) obj;
                zc2Var.getClass();
                ef2 ef2Var3 = (ef2) this.receiver;
                hfk0 hfk0Var4 = ef2.V1;
                ef2Var3.getClass();
                if (zc2Var instanceof yc2) {
                    ef2Var3.M0(((yc2) zc2Var).f42365a);
                } else {
                    if (!(zc2Var instanceof xc2)) {
                        t9f.b();
                        return null;
                    }
                    ef2Var3.L0().x(new te2(((xc2) zc2Var).f40626a));
                }
                ef2Var3.K0().x(jc2.f16255a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cc2 cc2Var = (cc2) obj;
                cc2Var.getClass();
                ef2 ef2Var4 = (ef2) this.receiver;
                hfk0 hfk0Var5 = ef2.V1;
                ef2Var4.getClass();
                if (cc2Var instanceof bc2) {
                    ef2Var4.M0(((bc2) cc2Var).f2333a);
                } else {
                    if (!(cc2Var instanceof ac2)) {
                        t9f.b();
                        return null;
                    }
                    ef2Var4.L0().x(new te2(((ac2) cc2Var).f608a));
                }
                ef2Var4.J0().x(ib2.f14465a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ye2 ye2Var = (ye2) obj;
                ye2Var.getClass();
                ((k3t0) this.receiver).x(ye2Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((hh2) this.receiver).S(th8);
                return Unit.f46060a;
            default:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((qi2) this.receiver).N(th9);
                return Unit.f46060a;
        }
    }
}
