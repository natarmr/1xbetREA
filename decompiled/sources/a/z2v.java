package a;

/* JADX INFO: loaded from: classes3.dex */
public final class z2v extends zje {
    public long i;
    public Long j;
    public Long k;
    public String l;
    public Integer m;
    public nhf0 n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ieu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2v(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.q = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(0L, null, null, null, false, null, this);
    }
}
