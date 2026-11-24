package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zyg extends zje {
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public dzg p;
    public zyg q;
    public Throwable r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dzg t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyg(dzg dzgVar, zje zjeVar) {
        super(zjeVar);
        this.t = dzgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(0, 0L, this);
    }
}
