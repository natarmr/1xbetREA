package a;

/* JADX INFO: loaded from: classes.dex */
public final class rpt0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ spt0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpt0(spt0 spt0Var, zje zjeVar) {
        super(zjeVar);
        this.j = spt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, this, null);
    }
}
