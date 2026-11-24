package a;

/* JADX INFO: loaded from: classes2.dex */
public final class coq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ doq k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coq(doq doqVar, yje yjeVar) {
        super(yjeVar);
        this.k = doqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
