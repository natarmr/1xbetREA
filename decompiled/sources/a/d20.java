package a;

/* JADX INFO: loaded from: classes6.dex */
public final class d20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d20(f20 f20Var, zje zjeVar) {
        super(zjeVar);
        this.j = f20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(false, this);
    }
}
