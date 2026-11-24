package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class j92 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ n92 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j92(n92 n92Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = n92Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        n92 n92Var = this.k;
        switch (b) {
            case 0:
                return new j92(n92Var, yjeVar, (byte) 0);
            default:
                return new j92(n92Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((j92) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        n92 n92Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    yhi yhiVar = n92Var.t;
                    int i = ((d92) n92Var.D()).b.f2186a;
                    bvc bvcVarA = jiu0.a(n92Var);
                    n0w n0wVar = n0w.f22720a;
                    boolean z2 = ((d92) n92Var.D()).b.g;
                    this.j = true;
                    if (yhiVar.e(i, bvcVarA, n0wVar, z2, this) == wneVar) {
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
                sff0 sff0Var = n92Var.X;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    pwi pwiVar = n92Var.V;
                    int i2 = ((d92) n92Var.D()).b.f2186a;
                    bvc bvcVarA2 = jiu0.a(n92Var);
                    boolean z4 = sff0Var.J1;
                    boolean z5 = n92Var.W.a() || sff0Var.O1;
                    this.j = true;
                    if (pwiVar.n(i2, bvcVarA2, z4, z5, true, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
