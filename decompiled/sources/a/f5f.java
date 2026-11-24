package a;

/* JADX INFO: loaded from: classes.dex */
public final class f5f extends zje {
    public q4f i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ r7f m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.m = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.z(null, false, this);
    }
}
