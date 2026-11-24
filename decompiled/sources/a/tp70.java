package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tp70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ up70 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp70(up70 up70Var, zje zjeVar) {
        super(zjeVar);
        this.j = up70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
