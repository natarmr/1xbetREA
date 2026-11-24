package a;

/* JADX INFO: loaded from: classes3.dex */
public final class svo extends zje {
    public String i;
    public Throwable j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ iqi r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svo(iqi iqiVar, zje zjeVar) {
        super(zjeVar);
        this.r = iqiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(this, null, false);
    }
}
