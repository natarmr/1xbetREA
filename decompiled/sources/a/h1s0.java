package a;

/* JADX INFO: loaded from: classes2.dex */
public final class h1s0 extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public Throwable p;
    public /* synthetic */ Object q;
    public final /* synthetic */ fuj0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1s0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.r = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.t(0L, 0L, this);
    }
}
