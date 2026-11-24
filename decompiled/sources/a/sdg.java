package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sdg extends zje {
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;
    public Throwable o;
    public /* synthetic */ Object p;
    public final /* synthetic */ udg q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdg(udg udgVar, zje zjeVar) {
        super(zjeVar);
        this.q = udgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(0L, this);
    }
}
