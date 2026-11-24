package a;

/* JADX INFO: loaded from: classes4.dex */
public final class v5p extends zje {
    public khf0 i;
    public v5p j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ khf0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5p(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.r = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.j(this);
    }
}
