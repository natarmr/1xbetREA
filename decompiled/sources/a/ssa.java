package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ssa extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ osa k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssa(osa osaVar, yje yjeVar) {
        super(yjeVar);
        this.k = osaVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
