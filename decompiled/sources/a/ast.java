package a;

/* JADX INFO: loaded from: classes.dex */
public final class ast extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fhj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ast(fhj fhjVar, zje zjeVar) {
        super(zjeVar);
        this.k = fhjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(0, 0, false, false, false, this);
    }
}
