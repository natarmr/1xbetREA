package a;

/* JADX INFO: loaded from: classes.dex */
public final class q5f extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r7f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.k = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.E(null, null, null, null, null, false, this);
    }
}
