package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ds extends zje {
    public tnp0 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ es l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(es esVar, yje yjeVar) {
        super(yjeVar);
        this.l = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.u(null, this);
    }
}
