package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ei70 extends zje {
    public double i;
    public double j;
    public Long k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ji70 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei70(ji70 ji70Var, zje zjeVar) {
        super(zjeVar);
        this.n = ji70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.y(0.0d, this);
    }
}
