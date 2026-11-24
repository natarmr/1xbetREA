package a;

/* JADX INFO: loaded from: classes4.dex */
public final class efs0 extends zje {
    public km80 i;
    public dfs0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ffs0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efs0(ffs0 ffs0Var, zje zjeVar) {
        super(zjeVar);
        this.l = ffs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, this);
    }
}
