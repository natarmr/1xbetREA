package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vgm0 extends zje {
    public String i;
    public Throwable j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ cyu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgm0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.q = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.w(null, this);
    }
}
