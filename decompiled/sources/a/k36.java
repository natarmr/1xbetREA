package a;

/* JADX INFO: loaded from: classes5.dex */
public final class k36 extends zje {
    public ujn i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p36 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k36(p36 p36Var, zje zjeVar) {
        super(zjeVar);
        this.k = p36Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
