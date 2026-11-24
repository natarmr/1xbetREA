package a;

import android.content.Context;
import android.text.SpannableString;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class ot6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ st6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot6(st6 st6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = st6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        st6 st6Var = this.k;
        switch (b) {
            case 0:
                ot6 ot6Var = new ot6(st6Var, yjeVar, (byte) 0);
                ot6Var.j = obj;
                return ot6Var;
            case 1:
                ot6 ot6Var2 = new ot6(st6Var, yjeVar, (byte) 1);
                ot6Var2.j = obj;
                return ot6Var2;
            case 2:
                ot6 ot6Var3 = new ot6(st6Var, yjeVar, (byte) 2);
                ot6Var3.j = obj;
                return ot6Var3;
            case 3:
                ot6 ot6Var4 = new ot6(st6Var, yjeVar, (byte) 3);
                ot6Var4.j = obj;
                return ot6Var4;
            case 4:
                ot6 ot6Var5 = new ot6(st6Var, yjeVar, (byte) 4);
                ot6Var5.j = obj;
                return ot6Var5;
            case 5:
                ot6 ot6Var6 = new ot6(st6Var, yjeVar, (byte) 5);
                ot6Var6.j = obj;
                return ot6Var6;
            default:
                ot6 ot6Var7 = new ot6(st6Var, yjeVar, (byte) 6);
                ot6Var7.j = obj;
                return ot6Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ot6) create((kd20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ot6) create((od20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ot6) create((f1o) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ot6) create((ce20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ot6) create((apm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ot6) create((he20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ot6) create((ke20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 1;
        st6 st6Var = this.k;
        switch (b) {
            case 0:
                kd20 kd20Var = (kd20) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(kd20Var, id20.f14562a)) {
                    yk5 yk5Var = st6.R1;
                    st6Var.G0().b.u();
                } else {
                    if (!Intrinsics.d(kd20Var, jd20.f16309a)) {
                        t9f.b();
                        return null;
                    }
                    yk5 yk5Var2 = st6.R1;
                    st6Var.G0().b.w();
                }
                return Unit.f46060a;
            case 1:
                od20 od20Var = (od20) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (od20Var instanceof nd20) {
                    yk5 yk5Var3 = st6.R1;
                    MakeBetBalanceViewDs makeBetBalanceViewDs = st6Var.G0().b;
                    makeBetBalanceViewDs.setVisibility(0);
                    makeBetBalanceViewDs.x();
                    nd20 nd20Var = (nd20) od20Var;
                    makeBetBalanceViewDs.setModel(nd20Var.b);
                    if (nd20Var.d) {
                        String strH = st6Var.H(R.string.change_balance_account);
                        strH.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new mt6(st6Var, b2));
                    } else {
                        String strH2 = st6Var.H(R.string.refill_account);
                        strH2.getClass();
                        makeBetBalanceViewDs.setChangeBalanceBtnText(strH2);
                        makeBetBalanceViewDs.setChangeBalanceClickListener(new mt6(st6Var, (byte) 2));
                    }
                } else if (Intrinsics.d(od20Var, ld20.f19829a)) {
                    yk5 yk5Var4 = st6.R1;
                    st6Var.G0().b.setVisibility(8);
                    st6Var.G0().b.x();
                } else {
                    if (!Intrinsics.d(od20Var, md20.f21577a)) {
                        t9f.b();
                        return null;
                    }
                    yk5 yk5Var5 = st6.R1;
                    st6Var.G0().b.setVisibility(0);
                    st6Var.G0().b.v();
                }
                return Unit.f46060a;
            case 2:
                f1o f1oVar = (f1o) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (f1oVar != null) {
                    boolean z = f1oVar instanceof e1o;
                    st6 st6Var2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = st6Var2.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, ((e1o) f1oVar).f7044a, st6Var2, null, st6Var2.G0().d, false, null, 1012);
                    } else if (f1oVar instanceof d1o) {
                        ii iiVar = st6Var2.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = st6Var2.H(R.string.error);
                        String str = ((d1o) f1oVar).f5318a;
                        String strH4 = st6Var2.H(R.string.replenish);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) str, (CharSequence) strH4, st6Var2.H(R.string.cancel), (String) null, "request_insufficient_founds_dialog_key", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = st6Var2.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (f1oVar instanceof c1o) {
                        ii iiVar2 = st6Var2.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH5 = st6Var2.H(R.string.error);
                        String str2 = ((c1o) f1oVar).f3582a;
                        String strH6 = st6Var2.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) str2, (CharSequence) strH6, st6Var2.H(R.string.cancel), (String) null, "request_bet_exists_dialog_key", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = st6Var2.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    }
                    yk5 yk5Var6 = st6.R1;
                    p7m0 p7m0Var = st6Var2.H0().K;
                    p7m0Var.getClass();
                    p7m0Var.o(null, rd20.f30271a);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                ce20 ce20Var = (ce20) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (ce20Var != null) {
                    if (ce20Var instanceof ae20) {
                        yk5 yk5Var7 = st6.R1;
                        st6Var.G0().f.setVisibility(8);
                    } else if (ce20Var instanceof be20) {
                        yk5 yk5Var8 = st6.R1;
                        st6Var.G0().f.setVisibility(0);
                        st6Var.G0().f.setText(((be20) ce20Var).f2428a.b(st6Var.o0()));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                apm0 apm0Var = (apm0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                yk5 yk5Var9 = st6.R1;
                BetInputView betInputView = st6Var.G0().c;
                boolean z2 = apm0Var.c;
                pz4 pz4Var = apm0Var.g;
                betInputView.setVisibilityStepButtons(z2);
                BetInputView betInputView2 = st6Var.G0().c;
                boolean z3 = apm0Var.i;
                betInputView2.y(z3);
                st6Var.G0().c.w(null, apm0Var.f1260a);
                if (z3) {
                    st6Var.G0().c.x("", false);
                } else {
                    SpannableString spannableStringC = apm0Var.b.c(st6Var.o0());
                    st6Var.G0().c.x(spannableStringC.toString(), apm0Var.h);
                    st6Var.G0().c.setBetLimitsText(spannableStringC);
                    st6Var.G0().c.setPlusButtonEnabled(apm0Var.d);
                    st6Var.G0().c.setMinusButtonEnabled(apm0Var.e);
                    st6Var.G0().c.setMakeBetButtonEnabled(apm0Var.f);
                    if (pz4Var.f27827a) {
                        st6Var.G0().c.setMaxValue(new BigDecimal(String.valueOf(pz4Var.b)));
                    }
                }
                return Unit.f46060a;
            case 5:
                he20 he20Var = (he20) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (he20Var instanceof ge20) {
                    yk5 yk5Var10 = st6.R1;
                    ge20 ge20Var = (ge20) he20Var;
                    st6Var.G0().e.setHeaderValue(ge20Var.f11130a.b(st6Var.o0()));
                    TaxExpandableSpoiler taxExpandableSpoiler = st6Var.G0().e;
                    Context contextO0 = st6Var.o0();
                    ArrayList<mvo0> arrayList = ge20Var.d;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (mvo0 mvo0Var : arrayList) {
                        nvo0 nvo0Var = new nvo0(contextO0);
                        nvo0Var.setModel(mvo0Var);
                        arrayList2.add(nvo0Var);
                    }
                    taxExpandableSpoiler.setContent(arrayList2);
                    st6Var.G0().e.e();
                    st6Var.G0().e.setVisibility(0);
                } else if (he20Var instanceof de20) {
                    yk5 yk5Var11 = st6.R1;
                    st6Var.G0().e.e();
                    st6Var.G0().e.f();
                    st6Var.G0().e.setVisibility(0);
                } else if (Intrinsics.d(he20Var, fe20.f9384a)) {
                    yk5 yk5Var12 = st6.R1;
                    st6Var.G0().e.g();
                    st6Var.G0().e.setVisibility(0);
                } else {
                    if (!Intrinsics.d(he20Var, ee20.f7648a)) {
                        t9f.b();
                        return null;
                    }
                    yk5 yk5Var13 = st6.R1;
                    st6Var.G0().e.e();
                    st6Var.G0().e.setVisibility(8);
                }
                return Unit.f46060a;
            default:
                ke20 ke20Var = (ke20) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(ke20Var, ie20.f14612a)) {
                    gnm0.i(st6Var.C());
                    st6Var.G0().c.setMakeBetButtonEnabled(true);
                } else {
                    if (!Intrinsics.d(ke20Var, je20.f16354a)) {
                        t9f.b();
                        return null;
                    }
                    gnm0.s(st6Var.C());
                    st6Var.G0().c.setMakeBetButtonEnabled(false);
                }
                return Unit.f46060a;
        }
    }
}
