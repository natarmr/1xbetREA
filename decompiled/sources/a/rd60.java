package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rd60 extends zje {
    public long i;
    public zos j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sd60 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd60(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.m = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.r(0L, null, false, this);
    }
}
