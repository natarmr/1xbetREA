package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class xqn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ arn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqn0(arn0 arn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = arn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        arn0 arn0Var = this.k;
        switch (b) {
            case 0:
                return new xqn0(arn0Var, yjeVar, (byte) 0);
            default:
                return new xqn0(arn0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((xqn0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        arn0 arn0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uii uiiVar = arn0Var.k;
                    ewt ewtVar = new ewt(((xxn0) ((dpi0) ((hnu) uiiVar.f35730a).f13365a).f6468a).f41667a, uiiVar, (byte) 13);
                    agn0 agn0Var = new agn0(arn0Var, (yje) null, (byte) 13);
                    this.j = true;
                    if (slb.O(ewtVar, agn0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                ol60 ol60Var = arn0Var.v;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ol60Var.f(dqn0.f6525a);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var = arn0Var.u;
                String strA = arn0Var.c.b.a(R.string.swipex_bet_sum_onboarding, Arrays.copyOf(new Object[0], 0));
                ksn0 ksn0Var = arn0Var.z;
                String str = ksn0Var != null ? ksn0Var.f18823a : null;
                if (str == null) {
                    str = "";
                }
                String str2 = ksn0Var != null ? ksn0Var.c : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = ksn0Var != null ? ksn0Var.b : null;
                rqn0 rqn0Var = new rqn0(strA, str, str2, str3 != null ? str3 : "");
                p7m0Var.getClass();
                p7m0Var.o(null, rqn0Var);
                ol60Var.f(iqn0.f15218a);
                ol60Var.f(zpn0.f44768a);
                return Unit.f46060a;
        }
    }
}
