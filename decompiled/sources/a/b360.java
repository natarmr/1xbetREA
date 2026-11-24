package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b360 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ r260 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b360(r260 r260Var, yje yjeVar) {
        super(yjeVar);
        this.k = r260Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
