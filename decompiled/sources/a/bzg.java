package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bzg extends zje {
    public dzg i;
    public bzg j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ dzg r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzg(dzg dzgVar, zje zjeVar) {
        super(zjeVar);
        this.r = dzgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(this);
    }
}
