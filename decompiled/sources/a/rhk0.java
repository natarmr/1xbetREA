package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rhk0 extends zje {
    public z220 i;
    public rhk0 j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ z220 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhk0(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.r = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.u(this);
    }
}
