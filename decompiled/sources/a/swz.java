package a;

/* JADX INFO: loaded from: classes2.dex */
public final class swz extends zje {
    public double i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String n;
    public Throwable o;
    public long p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ twz s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swz(twz twzVar, zje zjeVar) {
        super(zjeVar);
        this.s = twzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.g(0.0d, 0, null, this);
    }
}
