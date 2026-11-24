package a;

/* JADX INFO: loaded from: classes.dex */
public final class z4v extends zje {
    public q4f i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fqc l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4v(fqc fqcVar, zje zjeVar) {
        super(zjeVar);
        this.l = fqcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
