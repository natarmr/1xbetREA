package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class jl00 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ ygq0 j;
    public /* synthetic */ Pair k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl00(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i = 3;
        ygq0 ygq0Var = (ygq0) obj;
        Pair pair = (Pair) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                jl00 jl00Var = new jl00(i, yjeVar, (byte) 0);
                jl00Var.j = ygq0Var;
                jl00Var.k = pair;
                return jl00Var.invokeSuspend(Unit.f46060a);
            default:
                jl00 jl00Var2 = new jl00(i, yjeVar, (byte) 1);
                jl00Var2.j = ygq0Var;
                jl00Var2.k = pair;
                return jl00Var2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                ygq0 ygq0Var = this.j;
                Pair pair = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new z4q(ygq0Var, pair);
            default:
                ygq0 ygq0Var2 = this.j;
                Pair pair2 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new z4q(ygq0Var2, pair2);
        }
    }
}
