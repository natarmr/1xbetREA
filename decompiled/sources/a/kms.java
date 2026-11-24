package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kms extends zje {
    public long i;
    public long j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g3j m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kms(g3j g3jVar, zje zjeVar) {
        super(zjeVar);
        this.m = g3jVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(0L, 0L, 0L, this, false);
    }
}
