package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tgz extends zje {
    public String i;
    public zpu j;
    public zpu k;
    public tgz l;
    public Throwable m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ zpu t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgz(zpu zpuVar, zje zjeVar) {
        super(zjeVar);
        this.t = zpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Object objE = this.t.e(null, this);
        return objE == wne.f39444a ? objE : new j0g0(objE);
    }
}
