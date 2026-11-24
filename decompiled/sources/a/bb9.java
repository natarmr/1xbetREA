package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bb9 extends zje {
    public long i;
    public long j;
    public long k;
    public sip l;
    public boolean m;
    public boolean n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nr q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb9(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.q = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.x(0L, null, 0L, this);
    }
}
