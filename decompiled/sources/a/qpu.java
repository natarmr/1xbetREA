package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qpu extends zje {
    public long i;
    public phf0 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ phf0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpu(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.n = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(0L, this);
    }
}
