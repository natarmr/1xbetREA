package a;

/* JADX INFO: loaded from: classes4.dex */
public final class bxl0 extends zje {
    public String i;
    public String j;
    public Throwable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public long p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ yuu t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxl0(yuu yuuVar, zje zjeVar) {
        super(zjeVar);
        this.t = yuuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.j(null, null, false, false, this);
    }
}
