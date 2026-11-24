package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tl7 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fm7 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl7(fm7 fm7Var, zje zjeVar) {
        super(zjeVar);
        this.j = fm7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
