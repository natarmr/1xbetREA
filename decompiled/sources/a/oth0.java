package a;

/* JADX INFO: loaded from: classes5.dex */
public final class oth0 extends zje {
    public String i;
    public ynb0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kd30 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oth0(kd30 kd30Var, zje zjeVar) {
        super(zjeVar);
        this.m = kd30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.x(null, null, 0, null, this);
    }
}
