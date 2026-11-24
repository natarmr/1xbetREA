package a;

import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class fw8 extends zje {
    public AggregatorSortingOptionModel i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gw8 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw8(gw8 gw8Var, zje zjeVar) {
        super(zjeVar);
        this.l = gw8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, this);
    }
}
