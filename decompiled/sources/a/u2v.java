package a;

/* JADX INFO: loaded from: classes4.dex */
public final class u2v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tru j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2v(tru truVar, zje zjeVar) {
        super(zjeVar);
        this.j = truVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
