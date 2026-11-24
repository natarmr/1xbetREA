package a;

/* JADX INFO: loaded from: classes4.dex */
public final class t5r0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h0q0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5r0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.k = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(0, null, false, 0L, null, 0L, this);
    }
}
