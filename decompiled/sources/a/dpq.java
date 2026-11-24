package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dpq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ yj2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpq(yj2 yj2Var, yje yjeVar) {
        super(yjeVar);
        this.l = yj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
