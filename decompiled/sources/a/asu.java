package a;

/* JADX INFO: loaded from: classes4.dex */
public final class asu extends zje {
    public bm5 i;
    public tl5 j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ khf0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asu(khf0 khf0Var, yje yjeVar) {
        super(yjeVar);
        this.m = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.A(null, null, this);
    }
}
