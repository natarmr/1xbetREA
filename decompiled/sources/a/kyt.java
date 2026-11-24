package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kyt extends zje {
    public mvc i;
    public String j;
    public tyt k;
    public boolean l;
    public boolean m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ lyt p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyt(lyt lytVar, zje zjeVar) {
        super(zjeVar);
        this.p = lytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
