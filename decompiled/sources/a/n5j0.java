package a;

/* JADX INFO: loaded from: classes5.dex */
public final class n5j0 extends zje {
    public bm5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w5j0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5j0(w5j0 w5j0Var, zje zjeVar) {
        super(zjeVar);
        this.k = w5j0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(null, this);
    }
}
