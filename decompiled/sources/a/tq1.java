package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tq1 extends zje {
    public int i;
    public int j;
    public int k;
    public fvt0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ fvt0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq1(fvt0 fvt0Var, zje zjeVar) {
        super(zjeVar);
        this.n = fvt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.s(0, this);
    }
}
