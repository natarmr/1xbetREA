package a;

/* JADX INFO: loaded from: classes.dex */
public final class xy2 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ az2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy2(az2 az2Var, zje zjeVar) {
        super(zjeVar);
        this.k = az2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(0L, null, this);
    }
}
