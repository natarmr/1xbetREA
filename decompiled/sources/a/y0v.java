package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y0v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ d2c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0v(d2c d2cVar, yje yjeVar) {
        super(yjeVar);
        this.k = d2cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
