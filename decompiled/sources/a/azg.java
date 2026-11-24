package a;

/* JADX INFO: loaded from: classes4.dex */
public final class azg extends zje {
    public String i;
    public dzg j;
    public azg k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ dzg s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azg(dzg dzgVar, zje zjeVar) {
        super(zjeVar);
        this.s = dzgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, this);
    }
}
