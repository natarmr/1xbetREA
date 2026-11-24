package a;

/* JADX INFO: loaded from: classes.dex */
public final class in20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ on20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.j = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.S0(this);
    }
}
