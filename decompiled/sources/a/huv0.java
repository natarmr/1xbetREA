package a;

/* JADX INFO: loaded from: classes6.dex */
public final class huv0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ vkr0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huv0(vkr0 vkr0Var, zje zjeVar) {
        super(zjeVar);
        this.j = vkr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.B(0.0f, this);
    }
}
