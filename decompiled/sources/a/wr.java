package a;

/* JADX INFO: loaded from: classes.dex */
public final class wr extends zje {
    public long i;
    public long j;
    public long k;
    public xvs l;
    public h9n0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ xr o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(xr xrVar, zje zjeVar) {
        super(zjeVar);
        this.o = xrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.l(0L, 0L, null, null, this);
    }
}
