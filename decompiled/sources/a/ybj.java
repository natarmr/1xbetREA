package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ybj extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pmi j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybj(pmi pmiVar, zje zjeVar) {
        super(zjeVar);
        this.j = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(this);
    }
}
