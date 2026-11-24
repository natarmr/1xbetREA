package a;

/* JADX INFO: loaded from: classes.dex */
public final class le20 extends zje {
    public double i;
    public double j;
    public double k;
    public q4f l;
    public duw m;
    public hxu n;
    public yk5 o;
    public cl5 p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ qg20 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.s = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.w(0.0d, null, null, this);
    }
}
