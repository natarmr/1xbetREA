package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hdu extends zje {
    public long i;
    public cu j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdu(cu cuVar, zje zjeVar) {
        super(zjeVar);
        this.l = cuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(0L, this);
    }
}
