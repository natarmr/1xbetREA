package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dtj extends zje {
    public usj i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ etj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtj(etj etjVar, yje yjeVar) {
        super(yjeVar);
        this.l = etjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
