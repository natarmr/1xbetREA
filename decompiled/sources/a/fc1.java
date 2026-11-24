package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fc1 extends zje {
    public kc1 i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kc1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc1(kc1 kc1Var, zje zjeVar) {
        super(zjeVar);
        this.m = kc1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.O(this);
    }
}
