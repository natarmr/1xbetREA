package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fyu0 extends zje {
    public bzs0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h0q0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyu0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.k = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(0L, this);
    }
}
