package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vp90 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ xp90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp90(xp90 xp90Var, yje yjeVar) {
        super(yjeVar);
        this.k = xp90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
