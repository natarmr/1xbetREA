package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nkr0 extends zje {
    public String i;
    public String j;
    public Throwable k;
    public okr0 l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ w5z s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkr0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.s = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.g0(null, null, this);
    }
}
