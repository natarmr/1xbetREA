package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fn10 extends zje {
    public ql5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pn10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn10(pn10 pn10Var, zje zjeVar) {
        super(zjeVar);
        this.k = pn10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.M(null, this);
    }
}
