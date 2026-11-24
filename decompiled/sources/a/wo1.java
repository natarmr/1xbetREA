package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wo1 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ dp1 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo1(dp1 dp1Var, boolean z, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.j = dp1Var;
        this.k = z;
        this.l = z2;
        this.m = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new wo1(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wo1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wgh0 wgh0Var;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        xgh0 xgh0Var = null;
        dp1 dp1Var = this.j;
        if (!z) {
            z1x.P(obj);
            this.i = true;
            int i = dp1.G;
            if (dp1Var.O(this.k, this.l, this.m, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        String str = ((bo1) dp1Var.D()).f2910a;
        String str2 = ((bo1) dp1Var.D()).m;
        wgh0 wgh0Var2 = wgh0.MY_AGGREGATOR;
        if (!str2.equals("null")) {
            s31 s31Var = dp1Var.v;
            String str3 = ((bo1) dp1Var.D()).m;
            wgh0[] wgh0VarArrValues = wgh0.values();
            int length = wgh0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    wgh0Var = null;
                    break;
                }
                wgh0Var = wgh0VarArrValues[i2];
                if (wgh0Var.f39117a.equals(str3)) {
                    break;
                }
                i2++;
            }
            if (wgh0Var == null) {
                wgh0Var = wgh0.UNKNOWN;
            }
            s31Var.h(wgh0Var, str, null);
            cyu cyuVar = dp1Var.w;
            String str4 = ((bo1) dp1Var.D()).m;
            for (xgh0 xgh0Var2 : xgh0.values()) {
                if (xgh0Var2.f40840a.equals(str4)) {
                    xgh0Var = xgh0Var2;
                    break;
                }
            }
            if (xgh0Var == null) {
                xgh0Var = xgh0.UNKNOWN;
            }
            cyuVar.D(null, xgh0Var.f40840a, str);
        }
        return Unit.f46060a;
    }
}
