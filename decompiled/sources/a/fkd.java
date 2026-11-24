package a;

/* JADX INFO: loaded from: classes.dex */
public final class fkd extends zje {
    public Object i;
    public mkx j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ gkd n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkd(gkd gkdVar, zje zjeVar) {
        super(zjeVar);
        this.n = gkdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
