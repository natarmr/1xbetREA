package a;

/* JADX INFO: loaded from: classes.dex */
public final class gnn0 extends zje {
    public c4m0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ inn0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnn0(inn0 inn0Var, zw5 zw5Var) {
        super(zw5Var);
        this.k = inn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(0L, null, this);
    }
}
