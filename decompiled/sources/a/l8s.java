package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l8s extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ i89 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8s(i89 i89Var, yje yjeVar) {
        super(yjeVar);
        this.k = i89Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
