package a;

/* JADX INFO: loaded from: classes.dex */
public final class xk50 extends zje {
    public abe0 i;
    public ol50 j;
    public ol50 k;
    public pv00 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ zk50 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk50(zk50 zk50Var, zje zjeVar) {
        super(zjeVar);
        this.n = zk50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, null, null, this);
    }
}
