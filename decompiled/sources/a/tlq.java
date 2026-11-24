package a;

/* JADX INFO: loaded from: classes.dex */
public final class tlq extends zje {
    public nlx i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vlq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlq(vlq vlqVar, zje zjeVar) {
        super(zjeVar);
        this.k = vlqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
