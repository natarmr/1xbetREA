package a;

import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectTimeRangeScreenParams;
import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pop extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pop(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f27340a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 1;
        switch (this.f27340a) {
            case 0:
                ki00 ki00Var = (ki00) obj;
                ki00Var.getClass();
                ((k3t0) this.receiver).x(ki00Var);
                return Unit.f46060a;
            case 1:
                dgl0 dgl0Var = (dgl0) obj;
                dgl0Var.getClass();
                ((k3t0) this.receiver).x(dgl0Var);
                return Unit.f46060a;
            case 2:
                ekp ekpVar = (ekp) obj;
                ekpVar.getClass();
                rop ropVar = (rop) this.receiver;
                nek nekVar = rop.a2;
                ropVar.getClass();
                if (ekpVar instanceof ckp) {
                    ckp ckpVar = (ckp) ekpVar;
                    ghq0 ghq0Var = ckpVar.f4517a;
                    ygq0 ygq0Var = ghq0Var.f11314a;
                    wgq0 wgq0Var = ghq0Var.b;
                    long j = wgq0Var.f39129a;
                    long j2 = wgq0Var.b;
                    gle0 gle0Var = d3i0.n2;
                    androidx.fragment.app.e eVarC = ropVar.C();
                    eVarC.getClass();
                    SelectTimeFilterScreenParams selectTimeFilterScreenParams = new SelectTimeFilterScreenParams(ygq0Var, j, j2, true, false, new Date(), false, ckpVar.b);
                    gle0Var.getClass();
                    gle0.i(eVarC, selectTimeFilterScreenParams);
                } else if (ekpVar instanceof bkp) {
                    wdk0.k(ropVar.M0().q, ((bkp) ekpVar).f2759a, ropVar, null, null, false, null, 1020);
                } else if (ekpVar instanceof akp) {
                    ChoosenDate choosenDate = ((akp) ekpVar).f1033a;
                    lme0 lme0Var = y3i0.n2;
                    androidx.fragment.app.e eVarC2 = ropVar.C();
                    eVarC2.getClass();
                    SelectTimeRangeScreenParams selectTimeRangeScreenParams = new SelectTimeRangeScreenParams(choosenDate, "SELECT_DATE_TIME_REQUEST_KEY");
                    lme0Var.getClass();
                    lme0.c(eVarC2, selectTimeRangeScreenParams);
                } else if (ekpVar instanceof zjp) {
                    j120.Y(ropVar);
                } else {
                    if (!(ekpVar instanceof dkp)) {
                        t9f.b();
                        return null;
                    }
                    TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = ((dkp) ekpVar).f6243a;
                    List listP = ropVar.C().c.p();
                    listP.getClass();
                    if (listP.isEmpty()) {
                        j6m0 j6m0Var = b5r0.t2;
                        androidx.fragment.app.e eVarC3 = ropVar.C();
                        eVarC3.getClass();
                        j6m0Var.getClass();
                        j6m0.f(eVarC3, topGamesByStatBottomSheetScreenParams);
                    } else {
                        Iterator it = listP.iterator();
                        while (it.hasNext()) {
                            if (((Fragment) it.next()) instanceof sik) {
                            }
                        }
                        j6m0 j6m0Var2 = b5r0.t2;
                        androidx.fragment.app.e eVarC4 = ropVar.C();
                        eVarC4.getClass();
                        j6m0Var2.getClass();
                        j6m0.f(eVarC4, topGamesByStatBottomSheetScreenParams);
                    }
                }
                ropVar.N0().x(hjp.f13171a);
                return Unit.f46060a;
            case 3:
                ujp ujpVar = (ujp) obj;
                ujpVar.getClass();
                ((k3t0) this.receiver).x(ujpVar);
                return Unit.f46060a;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((fpp) this.receiver).P(th);
                return Unit.f46060a;
            case 5:
                mtp mtpVar = (mtp) obj;
                mtpVar.getClass();
                ((k3t0) this.receiver).x(mtpVar);
                return Unit.f46060a;
            case 6:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                pup pupVar = (pup) this.receiver;
                bby bbyVar = pupVar.A;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                pupVar.w.b(th2, new gup(th2, pupVar, b));
                return Unit.f46060a;
            case 7:
                jxp jxpVar = (jxp) obj;
                jxpVar.getClass();
                svp svpVar = (svp) this.receiver;
                ddk ddkVar = svp.S1;
                svpVar.getClass();
                if (jxpVar instanceof hxp) {
                    hxp hxpVar = (hxp) jxpVar;
                    ujd ujdVar = svpVar.N1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(svpVar, hxpVar.f13821a);
                } else {
                    if (!(jxpVar instanceof ixp)) {
                        t9f.b();
                        return null;
                    }
                    ixp ixpVar = (ixp) jxpVar;
                    wdk0 wdk0Var = svpVar.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ixpVar.f15553a, null, null, null, null, 124), svpVar, null, null, false, null, 1020);
                }
                svpVar.G0().x(yup.f43278a);
                return Unit.f46060a;
            case 8:
                lvp lvpVar = (lvp) obj;
                lvpVar.getClass();
                ((k3t0) this.receiver).x(lvpVar);
                return Unit.f46060a;
            case 9:
                s4q s4qVar = (s4q) obj;
                s4qVar.getClass();
                n4q n4qVar = (n4q) this.receiver;
                bek bekVar = n4q.R1;
                n4qVar.getClass();
                phf0 phf0Var = n4qVar.L1;
                if (s4qVar instanceof r4q) {
                    if (n4qVar.F().J("SeasonsBottomSheet") == null) {
                        gle0 gle0Var2 = kjh0.o2;
                        String strN = phf0Var.n(n4qVar, n4q.S1[0]);
                        gle0Var2.getClass();
                        strN.getClass();
                        kjh0 kjh0Var = new kjh0();
                        iiy[] iiyVarArr = kjh0.p2;
                        kjh0Var.m2.x(kjh0Var, iiyVarArr[0], "REQUEST_SEASONS_DIALOG_KEY");
                        kjh0Var.n2.x(kjh0Var, iiyVarArr[1], strN);
                        kjh0Var.H0(n4qVar.F(), "SeasonsBottomSheet");
                    }
                } else if (s4qVar instanceof q4q) {
                    if (n4qVar.F().J("SelectMatch") == null) {
                        evz evzVar = qg30.o2;
                        String strN2 = phf0Var.n(n4qVar, n4q.S1[0]);
                        evzVar.getClass();
                        strN2.getClass();
                        qg30 qg30Var = new qg30();
                        iiy[] iiyVarArr2 = qg30.p2;
                        qg30Var.m2.x(qg30Var, iiyVarArr2[0], "REQUEST_MATCH_TYPES_DIALOG_KEY");
                        qg30Var.n2.x(qg30Var, iiyVarArr2[1], strN2);
                        qg30Var.H0(n4qVar.F(), "SelectMatch");
                    }
                } else if (s4qVar instanceof p4q) {
                    ii iiVar = n4qVar.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = n4qVar.H(R.string.caution);
                    String strH2 = n4qVar.H(R.string.reset_to_default_values);
                    String strH3 = n4qVar.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, n4qVar.H(R.string.cancel), (String) null, "REQUEST_RESET_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = n4qVar.C();
                    eVarC5.getClass();
                    iiVar.d(dialogFields, eVarC5);
                }
                n4qVar.G0().x(z3q.f43734a);
                return Unit.f46060a;
            case 10:
                i4q i4qVar = (i4q) obj;
                i4qVar.getClass();
                ((k3t0) this.receiver).x(i4qVar);
                return Unit.f46060a;
            case 11:
                f9q f9qVar = (f9q) obj;
                f9qVar.getClass();
                ((k3t0) this.receiver).x(f9qVar);
                return Unit.f46060a;
            case 12:
                ((s9q) obj).getClass();
                q9q q9qVar = (q9q) this.receiver;
                int i = q9q.m2;
                q9qVar.y0();
                return Unit.f46060a;
            case 13:
                r9q r9qVar = (r9q) obj;
                r9qVar.getClass();
                ((k3t0) this.receiver).x(r9qVar);
                return Unit.f46060a;
            case 14:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((ebq) this.receiver).P(th3);
                return Unit.f46060a;
            case 15:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((ebq) this.receiver).P(th4);
                return Unit.f46060a;
            case 16:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((ebq) this.receiver).P(th5);
                return Unit.f46060a;
            case 17:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ebq ebqVar = (ebq) this.receiver;
                int i2 = ebq.f0;
                ebqVar.P(th6);
                return Unit.f46060a;
            case 18:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((ebq) this.receiver).P(th7);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((ebq) this.receiver).P(th8);
                return Unit.f46060a;
            case 20:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((ebq) this.receiver).P(th9);
                return Unit.f46060a;
            case 21:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((ebq) this.receiver).P(th10);
                return Unit.f46060a;
            case 22:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((ebq) this.receiver).P(th11);
                return Unit.f46060a;
            case 23:
                dar darVar = (dar) obj;
                darVar.getClass();
                ((k3t0) this.receiver).x(darVar);
                return Unit.f46060a;
            case 24:
                ncr ncrVar = (ncr) obj;
                ncrVar.getClass();
                ((k3t0) this.receiver).x(ncrVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sjr sjrVar = (sjr) obj;
                sjrVar.getClass();
                ((k3t0) this.receiver).x(sjrVar);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                pnr pnrVar = (pnr) obj;
                pnrVar.getClass();
                dnr dnrVar = (dnr) this.receiver;
                ddk ddkVar2 = dnr.c2;
                dnrVar.getClass();
                if (pnrVar instanceof mnr) {
                    j120.P(dnrVar, new gmo(dnrVar, pnrVar, (byte) 17));
                } else if (pnrVar.equals(nnr.b)) {
                    j120.P(dnrVar, new ymr(dnrVar, b));
                } else if (pnrVar.equals(nnr.c)) {
                    wdk0 wdk0Var2 = dnrVar.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH4 = dnrVar.H(R.string.one_click_bet_disabled_message);
                    strH4.getClass();
                    wdk0.k(wdk0Var2, new xdk0(qek0Var, strH4, null, null, null, null, 124), dnrVar, null, null, false, null, 1020);
                } else if (pnrVar instanceof onr) {
                    dnrVar.C().t0(i120.V(new Pair("BUNDLE_KEY_GAME_ID", Long.valueOf(((onr) pnrVar).f25560a))), "REQUEST_KEY_UPDATE_GAME_ID");
                } else if (pnrVar instanceof knr) {
                    wdk0 wdk0Var3 = dnrVar.O1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH5 = dnrVar.H(((knr) pnrVar).f18598a);
                    strH5.getClass();
                    wdk0.k(wdk0Var3, new xdk0(rek0Var, strH5, null, null, null, null, 124), dnrVar, null, null, false, null, 1020);
                } else if (pnrVar instanceof lnr) {
                    lnr lnrVar = (lnr) pnrVar;
                    new c0x(lnrVar.f20360a, dnrVar.o0(), lnrVar.b).show();
                } else {
                    if (!pnrVar.equals(nnr.f23836a)) {
                        t9f.b();
                        return null;
                    }
                    if (dnrVar.V1 == null) {
                        Intrinsics.h("tipsDialogFeature");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC6 = dnrVar.C();
                    eVarC6.getClass();
                    uuz uuzVar = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC6.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var = new ki60();
                        iiy[] iiyVarArr3 = ki60.r2;
                        ki60Var.n2.I(ki60Var, iiyVarArr3[1], 8);
                        ki60Var.o2.x(ki60Var, iiyVarArr3[2], "");
                        sj3.E0(ki60Var, eVarC6, "OnboardingBottomSheetContainerFragment");
                    }
                }
                dnrVar.I0().x(lmr.b);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                umr umrVar = (umr) obj;
                umrVar.getClass();
                ((k3t0) this.receiver).x(umrVar);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                spr sprVar = (spr) this.receiver;
                sprVar.t.f(th12, new znr(sprVar, b));
                return Unit.f46060a;
            default:
                y2s y2sVar = (y2s) obj;
                y2sVar.getClass();
                j2s j2sVar = (j2s) this.receiver;
                xak xakVar = j2s.b2;
                j2sVar.getClass();
                if (y2sVar instanceof r2s) {
                    wdk0 wdk0Var4 = j2sVar.U1;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var2 = rek0.b;
                    String strH6 = j2sVar.H(((r2s) y2sVar).f29751a);
                    strH6.getClass();
                    wdk0.k(wdk0Var4, new xdk0(rek0Var2, strH6, null, null, null, null, 124), j2sVar, null, null, false, null, 1020);
                } else if (y2sVar instanceof s2s) {
                    s2s s2sVar = (s2s) y2sVar;
                    new c0x(s2sVar.f31517a, j2sVar.o0(), s2sVar.b).show();
                } else if (y2sVar instanceof x2s) {
                    j2sVar.C().t0(i120.V(new Pair("BUNDLE_KEY_GAME_ID", Long.valueOf(((x2s) y2sVar).f40184a))), "REQUEST_KEY_UPDATE_GAME_ID");
                } else if (y2sVar instanceof t2s) {
                    if (j2sVar.O1 == null) {
                        Intrinsics.h("actionMenuDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC7 = j2sVar.C();
                    eVarC7.getClass();
                    gfk0.h(eVarC7, ((t2s) y2sVar).f33230a);
                } else if (y2sVar.equals(v2s.f36701a)) {
                    if (j2sVar.S1 == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC8 = j2sVar.C();
                    eVarC8.getClass();
                    xi70.h(eVarC8);
                } else if (y2sVar.equals(w2s.f38466a)) {
                    wdk0 wdk0Var5 = j2sVar.U1;
                    if (wdk0Var5 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var2 = qek0.f28589a;
                    String strH7 = j2sVar.H(R.string.one_click_bet_disabled_message);
                    strH7.getClass();
                    wdk0.k(wdk0Var5, new xdk0(qek0Var2, strH7, null, null, null, null, 124), j2sVar, null, null, false, null, 1020);
                } else {
                    if (!y2sVar.equals(u2s.f34961a)) {
                        t9f.b();
                        return null;
                    }
                    if (j2sVar.V1 == null) {
                        Intrinsics.h("tipsDialogFeature");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC9 = j2sVar.C();
                    eVarC9.getClass();
                    uuz uuzVar2 = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC9.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var2 = new ki60();
                        iiy[] iiyVarArr4 = ki60.r2;
                        ki60Var2.n2.I(ki60Var2, iiyVarArr4[1], 8);
                        ki60Var2.o2.x(ki60Var2, iiyVarArr4[2], "");
                        sj3.E0(ki60Var2, eVarC9, "OnboardingBottomSheetContainerFragment");
                    }
                }
                j2sVar.J0().x(k1s.f17543a);
                return Unit.f46060a;
        }
    }
}
