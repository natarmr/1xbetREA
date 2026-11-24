package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zip extends zje {
    public sip i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zip(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.l = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(0L, this, null, null);
    }
}
