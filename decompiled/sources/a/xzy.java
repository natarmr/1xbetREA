package a;

/* JADX INFO: loaded from: classes6.dex */
public final class xzy extends zje {
    public String i;
    public n3q j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ dgu r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzy(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.r = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.n(null, null, this);
    }
}
