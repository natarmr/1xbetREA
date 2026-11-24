package a;

/* JADX INFO: loaded from: classes4.dex */
public final class s060 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ u060 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s060(u060 u060Var, yje yjeVar) {
        super(yjeVar);
        this.k = u060Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
