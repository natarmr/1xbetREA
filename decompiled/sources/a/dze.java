package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes.dex */
public final class dze extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gze k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dze(gze gzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gzeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gze gzeVar = this.k;
        switch (b) {
            case 0:
                dze dzeVar = new dze(gzeVar, yjeVar, (byte) 0);
                dzeVar.j = obj;
                return dzeVar;
            case 1:
                dze dzeVar2 = new dze(gzeVar, yjeVar, (byte) 1);
                dzeVar2.j = obj;
                return dzeVar2;
            case 2:
                dze dzeVar3 = new dze(gzeVar, yjeVar, (byte) 2);
                dzeVar3.j = obj;
                return dzeVar3;
            case 3:
                dze dzeVar4 = new dze(gzeVar, yjeVar, (byte) 3);
                dzeVar4.j = obj;
                return dzeVar4;
            case 4:
                dze dzeVar5 = new dze(gzeVar, yjeVar, (byte) 4);
                dzeVar5.j = obj;
                return dzeVar5;
            case 5:
                dze dzeVar6 = new dze(gzeVar, yjeVar, (byte) 5);
                dzeVar6.j = obj;
                return dzeVar6;
            case 6:
                dze dzeVar7 = new dze(gzeVar, yjeVar, (byte) 6);
                dzeVar7.j = obj;
                return dzeVar7;
            case 7:
                dze dzeVar8 = new dze(gzeVar, yjeVar, (byte) 7);
                dzeVar8.j = obj;
                return dzeVar8;
            case 8:
                dze dzeVar9 = new dze(gzeVar, yjeVar, (byte) 8);
                dzeVar9.j = obj;
                return dzeVar9;
            case 9:
                dze dzeVar10 = new dze(gzeVar, yjeVar, (byte) 9);
                dzeVar10.j = obj;
                return dzeVar10;
            case 10:
                dze dzeVar11 = new dze(gzeVar, yjeVar, (byte) 10);
                dzeVar11.j = obj;
                return dzeVar11;
            default:
                dze dzeVar12 = new dze(gzeVar, yjeVar, (byte) 11);
                dzeVar12.j = obj;
                return dzeVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dze) create((r40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dze) create((fh5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((dze) create((wm5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((dze) create((ma20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((dze) create((rn20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((dze) create((xuj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((dze) create((fxo) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((dze) create((br00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((dze) create((ac50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((dze) create((jnb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((dze) create((czj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dze) create((hwo0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strH0;
        String str;
        String str2;
        byte b = this.i;
        byte b2 = 1;
        gze gzeVar = this.k;
        switch (b) {
            case 0:
                r40 r40Var = (r40) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(r40Var, n40.f22874a)) {
                    usd usdVar = gze.S1;
                    gzeVar.G0().i.setVisibility(0);
                    gzeVar.G0().g.setEnabled(true);
                    gzeVar.G0().g.setAlpha(1.0f);
                    gzeVar.G0().g.setEnabled(true);
                    gzeVar.G0().g.setAlpha(1.0f);
                } else if (Intrinsics.d(r40Var, l40.f19380a)) {
                    usd usdVar2 = gze.S1;
                    gzeVar.G0().i.setVisibility(0);
                    gzeVar.G0().g.setEnabled(false);
                    gzeVar.G0().g.setAlpha(0.5f);
                    gzeVar.G0().g.setEnabled(false);
                    gzeVar.G0().g.setAlpha(0.5f);
                } else if (Intrinsics.d(r40Var, p40.f26325a)) {
                    usd usdVar3 = gze.S1;
                    gzeVar.G0().i.setVisibility(8);
                    gzeVar.G0().i.setVisibility(8);
                }
                return Unit.f46060a;
            case 1:
                fh5 fh5Var = (fh5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(fh5Var, xg5.f40823a)) {
                    usd usdVar4 = gze.S1;
                    gzeVar.G0().j.u();
                } else if (Intrinsics.d(fh5Var, bh5.f2588a)) {
                    usd usdVar5 = gze.S1;
                    gzeVar.G0().j.w();
                }
                return Unit.f46060a;
            case 2:
                wm5 wm5Var = (wm5) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (wm5Var instanceof nm5) {
                    usd usdVar6 = gze.S1;
                    MakeBetBalanceViewDs makeBetBalanceViewDs = gzeVar.G0().j;
                    makeBetBalanceViewDs.setVisibility(0);
                    makeBetBalanceViewDs.x();
                    nm5 nm5Var = (nm5) wm5Var;
                    makeBetBalanceViewDs.setModel(nm5Var.f23757a);
                    if (nm5Var.b) {
                        String strH = gzeVar.H(R.string.change_balance_account);
                        strH.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new bze(gzeVar, b2));
                    } else {
                        String strH2 = gzeVar.H(R.string.refill_account);
                        strH2.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH2);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new bze(gzeVar, (byte) 2));
                    }
                } else if (Intrinsics.d(wm5Var, gm5.f11525a)) {
                    usd usdVar7 = gze.S1;
                    gzeVar.G0().j.setVisibility(8);
                    gzeVar.G0().j.x();
                } else {
                    if (!Intrinsics.d(wm5Var, km5.f18522a)) {
                        t9f.b();
                        return null;
                    }
                    usd usdVar8 = gze.S1;
                    gzeVar.G0().j.setVisibility(0);
                    gzeVar.G0().j.v();
                }
                return Unit.f46060a;
            case 3:
                ma20 ma20Var = (ma20) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ia20 ia20Var = ia20.f14416a;
                if (!Intrinsics.d(ma20Var, ia20Var)) {
                    if (ma20Var instanceof ka20) {
                        ka20 ka20Var = (ka20) ma20Var;
                        usd usdVar9 = gze.S1;
                        lgn0 lgn0Var = gzeVar.M1;
                        if (lgn0Var == null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        String strH3 = gzeVar.H(R.string.bet_processed_successfully);
                        strH3.getClass();
                        String str3 = ka20Var.m;
                        String str4 = ka20Var.l;
                        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH3, null, str3, null);
                        q4f q4fVar = ka20Var.g;
                        en7 en7Var = ka20Var.h;
                        int iOrdinal = q4fVar.ordinal();
                        if (iOrdinal == 3) {
                            String strH4 = gzeVar.H(R.string.system);
                            strH4.getClass();
                            strH0 = gze.H0(strH4, en7Var);
                        } else if (iOrdinal != 5) {
                            strH0 = gzeVar.H(lgb.V(q4fVar));
                            strH0.getClass();
                        } else {
                            String strH5 = gzeVar.H(R.string.multibet);
                            strH5.getClass();
                            strH0 = gze.H0(strH5, en7Var);
                        }
                        String str5 = strH0;
                        String str6 = ka20Var.i;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (str4 != null && str4.length() != 0) {
                            b2 = 0;
                        }
                        String strH6 = gzeVar.H(b2 == 0 ? R.string.maximum_coef : R.string.coefficient);
                        strH6.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.Simple(strH6, ka20Var.b));
                        if (b2 == 0) {
                            String strH7 = gzeVar.H(R.string.optional_coef);
                            strH7.getClass();
                            lc00VarB.add(new SuccessBetInfoItem.Simple(strH7, str4));
                        }
                        String strH8 = gzeVar.H(R.string.bet_sum);
                        strH8.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, gzeVar.o0()), strH8, ka20Var.f17943a, ka20Var.f, true));
                        if (!ka20Var.k && (str = ka20Var.d) != null && (str2 = ka20Var.e) != null) {
                            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, gzeVar.o0()), str, str2, ka20Var.f, false));
                        }
                        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(str5, str6, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(ka20Var.c), "SIMPLE", kotlin.collections.a.a(lc00VarB)), acb.P(gzeVar));
                    } else {
                        if (!(ma20Var instanceof la20)) {
                            t9f.b();
                            return null;
                        }
                        la20 la20Var = (la20) ma20Var;
                        int i = la20Var.b;
                        usd usdVar10 = gze.S1;
                        lgn0 lgn0Var2 = gzeVar.M1;
                        if (lgn0Var2 == null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        String strH9 = gzeVar.H(R.string.bet_processed_successfully);
                        strH9.getClass();
                        String strH10 = gzeVar.H(R.string.bet_processed_successfully);
                        Integer numValueOf = Integer.valueOf(i);
                        int i2 = la20Var.c;
                        lgn0Var2.c(new SuccessBetStringModel(strH9, w6x.q(strH10, Separators.RETURN, gzeVar.I(R.string.bet_processed_count_v2, numValueOf, Integer.valueOf(i2))), la20Var.d, gzeVar.I(R.string.bet_processed_count_v2, Integer.valueOf(i), Integer.valueOf(i2))), new SuccessBetAlertModel(null, null, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(la20Var.f19686a), "SIMPLE", iun.f15405a), acb.P(gzeVar));
                    }
                }
                usd usdVar11 = gze.S1;
                p7m0 p7m0Var = gzeVar.I0().a1;
                p7m0Var.getClass();
                p7m0Var.o(null, ia20Var);
                return Unit.f46060a;
            case 4:
                rn20 rn20Var = (rn20) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                usd usdVar12 = gze.S1;
                c3f c3fVarG0 = gzeVar.G0();
                BetInputView betInputView = c3fVarG0.b;
                DsButton dsButton = c3fVarG0.f;
                betInputView.setVisibility(!rn20Var.b ? 0 : 8);
                dsButton.setVisibility(rn20Var.b ? 0 : 8);
                dsButton.setEnabled(rn20Var.f30767a);
                return Unit.f46060a;
            case 5:
                xuj0 xuj0Var = (xuj0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (xuj0Var != null) {
                    boolean z = xuj0Var instanceof uuj0;
                    gze gzeVar2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = gzeVar2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, ((uuj0) xuj0Var).f36303a, gzeVar2, null, null, false, null, 1020);
                    } else if (xuj0Var instanceof ruj0) {
                        ii iiVar = gzeVar2.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH11 = gzeVar2.H(R.string.attention);
                        String str7 = ((ruj0) xuj0Var).f31132a;
                        String strH12 = gzeVar2.H(R.string.ok_new);
                        strH12.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH11, (CharSequence) str7, (CharSequence) strH12, gzeVar2.H(R.string.cancel), (String) null, "REQUEST_KEY_CHANGE_TYPE_TO_SYSTEM", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = gzeVar2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (xuj0Var instanceof puj0) {
                        ii iiVar2 = gzeVar2.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH13 = gzeVar2.H(R.string.error);
                        String str8 = ((puj0) xuj0Var).f27620a;
                        String strH14 = gzeVar2.H(R.string.ok_new);
                        strH14.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH13, (CharSequence) str8, (CharSequence) strH14, gzeVar2.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = gzeVar2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (xuj0Var instanceof quj0) {
                        ii iiVar3 = gzeVar2.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH15 = gzeVar2.H(R.string.error);
                        String str9 = ((quj0) xuj0Var).f29349a;
                        String strH16 = gzeVar2.H(R.string.replenish);
                        strH16.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH15, (CharSequence) str9, (CharSequence) strH16, gzeVar2.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC3 = gzeVar2.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 6:
                fxo fxoVar = (fxo) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (fxoVar.h) {
                    usd usdVar13 = gze.S1;
                    gzeVar.G0().h.setVisibility(8);
                    gzeVar.G0().m.setVisibility(8);
                } else if (fxoVar.f) {
                    usd usdVar14 = gze.S1;
                    gzeVar.G0().h.setVisibility(8);
                    gzeVar.G0().m.setVisibility(0);
                } else if (fxoVar.g) {
                    usd usdVar15 = gze.S1;
                    c3f c3fVarG1 = gzeVar.G0();
                    c3fVarG1.h.setVisibility(0);
                    c3fVarG1.c.setEnabled(false);
                    c3fVarG1.d.setEnabled(false);
                    c3fVarG1.e.setEnabled(false);
                    c3fVarG1.m.setVisibility(8);
                    if (fxoVar.d) {
                        gzeVar.J0(fxoVar);
                    }
                } else if (fxoVar.e) {
                    usd usdVar16 = gze.S1;
                    gzeVar.J0(fxoVar);
                } else {
                    usd usdVar17 = gze.S1;
                    gzeVar.G0().h.setVisibility(8);
                    gzeVar.G0().m.setVisibility(8);
                }
                return Unit.f46060a;
            case 7:
                br00 br00Var = (br00) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(br00Var, ar00.f1321a)) {
                    gnm0.s(gzeVar.C());
                } else {
                    if (!Intrinsics.d(br00Var, zq00.f44786a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.i(gzeVar.C());
                }
                return Unit.f46060a;
            case 8:
                ac50 ac50Var = (ac50) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ub50 ub50Var = ub50.f35363a;
                if (!Intrinsics.d(ac50Var, ub50Var)) {
                    if (Intrinsics.d(ac50Var, xb50.f40585a)) {
                        ynb ynbVar = gzeVar.N1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.i;
                        androidx.fragment.app.e eVarC4 = gzeVar.C();
                        eVarC4.getClass();
                        ynb.b(ynbVar, bm5Var, null, eVarC4, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                    } else {
                        if (!Intrinsics.d(ac50Var, yb50.f42325a)) {
                            t9f.b();
                            return null;
                        }
                        ii iiVar4 = gzeVar.L1;
                        if (iiVar4 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH17 = gzeVar.H(R.string.confirmation);
                        String strH18 = gzeVar.H(R.string.advancedbet_contract_agree_new);
                        String strH19 = gzeVar.H(R.string.yes);
                        strH19.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, gzeVar.H(R.string.no), (String) null, "REQUEST_KEY_ADVANCE", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC5 = gzeVar.C();
                        eVarC5.getClass();
                        iiVar4.d(dialogFields4, eVarC5);
                    }
                }
                usd usdVar18 = gze.S1;
                p7m0 p7m0Var2 = gzeVar.I0().b1;
                p7m0Var2.getClass();
                p7m0Var2.o(null, ub50Var);
                return Unit.f46060a;
            case 9:
                jnb0 jnb0Var = (jnb0) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (jnb0Var != null) {
                    if (jnb0Var instanceof hnb0) {
                        usd usdVar19 = gze.S1;
                        gzeVar.G0().n.setVisibility(8);
                    } else if (jnb0Var instanceof inb0) {
                        usd usdVar20 = gze.S1;
                        gzeVar.G0().n.setVisibility(0);
                        gzeVar.G0().n.setText(((inb0) jnb0Var).f15066a.b(gzeVar.o0()));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 10:
                czj0 czj0Var = (czj0) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                usd usdVar21 = gze.S1;
                BetInputView betInputView2 = gzeVar.G0().b;
                boolean z2 = czj0Var.l;
                AutoMaxUiModel autoMaxUiModel = czj0Var.j;
                betInputView2.y(z2);
                if (!czj0Var.b) {
                    betInputView2.w(null, czj0Var.f5227a);
                }
                betInputView2.setVisibilityStepButtons(czj0Var.d);
                betInputView2.setEachWayBadge(czj0Var.m);
                if (czj0Var.l) {
                    betInputView2.x("", false);
                } else {
                    SpannableString spannableStringC = czj0Var.c.c(gzeVar.o0());
                    betInputView2.setBetLimitsText(spannableStringC);
                    betInputView2.z(czj0Var.i);
                    betInputView2.setMakeBetButtonEnabled(czj0Var.g);
                    betInputView2.setPlusButtonEnabled(czj0Var.e);
                    betInputView2.setMinusButtonEnabled(czj0Var.f);
                    betInputView2.setEditFieldEnabled(czj0Var.h);
                    betInputView2.x(spannableStringC.toString(), czj0Var.k);
                    if (autoMaxUiModel.f46472a) {
                        betInputView2.setMaxValue(new BigDecimal(String.valueOf(autoMaxUiModel.b)));
                    } else {
                        BigDecimal bigDecimal = BigDecimal.ZERO;
                        bigDecimal.getClass();
                        betInputView2.t = bigDecimal;
                    }
                }
                return Unit.f46060a;
            default:
                hwo0 hwo0Var = (hwo0) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                if (hwo0Var instanceof ewo0) {
                    usd usdVar22 = gze.S1;
                    ewo0 ewo0Var = (ewo0) hwo0Var;
                    gzeVar.G0().k.setHeaderValue(ewo0Var.f8537a.c(gzeVar.o0()));
                    TaxExpandableSpoiler taxExpandableSpoiler = gzeVar.G0().k;
                    Context contextO0 = gzeVar.o0();
                    ArrayList<mvo0> arrayList = ewo0Var.b;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (mvo0 mvo0Var : arrayList) {
                        nvo0 nvo0Var = new nvo0(contextO0);
                        nvo0Var.setModel(mvo0Var);
                        arrayList2.add(nvo0Var);
                    }
                    taxExpandableSpoiler.setContent(arrayList2);
                    gzeVar.G0().k.e();
                    gzeVar.G0().k.setVisibility(0);
                } else if (hwo0Var instanceof awo0) {
                    usd usdVar23 = gze.S1;
                    gzeVar.G0().k.e();
                    gzeVar.G0().k.setVisibility(8);
                } else if (Intrinsics.d(hwo0Var, xvo0.f41571a)) {
                    usd usdVar24 = gze.S1;
                    gzeVar.G0().k.e();
                    gzeVar.G0().k.f();
                    gzeVar.G0().k.setVisibility(0);
                } else {
                    if (!Intrinsics.d(hwo0Var, cwo0.f5091a)) {
                        t9f.b();
                        return null;
                    }
                    usd usdVar25 = gze.S1;
                    gzeVar.G0().k.g();
                    gzeVar.G0().k.setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}
