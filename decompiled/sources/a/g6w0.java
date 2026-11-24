package a;

/* JADX INFO: loaded from: classes3.dex */
public final class g6w0 extends zje {
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Throwable n;
    public byte o;
    public long p;
    public long q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ a6w0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6w0(a6w0 a6w0Var, zje zjeVar) {
        super(zjeVar);
        this.t = a6w0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, null, null, null, 0, null, this);
    }
}
