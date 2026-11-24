package a;

/* JADX INFO: loaded from: classes5.dex */
public final class s7c extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ v7c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7c(v7c v7cVar, zje zjeVar) {
        super(zjeVar);
        this.j = v7cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(this);
    }
}
