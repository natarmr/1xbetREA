package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ezl extends bnn0 implements xdr {
    public /* synthetic */ float i;
    public final /* synthetic */ vne j;
    public final /* synthetic */ bzl k;
    public final /* synthetic */ sjj l;
    public final /* synthetic */ nul0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezl(vne vneVar, bzl bzlVar, sjj sjjVar, nul0 nul0Var, yje yjeVar) {
        super(3, yjeVar);
        this.j = vneVar;
        this.k = bzlVar;
        this.l = sjjVar;
        this.m = nul0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        sjj sjjVar = this.l;
        nul0 nul0Var = this.m;
        ezl ezlVar = new ezl(this.j, this.k, sjjVar, nul0Var, (yje) obj3);
        ezlVar.i = fFloatValue;
        return ezlVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        float f = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        qjj.W(this.j, null, null, new dzl(this.k, f, this.l, this.m, null), 3);
        return Unit.f46060a;
    }
}
