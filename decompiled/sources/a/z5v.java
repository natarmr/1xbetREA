package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z5v extends zje {
    public gmq i;
    public gmq j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b6v m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5v(b6v b6vVar, zje zjeVar) {
        super(zjeVar);
        this.m = b6vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, 0, this);
    }
}
