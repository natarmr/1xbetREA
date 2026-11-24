package a;

/* JADX INFO: loaded from: classes6.dex */
public final class xe20 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ clu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe20(clu cluVar, yje yjeVar) {
        super(yjeVar);
        this.k = cluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
