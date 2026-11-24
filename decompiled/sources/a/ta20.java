package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ta20 extends zje {
    public ql5 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pwi l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta20(pwi pwiVar, zje zjeVar) {
        super(zjeVar);
        this.l = pwiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.u(null, 0L, this);
    }
}
