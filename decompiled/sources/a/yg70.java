package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yg70 extends zje {
    public double i;
    public double j;
    public long k;
    public Long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ eh70 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg70(eh70 eh70Var, zje zjeVar) {
        super(zjeVar);
        this.n = eh70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.z(0.0d, this);
    }
}
