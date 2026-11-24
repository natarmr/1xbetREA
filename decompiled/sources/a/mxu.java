package a;

/* JADX INFO: loaded from: classes6.dex */
public final class mxu extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public dgu n;
    public mxu o;
    public Throwable p;
    public long q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dgu t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxu(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.t = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.E(0, 0, this);
    }
}
