package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dl00 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ loo k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl00(loo looVar, yje yjeVar) {
        super(yjeVar);
        this.k = looVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
