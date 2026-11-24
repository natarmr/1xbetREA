package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dlt0 extends zje {
    public aja i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fck0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlt0(fck0 fck0Var, zje zjeVar) {
        super(zjeVar);
        this.k = fck0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
