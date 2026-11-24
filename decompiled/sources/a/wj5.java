package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wj5 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ sj5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj5(sj5 sj5Var, yje yjeVar) {
        super(yjeVar);
        this.k = sj5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
