package a;

/* JADX INFO: loaded from: classes4.dex */
public final class w5p extends zje {
    public x4k i;
    public /* synthetic */ Object j;
    public final /* synthetic */ khf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5p(khf0 khf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = khf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(null, null, this);
    }
}
