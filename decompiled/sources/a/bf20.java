package a;

/* JADX INFO: loaded from: classes.dex */
public final class bf20 extends zje {
    public q4f i;
    public pn40 j;
    public cl5 k;
    public boolean l;
    public double m;
    public double n;
    public double o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qg20 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.q = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.L(null, null, false, this);
    }
}
