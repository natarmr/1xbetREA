package a;

/* JADX INFO: loaded from: classes.dex */
public final class y5f extends zje {
    public rue i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r7f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.k = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.T(null, this);
    }
}
