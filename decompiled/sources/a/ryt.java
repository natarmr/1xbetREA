package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ryt extends zje {
    public mvc i;
    public iyt j;
    public String k;
    public boolean l;
    public boolean m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ syt p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryt(syt sytVar, zje zjeVar) {
        super(zjeVar);
        this.p = sytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
