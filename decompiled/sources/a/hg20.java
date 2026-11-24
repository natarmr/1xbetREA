package a;

/* JADX INFO: loaded from: classes.dex */
public final class hg20 extends zje {
    public oa20 i;
    public q4f j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public double p;
    public /* synthetic */ Object q;
    public final /* synthetic */ qg20 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.r = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.i0(null, null, false, this);
    }
}
