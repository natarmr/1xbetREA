package a;

/* JADX INFO: loaded from: classes3.dex */
public final class okc0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rkc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okc0(rkc0 rkc0Var, zje zjeVar) {
        super(zjeVar);
        this.k = rkc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, 0L, this);
    }
}
