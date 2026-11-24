package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yn20 extends zje {
    public ouj0 i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g320 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn20(g320 g320Var, yje yjeVar) {
        super(yjeVar);
        this.m = g320Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, 0L, 0, this);
    }
}
