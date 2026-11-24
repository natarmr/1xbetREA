package a;

/* JADX INFO: loaded from: classes.dex */
public final class gke extends zje {
    public vt00 i;
    public vt00 j;
    public z40 k;
    public Long l;
    public mie0 m;
    public l0g0 n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ hke q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gke(hke hkeVar, zje zjeVar) {
        super(zjeVar);
        this.q = hkeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, null, null, null, null, null, 0, null, null, this);
    }
}
