package a;

/* JADX INFO: loaded from: classes.dex */
public final class ef20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qg20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.j = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, null, 0L, false, this);
    }
}
