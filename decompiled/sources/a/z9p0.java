package a;

/* JADX INFO: loaded from: classes5.dex */
public final class z9p0 extends zje {
    public long i;
    public long j;
    public long k;
    public String l;
    public epi0 m;
    public z9p0 n;
    public Throwable o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ epi0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9p0(epi0 epi0Var, zje zjeVar) {
        super(zjeVar);
        this.t = epi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(0L, this, null);
    }
}
