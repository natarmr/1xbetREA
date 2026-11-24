package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uj90 extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kk90 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj90(kk90 kk90Var, zje zjeVar) {
        super(zjeVar);
        this.m = kk90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(false, this);
    }
}
