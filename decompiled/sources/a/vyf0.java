package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vyf0 extends zje {
    public String i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ n660 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyf0(n660 n660Var, zje zjeVar) {
        super(zjeVar);
        this.m = n660Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(0L, this, null);
    }
}
