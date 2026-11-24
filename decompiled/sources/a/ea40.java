package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ea40 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fa40 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea40(fa40 fa40Var, yje yjeVar) {
        super(yjeVar);
        this.k = fa40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(false, this);
    }
}
