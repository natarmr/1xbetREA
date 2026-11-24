package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fyt extends zje {
    public int i;
    public int j;
    public boolean k;
    public String l;
    public hyt m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gyt o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyt(gyt gytVar, zje zjeVar) {
        super(zjeVar);
        this.o = gytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(0, this);
    }
}
