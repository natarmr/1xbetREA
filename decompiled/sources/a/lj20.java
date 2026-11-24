package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lj20 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mn20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj20(mn20 mn20Var, zje zjeVar) {
        super(zjeVar);
        this.k = mn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.y(null, this);
    }
}
