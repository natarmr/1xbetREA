package a;

/* JADX INFO: loaded from: classes.dex */
public final class tfu extends zje {
    public long i;
    public sip j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rrd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfu(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.l = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(0L, null, this);
    }
}
