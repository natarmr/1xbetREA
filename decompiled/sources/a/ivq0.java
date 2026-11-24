package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ivq0 extends zje {
    public String i;
    public Throwable j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ jvq0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivq0(jvq0 jvq0Var, zje zjeVar) {
        super(zjeVar);
        this.q = jvq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
