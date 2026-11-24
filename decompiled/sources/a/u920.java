package a;

/* JADX INFO: loaded from: classes.dex */
public final class u920 extends zje {
    public oa20 i;
    public svu j;
    public Object k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ x920 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u920(x920 x920Var, zje zjeVar) {
        super(zjeVar);
        this.r = x920Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.w(null, 0L, false, this);
    }
}
