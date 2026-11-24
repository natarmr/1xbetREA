package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lp70 extends zje {
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sp70 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp70(sp70 sp70Var, zje zjeVar) {
        super(zjeVar);
        this.l = sp70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.A(false, this);
    }
}
