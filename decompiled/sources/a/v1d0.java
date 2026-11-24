package a;

/* JADX INFO: loaded from: classes.dex */
public final class v1d0 extends zje {
    public long i;
    public short j;
    public b2d0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jw20 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1d0(jw20 jw20Var, zje zjeVar) {
        super(zjeVar);
        this.m = jw20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.q(0, 0L, this);
    }
}
