package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dt50 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ gt50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt50(gt50 gt50Var, zje zjeVar) {
        super(zjeVar);
        this.j = gt50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.P(this);
    }
}
