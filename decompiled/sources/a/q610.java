package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q610 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ u610 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q610(u610 u610Var, zje zjeVar) {
        super(zjeVar);
        this.j = u610Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
