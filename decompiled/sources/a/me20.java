package a;

/* JADX INFO: loaded from: classes.dex */
public final class me20 extends zje {
    public q4f i;
    public qg20 j;
    public double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qg20 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.m = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(null, 0.0d, this);
    }
}
