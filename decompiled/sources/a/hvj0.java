package a;

import android.content.Context;
import android.text.SpannableString;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class hvj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jvj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hvj0(jvj0 jvj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jvj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jvj0 jvj0Var = this.k;
        switch (b) {
            case 0:
                hvj0 hvj0Var = new hvj0(jvj0Var, yjeVar, (byte) 0);
                hvj0Var.j = obj;
                return hvj0Var;
            case 1:
                hvj0 hvj0Var2 = new hvj0(jvj0Var, yjeVar, (byte) 1);
                hvj0Var2.j = obj;
                return hvj0Var2;
            case 2:
                hvj0 hvj0Var3 = new hvj0(jvj0Var, yjeVar, (byte) 2);
                hvj0Var3.j = obj;
                return hvj0Var3;
            case 3:
                hvj0 hvj0Var4 = new hvj0(jvj0Var, yjeVar, (byte) 3);
                hvj0Var4.j = obj;
                return hvj0Var4;
            case 4:
                hvj0 hvj0Var5 = new hvj0(jvj0Var, yjeVar, (byte) 4);
                hvj0Var5.j = obj;
                return hvj0Var5;
            case 5:
                hvj0 hvj0Var6 = new hvj0(jvj0Var, yjeVar, (byte) 5);
                hvj0Var6.j = obj;
                return hvj0Var6;
            case 6:
                hvj0 hvj0Var7 = new hvj0(jvj0Var, yjeVar, (byte) 6);
                hvj0Var7.j = obj;
                return hvj0Var7;
            case 7:
                hvj0 hvj0Var8 = new hvj0(jvj0Var, yjeVar, (byte) 7);
                hvj0Var8.j = obj;
                return hvj0Var8;
            case 8:
                hvj0 hvj0Var9 = new hvj0(jvj0Var, yjeVar, (byte) 8);
                hvj0Var9.j = obj;
                return hvj0Var9;
            case 9:
                hvj0 hvj0Var10 = new hvj0(jvj0Var, yjeVar, (byte) 9);
                hvj0Var10.j = obj;
                return hvj0Var10;
            default:
                hvj0 hvj0Var11 = new hvj0(jvj0Var, yjeVar, (byte) 10);
                hvj0Var11.j = obj;
                return hvj0Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hvj0) create((i40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hvj0) create((q40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hvj0) create((dh5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hvj0) create((qm5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((hvj0) create((wuj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((hvj0) create((exo) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((hvj0) create((wq00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((hvj0) create((ovj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((hvj0) create((qnb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((hvj0) create((bzj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hvj0) create((gwo0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jvj0 jvj0Var = this.k;
        switch (b) {
            case 0:
                i40 i40Var = (i40) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                zie0 zie0Var = jvj0.W1;
                jvj0Var.H0().k.setText(i40Var.f14122a.c(jvj0Var.o0()));
                return Unit.f46060a;
            case 1:
                q40 q40Var = (q40) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(q40Var, m40.f21142a)) {
                    zie0 zie0Var2 = jvj0.W1;
                    jvj0Var.H0().h.setVisibility(0);
                    jvj0Var.H0().g.setEnabled(true);
                } else if (Intrinsics.d(q40Var, k40.f17643a)) {
                    zie0 zie0Var3 = jvj0.W1;
                    jvj0Var.H0().h.setVisibility(0);
                    jvj0Var.H0().g.setEnabled(false);
                } else {
                    if (!Intrinsics.d(q40Var, o40.f24608a)) {
                        t9f.b();
                        return null;
                    }
                    zie0 zie0Var4 = jvj0.W1;
                    jvj0Var.H0().h.setVisibility(8);
                }
                return Unit.f46060a;
            case 2:
                dh5 dh5Var = (dh5) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(dh5Var, vg5.f37365a)) {
                    zie0 zie0Var5 = jvj0.W1;
                    jvj0Var.H0().b.u();
                } else if (Intrinsics.d(dh5Var, zg5.f44327a)) {
                    zie0 zie0Var6 = jvj0.W1;
                    jvj0Var.H0().b.w();
                }
                return Unit.f46060a;
            case 3:
                qm5 qm5Var = (qm5) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (qm5Var instanceof mm5) {
                    zie0 zie0Var7 = jvj0.W1;
                    MakeBetBalanceViewDs makeBetBalanceViewDs = jvj0Var.H0().b;
                    makeBetBalanceViewDs.setVisibility(0);
                    makeBetBalanceViewDs.x();
                    mm5 mm5Var = (mm5) qm5Var;
                    makeBetBalanceViewDs.setModel(mm5Var.f22020a);
                    if (mm5Var.b) {
                        String strH = jvj0Var.H(R.string.change_balance_account);
                        strH.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new dvj0(jvj0Var, makeBetBalanceViewDs));
                    } else {
                        String strH2 = jvj0Var.H(R.string.refill_account);
                        strH2.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH2);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new dvj0(jvj0Var, (byte) 2));
                    }
                } else if (Intrinsics.d(qm5Var, fm5.f9768a)) {
                    zie0 zie0Var8 = jvj0.W1;
                    jvj0Var.H0().b.setVisibility(8);
                    jvj0Var.H0().b.x();
                } else {
                    if (!Intrinsics.d(qm5Var, jm5.f16748a)) {
                        t9f.b();
                        return null;
                    }
                    zie0 zie0Var9 = jvj0.W1;
                    jvj0Var.H0().b.setVisibility(0);
                    jvj0Var.H0().b.v();
                }
                return Unit.f46060a;
            case 4:
                wuj0 wuj0Var = (wuj0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (wuj0Var != null) {
                    boolean z = wuj0Var instanceof tuj0;
                    jvj0 jvj0Var2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = jvj0Var2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, ((tuj0) wuj0Var).f34554a, jvj0Var2, null, jvj0.G0(jvj0Var2).Q0().r, false, null, 1012);
                    } else if (wuj0Var instanceof suj0) {
                        String str = ((suj0) wuj0Var).f32824a;
                        String strH3 = jvj0Var2.H(R.string.ok_new);
                        strH3.getClass();
                        jvj0Var2.L0(str, "REQUEST_BET_EXISTS_DIALOG_KEY", strH3);
                    } else if (wuj0Var instanceof vuj0) {
                        String str2 = ((vuj0) wuj0Var).f38051a;
                        String strH4 = jvj0Var2.H(R.string.top_up);
                        strH4.getClass();
                        jvj0Var2.L0(str2, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", strH4);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 5:
                exo exoVar = (exo) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (exoVar.g) {
                    zie0 zie0Var10 = jvj0.W1;
                    bd20 bd20VarH0 = jvj0Var.H0();
                    bd20VarH0.i.setVisibility(0);
                    bd20VarH0.d.setEnabled(false);
                    bd20VarH0.e.setEnabled(false);
                    bd20VarH0.f.setEnabled(false);
                    bd20VarH0.l.setVisibility(8);
                    jvj0Var.K0(exoVar);
                } else if (exoVar.e) {
                    zie0 zie0Var11 = jvj0.W1;
                    jvj0Var.K0(exoVar);
                } else if (exoVar.f) {
                    zie0 zie0Var12 = jvj0.W1;
                    jvj0Var.H0().i.setVisibility(8);
                    jvj0Var.H0().l.setVisibility(0);
                } else if (exoVar.h) {
                    zie0 zie0Var13 = jvj0.W1;
                    jvj0Var.H0().i.setVisibility(8);
                    jvj0Var.H0().l.setVisibility(8);
                } else {
                    zie0 zie0Var14 = jvj0.W1;
                    jvj0Var.H0().i.setVisibility(8);
                    jvj0Var.H0().l.setVisibility(8);
                }
                return Unit.f46060a;
            case 6:
                wq00 wq00Var = (wq00) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(wq00Var, vq00.f37833a)) {
                    gnm0.s(jvj0Var.C());
                } else {
                    if (!Intrinsics.d(wq00Var, uq00.f36094a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.i(jvj0Var.C());
                }
                return Unit.f46060a;
            case 7:
                ovj0 ovj0Var = (ovj0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(ovj0Var, mvj0.f22459a)) {
                    ynb ynbVar = jvj0Var.O1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.b;
                    androidx.fragment.app.e eVarC = jvj0Var.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                } else {
                    if (!Intrinsics.d(ovj0Var, nvj0.f24190a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar = jvj0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = jvj0Var.H(R.string.confirmation);
                    String strH6 = jvj0Var.H(R.string.advancedbet_contract_agree_new);
                    String strH7 = jvj0Var.H(R.string.yes);
                    strH7.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, jvj0Var.H(R.string.no), (String) null, "REQUEST_ADVANCE_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = jvj0Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                }
                return Unit.f46060a;
            case 8:
                qnb0 qnb0Var = (qnb0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(qnb0Var, onb0.f25539a)) {
                    zie0 zie0Var15 = jvj0.W1;
                    jvj0Var.H0().m.setVisibility(8);
                } else {
                    if (!(qnb0Var instanceof pnb0)) {
                        t9f.b();
                        return null;
                    }
                    zie0 zie0Var16 = jvj0.W1;
                    jvj0Var.H0().m.setVisibility(0);
                    jvj0Var.H0().m.setText(((pnb0) qnb0Var).f27279a.c(jvj0Var.o0()));
                }
                return Unit.f46060a;
            case 9:
                bzj0 bzj0Var = (bzj0) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                zie0 zie0Var17 = jvj0.W1;
                BetInputView betInputView = jvj0Var.H0().c;
                boolean z2 = bzj0Var.l;
                AutoMaxUiModel autoMaxUiModel = bzj0Var.j;
                betInputView.y(z2);
                if (!bzj0Var.b) {
                    betInputView.w(null, bzj0Var.f3471a);
                }
                betInputView.setVisibilityStepButtons(bzj0Var.d);
                betInputView.setEachWayBadge(bzj0Var.m);
                if (!bzj0Var.l) {
                    SpannableString spannableStringC = bzj0Var.c.c(jvj0Var.o0());
                    betInputView.setBetLimitsText(spannableStringC);
                    betInputView.z(bzj0Var.i);
                    betInputView.setMakeBetButtonEnabled(bzj0Var.g);
                    betInputView.setPlusButtonEnabled(bzj0Var.e);
                    betInputView.setMinusButtonEnabled(bzj0Var.f);
                    betInputView.setEditFieldEnabled(bzj0Var.h);
                    betInputView.x(spannableStringC.toString(), bzj0Var.k);
                    if (autoMaxUiModel.f46769a) {
                        betInputView.setMaxValue(new BigDecimal(String.valueOf(autoMaxUiModel.b)));
                    } else {
                        BigDecimal bigDecimal = BigDecimal.ZERO;
                        bigDecimal.getClass();
                        betInputView.t = bigDecimal;
                    }
                }
                return Unit.f46060a;
            default:
                gwo0 gwo0Var = (gwo0) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (gwo0Var instanceof dwo0) {
                    zie0 zie0Var18 = jvj0.W1;
                    dwo0 dwo0Var = (dwo0) gwo0Var;
                    jvj0Var.H0().j.setHeaderValue(dwo0Var.f6810a.c(jvj0Var.o0()));
                    TaxExpandableSpoiler taxExpandableSpoiler = jvj0Var.H0().j;
                    Context contextO0 = jvj0Var.o0();
                    ArrayList<mvo0> arrayList = dwo0Var.b;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (mvo0 mvo0Var : arrayList) {
                        nvo0 nvo0Var = new nvo0(contextO0);
                        nvo0Var.setModel(mvo0Var);
                        arrayList2.add(nvo0Var);
                    }
                    taxExpandableSpoiler.setContent(arrayList2);
                    jvj0Var.H0().j.e();
                    jvj0Var.H0().j.setVisibility(0);
                } else if (gwo0Var instanceof zvo0) {
                    zie0 zie0Var19 = jvj0.W1;
                    jvj0Var.H0().j.e();
                    jvj0Var.H0().j.setVisibility(8);
                } else if (Intrinsics.d(gwo0Var, wvo0.f39847a)) {
                    zie0 zie0Var20 = jvj0.W1;
                    jvj0Var.H0().j.e();
                    jvj0Var.H0().j.f();
                    jvj0Var.H0().j.setVisibility(0);
                } else {
                    if (!Intrinsics.d(gwo0Var, bwo0.f3335a)) {
                        t9f.b();
                        return null;
                    }
                    zie0 zie0Var21 = jvj0.W1;
                    jvj0Var.H0().j.g();
                    jvj0Var.H0().j.setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}
