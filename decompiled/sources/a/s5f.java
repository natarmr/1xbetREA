package a;

/* JADX INFO: loaded from: classes.dex */
public final class s5f extends zje {
    public et7 i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ r7f m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.m = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.H(null, null, null, null, null, false, this);
    }
}
