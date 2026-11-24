package a;

/* JADX INFO: loaded from: classes5.dex */
public final class fw50 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kw50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw50(kw50 kw50Var, zje zjeVar) {
        super(zjeVar);
        this.j = kw50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(null, this);
    }
}
