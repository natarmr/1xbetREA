package a;

/* JADX INFO: loaded from: classes.dex */
public final class vk80 extends zje {
    public int i;
    public j73 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xk80 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk80(xk80 xk80Var, yje yjeVar) {
        super(yjeVar);
        this.l = xk80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(0, null, this);
    }
}
