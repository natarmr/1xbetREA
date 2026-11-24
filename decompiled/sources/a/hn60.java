package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hn60 extends zje {
    public i1w0 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nn60 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn60(nn60 nn60Var, zje zjeVar) {
        super(zjeVar);
        this.l = nn60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, null, 0L, null, this);
    }
}
