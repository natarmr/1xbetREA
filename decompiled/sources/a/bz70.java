package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bz70 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ty70 k;
    public kmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz70(ty70 ty70Var, yje yjeVar) {
        super(yjeVar);
        this.k = ty70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
