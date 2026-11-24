package a;

/* JADX INFO: loaded from: classes4.dex */
public final class czg extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public epe m;
    public dzg n;
    public czg o;
    public Throwable p;
    public long q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dzg t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czg(dzg dzgVar, zje zjeVar) {
        super(zjeVar);
        this.t = dzgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(0, null, this);
    }
}
