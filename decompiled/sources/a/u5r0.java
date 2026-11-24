package a;

/* JADX INFO: loaded from: classes4.dex */
public final class u5r0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h0q0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5r0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.j = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.o(0, null, false, 0L, null, this);
    }
}
