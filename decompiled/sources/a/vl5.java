package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vl5 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rrd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl5(rrd rrdVar, yje yjeVar) {
        super(yjeVar);
        this.k = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(0L, null, this);
    }
}
