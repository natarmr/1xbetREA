package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hlt0 extends zje {
    public bm5 i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nvu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlt0(nvu nvuVar, zje zjeVar) {
        super(zjeVar);
        this.l = nvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.J(null, 0.0d, this);
    }
}
