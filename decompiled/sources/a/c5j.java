package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c5j extends zje {
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public kki n;
    public kki o;
    public c5j p;
    public /* synthetic */ Object q;
    public final /* synthetic */ kki r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5j(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.r = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.z(0, 0L, 0L, this);
    }
}
