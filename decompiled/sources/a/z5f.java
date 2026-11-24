package a;

/* JADX INFO: loaded from: classes.dex */
public final class z5f extends zje {
    public p0f i;
    public r7f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r7f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.l = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.U(null, 0L, this);
    }
}
