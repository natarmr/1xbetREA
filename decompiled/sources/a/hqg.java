package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hqg extends zje {
    public String i;
    public String j;
    public String k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ prc s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqg(prc prcVar, zje zjeVar) {
        super(zjeVar);
        this.s = prcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.k(null, null, null, this);
    }
}
