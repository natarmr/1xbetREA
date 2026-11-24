package a;

/* JADX INFO: loaded from: classes.dex */
public final class usw extends zje {
    public rsw i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xsw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usw(xsw xswVar, zje zjeVar) {
        super(zjeVar);
        this.k = xswVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.Z0(this);
    }
}
