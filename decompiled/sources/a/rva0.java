package a;

/* JADX INFO: loaded from: classes.dex */
public final class rva0 extends zje {
    public yva0 i;
    public e2e j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yva0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rva0(yva0 yva0Var, zje zjeVar) {
        super(zjeVar);
        this.m = yva0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(false, this);
    }
}
