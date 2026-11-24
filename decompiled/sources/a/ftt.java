package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ftt extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ o4m l;
    public g0f m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftt(o4m o4mVar, yje yjeVar) {
        super(yjeVar);
        this.l = o4mVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
