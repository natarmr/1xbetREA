package a;

/* JADX INFO: loaded from: classes3.dex */
public final class k2w extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ clu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2w(clu cluVar, yje yjeVar) {
        super(yjeVar);
        this.l = cluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
