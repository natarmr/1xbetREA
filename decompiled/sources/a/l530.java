package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l530 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n530 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l530(n530 n530Var, zje zjeVar) {
        super(zjeVar);
        this.k = n530Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(0L, 0L, null, 0L, this);
    }
}
