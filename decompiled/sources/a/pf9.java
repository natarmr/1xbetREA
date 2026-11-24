package a;

/* JADX INFO: loaded from: classes.dex */
public final class pf9 extends zje {
    public int i;
    public long j;
    public xg8 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rrd m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf9(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.m = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.w(0, 0L, null, this);
    }
}
