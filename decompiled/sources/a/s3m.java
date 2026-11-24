package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class s3m extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ x3m j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ float l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3m(x3m x3mVar, boolean z, float f, t33 t33Var, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = x3mVar;
        this.k = z;
        this.l = f;
        this.m = t33Var;
        this.n = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new s3m(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s3m) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            vsg0 vsg0VarV = ydx.V(null, new zt2(this.j, this.k, this.l));
            og ogVar = new og(this.m, this.n, null);
            this.i = true;
            if (slb.O(vsg0VarV, ogVar, this) == wneVar) {
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
    }
}
