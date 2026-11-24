package a;

/* JADX INFO: loaded from: classes.dex */
public final class rc60 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rrd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc60(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.k = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.y(null, this);
    }
}
