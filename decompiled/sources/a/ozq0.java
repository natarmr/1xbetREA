package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ozq0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ rzq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozq0(rzq0 rzq0Var, yje yjeVar) {
        super(yjeVar);
        this.k = rzq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
