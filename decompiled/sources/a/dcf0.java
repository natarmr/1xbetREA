package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dcf0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ocf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcf0(ocf0 ocf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ocf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.W(this);
    }
}
