package a;

/* JADX INFO: loaded from: classes.dex */
public final class ecj extends zje {
    public odd i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ncj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecj(ncj ncjVar, zje zjeVar) {
        super(zjeVar);
        this.k = ncjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
