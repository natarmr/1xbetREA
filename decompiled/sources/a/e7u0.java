package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e7u0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ qaf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7u0(qaf0 qaf0Var, yje yjeVar) {
        super(yjeVar);
        this.k = qaf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
