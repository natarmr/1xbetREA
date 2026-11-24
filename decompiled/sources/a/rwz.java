package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rwz extends zje {
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public Throwable q;
    public /* synthetic */ Object r;
    public final /* synthetic */ twz s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwz(twz twzVar, zje zjeVar) {
        super(zjeVar);
        this.s = twzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.f(0, 0L, this, null);
    }
}
