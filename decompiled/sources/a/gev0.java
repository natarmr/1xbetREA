package a;

/* JADX INFO: loaded from: classes.dex */
public final class gev0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fht0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gev0(fht0 fht0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fht0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
