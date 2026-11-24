package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mzq0 extends zje {
    public long i;
    public long j;
    public long k;
    public cyu l;
    public mzq0 m;
    public Throwable n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ cyu s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzq0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.s = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.k(0L, this);
    }
}
