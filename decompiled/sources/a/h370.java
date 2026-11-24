package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h370 extends zje {
    public Object i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k370 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h370(k370 k370Var, zje zjeVar) {
        super(zjeVar);
        this.m = k370Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.K(this);
    }
}
