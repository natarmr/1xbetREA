package a;

/* JADX INFO: loaded from: classes5.dex */
public final class u6f0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ hbb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6f0(hbb0 hbb0Var, yje yjeVar) {
        super(yjeVar);
        this.k = hbb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
