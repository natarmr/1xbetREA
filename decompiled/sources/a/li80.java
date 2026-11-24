package a;

/* JADX INFO: loaded from: classes3.dex */
public final class li80 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lh70 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li80(lh70 lh70Var, yje yjeVar) {
        super(yjeVar);
        this.j = lh70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
