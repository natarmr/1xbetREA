package a;

/* JADX INFO: loaded from: classes.dex */
public final class apt0 extends zje {
    public mie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cpt0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apt0(cpt0 cpt0Var, zje zjeVar) {
        super(zjeVar);
        this.k = cpt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
