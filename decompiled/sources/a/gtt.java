package a;

/* JADX INFO: loaded from: classes6.dex */
public final class gtt extends zje {
    public cit0 i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ali m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtt(ali aliVar, zje zjeVar) {
        super(zjeVar);
        this.m = aliVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.q(null, 0L, this);
    }
}
