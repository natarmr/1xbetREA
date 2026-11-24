package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lst extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ mst k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lst(mst mstVar, yje yjeVar) {
        super(yjeVar);
        this.k = mstVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
