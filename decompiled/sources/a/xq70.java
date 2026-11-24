package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xq70 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ld60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq70(ld60 ld60Var, yje yjeVar) {
        super(yjeVar);
        this.k = ld60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
