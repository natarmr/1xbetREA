package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes3.dex */
public final class pt6 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ st6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt6(st6 st6Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = st6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        pt6 pt6Var = new pt6(this.j, yjeVar);
        pt6Var.i = obj;
        return pt6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pt6) create((zd20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zd20 zd20Var = (zd20) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        wd20 wd20Var = wd20.f38952a;
        boolean zD = Intrinsics.d(zd20Var, wd20Var);
        st6 st6Var = this.j;
        if (!zD) {
            if (Intrinsics.d(zd20Var, xd20.f40677a)) {
                ynb ynbVar = st6Var.M1;
                if (ynbVar == null) {
                    Intrinsics.h("changeBalanceDialogProvider");
                    throw null;
                }
                bm5 bm5Var = bm5.k;
                androidx.fragment.app.e eVarC = st6Var.C();
                eVarC.getClass();
                ynb.b(ynbVar, bm5Var, null, eVarC, false, "change_balance_request_key", 398);
            } else {
                if (!(zd20Var instanceof yd20)) {
                    t9f.b();
                    return null;
                }
                lgn0 lgn0Var = st6Var.O1;
                if (lgn0Var == null) {
                    Intrinsics.h("successBetAlertManager");
                    throw null;
                }
                String strH = st6Var.H(R.string.bet_processed_successfully);
                strH.getClass();
                SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, null, null);
                String strH2 = st6Var.H(R.string.alternative_sport);
                yd20 yd20Var = (yd20) zd20Var;
                String str = yd20Var.f42413a;
                lc00 lc00VarB = kotlin.collections.a.b();
                String strH3 = st6Var.H(R.string.coefficient);
                strH3.getClass();
                lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, yd20Var.d));
                String strH4 = st6Var.H(R.string.bet_sum);
                strH4.getClass();
                pn40 pn40Var = pn40.f27267a;
                lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, st6Var.o0()), strH4, pn40.c(yd20Var.c, p3u0.c), yd20Var.g, true));
                if (!yd20Var.h) {
                    lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, st6Var.o0()), yd20Var.f, yd20Var.e, yd20Var.g, false));
                }
                lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH2, str, "REQUEST_SUCCESS_BET_KEY", new Long(yd20Var.b), "SIMPLE", kotlin.collections.a.a(lc00VarB)), st6Var.p0().p0());
                Fragment fragment = st6Var.y;
                yo8 yo8Var = fragment instanceof yo8 ? (yo8) fragment : null;
                if (yo8Var != null) {
                    yo8Var.x0();
                }
            }
        }
        yk5 yk5Var = st6.R1;
        p7m0 p7m0Var = st6Var.H0().N;
        p7m0Var.getClass();
        p7m0Var.o(null, wd20Var);
        return Unit.f46060a;
    }
}
