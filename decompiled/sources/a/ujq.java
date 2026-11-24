package a;

/* JADX INFO: loaded from: classes.dex */
public final class ujq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ vjq j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujq(vjq vjqVar, zje zjeVar) {
        super(zjeVar);
        this.j = vjqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
