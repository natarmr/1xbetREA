package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yh5 extends zje {
    public vh5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kb0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh5(kb0 kb0Var, zje zjeVar) {
        super(zjeVar);
        this.k = kb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.q(null, this);
    }
}
