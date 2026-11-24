package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mwz extends zje {
    public String i;
    public Throwable j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ twz q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwz(twz twzVar, zje zjeVar) {
        super(zjeVar);
        this.q = twzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
