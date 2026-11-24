package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ylv extends zje {
    public k9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylv(nc0 nc0Var, zje zjeVar) {
        super(zjeVar);
        this.k = nc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(null, 0L, this);
    }
}
