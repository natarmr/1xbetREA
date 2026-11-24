package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ye70 extends zje {
    public ql5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qf70 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye70(qf70 qf70Var, zje zjeVar) {
        super(zjeVar);
        this.k = qf70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(null, this);
    }
}
