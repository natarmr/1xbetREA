package a;

/* JADX INFO: loaded from: classes3.dex */
public final class z2f extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a3f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2f(a3f a3fVar, zje zjeVar) {
        super(zjeVar);
        this.k = a3fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.P(this);
    }
}
