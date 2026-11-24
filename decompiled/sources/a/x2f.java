package a;

/* JADX INFO: loaded from: classes3.dex */
public final class x2f extends zje {
    public q1h0 i;
    public h0q0 j;
    public String k;
    public s77 l;
    public String m;
    public boolean n;
    public int o;
    public long p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ a3f s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2f(a3f a3fVar, zje zjeVar) {
        super(zjeVar);
        this.s = a3fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.N(this);
    }
}
