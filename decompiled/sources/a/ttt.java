package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ttt extends zje {
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String n;
    public Throwable o;
    public long p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ uyn s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttt(uyn uynVar, zje zjeVar) {
        super(zjeVar);
        this.s = uynVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.j(0, this, null, false);
    }
}
