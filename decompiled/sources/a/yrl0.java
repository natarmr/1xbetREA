package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yrl0 extends zje {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w5z k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrl0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.k = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(0, this);
    }
}
