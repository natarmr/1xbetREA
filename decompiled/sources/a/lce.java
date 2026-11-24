package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lce extends zje {
    public int i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xex l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lce(xex xexVar, zje zjeVar) {
        super(zjeVar);
        this.l = xexVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.C(0, this, false);
    }
}
