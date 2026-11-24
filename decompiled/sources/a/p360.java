package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p360 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ l360 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p360(l360 l360Var, yje yjeVar) {
        super(yjeVar);
        this.k = l360Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
