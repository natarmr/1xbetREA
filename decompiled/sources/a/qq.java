package a;

/* JADX INFO: loaded from: classes.dex */
public final class qq extends zje {
    public long i;
    public long j;
    public tg7 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rq m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq(rq rqVar, zje zjeVar) {
        super(zjeVar);
        this.m = rqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(0L, this);
    }
}
