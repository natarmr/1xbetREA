package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zj80 extends zje {
    public Throwable i;
    public lk80 j;
    public k050 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sd60 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj80(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.m = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(null, null, this);
    }
}
