package a;

/* JADX INFO: loaded from: classes.dex */
public final class s8e extends zje {
    public rei0 i;
    public i050 j;
    public gxb k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g45 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8e(g45 g45Var, zje zjeVar) {
        super(zjeVar);
        this.m = g45Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f0(null, this);
    }
}
