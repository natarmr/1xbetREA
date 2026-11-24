package a;

/* JADX INFO: loaded from: classes5.dex */
public final class coj0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ r5j0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coj0(r5j0 r5j0Var, yje yjeVar) {
        super(yjeVar);
        this.k = r5j0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
