package a;

/* JADX INFO: loaded from: classes.dex */
public final class n2j extends zje {
    public /* synthetic */ Object i;
    public int j;
    public kmq k;
    public final /* synthetic */ na l;
    public umt0 m;
    public yqc n;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2j(na naVar, yje yjeVar) {
        super(yjeVar);
        this.l = naVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
