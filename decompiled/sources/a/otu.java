package a;

/* JADX INFO: loaded from: classes6.dex */
public final class otu extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dgu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otu(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.k = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(this);
    }
}
