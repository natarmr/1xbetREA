package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nr9 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ or9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr9(or9 or9Var, zje zjeVar) {
        super(zjeVar);
        this.j = or9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
