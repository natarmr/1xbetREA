package a;

/* JADX INFO: loaded from: classes5.dex */
public final class d7c0 extends zje {
    public oa20 i;
    public String j;
    public nw20 k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g7c0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7c0(g7c0 g7c0Var, zje zjeVar) {
        super(zjeVar);
        this.n = g7c0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(null, null, null, this);
    }
}
