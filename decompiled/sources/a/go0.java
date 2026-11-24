package a;

/* JADX INFO: loaded from: classes3.dex */
public final class go0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qo0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go0(qo0 qo0Var, zje zjeVar) {
        super(zjeVar);
        this.j = qo0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.O(false, false, this);
    }
}
