package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xjr extends zje {
    public String i;
    public fjo j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ yjr r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjr(yjr yjrVar, zje zjeVar) {
        super(zjeVar);
        this.r = yjrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
