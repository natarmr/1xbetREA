package a;

/* JADX INFO: loaded from: classes3.dex */
public final class uln extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public Throwable q;
    public /* synthetic */ Object r;
    public final /* synthetic */ es s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uln(es esVar, zje zjeVar) {
        super(zjeVar);
        this.s = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.B(0, 0L, 0L, this);
    }
}
