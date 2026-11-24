package a;

/* JADX INFO: loaded from: classes5.dex */
public final class boc0 extends zje {
    public doc0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ doc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boc0(doc0 doc0Var, zje zjeVar) {
        super(zjeVar);
        this.k = doc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(this);
    }
}
