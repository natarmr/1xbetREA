package a;

/* JADX INFO: loaded from: classes3.dex */
public final class g5v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ h5v l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5v(h5v h5vVar, yje yjeVar) {
        super(yjeVar);
        this.l = h5vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
