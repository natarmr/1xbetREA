package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qup extends zje {
    public String i;
    public Throwable j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ wti r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qup(wti wtiVar, zje zjeVar) {
        super(zjeVar);
        this.r = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(this, null, false);
    }
}
