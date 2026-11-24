package a;

/* JADX INFO: loaded from: classes.dex */
public final class j7f extends zje {
    public boolean i;
    public boolean j;
    public mpc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ r7f m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.m = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l0(false, false, this);
    }
}
