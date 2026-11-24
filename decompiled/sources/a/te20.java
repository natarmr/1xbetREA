package a;

/* JADX INFO: loaded from: classes.dex */
public final class te20 extends zje {
    public long i;
    public double j;
    public boolean k;
    public boolean l;
    public g320 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qg20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.o = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.D(0L, 0.0d, false, null, false, this);
    }
}
