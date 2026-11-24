package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pnq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ qnq k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnq(qnq qnqVar, yje yjeVar) {
        super(yjeVar);
        this.k = qnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
