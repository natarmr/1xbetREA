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
import org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes.dex */
public final class pye extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rye k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pye(rye ryeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ryeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rye ryeVar = this.k;
        switch (b) {
            case 0:
                pye pyeVar = new pye(ryeVar, yjeVar, (byte) 0);
                pyeVar.j = obj;
                return pyeVar;
            case 1:
                pye pyeVar2 = new pye(ryeVar, yjeVar, (byte) 1);
                pyeVar2.j = obj;
                return pyeVar2;
            case 2:
                pye pyeVar3 = new pye(ryeVar, yjeVar, (byte) 2);
                pyeVar3.j = obj;
                return pyeVar3;
            case 3:
                pye pyeVar4 = new pye(ryeVar, yjeVar, (byte) 3);
                pyeVar4.j = obj;
                return pyeVar4;
            case 4:
                pye pyeVar5 = new pye(ryeVar, yjeVar, (byte) 4);
                pyeVar5.j = obj;
                return pyeVar5;
            case 5:
                pye pyeVar6 = new pye(ryeVar, yjeVar, (byte) 5);
                pyeVar6.j = obj;
                return pyeVar6;
            case 6:
                pye pyeVar7 = new pye(ryeVar, yjeVar, (byte) 6);
                pyeVar7.j = obj;
                return pyeVar7;
            case 7:
                pye pyeVar8 = new pye(ryeVar, yjeVar, (byte) 7);
                pyeVar8.j = obj;
                return pyeVar8;
            default:
                pye pyeVar9 = new pye(ryeVar, yjeVar, (byte) 8);
                pyeVar9.j = obj;
                return pyeVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pye) create((fh5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pye) create((wm5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((pye) create((ma20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((pye) create((y05) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((pye) create((jw4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((pye) create((br00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((pye) create((ac50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((pye) create((jnb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pye) create((hwo0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        z = true;
        rye ryeVar = this.k;
        switch (b) {
            case 0:
                fh5 fh5Var = (fh5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(fh5Var, xg5.f40823a)) {
                    kwd kwdVar = rye.S1;
                    ryeVar.G0().b.u();
                } else if (Intrinsics.d(fh5Var, bh5.f2588a)) {
                    kwd kwdVar2 = rye.S1;
                    ryeVar.G0().b.w();
                }
                return Unit.f46060a;
            case 1:
                wm5 wm5Var = (wm5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (wm5Var instanceof nm5) {
                    kwd kwdVar3 = rye.S1;
                    MakeBetBalanceViewDs makeBetBalanceViewDs = ryeVar.G0().b;
                    makeBetBalanceViewDs.setVisibility(0);
                    makeBetBalanceViewDs.x();
                    nm5 nm5Var = (nm5) wm5Var;
                    makeBetBalanceViewDs.setModel(nm5Var.f23757a);
                    if (nm5Var.b) {
                        String strH = ryeVar.H(R.string.change_balance_account);
                        strH.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new mye(ryeVar, z ? (byte) 1 : (byte) 0));
                    } else {
                        String strH2 = ryeVar.H(R.string.refill_account);
                        strH2.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH2);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new mye(ryeVar, (byte) 2));
                    }
                } else if (Intrinsics.d(wm5Var, gm5.f11525a)) {
                    kwd kwdVar4 = rye.S1;
                    ryeVar.G0().b.setVisibility(8);
                    ryeVar.G0().b.x();
                } else {
                    if (!Intrinsics.d(wm5Var, km5.f18522a)) {
                        t9f.b();
                        return null;
                    }
                    kwd kwdVar5 = rye.S1;
                    ryeVar.G0().b.setVisibility(0);
                    ryeVar.G0().b.v();
                }
                return Unit.f46060a;
            case 2:
                ma20 ma20Var = (ma20) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ia20 ia20Var = ia20.f14416a;
                if (!Intrinsics.d(ma20Var, ia20Var) && !(ma20Var instanceof la20)) {
                    if (!(ma20Var instanceof ka20)) {
                        t9f.b();
                        return null;
                    }
                    ka20 ka20Var = (ka20) ma20Var;
                    kwd kwdVar6 = rye.S1;
                    lgn0 lgn0Var = ryeVar.M1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH3 = ryeVar.H(R.string.success_auto_bet);
                    strH3.getClass();
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH3, null, null, null);
                    String strH4 = ryeVar.H(lgb.V(ka20Var.g));
                    String str = ka20Var.i;
                    String strH5 = ryeVar.H(R.string.autobet_sum);
                    strH5.getClass();
                    lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH4, str, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(ka20Var.c), "AUTO", kotlin.collections.a.c(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, ryeVar.o0()), strH5, ka20Var.f17943a, ka20Var.f, true))), acb.P(ryeVar));
                }
                kwd kwdVar7 = rye.S1;
                p7m0 p7m0Var = ryeVar.H0().n0;
                p7m0Var.getClass();
                p7m0Var.o(null, ia20Var);
                return Unit.f46060a;
            case 3:
                y05 y05Var = (y05) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                kwd kwdVar8 = rye.S1;
                BetInputView betInputView = ryeVar.G0().e;
                boolean z2 = y05Var.h;
                AutoMaxUiModel autoMaxUiModel = y05Var.k;
                boolean z3 = y05Var.p;
                if (!z2) {
                    String str2 = y05Var.f41789a;
                    int i = BetInputView.v;
                    betInputView.w(null, str2);
                }
                betInputView.setEditFieldEnabled(!z3);
                betInputView.setPlusButtonEnabled(y05Var.c);
                betInputView.setMinusButtonEnabled(y05Var.d);
                if (!y05Var.l && !y05Var.o) {
                    z = false;
                }
                betInputView.x(y05Var.b.c(ryeVar.o0()).toString(), z);
                betInputView.setPlaceholder(y05Var.n);
                betInputView.setMaxValue(wvb.L("9999999999999.999"));
                BetInputView betInputView2 = ryeVar.G0().d;
                betInputView2.y(z3);
                if (!z3) {
                    SpannableString spannableStringC = y05Var.g.c(ryeVar.o0());
                    betInputView2.x(spannableStringC.toString(), y05Var.m);
                    betInputView2.setBetLimitsText(spannableStringC);
                    betInputView2.setMakeBetButtonEnabled(y05Var.e);
                    if (!y05Var.i) {
                        betInputView2.w(null, y05Var.f);
                    }
                    if (autoMaxUiModel.f46472a) {
                        betInputView2.setMaxValue(new BigDecimal(String.valueOf(autoMaxUiModel.b)));
                    } else {
                        BigDecimal bigDecimal = BigDecimal.ZERO;
                        bigDecimal.getClass();
                        betInputView2.t = bigDecimal;
                    }
                }
                return Unit.f46060a;
            case 4:
                jw4 jw4Var = (jw4) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (jw4Var != null) {
                    boolean z4 = jw4Var instanceof gw4;
                    rye ryeVar2 = this.k;
                    if (z4) {
                        wdk0 wdk0Var = ryeVar2.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, ((gw4) jw4Var).f12007a, ryeVar2, null, null, false, null, 1020);
                    } else if (jw4Var instanceof cw4) {
                        ii iiVar = ryeVar2.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = ryeVar2.H(R.string.error);
                        String str3 = ((cw4) jw4Var).f5063a;
                        String strH7 = ryeVar2.H(R.string.ok_new);
                        strH7.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH6, (CharSequence) str3, (CharSequence) strH7, ryeVar2.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = ryeVar2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (jw4Var instanceof dw4) {
                        ii iiVar2 = ryeVar2.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH8 = ryeVar2.H(R.string.error);
                        String str4 = ((dw4) jw4Var).f6778a;
                        String strH9 = ryeVar2.H(R.string.replenish);
                        strH9.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH8, (CharSequence) str4, (CharSequence) strH9, ryeVar2.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = ryeVar2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 5:
                br00 br00Var = (br00) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(br00Var, ar00.f1321a)) {
                    j120.Y(ryeVar);
                    gnm0.s(ryeVar.C());
                } else {
                    if (!Intrinsics.d(br00Var, zq00.f44786a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.i(ryeVar.C());
                }
                return Unit.f46060a;
            case 6:
                ac50 ac50Var = (ac50) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ub50 ub50Var = ub50.f35363a;
                if (!Intrinsics.d(ac50Var, ub50Var) && !Intrinsics.d(ac50Var, yb50.f42325a)) {
                    if (!Intrinsics.d(ac50Var, xb50.f40585a)) {
                        t9f.b();
                        return null;
                    }
                    ynb ynbVar = ryeVar.O1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.i;
                    androidx.fragment.app.e eVarC3 = ryeVar.C();
                    eVarC3.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC3, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                }
                kwd kwdVar9 = rye.S1;
                p7m0 p7m0Var2 = ryeVar.H0().V;
                p7m0Var2.getClass();
                p7m0Var2.o(null, ub50Var);
                return Unit.f46060a;
            case 7:
                jnb0 jnb0Var = (jnb0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (jnb0Var != null) {
                    if (jnb0Var instanceof hnb0) {
                        kwd kwdVar10 = rye.S1;
                        ryeVar.G0().c.setVisibility(8);
                    } else if (jnb0Var instanceof inb0) {
                        kwd kwdVar11 = rye.S1;
                        ryeVar.G0().c.setVisibility(0);
                        ryeVar.G0().c.setText(((inb0) jnb0Var).f15066a.b(ryeVar.o0()));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                hwo0 hwo0Var = (hwo0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (hwo0Var instanceof ewo0) {
                    kwd kwdVar12 = rye.S1;
                    ewo0 ewo0Var = (ewo0) hwo0Var;
                    ryeVar.G0().f.setHeaderValue(ewo0Var.f8537a.c(ryeVar.o0()));
                    TaxExpandableSpoiler taxExpandableSpoiler = ryeVar.G0().f;
                    Context contextO0 = ryeVar.o0();
                    ArrayList<mvo0> arrayList = ewo0Var.b;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (mvo0 mvo0Var : arrayList) {
                        nvo0 nvo0Var = new nvo0(contextO0);
                        nvo0Var.setModel(mvo0Var);
                        arrayList2.add(nvo0Var);
                    }
                    taxExpandableSpoiler.setContent(arrayList2);
                    ryeVar.G0().f.e();
                    ryeVar.G0().f.setVisibility(0);
                } else if (hwo0Var instanceof awo0) {
                    kwd kwdVar13 = rye.S1;
                    ryeVar.G0().f.e();
                    ryeVar.G0().f.setVisibility(8);
                } else if (hwo0Var instanceof xvo0) {
                    kwd kwdVar14 = rye.S1;
                    ryeVar.G0().f.e();
                    ryeVar.G0().f.f();
                    ryeVar.G0().f.setVisibility(0);
                } else {
                    if (!Intrinsics.d(hwo0Var, cwo0.f5091a)) {
                        t9f.b();
                        return null;
                    }
                    kwd kwdVar15 = rye.S1;
                    ryeVar.G0().f.g();
                    ryeVar.G0().f.setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}
