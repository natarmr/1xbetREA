package a;

/* JADX INFO: loaded from: classes.dex */
public final class w16 extends zje {
    public Object i;
    public Object j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tdg0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w16(tdg0 tdg0Var, zje zjeVar) {
        super(zjeVar);
        this.m = tdg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, this);
    }
}
