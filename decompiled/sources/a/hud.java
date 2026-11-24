package a;

/* JADX INFO: loaded from: classes.dex */
public final class hud extends zje {
    public chf0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ chf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hud(chf0 chf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = chf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
