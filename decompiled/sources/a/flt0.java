package a;

/* JADX INFO: loaded from: classes2.dex */
public final class flt0 extends zje {
    public long i;
    public String j;
    public Object k;
    public aja l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ glt0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flt0(glt0 glt0Var, zje zjeVar) {
        super(zjeVar);
        this.o = glt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(0L, this, null, false);
    }
}
