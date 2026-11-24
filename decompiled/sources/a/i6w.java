package a;

/* JADX INFO: loaded from: classes.dex */
public final class i6w extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rrd j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6w(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.j = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.s(null, 0L, this);
    }
}
