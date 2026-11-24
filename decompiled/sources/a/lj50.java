package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lj50 extends zje {
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nvu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj50(nvu nvuVar, zje zjeVar) {
        super(zjeVar);
        this.m = nvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.K(this);
    }
}
