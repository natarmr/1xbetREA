package a;

/* JADX INFO: loaded from: classes.dex */
public final class uit0 extends zje {
    public q4f i;
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vit0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uit0(vit0 vit0Var, zje zjeVar) {
        super(zjeVar);
        this.m = vit0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, null, false, this);
    }
}
