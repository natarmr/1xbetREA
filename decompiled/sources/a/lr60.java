package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lr60 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bs60 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr60(bs60 bs60Var, zje zjeVar) {
        super(zjeVar);
        this.k = bs60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.S(null, this);
    }
}
