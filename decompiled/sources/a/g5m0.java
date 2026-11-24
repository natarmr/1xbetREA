package a;

/* JADX INFO: loaded from: classes3.dex */
public final class g5m0 extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ i5m0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5m0(i5m0 i5m0Var, zje zjeVar) {
        super(zjeVar);
        this.k = i5m0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0.0d, 0.0d, this);
    }
}
