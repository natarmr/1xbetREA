package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ncf0 extends zje {
    public ocf0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ocf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncf0(ocf0 ocf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ocf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i0(null, null, 0, false, false, this);
    }
}
