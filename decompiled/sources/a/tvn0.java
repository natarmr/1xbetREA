package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.SwipexCardsRecyclerView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class tvn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vvn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tvn0(vvn0 vvn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vvn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vvn0 vvn0Var = this.k;
        switch (b) {
            case 0:
                tvn0 tvn0Var = new tvn0(vvn0Var, yjeVar, (byte) 0);
                tvn0Var.j = obj;
                return tvn0Var;
            default:
                tvn0 tvn0Var2 = new tvn0(vvn0Var, yjeVar, (byte) 1);
                tvn0Var2.j = obj;
                return tvn0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tvn0) create((uxn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tvn0) create((wxn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0510  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                rek0 rek0Var = rek0.b;
                uxn0 uxn0Var = (uxn0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(uxn0Var, exn0.f8587a);
                vvn0 vvn0Var = this.k;
                if (zD) {
                    j6m0 j6m0Var = vvn0.W1;
                    ((ssn0) vvn0Var.U1.getValue()).A(iun.f15405a);
                } else if (uxn0Var instanceof fxn0) {
                    s2m0 s2m0Var = bun0.g2;
                    androidx.fragment.app.e eVarC = vvn0Var.C();
                    eVarC.getClass();
                    s2m0Var.getClass();
                    if (eVarC.J("SwipexChangeBetSumDialogBottomSheetFragment") == null) {
                        new bun0().H0(eVarC, "SwipexChangeBetSumDialogBottomSheetFragment");
                    }
                } else if (Intrinsics.d(uxn0Var, hxn0.f13818a)) {
                    j6m0 j6m0Var2 = vvn0.W1;
                    SwipexCardsRecyclerView swipexCardsRecyclerView = vvn0Var.J0().d;
                    androidx.recyclerview.widget.b layoutManager = swipexCardsRecyclerView.getLayoutManager();
                    CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                    if (cardStackLayoutManager != null) {
                        zj zjVar = zj.f44462a;
                        pek pekVar = ven.b;
                        cardStackLayoutManager.s = new ron0(new DecelerateInterpolator(), 4);
                        swipexCardsRecyclerView.B0(cardStackLayoutManager.r.f - 1);
                    }
                } else if (uxn0Var instanceof ixn0) {
                    wdk0 wdk0Var = vvn0Var.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0Var, ((ixn0) uxn0Var).f15550a, null, null, null, null, 124), vvn0Var, null, null, false, null, 1020);
                } else if (uxn0Var instanceof jxn0) {
                    wdk0 wdk0Var2 = vvn0Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    jxn0 jxn0Var = (jxn0) uxn0Var;
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, jxn0Var.f17316a, null, null, null, new Integer(jxn0Var.b), 92), vvn0Var, null, null, false, null, 1020);
                } else if (Intrinsics.d(uxn0Var, kxn0.f19064a)) {
                    ii iiVar = vvn0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = vvn0Var.H(R.string.suggest_to_change_filters);
                    String strH2 = vvn0Var.H(R.string.swipe_x_change_filter_text);
                    String strH3 = vvn0Var.H(R.string.go_to_filter_screen);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, vvn0Var.H(R.string.cancel), (String) null, "CHANGE_FILTERS_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = vvn0Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                } else if (Intrinsics.d(uxn0Var, mxn0.f22565a)) {
                    j6m0 j6m0Var3 = vvn0.W1;
                    ii iiVar2 = vvn0Var.N1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = vvn0Var.H(R.string.error);
                    String strH5 = vvn0Var.H(R.string.not_enough_money_for_bet);
                    String strH6 = vvn0Var.H(R.string.replenish);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, vvn0Var.H(R.string.cancel), (String) null, "REQUEST_TOP_UP", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC3 = vvn0Var.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                } else if (uxn0Var instanceof nxn0) {
                    nxn0 nxn0Var = (nxn0) uxn0Var;
                    ra10 ra10Var = nxn0Var.f24291a;
                    if (nxn0Var.b) {
                        j6m0 j6m0Var4 = vvn0.W1;
                        vvn0Var.J0().k.x(ra10Var, new qvn0(vvn0Var, (byte) 7));
                    } else {
                        j6m0 j6m0Var5 = vvn0.W1;
                        vvn0Var.J0().k.v(ra10Var);
                    }
                } else if (Intrinsics.d(uxn0Var, oxn0.f26021a)) {
                    g9m0 g9m0Var = npn0.j2;
                    androidx.fragment.app.e eVarC4 = vvn0Var.C();
                    eVarC4.getClass();
                    g9m0Var.getClass();
                    if (eVarC4.J("SwipeXOnboardingBottomS") == null) {
                        sj3.E0(new npn0(), eVarC4, "SwipeXOnboardingBottomS");
                    }
                    vvn0Var.J0().l.setVisibility(0);
                    vvn0Var.J0().d.setVisibility(8);
                } else if (uxn0Var instanceof qxn0) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        j6m0 j6m0Var6 = vvn0.W1;
                        ckb.Z(vvn0Var.J0().f39846a, 16);
                    }
                    wdk0 wdk0Var3 = vvn0Var.O1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qxn0 qxn0Var = (qxn0) uxn0Var;
                    wdk0.k(wdk0Var3, new xdk0(qek0.f28589a, vvn0Var.H(R.string.bet_processed_successfully) + Separators.RETURN + vvn0Var.I(R.string.killer_clubs_coefficient_v2, qxn0Var.f29493a) + Separators.RETURN + vvn0Var.H(R.string.history_bet_rate) + Separators.SP + qxn0Var.b, null, null, null, null, 124), vvn0Var, null, null, false, null, 1020);
                } else if (Intrinsics.d(uxn0Var, sxn0.f32985a)) {
                    gnm0.s(vvn0Var.F());
                } else if (Intrinsics.d(uxn0Var, txn0.f34710a)) {
                    List listP = vvn0Var.F().c.p();
                    if (listP != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listP) {
                            if (Intrinsics.d(((Fragment) obj2).B, "mvu0")) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            Fragment fragment = (Fragment) it.next();
                            mvu0 mvu0Var = fragment instanceof mvu0 ? (mvu0) fragment : null;
                            if (mvu0Var != null) {
                                mvu0Var.y0();
                            }
                            j6m0 j6m0Var7 = vvn0.W1;
                            vvn0Var.K0().x(new nrn0(true));
                        } else {
                            j6m0 j6m0Var8 = vvn0.W1;
                            vvn0Var.K0().x(new nrn0(false));
                        }
                    } else {
                        j6m0 j6m0Var9 = vvn0.W1;
                        vvn0Var.K0().x(new nrn0(false));
                    }
                } else if (Intrinsics.d(uxn0Var, pxn0.f27760a)) {
                    j6m0 j6m0Var10 = vvn0.W1;
                    vvn0Var.L0(true);
                } else if (Intrinsics.d(uxn0Var, lxn0.f20824a)) {
                    j6m0 j6m0Var11 = vvn0.W1;
                    vvn0Var.L0(false);
                } else if (Intrinsics.d(uxn0Var, rxn0.f31273a)) {
                    j6m0 j6m0Var12 = vvn0.W1;
                    m6m0 m6m0Var = don0.n2;
                    androidx.fragment.app.e eVarC5 = vvn0Var.C();
                    eVarC5.getClass();
                    SwipeActionConfirmationParams swipeActionConfirmationParams = new SwipeActionConfirmationParams("REQUEST_CONFIRM_BET", "SWIPE_ACTION_CONFIRMED_RESULT_KEY");
                    m6m0Var.getClass();
                    if (eVarC5.J("SwipeActionConfirmationBottomSheet") == null) {
                        don0 don0Var = new don0();
                        don0Var.k2.J(don0Var, don0.o2[0], swipeActionConfirmationParams);
                        don0Var.H0(eVarC5, "SwipeActionConfirmationBottomSheet");
                    }
                } else {
                    if (!Intrinsics.d(uxn0Var, gxn0.f12085a)) {
                        t9f.b();
                        return null;
                    }
                    j6m0 j6m0Var13 = vvn0.W1;
                    vvn0Var.J0().d.H0();
                }
                j6m0 j6m0Var14 = vvn0.W1;
                vvn0Var.K0().x(orn0.f25742a);
                return Unit.f46060a;
            default:
                wxn0 wxn0Var = (wxn0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                vvn0 vvn0Var2 = this.k;
                a8z a8zVar = vvn0Var2.U1;
                j6m0 j6m0Var15 = vvn0.W1;
                a4x a4xVar = wxn0Var.f39940a;
                boolean z = wxn0Var.h;
                boolean z2 = wxn0Var.c;
                if (!vvn0Var2.H0().r.f41165a.a() || z2) {
                    if ((a4xVar.size() + vvn0Var2.H0().r.f) - vvn0Var2.H0().S() == 1) {
                        List list = ((ssn0) a8zVar.getValue()).e.f;
                        list.getClass();
                        if (list.isEmpty()) {
                            ((ssn0) a8zVar.getValue()).B(a4xVar, new apj0(vvn0Var2.H0(), (byte) 9));
                        }
                    } else {
                        ((ssn0) a8zVar.getValue()).B(a4xVar, new apj0(vvn0Var2.H0(), (byte) 9));
                    }
                }
                vvn0Var2.J0().d.setVisibility(!z ? 0 : 8);
                if (vvn0Var2.J0().f.getVisibility() != 0) {
                    vvn0Var2.J0().f.setVisibility(0);
                    ConstraintLayout constraintLayout = vvn0Var2.J0().f;
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                        constraintLayout.addOnLayoutChangeListener(new w23(vvn0Var2, (byte) 17));
                    } else {
                        vvn0Var2.G0();
                    }
                }
                ksn0 ksn0Var = wxn0Var.m;
                vvn0Var2.J0().i.setImageDrawable(vvn0Var2.o0().getDrawable(R.drawable.ic_glyph));
                vvn0Var2.J0().c.setText(ksn0Var.f18823a + Separators.SP + ksn0Var.c);
                a4x a4xVar2 = wxn0Var.b;
                boolean z3 = wxn0Var.e;
                vvn0Var2.J0().h.setChips(a4xVar2);
                vvn0Var2.J0().m.setVisibility((!a4xVar2.isEmpty() || z3) ? 0 : 8);
                vvn0Var2.J0().h.setLoading(z3);
                if (wxn0Var.d) {
                    vvn0Var2.J0().g.setVisibility(0);
                    vvn0Var2.J0().d.setVisibility(8);
                    vvn0Var2.J0().j.setEnabled(false);
                    vvn0Var2.J0().e.setEnabled(false);
                    vvn0Var2.J0().b.setEnabled(false);
                    vvn0Var2.J0().h.setEnabled(false);
                    vvn0Var2.J0().n.setEnabled(false);
                    vvn0Var2.J0().k.setVisibility(8);
                } else {
                    vvn0Var2.J0().j.setEnabled(true);
                    vvn0Var2.J0().e.setEnabled(true);
                    vvn0Var2.J0().b.setEnabled(true);
                    vvn0Var2.J0().k.setVisibility(8);
                    vvn0Var2.J0().g.setVisibility(8);
                    vvn0Var2.J0().l.setVisibility(8);
                    vvn0Var2.J0().d.setVisibility(0);
                    vvn0Var2.J0().h.setEnabled(true);
                    vvn0Var2.J0().n.setEnabled(true);
                }
                if (wxn0Var.f) {
                    vvn0Var2.J0().d.setVisibility(8);
                    vvn0Var2.J0().f.setVisibility(8);
                    vvn0Var2.J0().l.setVisibility(8);
                    vvn0Var2.J0().g.setVisibility(8);
                    vvn0Var2.J0().h.setEnabled(false);
                    vvn0Var2.J0().n.setEnabled(false);
                } else if (wxn0Var.g) {
                    vvn0Var2.J0().g.setVisibility(8);
                    vvn0Var2.J0().d.setVisibility(8);
                    vvn0Var2.J0().f.setVisibility(8);
                    vvn0Var2.J0().k.setVisibility(0);
                } else if (z) {
                    vvn0Var2.J0().g.setVisibility(8);
                    vvn0Var2.J0().k.setVisibility(0);
                    vvn0Var2.J0().f.setVisibility(8);
                    vvn0Var2.J0().d.setVisibility(8);
                }
                return Unit.f46060a;
        }
    }
}
