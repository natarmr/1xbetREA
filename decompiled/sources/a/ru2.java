package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ru2 extends bnn0 implements xdr {
    public /* synthetic */ vne i;
    public /* synthetic */ float j;
    public final /* synthetic */ qv2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(qv2 qv2Var, yje yjeVar) {
        super(3, yjeVar);
        this.k = qv2Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        ru2 ru2Var = new ru2(this.k, (yje) obj3);
        ru2Var.i = (vne) obj;
        ru2Var.j = fFloatValue;
        return ru2Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        qjj.W(this.i, null, null, new qu2((Object) this.k, this.j, (yje) null, (byte) 0), 3);
        return Unit.f46060a;
    }
}
