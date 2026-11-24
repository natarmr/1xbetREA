package a;

/* JADX INFO: loaded from: classes.dex */
public final class r5f extends zje {
    public q4f i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r7f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.l = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.F(null, null, null, null, null, null, false, this);
    }
}
