package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ww30 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xw30 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww30(xw30 xw30Var, zje zjeVar) {
        super(zjeVar);
        this.j = xw30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.q(this);
    }
}
