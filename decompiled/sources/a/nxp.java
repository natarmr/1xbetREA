package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nxp extends zje {
    public long i;
    public long j;
    public long k;
    public nmo l;
    public nxp m;
    public Throwable n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ nmo s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxp(nmo nmoVar, zje zjeVar) {
        super(zjeVar);
        this.s = nmoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objB = this.s.b(0L, this);
        return objB == wne.f39444a ? objB : new j0g0(objB);
    }
}
