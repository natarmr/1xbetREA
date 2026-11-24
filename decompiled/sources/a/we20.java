package a;

/* JADX INFO: loaded from: classes.dex */
public final class we20 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ye20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we20(ye20 ye20Var, yje yjeVar) {
        super(yjeVar);
        this.k = ye20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
