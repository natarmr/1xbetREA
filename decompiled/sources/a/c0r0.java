package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c0r0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ yzq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0r0(yzq0 yzq0Var, yje yjeVar) {
        super(yjeVar);
        this.k = yzq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
