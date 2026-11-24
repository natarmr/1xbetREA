package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vwu extends zje {
    public svu i;
    public String j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ yhi q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwu(yhi yhiVar, zje zjeVar) {
        super(zjeVar);
        this.q = yhiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(0, 0L, this, null, false);
    }
}
