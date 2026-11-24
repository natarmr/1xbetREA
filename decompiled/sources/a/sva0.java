package a;

/* JADX INFO: loaded from: classes.dex */
public final class sva0 extends zje {
    public Object i;
    public mie0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xva0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sva0(xva0 xva0Var, zje zjeVar) {
        super(zjeVar);
        this.l = xva0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, null, this);
    }
}
