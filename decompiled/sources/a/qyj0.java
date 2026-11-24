package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qyj0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ omi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyj0(omi0 omi0Var, yje yjeVar) {
        super(yjeVar);
        this.k = omi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
