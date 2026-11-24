package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dr0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ gr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(gr0 gr0Var, yje yjeVar) {
        super(yjeVar);
        this.k = gr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
