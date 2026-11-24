package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bf70 extends zje {
    public boolean i;
    public bsu j;
    public bm5 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qf70 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf70(qf70 qf70Var, zje zjeVar) {
        super(zjeVar);
        this.m = qf70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.y(this);
    }
}
