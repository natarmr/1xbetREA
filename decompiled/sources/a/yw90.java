package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yw90 extends zje {
    public String i;
    public s9t j;
    public double k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zw90 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw90(zw90 zw90Var, zje zjeVar) {
        super(zjeVar);
        this.m = zw90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
