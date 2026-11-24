package a;

/* JADX INFO: loaded from: classes2.dex */
public final class owz extends zje {
    public boolean i;
    public cnz j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ twz r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owz(twz twzVar, zje zjeVar) {
        super(zjeVar);
        this.r = twzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(false, null, this);
    }
}
