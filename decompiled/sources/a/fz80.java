package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fz80 extends zje {
    public ow80 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gz80 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz80(gz80 gz80Var, zje zjeVar) {
        super(zjeVar);
        this.k = gz80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O(null, this);
    }
}
