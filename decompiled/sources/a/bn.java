package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bn extends zje {
    public long i;
    public long j;
    public long k;
    public c5k l;
    public bn m;
    public Throwable n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ c5k s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(c5k c5kVar, zje zjeVar) {
        super(zjeVar);
        this.s = c5kVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objD = this.s.d(0L, this);
        return objD == wne.f39444a ? objD : new j0g0(objD);
    }
}
