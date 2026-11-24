package a;

/* JADX INFO: loaded from: classes.dex */
public final class ajt0 extends zje {
    public q4f i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vit0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajt0(vit0 vit0Var, zje zjeVar) {
        super(zjeVar);
        this.l = vit0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
