package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mjt0 extends zje {
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public xvs p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ njt0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjt0(njt0 njt0Var, zje zjeVar) {
        super(zjeVar);
        this.s = njt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(0L, 0L, this, false, false, false);
    }
}
