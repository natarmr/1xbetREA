package a;

/* JADX INFO: loaded from: classes.dex */
public final class v520 extends zje {
    public pa20 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h620 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v520(h620 h620Var, zje zjeVar) {
        super(zjeVar);
        this.k = h620Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(null, this);
    }
}
