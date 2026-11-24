package a;

/* JADX INFO: loaded from: classes5.dex */
public final class q7c extends zje {
    public owf0 i;
    public we50 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v7c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7c(v7c v7cVar, zje zjeVar) {
        super(zjeVar);
        this.l = v7cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(null, null, this);
    }
}
