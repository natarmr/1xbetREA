package a;

/* JADX INFO: loaded from: classes4.dex */
public final class f9b0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g9b0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9b0(g9b0 g9b0Var, zje zjeVar) {
        super(zjeVar);
        this.k = g9b0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.F(null, this);
    }
}
