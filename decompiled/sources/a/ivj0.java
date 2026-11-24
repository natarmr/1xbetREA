package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ivj0 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ jvj0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivj0(jvj0 jvj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = jvj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ivj0 ivj0Var = new ivj0(this.j, yjeVar);
        ivj0Var.i = obj;
        return ivj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ivj0) create((ja20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ja20 ja20Var = (ja20) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (ja20Var == null) {
            t9f.b();
            return null;
        }
        String str = ja20Var.h;
        jvj0 jvj0Var = this.j;
        lgn0 lgn0Var = jvj0Var.P1;
        if (lgn0Var == null) {
            Intrinsics.h("successBetAlertManager");
            throw null;
        }
        String strH = jvj0Var.H(R.string.bet_processed_successfully);
        strH.getClass();
        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH, null, ja20Var.i, null);
        String strH2 = jvj0Var.H(R.string.single);
        String str2 = ja20Var.e;
        lc00 lc00VarB = kotlin.collections.a.b();
        boolean z = str == null || str.length() == 0;
        String strH3 = jvj0Var.H(!z ? R.string.maximum_coef : R.string.coefficient);
        strH3.getClass();
        lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, ja20Var.b));
        if (!z) {
            String strH4 = jvj0Var.H(R.string.optional_coef);
            strH4.getClass();
            lc00VarB.add(new SuccessBetInfoItem.Simple(strH4, str));
        }
        String strH5 = jvj0Var.H(R.string.bet_sum);
        strH5.getClass();
        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, jvj0Var.o0()), strH5, ja20Var.f16168a, ja20Var.d, true));
        gnb0 gnb0Var = ja20Var.g;
        if (gnb0Var != null) {
            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, jvj0Var.o0()), gnb0Var.f11578a, gnb0Var.b, ja20Var.d, false));
        }
        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH2, str2, "REQUEST_SUCCESS_BET_KEY", new Long(ja20Var.c), "SIMPLE", kotlin.collections.a.a(lc00VarB)), jvj0.G0(jvj0Var).p0());
        jvj0.G0(jvj0Var).x0();
        return Unit.f46060a;
    }
}
