package a;

/* JADX INFO: loaded from: classes.dex */
public final class lv2 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rv2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv2(rv2 rv2Var, yje yjeVar) {
        super(yjeVar);
        this.j = rv2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, null, this);
    }
}
