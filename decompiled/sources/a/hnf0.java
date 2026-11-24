package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hnf0 extends zje {
    public Long i;
    public Long j;
    public String k;
    public cpc l;
    public int m;
    public boolean n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ w5z q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnf0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.q = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.U(null, null, 0, false, this);
    }
}
