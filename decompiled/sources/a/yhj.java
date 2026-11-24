package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yhj extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public Throwable u;
    public /* synthetic */ Object v;
    public final /* synthetic */ uii w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhj(uii uiiVar, yje yjeVar) {
        super(yjeVar);
        this.w = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.m(0, false, 0L, false, false, false, false, this);
    }
}
