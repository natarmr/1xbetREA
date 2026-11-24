package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sau extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public a8z m;
    public sff0 n;
    public v8d o;
    public long p;
    public boolean q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ uau t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sau(uau uauVar, zje zjeVar) {
        super(zjeVar);
        this.t = uauVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(0, this);
    }
}
