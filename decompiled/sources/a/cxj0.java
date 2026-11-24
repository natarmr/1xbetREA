package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cxj0 extends zje {
    public pa20 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xxj0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxj0(xxj0 xxj0Var, zje zjeVar) {
        super(zjeVar);
        this.k = xxj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.D(null, false, null, null, 0L, this);
    }
}
