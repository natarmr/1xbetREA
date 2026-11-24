package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qa20 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z220 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa20(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.k = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.y(0L, null, false, 0.0d, 0, null, null, 0, this);
    }
}
