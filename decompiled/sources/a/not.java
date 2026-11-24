package a;

/* JADX INFO: loaded from: classes4.dex */
public final class not extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ n7c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public not(n7c n7cVar, yje yjeVar) {
        super(yjeVar);
        this.k = n7cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
