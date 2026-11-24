package a;

/* JADX INFO: loaded from: classes6.dex */
public final class o9s0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h0q0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9s0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.j = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.s(null, this);
    }
}
