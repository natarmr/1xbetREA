package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xq0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ar0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(ar0 ar0Var, yje yjeVar) {
        super(yjeVar);
        this.k = ar0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
