package a;

/* JADX INFO: loaded from: classes4.dex */
public final class otb extends zje {
    public gmq i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y38 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otb(y38 y38Var, yje yjeVar) {
        super(yjeVar);
        this.k = y38Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
