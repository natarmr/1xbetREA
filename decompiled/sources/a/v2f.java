package a;

/* JADX INFO: loaded from: classes3.dex */
public final class v2f extends zje {
    public int i;
    public q1h0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a3f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2f(a3f a3fVar, zje zjeVar) {
        super(zjeVar);
        this.l = a3fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(this);
    }
}
