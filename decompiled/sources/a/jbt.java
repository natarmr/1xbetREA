package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jbt extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pbt j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbt(pbt pbtVar, zje zjeVar) {
        super(zjeVar);
        this.j = pbtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.p(false, null, 0L, this);
    }
}
