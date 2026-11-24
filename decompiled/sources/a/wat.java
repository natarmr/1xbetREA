package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wat extends zje {
    public int i;
    public String j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pbt n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wat(pbt pbtVar, zje zjeVar) {
        super(zjeVar);
        this.n = pbtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(0, this, null, false, false);
    }
}
