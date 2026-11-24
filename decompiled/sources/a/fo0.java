package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fo0 extends zje {
    public boolean i;
    public boolean j;
    public Object k;
    public long l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ qo0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo0(qo0 qo0Var, zje zjeVar) {
        super(zjeVar);
        this.o = qo0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.M(false, false, null, this);
    }
}
