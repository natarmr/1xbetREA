package a;

/* JADX INFO: loaded from: classes.dex */
public final class hbe0 extends zje {
    public tlx i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ibe0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbe0(ibe0 ibe0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ibe0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
