package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qt5 extends zje {
    public boolean i;
    public cu5 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cu5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.m = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(false, null, 0, 0, false, this);
    }
}
