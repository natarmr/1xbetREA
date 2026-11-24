package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class wpn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ypn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpn0(ypn0 ypn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ypn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ypn0 ypn0Var = this.k;
        switch (b) {
            case 0:
                wpn0 wpn0Var = new wpn0(ypn0Var, yjeVar, (byte) 0);
                wpn0Var.j = obj;
                return wpn0Var;
            case 1:
                wpn0 wpn0Var2 = new wpn0(ypn0Var, yjeVar, (byte) 1);
                wpn0Var2.j = obj;
                return wpn0Var2;
            default:
                wpn0 wpn0Var3 = new wpn0(ypn0Var, yjeVar, (byte) 2);
                wpn0Var3.j = obj;
                return wpn0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wpn0) create((nqn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wpn0) create((uqn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wpn0) create((oqn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        xna xnaVar;
        byte b = this.i;
        wna wnaVar = null;
        ypn0 ypn0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                nqn0 nqn0Var = (nqn0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(nqn0Var, kqn0.f18732a)) {
                    g9m0 g9m0Var = npn0.j2;
                    androidx.fragment.app.e eVarC = ypn0Var.C();
                    eVarC.getClass();
                    g9m0Var.getClass();
                    if (eVarC.J("SwipeXOnboardingBottomS") == null) {
                        sj3.E0(new npn0(), eVarC, "SwipeXOnboardingBottomS");
                    }
                } else if (nqn0Var instanceof lqn0) {
                    s9m0 s9m0Var = ypn0.h2;
                    androidx.recyclerview.widget.b layoutManager = ypn0Var.M0().e.getLayoutManager();
                    CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                    if (cardStackLayoutManager != null && (xnaVar = cardStackLayoutManager.r) != null) {
                        wnaVar = xnaVar.f41165a;
                    }
                    if (wnaVar == wna.f39437a) {
                        ypn0Var.M0().e.A0(((lqn0) nqn0Var).f20494a, 0, ypn0Var.d2, 500, false);
                    }
                } else if (Intrinsics.d(nqn0Var, cqn0.f4804a)) {
                    s9m0 s9m0Var2 = ypn0.h2;
                    ypn0.L0(ypn0Var.M0().m);
                    ypn0.L0(ypn0Var.M0().j);
                } else if (Intrinsics.d(nqn0Var, hqn0.f13493a)) {
                    s9m0 s9m0Var3 = ypn0.h2;
                    ypn0.K0(ypn0Var.M0().m);
                    ypn0.K0(ypn0Var.M0().j);
                } else if (Intrinsics.d(nqn0Var, dqn0.f6525a)) {
                    s9m0 s9m0Var4 = ypn0.h2;
                    ypn0.L0(ypn0Var.M0().n);
                    ypn0.L0(ypn0Var.M0().k);
                } else if (Intrinsics.d(nqn0Var, iqn0.f15218a)) {
                    s9m0 s9m0Var5 = ypn0.h2;
                    ypn0.K0(ypn0Var.M0().n);
                    ypn0.K0(ypn0Var.M0().k);
                } else if (Intrinsics.d(nqn0Var, eqn0.f8246a)) {
                    s9m0 s9m0Var6 = ypn0.h2;
                    ypn0.O0(ypn0Var.M0().e);
                } else if (Intrinsics.d(nqn0Var, aqn0.f1305a)) {
                    s9m0 s9m0Var7 = ypn0.h2;
                    ypn0.K0(ypn0Var.M0().g);
                    ypn0.K0(ypn0Var.M0().d);
                    ypn0.K0(ypn0Var.M0().n);
                    ypn0.K0(ypn0Var.M0().k);
                    ypn0Var.M0().b.setAlpha(0.3f);
                    ypn0Var.M0().c.setAlpha(0.3f);
                    ypn0Var.M0().h.setAlpha(0.3f);
                } else if (Intrinsics.d(nqn0Var, zpn0.f44768a)) {
                    s9m0 s9m0Var8 = ypn0.h2;
                    ypn0.K0(ypn0Var.M0().b);
                    ypn0.K0(ypn0Var.M0().c);
                    ypn0.K0(ypn0Var.M0().h);
                    ypn0.O0(ypn0Var.M0().l);
                    ypn0.O0(ypn0Var.M0().f);
                } else if (Intrinsics.d(nqn0Var, gqn0.f11742a)) {
                    s9m0 s9m0Var9 = ypn0.h2;
                    ypn0.P0(ypn0Var.M0().l);
                } else if (Intrinsics.d(nqn0Var, fqn0.f9985a)) {
                    s9m0 s9m0Var10 = ypn0.h2;
                    ypn0.P0(ypn0Var.M0().f);
                } else {
                    if (nqn0Var instanceof jqn0) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    if (nqn0Var instanceof mqn0) {
                        s9m0 s9m0Var11 = ypn0.h2;
                        mqn0 mqn0Var = (mqn0) nqn0Var;
                        ypn0Var.M0().c.setText(mqn0Var.f22234a + Separators.SP + mqn0Var.b);
                    } else {
                        if (!(nqn0Var instanceof bqn0)) {
                            t9f.b();
                            return null;
                        }
                        s9m0 s9m0Var12 = ypn0.h2;
                        ypn0Var.M0().e.suppressLayout(!((bqn0) nqn0Var).f3040a);
                    }
                }
                return Unit.f46060a;
            case 1:
                uqn0 uqn0Var = (uqn0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (uqn0Var instanceof pqn0) {
                    s9m0 s9m0Var13 = ypn0.h2;
                    ypn0Var.M0().d.setEnabled(true);
                    ypn0Var.M0().j.setVisibility(4);
                    ypn0Var.M0().m.setVisibility(4);
                    pqn0 pqn0Var = (pqn0) uqn0Var;
                    ypn0Var.M0().n.setText(pqn0Var.f27423a);
                    ypn0Var.M0().c.setText(pqn0Var.b + Separators.SP + pqn0Var.c);
                } else if (uqn0Var instanceof rqn0) {
                    s9m0 s9m0Var14 = ypn0.h2;
                    ypn0Var.M0().d.setEnabled(true);
                    ypn0Var.M0().j.setVisibility(4);
                    ypn0Var.M0().m.setVisibility(4);
                    rqn0 rqn0Var = (rqn0) uqn0Var;
                    ypn0Var.M0().n.setText(rqn0Var.f30939a);
                    ypn0Var.M0().c.setText(rqn0Var.b + Separators.SP + rqn0Var.c);
                } else if (uqn0Var instanceof sqn0) {
                    CardStackLayoutManager cardStackLayoutManager2 = ypn0Var.f2;
                    if (cardStackLayoutManager2 != null) {
                        vna vnaVar = vna.f37710a;
                        xna xnaVar2 = cardStackLayoutManager2.r;
                        xnaVar2.getClass();
                        xnaVar2.b = vnaVar;
                    }
                    ypn0Var.M0().k.setAlpha(0.0f);
                    ypn0Var.M0().n.setAlpha(0.0f);
                    ypn0Var.M0().d.setAlpha(0.0f);
                    ypn0Var.M0().d.setEnabled(false);
                    ypn0Var.M0().g.setAlpha(0.1f);
                    ypn0Var.M0().j.setImageResource(R.drawable.ic_arrow_left);
                    ypn0Var.M0().m.setText(((sqn0) uqn0Var).f32638a);
                    ypn0.K0(ypn0Var.M0().m);
                    ypn0.K0(ypn0Var.M0().e);
                } else if (uqn0Var instanceof tqn0) {
                    CardStackLayoutManager cardStackLayoutManager3 = ypn0Var.f2;
                    if (cardStackLayoutManager3 != null) {
                        vna vnaVar2 = vna.b;
                        xna xnaVar3 = cardStackLayoutManager3.r;
                        xnaVar3.getClass();
                        xnaVar3.b = vnaVar2;
                    }
                    ypn0Var.M0().k.setAlpha(0.0f);
                    ypn0Var.M0().n.setAlpha(0.0f);
                    ypn0Var.M0().d.setAlpha(0.0f);
                    ypn0Var.M0().d.setEnabled(false);
                    ypn0Var.M0().g.setAlpha(0.1f);
                    ypn0Var.M0().e.setAlpha(1.0f);
                    ypn0Var.M0().j.setImageResource(R.drawable.ic_arrow_right);
                    ypn0Var.M0().m.setText(((tqn0) uqn0Var).f34389a);
                } else if (!Intrinsics.d(uqn0Var, qqn0.f29175a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                s9m0 s9m0Var15 = ypn0.h2;
                ((ssn0) ypn0Var.Z1.getValue()).A(((oqn0) obj2).f25697a);
                return Unit.f46060a;
        }
    }
}
