package a;

/* JADX INFO: loaded from: classes.dex */
public final class kxt extends zje {
    public long i;
    public kgz j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xzp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxt(xzp xzpVar, zje zjeVar) {
        super(zjeVar);
        this.l = xzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(0L, null, this);
    }
}
