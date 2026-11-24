package a;

/* JADX INFO: loaded from: classes5.dex */
public final class b5m0 extends zje {
    public long i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c5m0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5m0(c5m0 c5m0Var, zje zjeVar) {
        super(zjeVar);
        this.m = c5m0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0L, this);
    }
}
