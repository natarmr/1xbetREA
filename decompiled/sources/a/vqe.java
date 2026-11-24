package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vqe extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xqe j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqe(xqe xqeVar, zje zjeVar) {
        super(zjeVar);
        this.j = xqeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
