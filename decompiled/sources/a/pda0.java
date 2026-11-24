package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pda0 extends zje {
    public long i;
    public long j;
    public long k;
    public String l;
    public Throwable m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ iw20 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pda0(iw20 iw20Var, zje zjeVar) {
        super(zjeVar);
        this.r = iw20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(0L, this, null);
    }
}
