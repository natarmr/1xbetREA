package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rdu extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public wdu m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ wdu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.q = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        Object objD = this.q.D(false, null, false, false, this);
        return objD == wne.f39444a ? objD : new j0g0(objD);
    }
}
