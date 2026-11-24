package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fl60 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hl60 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl60(hl60 hl60Var, zje zjeVar) {
        super(zjeVar);
        this.j = hl60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.B(this);
    }
}
