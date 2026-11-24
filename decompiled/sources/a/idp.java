package a;

/* JADX INFO: loaded from: classes4.dex */
public final class idp extends zje {
    public phf0 i;
    public idp j;
    public Throwable k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ phf0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idp(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.r = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(this);
    }
}
