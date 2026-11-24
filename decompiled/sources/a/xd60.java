package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xd60 extends zje {
    public boolean i;
    public boolean j;
    public tly k;
    public /* synthetic */ Object l;
    public final /* synthetic */ clu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd60(clu cluVar, yje yjeVar) {
        super(yjeVar);
        this.m = cluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
