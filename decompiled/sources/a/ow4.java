package a;

import android.content.Context;
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
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes5.dex */
public final class ow4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rw4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow4(rw4 rw4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rw4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rw4 rw4Var = this.k;
        switch (b) {
            case 0:
                ow4 ow4Var = new ow4(rw4Var, yjeVar, (byte) 0);
                ow4Var.j = obj;
                return ow4Var;
            case 1:
                ow4 ow4Var2 = new ow4(rw4Var, yjeVar, (byte) 1);
                ow4Var2.j = obj;
                return ow4Var2;
            case 2:
                ow4 ow4Var3 = new ow4(rw4Var, yjeVar, (byte) 2);
                ow4Var3.j = obj;
                return ow4Var3;
            case 3:
                ow4 ow4Var4 = new ow4(rw4Var, yjeVar, (byte) 3);
                ow4Var4.j = obj;
                return ow4Var4;
            case 4:
                ow4 ow4Var5 = new ow4(rw4Var, yjeVar, (byte) 4);
                ow4Var5.j = obj;
                return ow4Var5;
            case 5:
                ow4 ow4Var6 = new ow4(rw4Var, yjeVar, (byte) 5);
                ow4Var6.j = obj;
                return ow4Var6;
            case 6:
                ow4 ow4Var7 = new ow4(rw4Var, yjeVar, (byte) 6);
                ow4Var7.j = obj;
                return ow4Var7;
            case 7:
                ow4 ow4Var8 = new ow4(rw4Var, yjeVar, (byte) 7);
                ow4Var8.j = obj;
                return ow4Var8;
            default:
                ow4 ow4Var9 = new ow4(rw4Var, yjeVar, (byte) 8);
                ow4Var9.j = obj;
                return ow4Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ow4) create((dh5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ow4) create((qm5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ow4) create((ja20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ow4) create((iw4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ow4) create((wq00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ow4) create((dx4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ow4) create((qnb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ow4) create((x05) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ow4) create((gwo0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        rw4 rw4Var = this.k;
        switch (b) {
            case 0:
                dh5 dh5Var = (dh5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(dh5Var, vg5.f37365a)) {
                    gfk0 gfk0Var = rw4.W1;
                    rw4Var.H0().b.u();
                } else if (Intrinsics.d(dh5Var, zg5.f44327a)) {
                    gfk0 gfk0Var2 = rw4.W1;
                    rw4Var.H0().b.w();
                }
                return Unit.f46060a;
            case 1:
                qm5 qm5Var = (qm5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (qm5Var instanceof mm5) {
                    gfk0 gfk0Var3 = rw4.W1;
                    MakeBetBalanceViewDs makeBetBalanceViewDs = rw4Var.H0().b;
                    makeBetBalanceViewDs.setVisibility(0);
                    makeBetBalanceViewDs.x();
                    mm5 mm5Var = (mm5) qm5Var;
                    makeBetBalanceViewDs.setModel(mm5Var.f22020a);
                    if (mm5Var.b) {
                        String strH = rw4Var.H(R.string.change_balance_account);
                        strH.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new kw4(rw4Var, (byte) 1));
                    } else {
                        String strH2 = rw4Var.H(R.string.refill_account);
                        strH2.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH2);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new kw4(rw4Var, (byte) 2));
                    }
                } else if (Intrinsics.d(qm5Var, fm5.f9768a)) {
                    gfk0 gfk0Var4 = rw4.W1;
                    rw4Var.H0().b.setVisibility(8);
                    rw4Var.H0().b.x();
                } else {
                    if (!Intrinsics.d(qm5Var, jm5.f16748a)) {
                        t9f.b();
                        return null;
                    }
                    gfk0 gfk0Var5 = rw4.W1;
                    rw4Var.H0().b.setVisibility(0);
                    rw4Var.H0().b.v();
                }
                return Unit.f46060a;
            case 2:
                ja20 ja20Var = (ja20) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (ja20Var == null) {
                    t9f.b();
                    return null;
                }
                String strH3 = rw4Var.H(R.string.success_auto_bet);
                strH3.getClass();
                lgn0 lgn0Var = rw4Var.O1;
                if (lgn0Var == null) {
                    Intrinsics.h("successBetAlertManager");
                    throw null;
                }
                SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH3, null, null, null);
                String strH4 = rw4Var.H(R.string.single);
                String str = ja20Var.e;
                String strH5 = rw4Var.H(R.string.autobet_sum);
                strH5.getClass();
                lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH4, str, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(ja20Var.c), "AUTO", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, rw4Var.o0()), strH5, ja20Var.f16168a, ja20Var.d, true))), rw4.G0(rw4Var).p0());
                rw4.G0(rw4Var).x0();
                return Unit.f46060a;
            case 3:
                iw4 iw4Var = (iw4) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (iw4Var != null) {
                    boolean z2 = iw4Var instanceof fw4;
                    rw4 rw4Var2 = this.k;
                    if (z2) {
                        wdk0 wdk0Var = rw4Var2.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, ((fw4) iw4Var).f10241a, rw4Var2, null, rw4.G0(rw4Var2).Q0().r, false, null, 1012);
                    } else if (iw4Var instanceof ew4) {
                        String str2 = ((ew4) iw4Var).f8502a;
                        String strH6 = rw4Var2.H(R.string.ok_new);
                        strH6.getClass();
                        rw4Var2.J0(str2, "REQUEST_BET_EXISTS_DIALOG_KEY", strH6);
                    } else if (iw4Var instanceof hw4) {
                        String str3 = ((hw4) iw4Var).f13753a;
                        String strH7 = rw4Var2.H(R.string.top_up);
                        strH7.getClass();
                        rw4Var2.J0(str3, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", strH7);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                wq00 wq00Var = (wq00) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(wq00Var, vq00.f37833a)) {
                    gnm0.s(rw4Var.C());
                } else {
                    if (!Intrinsics.d(wq00Var, uq00.f36094a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.i(rw4Var.C());
                }
                return Unit.f46060a;
            case 5:
                dx4 dx4Var = (dx4) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(dx4Var, dx4.f6829a)) {
                    ynb ynbVar = rw4Var.P1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.b;
                    androidx.fragment.app.e eVarC = rw4Var.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                }
                return Unit.f46060a;
            case 6:
                qnb0 qnb0Var = (qnb0) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(qnb0Var, onb0.f25539a)) {
                    gfk0 gfk0Var6 = rw4.W1;
                    rw4Var.H0().c.setVisibility(8);
                } else {
                    if (!(qnb0Var instanceof pnb0)) {
                        t9f.b();
                        return null;
                    }
                    gfk0 gfk0Var7 = rw4.W1;
                    rw4Var.H0().c.setVisibility(0);
                    rw4Var.H0().c.setText(((pnb0) qnb0Var).f27279a.c(rw4Var.o0()));
                }
                return Unit.f46060a;
            case 7:
                x05 x05Var = (x05) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                gfk0 gfk0Var8 = rw4.W1;
                BetInputView betInputView = rw4Var.H0().e;
                boolean z3 = x05Var.h;
                AutoMaxUiModel autoMaxUiModel = x05Var.k;
                boolean z4 = x05Var.o;
                if (!z3) {
                    String str4 = x05Var.f40054a;
                    int i = BetInputView.v;
                    betInputView.w(null, str4);
                }
                betInputView.setEditFieldEnabled(!z4);
                betInputView.setPlaceholder(x05Var.j);
                betInputView.setMaxValue(wvb.L("999.999"));
                betInputView.setPlusButtonEnabled(x05Var.c);
                betInputView.setMinusButtonEnabled(x05Var.d);
                if (!x05Var.l && !x05Var.n) {
                    z = false;
                }
                betInputView.x(x05Var.b.c(rw4Var.o0()).toString(), z);
                BetInputView betInputView2 = rw4Var.H0().d;
                betInputView2.y(z4);
                if (!x05Var.i) {
                    betInputView2.w(null, x05Var.f);
                }
                if (!z4) {
                    SpannableString spannableStringC = x05Var.g.c(rw4Var.o0());
                    betInputView2.setBetLimitsText(spannableStringC);
                    betInputView2.setMakeBetButtonEnabled(x05Var.e);
                    if (autoMaxUiModel.f46769a) {
                        betInputView2.setMaxValue(new BigDecimal(String.valueOf(autoMaxUiModel.b)));
                    } else {
                        BigDecimal bigDecimal = BigDecimal.ZERO;
                        bigDecimal.getClass();
                        betInputView2.t = bigDecimal;
                    }
                    betInputView2.x(spannableStringC.toString(), x05Var.m);
                }
                return Unit.f46060a;
            default:
                gwo0 gwo0Var = (gwo0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (gwo0Var instanceof dwo0) {
                    gfk0 gfk0Var9 = rw4.W1;
                    dwo0 dwo0Var = (dwo0) gwo0Var;
                    rw4Var.H0().f.setHeaderValue(dwo0Var.f6810a.c(rw4Var.o0()));
                    TaxExpandableSpoiler taxExpandableSpoiler = rw4Var.H0().f;
                    Context contextO0 = rw4Var.o0();
                    ArrayList<mvo0> arrayList = dwo0Var.b;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (mvo0 mvo0Var : arrayList) {
                        nvo0 nvo0Var = new nvo0(contextO0);
                        nvo0Var.setModel(mvo0Var);
                        arrayList2.add(nvo0Var);
                    }
                    taxExpandableSpoiler.setContent(arrayList2);
                    rw4Var.H0().f.e();
                    rw4Var.H0().f.setVisibility(0);
                } else if (gwo0Var instanceof zvo0) {
                    gfk0 gfk0Var10 = rw4.W1;
                    rw4Var.H0().f.e();
                    rw4Var.H0().f.setVisibility(8);
                } else if (gwo0Var instanceof wvo0) {
                    gfk0 gfk0Var11 = rw4.W1;
                    rw4Var.H0().f.e();
                    rw4Var.H0().f.f();
                    rw4Var.H0().f.setVisibility(0);
                } else {
                    if (!Intrinsics.d(gwo0Var, bwo0.f3335a)) {
                        t9f.b();
                        return null;
                    }
                    gfk0 gfk0Var12 = rw4.W1;
                    rw4Var.H0().f.g();
                    rw4Var.H0().f.setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}
