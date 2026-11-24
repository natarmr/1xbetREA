package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gfs0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fck0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfs0(fck0 fck0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fck0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(null, null, this);
    }
}
