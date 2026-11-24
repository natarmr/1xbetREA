package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l4v extends zje {
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public Throwable n;
    public /* synthetic */ Object o;
    public final /* synthetic */ hnu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4v(hnu hnuVar, zje zjeVar) {
        super(zjeVar);
        this.p = hnuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(this);
    }
}
