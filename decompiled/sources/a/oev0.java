package a;

/* JADX INFO: loaded from: classes6.dex */
public final class oev0 extends zje {
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h0q0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oev0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.l = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(false, false, this);
    }
}
