package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ed70 extends zje {
    public csr i;
    public oct j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xd70 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed70(xd70 xd70Var, zje zjeVar) {
        super(zjeVar);
        this.m = xd70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Q(0L, this, null);
    }
}
