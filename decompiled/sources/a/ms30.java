package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ms30 extends zje {
    public ys30 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ns30 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms30(ns30 ns30Var, zje zjeVar) {
        super(zjeVar);
        this.k = ns30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(null, this);
    }
}
