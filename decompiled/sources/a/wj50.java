package a;

/* JADX INFO: loaded from: classes.dex */
public final class wj50 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yj50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj50(yj50 yj50Var, zje zjeVar) {
        super(zjeVar);
        this.j = yj50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, 0L, this);
    }
}
