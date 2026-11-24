package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends zje {
    public qsg0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vsg0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(vsg0 vsg0Var, yje yjeVar) {
        super(yjeVar);
        this.k = vsg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
