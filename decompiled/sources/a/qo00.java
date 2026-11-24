package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qo00 extends zje {
    public rhi0 i;
    public Object j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ro00 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo00(ro00 ro00Var, zje zjeVar) {
        super(zjeVar);
        this.m = ro00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
