package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qwz extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public String q;
    public Throwable r;
    public /* synthetic */ Object s;
    public final /* synthetic */ twz t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwz(twz twzVar, zje zjeVar) {
        super(zjeVar);
        this.t = twzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.e(0, 0L, 0L, this, null);
    }
}
