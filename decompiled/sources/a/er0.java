package a;

/* JADX INFO: loaded from: classes3.dex */
public final class er0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ fr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(fr0 fr0Var, yje yjeVar) {
        super(yjeVar);
        this.k = fr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
