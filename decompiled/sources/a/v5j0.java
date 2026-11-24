package a;

/* JADX INFO: loaded from: classes5.dex */
public final class v5j0 extends zje {
    public bm5 i;
    public w5j0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w5j0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5j0(w5j0 w5j0Var, zje zjeVar) {
        super(zjeVar);
        this.l = w5j0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.G(null, this);
    }
}
