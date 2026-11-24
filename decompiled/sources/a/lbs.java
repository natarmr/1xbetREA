package a;

/* JADX INFO: loaded from: classes.dex */
public final class lbs extends zje {
    public String i;
    public String j;
    public Throwable k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ fhj s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbs(fhj fhjVar, zje zjeVar) {
        super(zjeVar);
        this.s = fhjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.r(this, null, null, false);
    }
}
