package a;

/* JADX INFO: loaded from: classes4.dex */
public final class u9t extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ w9t j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9t(w9t w9tVar, zje zjeVar) {
        super(zjeVar);
        this.j = w9tVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}
