package a;

/* JADX INFO: loaded from: classes.dex */
public final class ieg0 extends zje {
    public deg0 i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ deg0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieg0(deg0 deg0Var, zje zjeVar) {
        super(zjeVar);
        this.l = deg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(this);
    }
}
