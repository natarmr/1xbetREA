package a;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mjr0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjr0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f21911a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        byte b = 11;
        switch (this.f21911a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((njr0) this.receiver).z(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((njr0) this.receiver).z(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((njr0) this.receiver).z(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((njr0) this.receiver).z(th4);
                return Unit.f46060a;
            case 4:
                sqr0 sqr0Var = (sqr0) obj;
                sqr0Var.getClass();
                wpr0 wpr0Var = (wpr0) this.receiver;
                s9m0 s9m0Var = wpr0.P1;
                wpr0Var.getClass();
                if (sqr0Var instanceof pqr0) {
                    int iOrdinal = ((pqr0) sqr0Var).f27428a.ordinal();
                    if (iOrdinal == 0) {
                        int i = o5y.q2;
                        androidx.fragment.app.e eVarC = wpr0Var.C();
                        eVarC.getClass();
                        if (eVarC.J("JackpotSimpleBetDialogTag") == null) {
                            new o5y().H0(eVarC, "JackpotSimpleBetDialogTag");
                        }
                    } else if (iOrdinal == 1) {
                        int i2 = p4y.q2;
                        androidx.fragment.app.e eVarC2 = wpr0Var.C();
                        eVarC2.getClass();
                        if (eVarC2.J("JackpotSimpleBetDialogTag") == null) {
                            new p4y().H0(eVarC2, "JackpotSimpleBetDialogTag");
                        }
                    } else if (iOrdinal == 2) {
                        int i3 = o3y.q2;
                        androidx.fragment.app.e eVarC3 = wpr0Var.C();
                        eVarC3.getClass();
                        if (eVarC3.J("JackpotLiteNoTabBetTag") == null) {
                            new o3y().H0(eVarC3, "JackpotLiteNoTabBetTag");
                        }
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        int i4 = h1y.q2;
                        androidx.fragment.app.e eVarC4 = wpr0Var.C();
                        eVarC4.getClass();
                        if (eVarC4.J("JackpotSimpleBetDialogTag") == null) {
                            new h1y().H0(eVarC4, "JackpotSimpleBetDialogTag");
                        }
                    }
                } else if (sqr0Var.equals(qqr0.f29179a)) {
                    ii iiVar = wpr0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = wpr0Var.H(R.string.attention);
                    String strH2 = wpr0Var.H(R.string.toto_clear_warning);
                    String strH3 = wpr0Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, wpr0Var.H(R.string.cancel), (String) null, "REQUEST_JACKPOT_CLEAR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC5 = wpr0Var.C();
                    eVarC5.getClass();
                    iiVar.d(dialogFields, eVarC5);
                } else if (sqr0Var.equals(rqr0.f30946a)) {
                    ii iiVar2 = wpr0Var.N1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = wpr0Var.H(R.string.toto_card_filling_error);
                    String strH5 = wpr0Var.H(R.string.toto_warning_too_many_outcomes);
                    String strH6 = wpr0Var.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC6 = wpr0Var.C();
                    eVarC6.getClass();
                    iiVar2.d(dialogFields2, eVarC6);
                } else {
                    if (!sqr0Var.equals(oqr0.f25703a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar3 = wpr0Var.N1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = wpr0Var.H(R.string.attention);
                    String strH8 = wpr0Var.H(R.string.unacceptable_account_for_section);
                    String strH9 = wpr0Var.H(R.string.ok);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC7 = wpr0Var.C();
                    eVarC7.getClass();
                    iiVar3.d(dialogFields3, eVarC7);
                }
                ((k3t0) wpr0Var.O1.getValue()).x(xor0.f41234a);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                yrr0 yrr0Var = (yrr0) this.receiver;
                yrr0Var.t.b(th5, new p6r0(yrr0Var, b));
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                yrr0 yrr0Var2 = (yrr0) this.receiver;
                yrr0Var2.t.b(th6, new p6r0(yrr0Var2, b));
                return Unit.f46060a;
            case 7:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((psr0) this.receiver).N(th7);
                return Unit.f46060a;
            case 8:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                psr0 psr0Var = (psr0) this.receiver;
                int i5 = psr0.K;
                psr0Var.N(th8);
                return Unit.f46060a;
            case 9:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((psr0) this.receiver).N(th9);
                return Unit.f46060a;
            case 10:
                l520 l520Var = (l520) obj;
                l520Var.getClass();
                ((k3t0) this.receiver).x(l520Var);
                return Unit.f46060a;
            case 11:
                etr0 etr0Var = (etr0) obj;
                etr0Var.getClass();
                usr0 usr0Var = (usr0) this.receiver;
                int i6 = usr0.r2;
                usr0Var.getClass();
                if (etr0Var.equals(ysr0.f43185a)) {
                    usr0Var.E0(true);
                    usr0.P0(usr0Var).v(false);
                } else if (etr0Var.equals(wsr0.f39706a)) {
                    if (!usr0Var.R()) {
                        usr0Var.y0();
                    }
                } else if (etr0Var instanceof zsr0) {
                    zsr0 zsr0Var = (zsr0) etr0Var;
                    SuccessBetStringModel successBetStringModel = zsr0Var.f44919a;
                    SuccessBetAlertModel successBetAlertModel = zsr0Var.b;
                    lgn0 lgn0Var = usr0Var.l2;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    lgn0Var.c(successBetStringModel, successBetAlertModel, usr0Var.p0());
                    Fragment fragment = usr0Var.y;
                    yo8 yo8Var = fragment instanceof yo8 ? (yo8) fragment : null;
                    if (yo8Var != null) {
                        yo8Var.x0();
                    }
                } else if (etr0Var.equals(atr0.f1446a)) {
                    ynb ynbVar = usr0Var.m2;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.l;
                    androidx.fragment.app.e eVarC8 = usr0Var.C();
                    eVarC8.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC8, false, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else if (etr0Var instanceof btr0) {
                    String str = ((btr0) etr0Var).f3197a;
                    ii iiVar4 = usr0Var.o2;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH10 = usr0Var.H(R.string.error);
                    String strH11 = usr0Var.H(R.string.replenish);
                    strH11.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) str, (CharSequence) strH11, usr0Var.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC9 = usr0Var.C();
                    eVarC9.getClass();
                    iiVar4.d(dialogFields4, eVarC9);
                } else if (etr0Var.equals(ctr0.f4955a)) {
                    usr0Var.E0(false);
                    usr0.P0(usr0Var).v(true);
                } else if (etr0Var instanceof dtr0) {
                    xdk0 xdk0Var = ((dtr0) etr0Var).f6668a;
                    Dialog dialog = usr0Var.S1;
                    ViewGroup viewGroup = (dialog == null || (window = dialog.getWindow()) == null) ? null : (ViewGroup) window.findViewById(android.R.id.content);
                    wdk0 wdk0Var = usr0Var.n2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackBarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, xdk0Var, usr0Var, null, viewGroup, false, null, 1012);
                } else {
                    if (!etr0Var.equals(xsr0.f41429a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(usr0Var);
                    View view = usr0Var.l1;
                    if (view != null) {
                        view.clearFocus();
                    }
                }
                usr0Var.Q0().x(k320.f17598a);
                return Unit.f46060a;
            case 12:
                l520 l520Var2 = (l520) obj;
                l520Var2.getClass();
                ((k3t0) this.receiver).x(l520Var2);
                return Unit.f46060a;
            case 13:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((ltr0) this.receiver).N(th10);
                return Unit.f46060a;
            case 14:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((ltr0) this.receiver).N(th11);
                return Unit.f46060a;
            case 15:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((ltr0) this.receiver).N(th12);
                return Unit.f46060a;
            case 16:
                vtr0 vtr0Var = (vtr0) obj;
                vtr0Var.getClass();
                ((k3t0) this.receiver).x(vtr0Var);
                return Unit.f46060a;
            case 17:
                tvr0 tvr0Var = (tvr0) obj;
                tvr0Var.getClass();
                mvr0 mvr0Var = (mvr0) this.receiver;
                g9m0 g9m0Var = mvr0.W1;
                if (tvr0Var instanceof rvr0) {
                    xdk0 xdk0Var2 = ((rvr0) tvr0Var).f31185a;
                    wdk0 wdk0Var2 = mvr0Var.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    Object objN = mvr0Var.R1.n(mvr0.X1[0], mvr0Var);
                    objN.getClass();
                    wdk0.k(wdk0Var2, xdk0Var2, mvr0Var, null, ((nvr0) objN).f24201a, false, null, 1012);
                } else {
                    mvr0Var.getClass();
                    if (tvr0Var.equals(svr0.f32883a)) {
                        r9u r9uVar = mvr0Var.O1;
                        if (r9uVar == null) {
                            Intrinsics.h("getFeatureToggleUseCase");
                            throw null;
                        }
                        ygp ygpVar = ygp.B1;
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        if (j1q0Var.f15748a.d(ygpVar)) {
                            int i7 = ylr0.m2;
                            androidx.fragment.app.e eVarC10 = mvr0Var.C();
                            eVarC10.getClass();
                            yum0.m(eVarC10);
                        } else {
                            int i8 = amr0.m2;
                            androidx.fragment.app.e eVarC11 = mvr0Var.C();
                            eVarC11.getClass();
                            cvm0.l(eVarC11);
                        }
                    } else if (tvr0Var.equals(pvr0.f27676a)) {
                        qog0 qog0Var = (qog0) mvr0Var.Q1.getValue();
                        lz9 lz9Var = new lz9(qog0Var, mvr0Var, (byte) 8);
                        qog0Var.getClass();
                        qog0Var.f29072a.add(lz9Var);
                        qog0Var.a();
                    } else {
                        if (!(tvr0Var instanceof qvr0)) {
                            t9f.b();
                            return null;
                        }
                        String str2 = ((qvr0) tvr0Var).f29400a;
                        ii iiVar5 = mvr0Var.N1;
                        if (iiVar5 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH12 = mvr0Var.H(R.string.confirmation);
                        String strI = mvr0Var.I(R.string.toto_pdf_download_confirmation_dialog_text, str2);
                        String strH13 = mvr0Var.H(R.string.ok_new);
                        strH13.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) strI, (CharSequence) strH13, mvr0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC12 = mvr0Var.C();
                        eVarC12.getClass();
                        iiVar5.d(dialogFields5, eVarC12);
                    }
                }
                mvr0Var.G0().x(wur0.f39804a);
                return Unit.f46060a;
            case 18:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((zvr0) this.receiver).O(th13);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((zvr0) this.receiver).O(th14);
                return Unit.f46060a;
            case 20:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((zvr0) this.receiver).O(th15);
                return Unit.f46060a;
            case 21:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((zvr0) this.receiver).O(th16);
                return Unit.f46060a;
            case 22:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((zvr0) this.receiver).O(th17);
                return Unit.f46060a;
            case 23:
                z3s0 z3s0Var = (z3s0) obj;
                z3s0Var.getClass();
                v3s0 v3s0Var = (v3s0) this.receiver;
                y2m0 y2m0Var = v3s0.S1;
                v3s0Var.getClass();
                if (z3s0Var instanceof x3s0) {
                    x3s0 x3s0Var = (x3s0) z3s0Var;
                    long j = x3s0Var.f40235a;
                    String str3 = x3s0Var.b;
                    cl1.o2.getClass();
                    cl1 cl1VarG = gfk0.g(j, str3);
                    androidx.fragment.app.e eVarC13 = v3s0Var.C();
                    eVarC13.getClass();
                    sj3.D0(cl1VarG, eVarC13);
                } else if (z3s0Var instanceof y3s0) {
                    y3s0 y3s0Var = (y3s0) z3s0Var;
                    String str4 = y3s0Var.f41968a;
                    String str5 = y3s0Var.b;
                    String str6 = y3s0Var.c;
                    n12 n12Var = n12.b;
                    ii iiVar6 = v3s0Var.M1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields6 = new DialogFields((CharSequence) str4, (CharSequence) str5, (CharSequence) str6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12Var, false, 1528);
                    androidx.fragment.app.e eVarC14 = v3s0Var.C();
                    eVarC14.getClass();
                    iiVar6.d(dialogFields6, eVarC14);
                } else {
                    if (!z3s0Var.equals(w3s0.f38516a)) {
                        t9f.b();
                        return null;
                    }
                    v3s0Var.G0(null);
                }
                ((k3t0) v3s0Var.R1.getValue()).x(h3s0.f12402a);
                return Unit.f46060a;
            case 24:
                o3s0 o3s0Var = (o3s0) obj;
                o3s0Var.getClass();
                ((k3t0) this.receiver).x(o3s0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                d6s0 d6s0Var = (d6s0) obj;
                d6s0Var.getClass();
                a6s0 a6s0Var = (a6s0) this.receiver;
                j6m0 j6m0Var = a6s0.S1;
                a6s0Var.getClass();
                if (d6s0Var instanceof b6s0) {
                    b6s0 b6s0Var = (b6s0) d6s0Var;
                    long j2 = b6s0Var.f2071a;
                    String str7 = b6s0Var.b;
                    cl1.o2.getClass();
                    cl1 cl1VarG2 = gfk0.g(j2, str7);
                    androidx.fragment.app.e eVarC15 = a6s0Var.C();
                    eVarC15.getClass();
                    sj3.D0(cl1VarG2, eVarC15);
                } else {
                    if (!(d6s0Var instanceof c6s0)) {
                        t9f.b();
                        return null;
                    }
                    c6s0 c6s0Var = (c6s0) d6s0Var;
                    String str8 = c6s0Var.f3834a;
                    String str9 = c6s0Var.b;
                    String str10 = c6s0Var.c;
                    n12 n12Var2 = n12.b;
                    ii iiVar7 = a6s0Var.M1;
                    if (iiVar7 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields7 = new DialogFields((CharSequence) str8, (CharSequence) str9, (CharSequence) str10, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12Var2, false, 1528);
                    androidx.fragment.app.e eVarC16 = a6s0Var.C();
                    eVarC16.getClass();
                    iiVar7.d(dialogFields7, eVarC16);
                }
                a6s0Var.G0().x(s5s0.f31669a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                y5s0 y5s0Var = (y5s0) obj;
                y5s0Var.getClass();
                ((k3t0) this.receiver).x(y5s0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                d7s0 d7s0Var = (d7s0) obj;
                d7s0Var.getClass();
                z6s0 z6s0Var = (z6s0) this.receiver;
                m6m0 m6m0Var = z6s0.S1;
                z6s0Var.getClass();
                if (d7s0Var instanceof b7s0) {
                    b7s0 b7s0Var = (b7s0) d7s0Var;
                    long j3 = b7s0Var.f2123a;
                    String str11 = b7s0Var.b;
                    cl1.o2.getClass();
                    cl1 cl1VarG3 = gfk0.g(j3, str11);
                    androidx.fragment.app.e eVarC17 = z6s0Var.C();
                    eVarC17.getClass();
                    sj3.D0(cl1VarG3, eVarC17);
                } else if (d7s0Var instanceof c7s0) {
                    c7s0 c7s0Var = (c7s0) d7s0Var;
                    String str12 = c7s0Var.f3880a;
                    String str13 = c7s0Var.b;
                    String str14 = c7s0Var.c;
                    n12 n12Var3 = n12.b;
                    ii iiVar8 = z6s0Var.M1;
                    if (iiVar8 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields8 = new DialogFields((CharSequence) str12, (CharSequence) str13, (CharSequence) str14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12Var3, false, 1528);
                    androidx.fragment.app.e eVarC18 = z6s0Var.C();
                    eVarC18.getClass();
                    iiVar8.d(dialogFields8, eVarC18);
                } else {
                    if (!d7s0Var.equals(a7s0.f389a)) {
                        t9f.b();
                        return null;
                    }
                    z6s0Var.G0(null);
                }
                ((k3t0) z6s0Var.R1.getValue()).x(p6s0.f26473a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                u6s0 u6s0Var = (u6s0) obj;
                u6s0Var.getClass();
                ((k3t0) this.receiver).x(u6s0Var);
                return Unit.f46060a;
            default:
                String str15 = (String) obj;
                str15.getClass();
                ((o7j) this.receiver).x(str15);
                return Unit.f46060a;
        }
    }
}
