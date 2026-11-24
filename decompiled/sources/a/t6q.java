package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t6q extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ fc4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6q(fc4 fc4Var, yje yjeVar) {
        super(yjeVar);
        this.k = fc4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
