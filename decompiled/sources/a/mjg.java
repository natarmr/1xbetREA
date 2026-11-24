package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mjg extends zje {
    public String i;
    public njg j;
    public mjg k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ njg s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjg(njg njgVar, zje zjeVar) {
        super(zjeVar);
        this.s = njgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, this);
    }
}
