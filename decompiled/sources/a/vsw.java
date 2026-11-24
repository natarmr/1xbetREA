package a;

/* JADX INFO: loaded from: classes.dex */
public final class vsw extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xsw j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsw(xsw xswVar, zje zjeVar) {
        super(zjeVar);
        this.j = xswVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a1(this);
    }
}
