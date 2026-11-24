package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sl9 extends zje {
    public int i;
    public int j;
    public i050 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ul9 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl9(ul9 ul9Var, zje zjeVar) {
        super(zjeVar);
        this.m = ul9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(0, 0, this);
    }
}
