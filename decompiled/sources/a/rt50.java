package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rt50 extends zje {
    public ut50 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ut50 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt50(ut50 ut50Var, zje zjeVar) {
        super(zjeVar);
        this.k = ut50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(this);
    }
}
