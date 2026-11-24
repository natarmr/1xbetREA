package a;

/* JADX INFO: loaded from: classes6.dex */
public final class b4t0 extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public z3t0 n;
    public d4t0 o;
    public b4t0 p;
    public Throwable q;
    public int r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ d4t0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4t0(d4t0 d4t0Var, zje zjeVar) {
        super(zjeVar);
        this.v = d4t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object objB = this.v.b(0L, 0L, 0L, this);
        return objB == wne.f39444a ? objB : new j0g0(objB);
    }
}
