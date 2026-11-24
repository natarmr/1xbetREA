package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nk0 extends zje {
    public jk0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kb0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk0(kb0 kb0Var, yje yjeVar) {
        super(yjeVar);
        this.k = kb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(null, this);
    }
}
