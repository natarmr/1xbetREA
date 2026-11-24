package a;

/* JADX INFO: loaded from: classes7.dex */
public final class j64 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ qo3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j64(qo3 qo3Var, yje yjeVar) {
        super(yjeVar);
        this.k = qo3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
