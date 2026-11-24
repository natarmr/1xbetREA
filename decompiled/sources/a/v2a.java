package a;

/* JADX INFO: loaded from: classes.dex */
public final class v2a extends zje {
    public String i;
    public ex9 j;
    public x34 k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ rrd o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2a(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.o = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.B(null, 0, 0L, null, null, this);
    }
}
