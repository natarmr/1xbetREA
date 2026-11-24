package a;

/* JADX INFO: loaded from: classes6.dex */
public final class kdn extends zje {
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public es m;
    public long n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ sdn q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdn(sdn sdnVar, zje zjeVar) {
        super(zjeVar);
        this.q = sdnVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.N(false, this);
    }
}
