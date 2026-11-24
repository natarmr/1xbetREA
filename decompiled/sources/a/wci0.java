package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wci0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ y38 k;
    public kmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wci0(y38 y38Var, yje yjeVar) {
        super(yjeVar);
        this.k = y38Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
