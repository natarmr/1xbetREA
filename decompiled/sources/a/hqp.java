package a;

/* JADX INFO: loaded from: classes.dex */
public final class hqp extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ywq0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqp(ywq0 ywq0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ywq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.l(0L, 0L, this);
    }
}
