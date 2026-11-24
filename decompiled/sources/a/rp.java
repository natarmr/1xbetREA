package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rp extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ do20 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(do20 do20Var, zje zjeVar) {
        super(zjeVar);
        this.k = do20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(0L, this);
    }
}
