package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fp8 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hp8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp8(hp8 hp8Var, zje zjeVar) {
        super(zjeVar);
        this.k = hp8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(0L, 0L, this);
    }
}
