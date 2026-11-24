package a;

/* JADX INFO: loaded from: classes5.dex */
public final class kxj0 extends zje {
    public String i;
    public long j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xxj0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxj0(xxj0 xxj0Var, zje zjeVar) {
        super(zjeVar);
        this.n = xxj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.I(0, 0L, 0L, this, null);
    }
}
