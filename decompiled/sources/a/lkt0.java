package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lkt0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mkt0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkt0(mkt0 mkt0Var, zje zjeVar) {
        super(zjeVar);
        this.k = mkt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
