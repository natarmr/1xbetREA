package a;

/* JADX INFO: loaded from: classes6.dex */
public final class eyu0 extends zje {
    public kys0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h0q0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyu0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.k = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(0, 0L, this, null);
    }
}
