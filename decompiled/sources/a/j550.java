package a;

/* JADX INFO: loaded from: classes5.dex */
public final class j550 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ wk30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j550(wk30 wk30Var, yje yjeVar) {
        super(yjeVar);
        this.k = wk30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
