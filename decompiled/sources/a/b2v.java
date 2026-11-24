package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b2v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ p1v k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2v(p1v p1vVar, yje yjeVar) {
        super(yjeVar);
        this.k = p1vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
