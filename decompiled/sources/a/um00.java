package a;

/* JADX INFO: loaded from: classes.dex */
public final class um00 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xm00 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um00(xm00 xm00Var, zje zjeVar) {
        super(zjeVar);
        this.j = xm00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(null, null, this);
    }
}
