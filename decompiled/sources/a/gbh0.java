package a;

/* JADX INFO: loaded from: classes.dex */
public final class gbh0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hbh0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbh0(hbh0 hbh0Var, zje zjeVar) {
        super(zjeVar);
        this.k = hbh0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(0L, 0L, this);
    }
}
