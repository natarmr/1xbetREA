package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gnt extends zje {
    public long i;
    public boolean j;
    public ql5 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kki m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnt(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.m = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.n(0L, this, false);
    }
}
