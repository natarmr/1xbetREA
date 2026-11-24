package a;

/* JADX INFO: loaded from: classes4.dex */
public final class d0o0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ e0o0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0o0(e0o0 e0o0Var, yje yjeVar) {
        super(yjeVar);
        this.k = e0o0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
