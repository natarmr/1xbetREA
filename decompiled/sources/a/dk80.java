package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dk80 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fk80 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk80(fk80 fk80Var, zje zjeVar) {
        super(zjeVar);
        this.j = fk80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(false, this);
    }
}
