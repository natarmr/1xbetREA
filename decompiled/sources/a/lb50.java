package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lb50 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ nr30 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb50(nr30 nr30Var, yje yjeVar) {
        super(yjeVar);
        this.k = nr30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
