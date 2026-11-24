package a;

/* JADX INFO: loaded from: classes3.dex */
public final class z0u extends zje {
    public pmi i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pmi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0u(pmi pmiVar, yje yjeVar) {
        super(yjeVar);
        this.k = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(this);
    }
}
