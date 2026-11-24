package a;

/* JADX INFO: loaded from: classes.dex */
public final class sdg0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tdg0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdg0(tdg0 tdg0Var, zje zjeVar) {
        super(zjeVar);
        this.j = tdg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.n(false, null, this);
    }
}
