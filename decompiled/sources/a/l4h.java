package a;

/* JADX INFO: loaded from: classes4.dex */
public final class l4h extends zje {
    public String i;
    public String j;
    public String k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ m4h s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4h(m4h m4hVar, zje zjeVar) {
        super(zjeVar);
        this.s = m4hVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, null, this);
    }
}
