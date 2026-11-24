package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fcu extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public Throwable p;
    public /* synthetic */ Object q;
    public final /* synthetic */ rpt r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcu(rpt rptVar, zje zjeVar) {
        super(zjeVar);
        this.r = rptVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.j(0, 0, this);
    }
}
