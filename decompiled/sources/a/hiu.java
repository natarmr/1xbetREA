package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hiu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xfu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiu(xfu xfuVar, zje zjeVar) {
        super(zjeVar);
        this.j = xfuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(0L, null, false, 0L, 0, null, this);
    }
}
