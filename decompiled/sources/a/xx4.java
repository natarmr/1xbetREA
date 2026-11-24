package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xx4 extends zje {
    public long i;
    public long j;
    public long k;
    public oa20 l;
    public nw20 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ fy4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx4(fy4 fy4Var, zje zjeVar) {
        super(zjeVar);
        this.o = fy4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.A(0L, null, null, this);
    }
}
