package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xl5 extends zje {
    public String i;
    public long j;
    public long k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ rrd o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl5(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.o = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.j(null, null, this);
    }
}
