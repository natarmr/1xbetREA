package a;

/* JADX INFO: loaded from: classes3.dex */
public final class huu extends zje {
    public int i;
    public int j;
    public ynt k;
    public /* synthetic */ Object l;
    public final /* synthetic */ iuu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huu(iuu iuuVar, zje zjeVar) {
        super(zjeVar);
        this.m = iuuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}
