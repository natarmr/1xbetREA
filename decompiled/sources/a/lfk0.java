package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lfk0 extends zje {
    public qah0 i;
    public ucz j;
    public int k;
    public float l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pfk0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfk0(pfk0 pfk0Var, zje zjeVar) {
        super(zjeVar);
        this.n = pfk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, 0, 0.0f, this);
    }
}
