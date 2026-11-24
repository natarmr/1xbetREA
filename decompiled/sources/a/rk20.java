package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rk20 extends zje {
    public vw6 i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nn20 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.l = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m0(this);
    }
}
